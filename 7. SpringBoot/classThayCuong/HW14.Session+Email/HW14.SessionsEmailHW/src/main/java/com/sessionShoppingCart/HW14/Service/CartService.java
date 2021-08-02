package com.sessionShoppingCart.HW14.Service;

import com.sessionShoppingCart.HW14.Model.Cart;
import com.sessionShoppingCart.HW14.Model.OrderLine;
import com.sessionShoppingCart.HW14.Model.Product;
import com.sessionShoppingCart.HW14.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CartService {
    @Autowired
    private ProductRepository productRepository;

    public void addToCart(Long id, HttpSession session) {
        HashMap<Long, OrderLine> cart;

        var rawCart = session.getAttribute("CART");

        if(rawCart instanceof HashMap) {
            cart = (HashMap<Long, OrderLine>) rawCart;
        }else {
            cart = new HashMap<>();
        }

        Optional<Product> product =productRepository.findById(id);
        if (product.isPresent()) {
            //orderline dung chung id voi product
            OrderLine orderline = cart.getOrDefault(id, new OrderLine(product.get(), 0));
            orderline.increaseByOne();
            cart.put(id, orderline);
        }
        session.setAttribute("CART", cart);
    }

    //de dung trong controller
    public Cart getCart(HttpSession session) {
        HashMap<Long, OrderLine> cart;

        var rawCart =session.getAttribute("CART");

        //set wont help calculate at init, so create new Cart -> calculate spending
        if (rawCart instanceof HashMap) {
            cart = (HashMap<Long, OrderLine>) rawCart;
            return new Cart(
                    cart.values().stream().collect(Collectors.toList()),  //danh sách các mặt hàng mua
                    0.01f, //%Giảm giá
                    true   //Có tính thuế VAT không?
            );
        }
        return new Cart();
    }

    //hien thi so ITEM tren Cart cua controller
    public int countItemInCart(HttpSession session) {
        HashMap<Long, OrderLine> cart;

        var rawCart = session.getAttribute("CART");

        if (rawCart instanceof HashMap) {
            cart = (HashMap<Long, OrderLine>) rawCart;
            return cart.values().stream().mapToInt(OrderLine::getCount).sum();
        } else {
            return 0;
        }
    }

    public void discardFromCart(Long id, HttpSession session) {
        var rawCart = session.getAttribute("CART");
        HashMap<Long, OrderLine> cart;
        if(rawCart instanceof HashMap) {
            cart = (HashMap<Long, OrderLine>) rawCart;
        } else {
            cart = new HashMap<>();
        }

        Optional<Product> product =productRepository.findById(id);
        if (product.isPresent()) {
            //orderline dung chung id voi product
            OrderLine orderline = cart.getOrDefault(id, new OrderLine(product.get(), 0));
            orderline.decreaseByOne();
            cart.put(id, orderline);
        }
        session.setAttribute("CART", cart);
    }
}
