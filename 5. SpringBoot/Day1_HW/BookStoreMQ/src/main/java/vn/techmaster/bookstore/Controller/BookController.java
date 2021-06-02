package vn.techmaster.bookstore.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vn.techmaster.bookstore.model.Book;

@Controller
public class BookController {

    @Value("${spring.application.name}")
    private String appName;
    static final String APP_NAME = "appName";
    static final String BOOKS = "books";

    @GetMapping("/")
    public String getHomePageContent (Model modelView) {
        modelView.addAttribute(APP_NAME, appName);
        return "home";
    }

    @GetMapping("/book4")
    public String getBook4PageContent (Model modelView) {
        Book[] bookCollection = {
                new Book (1, "Strong Ass man", "Kyosake"),
                new Book(2, "Pro Spring 6", "Mark Man")
        };
        modelView.addAttribute(APP_NAME, appName);
        modelView.addAttribute(BOOKS, bookCollection);
        return "book4";
    }

}
