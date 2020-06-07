//019//
package com.herhos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.herhos.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>
{

}
