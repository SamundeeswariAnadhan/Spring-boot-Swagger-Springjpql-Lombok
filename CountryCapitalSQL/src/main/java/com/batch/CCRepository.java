package com.batch;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CCRepository extends JpaRepository<Countrycapital, Long>{
	
}
