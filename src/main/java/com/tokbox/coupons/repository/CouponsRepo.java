package com.tokbox.coupons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tokbox.coupons.model.Coupons;

@Repository
public interface CouponsRepo extends JpaRepository<Coupons,String>{
	
}
