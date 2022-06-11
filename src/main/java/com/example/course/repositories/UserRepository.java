package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.User;
                                                    /*tipo |tipo
                                                     *da   |do
                                                  entidade |id   */
public interface UserRepository extends JpaRepository<User, Long>{

}
