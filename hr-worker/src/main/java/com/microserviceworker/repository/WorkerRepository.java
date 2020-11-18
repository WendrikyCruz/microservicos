package com.microserviceworker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microserviceworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
