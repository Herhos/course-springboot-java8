//067//
package com.herhos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.herhos.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>
{

}
