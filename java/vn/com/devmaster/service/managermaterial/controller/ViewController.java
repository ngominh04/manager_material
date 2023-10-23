package vn.com.devmaster.service.managermaterial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.com.devmaster.service.managermaterial.config.CustomUserDetal;
import vn.com.devmaster.service.managermaterial.reponsitory.ProductRespon;
import vn.com.devmaster.service.managermaterial.reponsitory.Responsitory;
import vn.com.devmaster.service.managermaterial.service.Service;

@Controller
@RequestMapping("/view")
public class ViewController {

    @Autowired
    Responsitory responsitory;

    @Autowired
    ProductRespon productRespon;

    @Autowired
    Service service;

    @GetMapping("/products")
    String getProduct(Model model){
        model.addAttribute("prod",responsitory.getProduct());
        return "product";
    }

    @GetMapping("/hp")
    String showProductHp(Model model){
        model.addAttribute("hp",responsitory.getProductHp());
        return "product_hp";
    }

    @GetMapping("/asus")
    String showProductAsus(Model model){
        model.addAttribute("asus",responsitory.getProductAsus());
        return "product_asus";
    }

    @GetMapping("/dell")
    String showProductDell(Model model){
        model.addAttribute("dell",responsitory.getProductDell());
        return "product_dell";
    }

    @GetMapping("/acer")
    String showProductAcer(Model model){
        model.addAttribute("acer",responsitory.getProductAcer());
        return "product_acer";
    }

    @GetMapping("/mac")
    String showProductMac(Model model){
        model.addAttribute("mac",responsitory.getProductMac());
        return "product_mac";
    }

    // show toàn bộ những hình thức thanh toán
    @GetMapping("/payment_method")
    String showPaymentMethod(Model model){
        model.addAttribute("payment_method",responsitory.getPaymentMethod());
        return "paymentMethod";
    }

    // show toàn bộ phương thức giao hàng
    @GetMapping("/transport_method")
    String showTransportMethod(Model model){
        model.addAttribute("transport_method",responsitory.getTransport());
        return "transportMethod";
    }

    // show toàn bộ product
    @GetMapping("/productAll")
    String showAllProduct(Model model){
        model.addAttribute("productAll",responsitory.getProduct());
        return "productAll";
    }


    // lấy ra product id chi tiết
    @GetMapping("/productAll/{id}")
    String showProductChiTiets(Model model,@PathVariable(name = "id") Integer id){
        model.addAttribute("productId",productRespon.findAllById(id));
        model.addAttribute("productImage",responsitory.getProductImage(id));
        model.addAttribute("imageId",responsitory.getProductImage(id));
        return "productChiTiet";
    }


    // id product -> trang đặt hàng
    @GetMapping("/getOder/{id}")
    String showOder_1(Model model,@PathVariable(name = "id") Integer id){
        model.addAttribute("productId",productRespon.findAllById(id));
        model.addAttribute("payment",responsitory.getPaymentActive());
        model.addAttribute("tranport",responsitory.getTransPort(id));
        model.addAttribute("paymentId",responsitory.getPayment(id));
        return "oder/oderChiTiet";
    }

    // lấy id product và id transport -> ra trang tổng tiền
    @GetMapping("/getOder/{id}/tp{id1}")
    String showOder_2(Model model,@PathVariable(name = "id") Integer id,@PathVariable(name = "id1") Integer id1){
        model.addAttribute("productId",productRespon.findAllById(id));
        model.addAttribute("payment",responsitory.getPaymentActive());
        model.addAttribute("tranport",responsitory.getTransPort(id));
        model.addAttribute("tranport2",responsitory.getTransPort2(id,id1));
        model.addAttribute("paymentId",responsitory.getPayment(id));
        return "oder/oderTransport";
    }

    // lấy id product và id payment -> ra trang payment
    @GetMapping("/getOder/{id}/pm{id1}")
    String showOder_3(Model model,@PathVariable(name = "id") Integer id,@PathVariable(name = "id1") Integer id1){
        model.addAttribute("productId",productRespon.findAllById(id));
        model.addAttribute("payment",responsitory.getPaymentActive());
        model.addAttribute("tranport",responsitory.getTransPort(id));
        model.addAttribute("tranport2",responsitory.getTransPort2(id,id1));
        model.addAttribute("paymentId",responsitory.getPayment(id1));
        return "oder/oderPayment";
    }

    //chuyển từ trang tranport -> trang payment và ngược lại
    @GetMapping("/getOder/{id}/tp{id1}/pm{id2}")
    String showOder_3(Model model,@PathVariable(name = "id") Integer id,@PathVariable(name = "id1") Integer id1,@PathVariable(name = "id2") Integer id2){
        model.addAttribute("productId",productRespon.findAllById(id));
        model.addAttribute("payment",responsitory.getPaymentActive());
        model.addAttribute("tranport",responsitory.getTransPort(id1));
        model.addAttribute("tranport2",responsitory.getTransPort2(id,id1));
        model.addAttribute("paymentId",responsitory.getPayment(id2));
        return "/oder/oderPayment";
    }

    // lọc dưới 10 tr
    @GetMapping("/locPrice_10")
    public String showLocPrice(Model model){
        model.addAttribute("locPrice_10",responsitory.getLocPrice());
        return "locTheoGia/locPrice";
    }

    // lọc 10 đến 15tr
    @GetMapping("/locPrice_10_15")
    public String showLocPrice1(Model model){
        model.addAttribute("locPrice_10_15",responsitory.getLocPrice1());
        return "locTheoGia/locPrice1";
    }

    // lọc 15 đến 20tr
    @GetMapping("/locPrice_15_20")
    public String showLocPrice2(Model model){
        model.addAttribute("locPrice_15_20",responsitory.getLocPrice2());
        return "locTheoGia/locPrice2";
    }

    @GetMapping("/locPrice_20_25")
    public String showLocPrice3(Model model){
        model.addAttribute("locPrice_20_25",responsitory.getLocPrice3());
        return "locTheoGia/locPrice3";
    }

    @GetMapping("/locPrice_30")
    public String showLocPrice4(Model model){
        model.addAttribute("locPrice_30",responsitory.getLocPrice4());
        return "locTheoGia/locPrice4";
    }

    @GetMapping("/locPrice_25_30")
    public String showLocPrice5(Model model){
        model.addAttribute("locPrice_25_30",responsitory.getLocPrice5());
        return "locTheoGia/locPrice5";
    }
    @GetMapping("/login")
    public String showLogin(){
        return "login";
    }

    @PostMapping("/login_check")
    public String login(){
        // validate user, password trong database => lấy thông tin user
        CustomUserDetal userDetal= new CustomUserDetal("admin","admin","admin");
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
                userDetal,null,userDetal.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        return "redirect:/view/hp";
    }
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
