//058//
package com.herhos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.herhos.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>
{

}
