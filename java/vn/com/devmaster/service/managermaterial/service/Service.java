package vn.com.devmaster.service.managermaterial.service;


import org.springframework.beans.factory.annotation.Autowired;
import vn.com.devmaster.service.managermaterial.domain.Product;
import vn.com.devmaster.service.managermaterial.projecttion.IProduct;
import vn.com.devmaster.service.managermaterial.reponsitory.ProductRespon;


import javax.transaction.Transactional;
import java.util.List;

@Transactional
@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private ProductRespon productRespon;

//    public List<IProduct> listAll(){
//        return productRespon.findAll();
//    }
//    public void save(IProduct product){
//        productRespon.save(product);
//    }
//    public void delete(Integer id){
//        productRespon.deleteById(id);
//    }
//
//    public Product get(Integer id){return (Product) productRespon.findById(id).get();}


    public Product finById(Integer id) {
        return productRespon.findAllById(id);
    }
//    public Optional<Product> finById(Integer id){return productRespon.finById(id);}
}
