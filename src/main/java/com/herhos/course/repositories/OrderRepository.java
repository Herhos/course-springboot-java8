//043//
package com.herhos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.herhos.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>
{

}
