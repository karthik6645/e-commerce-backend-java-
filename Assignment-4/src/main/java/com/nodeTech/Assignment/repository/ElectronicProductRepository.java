package com.nodeTech.Assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nodeTech.Assignment.entity.ElectronicProduct;

public interface ElectronicProductRepository extends JpaRepository<ElectronicProduct, Integer> {

}
