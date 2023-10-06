package vn.com.devmaster.service.managermaterial.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.com.devmaster.service.managermaterial.domain.Category;
import vn.com.devmaster.service.managermaterial.domain.Customer;
import vn.com.devmaster.service.managermaterial.domain.Order;
import vn.com.devmaster.service.managermaterial.domain.OrdersDetail;

import java.util.List;

@Repository
public interface Responsitory extends JpaRepository<Category, Integer> {

    @Query(value = "select  c.* from category c",nativeQuery = true)
    List<Category> getCategory();

    @Query(value = "select cus from Customer cus")
    List<Customer> getCustomer();

    @Query(value = "select o.* from orders o",nativeQuery = true)
    List<Order> getOrder();

//    @Query(value = "select o from OrdersDetail o")
//    List<OrdersDetail> getOrdersDetail();


}
