package com.katherinewyers.icdd.repository;

import com.katherinewyers.icdd.model.Schema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchemaRepository extends JpaRepository<Schema, Long> {
}