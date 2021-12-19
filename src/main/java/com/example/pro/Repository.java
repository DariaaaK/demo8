package com.example.demospringbotapp.pro;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<com.example.demospringbotapp.pro.Employee,Integer> {

}