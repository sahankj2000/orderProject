package com.example.orderProject.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.aspectj.weaver.ast.Or;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "delivery_partner")
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class DeliveryPartner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "partner_name", nullable = false)
    private String name;

    @Column(name = "phone",nullable = false)
    private String phone;

    @OneToMany(mappedBy = "deliveryPartner", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Order> orders;
}
