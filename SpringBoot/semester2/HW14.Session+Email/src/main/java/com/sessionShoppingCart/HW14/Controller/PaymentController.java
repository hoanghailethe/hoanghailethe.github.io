package com.sessionShoppingCart.HW14.Controller;

import com.sessionShoppingCart.HW14.Model.Person;
import com.sessionShoppingCart.HW14.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import javax.servlet.http.HttpSession;

@Controller
public class PaymentController {

    //thêm các beam của java email và templateEngine
    @Autowired private TemplateEngine templateEngine;
    @Autowired private JavaMailSender javaMailSender;

    @Autowired private CartService cartService;

    //    Payment Form controller
    @GetMapping("/paymentForm")
    public String paymentForm(Model model, HttpSession session) {
        model.addAttribute("person", new Person());
        model.addAttribute("cart", cartService.getCart(session));
        return "register";
    }

    //trong phương thức này xử lý luôn email
    @PostMapping("/paymentForm")
    public String sendPersonInformation (
            @ModelAttribute("person") Person person,
            Model model, BindingResult result,
            HttpSession session
    ) throws MessagingException {
        //Create Mail message
        MimeMessage message =javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message,false);

        helper.setTo(person.getEmail());
        helper.setSubject("Minh Quang Car Shop");

        //set the context of the message before bundle CONTEXT to template Engine
        Context context = new Context();
        context.setVariable("customer", person);
        context.setVariable("cart", cartService.getCart(session));

        //bind Context vao thymeleaf de gen HTML message
        String htmlContent = templateEngine.process("email/email-message", context);
        //bind htmlContent vao message
        message.setContent(htmlContent, "text/html;charset=UTF-8");

        //send Email
        javaMailSender.send(message);

        //tra ve trang thong bao
        model.addAttribute("person", person);
        boolean success = (!result.hasErrors());
        model.addAttribute("success", success);

        //end Session life cycle here after submit
        session.invalidate();
        return "resultSubmit";
    }

    @GetMapping("/confirmMail")
    public String confirmMail() {
        return "/email/email-confirm";
    }
}
