package com.spring.bioMedical.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.bioMedical.entity.Admin;
import com.spring.bioMedical.entity.User;

/**
 * 
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */
@Repository("adminRepository")
public interface AdminRepository extends JpaRepository<Admin, Integer> {

	Admin findByEmail(String user);
	
	List<Admin> findByRole(String user);
}