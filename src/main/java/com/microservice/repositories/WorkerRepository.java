package com.microservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
