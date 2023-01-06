package com.example.orderProject.Repository;

import com.example.orderProject.Model.DeliveryPartner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartnerRepository extends JpaRepository<DeliveryPartner,Integer> {
}
