package JPArelationSQL.example.JPA.SQL.Controller;

import JPArelationSQL.example.JPA.SQL.DAO.Product;
import JPArelationSQL.example.JPA.SQL.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductRepository productRepo;
    private Exception NotFoundProductException;

    @GetMapping
    String getAllProduct(Model model) {
        model.addAttribute("products", productRepo.findAll());
        return "product_page";
    }
    
    @DeleteMapping("/{id}")
    String deleteProduct(Model model, @PathVariable long id) {
        productRepo.deleteById(id);
        return "product_page";
    }
    
    //Form add new product
    @GetMapping("/newProduct")
    String addProductForm(Model model) {
        model.addAttribute("product" ,new Product());
        return "productForm";
    }
    
    //form edit product
    @GetMapping("/editProduct/{id}")
    String editProduct(Model model, @PathVariable long id, BindingResult result) throws Exception {
        Product product = productRepo.findById(id).get();
        if(product == null ) throw NotFoundProductException;
        if(product != null) {
            model.addAttribute("product" , productRepo);    
        }
        return "productForm";
    }

    @PostMapping
    String addOrEdit(Model model, @ModelAttribute("product") Product product, BindingResult result) {

        return "redirect:/";
    }
    
}
