package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    ProductService productService;

    @GetMapping("")
    String home(Model model) {
        return listProductPaging(1,model,"name","asc");
    }

    @GetMapping("/page/{pageNumber}")
    String listProductPaging(@PathVariable("pageNumber") int pageNumber, Model model,
                             @Param("sortField") String sortField,
                             @Param("sortDir") String sortDir){
        Page<Product> page = productService.pageAndSort(pageNumber, sortField, sortDir);
        List<Product> products = page.getContent();

        long totalItems = page.getTotalElements();
        int totalPages = page.getTotalPages();
        sortDir = (sortDir.equals("asc")) ? "desc" : "asc";

        model.addAttribute("currentPage", pageNumber);
        model.addAttribute("sortField", sortField);
        model.addAttribute("sortDir", sortDir);
        //new model
        model.addAttribute("totalItems",totalItems);
        model.addAttribute("totalPages",totalPages);
        model.addAttribute("listProducts", products);

        return "index";
    }

    @GetMapping("/new")
    public String showNewProductPage(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "new_product";
    }

    @PostMapping("/save")
    public String saveProduct(@ModelAttribute("product") Product product) {
        productService.save(product);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String showEditProductForm(@PathVariable("id") Integer id, Model model ){
        var product = productService.get(id);
        model.addAttribute("product",product);
        return "edit_product";
    }

    @GetMapping("delete/{id}")
    public String deleteProduct(@PathVariable("id") Integer id, Model model){
        productService.delete(id);
        return "redirect:/";
    }

}
