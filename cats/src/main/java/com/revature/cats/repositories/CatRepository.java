package com.revature.cats.repositories;

import java.util.List;
import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.revature.cats.models.Cat;

// To have Spring Data JPA write CRUD methods for us, just extend JpaRepository
@Repository
public interface CatRepository extends JpaRepository<Cat, Integer> {
	//we now have CRUD methods
	
	// This should find cats by their name in our db
	// We can write methods that follow Spring Data JPA's conventions
	Cat findByName(String name);
	
	// We can also write methods and annotate them with @Query, which lets us write queries to implement a method
	// implement a method
	// this uses HQL, Hibernate Query Language. Like SQL, but refers to objects
	
	// this is a findAll that sorts by catId
	@Query("select c from Cat c order by c.catId")
	List<Cat> findAllSorted();
	
	// Retrieve all cats with names in a Set:
	@Query("select c from Cat c where c.name in :catNames")
	List<Cat> findCatsWithNamesInSet(Set<String> catNames);
}
