package vn.com.devmaster.service.managermaterial.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "NAME", length = 250)
    private String name;

    @Column(name = "USERNAME", length = 50)
    private String username;

    @Column(name = "PASSWORD", length = 50)
    private String password;

    @Column(name = "ADDRESS", length = 500)
    private String address;

    @Column(name = "EMAIL", length = 150)
    private String email;

    @Column(name = "PHONE", length = 50)
    private String phone;

    @Column(name = "CREATED_DATE")
    private Instant createdDate;

    @Column(name = "ISACTIVE")
    private Byte isactive;

}