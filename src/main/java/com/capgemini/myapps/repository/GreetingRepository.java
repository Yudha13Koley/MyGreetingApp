package com.capgemini.myapps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.myapps.model.Greeting;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {

}
