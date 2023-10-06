package vn.com.devmaster.service.managermaterial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.com.devmaster.service.managermaterial.domain.Category;
import vn.com.devmaster.service.managermaterial.domain.Customer;
import vn.com.devmaster.service.managermaterial.domain.Order;
import vn.com.devmaster.service.managermaterial.domain.OrdersDetail;
import vn.com.devmaster.service.managermaterial.reponsitory.Responsitory;
import vn.com.devmaster.service.managermaterial.service.Service;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    Responsitory responsitory;
    @Autowired
    Service service;

    @GetMapping("/category")
    List<Category> getCategory() {
        return responsitory.getCategory();
    }

    @GetMapping("/customer")
    List<Customer> getCustomer() {
        return responsitory.getCustomer();}

    @GetMapping("/order")
    List<Order> getOrder(){return responsitory.getOrder();}

//    @GetMapping("/ordersDetail")
//    List<OrdersDetail> getOrdersDetail(){return responsitory.getOrdersDetail();}
}
