package com.sessionShoppingCart.HW14.Controller;

import com.sessionShoppingCart.HW14.Model.Person;
import com.sessionShoppingCart.HW14.Repository.ProductRepository;
import com.sessionShoppingCart.HW14.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @Autowired private CartService cartService;

    @GetMapping("/")
    public String showHomePage(HttpSession session, Model model) {
        model.addAttribute("products", productRepository.getAll());
        model.addAttribute("cartCount", cartService.countItemInCart(session));
        return "index";
    }

    @GetMapping("/buy/{id}")
    public String buy(@PathVariable(name = "id") Long id, HttpSession session, Model model) {
        cartService.addToCart(id, session);
        return "redirect:/";
    }

    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable(name = "id") Long id, HttpSession session, Model model) {
        cartService.addToCart(id, session);
        model.addAttribute("cart", cartService.getCart(session));
        return "checkout";
    }

    @GetMapping("/discard/{id}")
    public String discard(@PathVariable(name = "id") Long id, HttpSession session, Model model) {
        cartService.discardFromCart(id, session);
        model.addAttribute("cart", cartService.getCart(session));
        return "checkout";
    }

    @GetMapping("/checkout")
    public String checkout(HttpSession session, Model model) {
        model.addAttribute("cart", cartService.getCart(session));
        return "checkout";
    }

}
