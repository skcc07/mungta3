package com.demo.user.domain;

import org.springframework.data.jpa.repository.JpaRepository;


// http :8080/dogs   <--- CRUD 에 대한 REST API 자동생성 
public interface AdminRepository extends JpaRepository<Admin, Integer>{
    
}