package com.ZTI2018.ZTI_SimpleToDo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ZTI2018.ZTI_SimpleToDo.model.User;



@Repository
public interface IUserRopository extends JpaRepository<User, Long>
{
	// here you can put any declaration like findByTech, getByTech etc and the method will be generated automatically
	// findByIdGreaterThan
	
	// own queries JPQL
	// @Query("from User where tech=? order by name") or ?1 ?2 multiple entries 
	// List<User> findByTechSorted(String tech)
}
