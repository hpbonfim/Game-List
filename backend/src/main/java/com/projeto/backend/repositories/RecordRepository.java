package com.projeto.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.backend.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long>{
	
/*	@Query("SELECT obj FROM Record obj WHERE " 
			+ "(coalesce(:min, null) IS NULL OR obj.moment >= :min) AND "
			+ "(coalesce(:max, null) IS NULL OR obj.moment <= :max)")
	Page<Record> findByMoments(Instant min, Instant max, Pageable pageable);
*/
}
