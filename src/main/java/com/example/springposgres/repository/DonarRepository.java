package com.example.springposgres.repository;

import com.example.springposgres.model.Customer;
import com.example.springposgres.model.Donar;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DonarRepository extends CrudRepository<Donar, Long>{

	List<Donar> findAll();

    @Query(value = "SELECT * FROM donar_details u WHERE u.name like "+ "%" +":searchText" + "%", nativeQuery = true)
    List<Donar> searchDonarsList(String searchText);
}