package com.ron.repo.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import com.ron.config.model.product.Product;


public interface IProductRepo extends JpaRepository<Product, Integer> {

}
