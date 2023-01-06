package com.example.orderProject.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "order_table")
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "delivery_date", columnDefinition = "DATE", nullable = false)
    private LocalDate date;

    @Column(name = "order_name", nullable = false)
    private String name;

    @ManyToOne
    @JsonIgnore
    @JoinColumn
    private DeliveryPartner deliveryPartner;

}
