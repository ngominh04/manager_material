package vn.com.devmaster.service.managermaterial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.com.devmaster.service.managermaterial.domain.CartItem;
import vn.com.devmaster.service.managermaterial.domain.Product;
import vn.com.devmaster.service.managermaterial.reponsitory.ProductRespon;
import vn.com.devmaster.service.managermaterial.reponsitory.Responsitory;
import vn.com.devmaster.service.managermaterial.service.Service;

@Controller
@RequestMapping("/shoping_cart")
public class ShopingCartController {
    @Autowired
    Service service;
    @Autowired
    Responsitory responsitory;
    @Autowired
    ProductRespon productRespon;

    @GetMapping("/a")
    public String showCart(Model model){
        model.addAttribute("cartItem",service.getAllItem());
        return "cart/shopingCart";
    }

    @GetMapping("/add/{id}")
    public String addCart(@PathVariable(name = "id" ) Integer id){
        Product product = productRespon.findAllById(id);
        if(product != null){
            CartItem item = new CartItem();
            item.setId(product.getId());
            item.setImage(product.getImage());
            item.setName(product.getName());
            item.setPrice(product.getPrice());
            item.setQuantity(1);
            service.add(item);
        }
        return "redirect:/shoping_cart/a";
    }

}
