//051//
package com.herhos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.herhos.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>
{

}
