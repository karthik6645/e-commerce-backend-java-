package com.nodeTech.Assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nodeTech.Assignment.entity.Login;

public interface LoginRepository extends JpaRepository<Login, Integer> {

}
