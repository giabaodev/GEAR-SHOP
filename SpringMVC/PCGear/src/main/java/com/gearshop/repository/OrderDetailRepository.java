package com.gearshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gearshop.entity.OrderDetailEntity;

public interface OrderDetailRepository extends JpaRepository<OrderDetailEntity, Integer>{

}
