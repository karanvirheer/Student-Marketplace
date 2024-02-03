package com.cps630.nexus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cps630.nexus.entity.Advertisement;

@Repository
public interface AdvertisementRepository extends JpaRepository<Advertisement, Integer> {
	@Query(value =	"SELECT * FROM advertisement WHERE category_id = :categoryId", nativeQuery = true)
	public List<Advertisement> findAllByCategoryId(@Param("categoryId") Integer categoryId);
}