package com.example.springposgres.controller;

import com.example.springposgres.model.Donar;
import com.example.springposgres.repository.DonarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class DonarController {
	@Autowired
	DonarRepository repository;
	
	@RequestMapping("/saveDonarRegistration")
	public Donar saveDonarRegistration(@RequestBody Donar donar){
		System.out.println(" donar details to be saved" + donar.toString());
		Donar savedDonar = repository.save(donar);
		return savedDonar;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/viewDonarsList")
	public List<Donar> searchDonarsList(){
		System.out.println(" view donars list");
		return repository.findAll();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/searchDonarsList/{searchText}")
	public List<Donar> viewDonarsList(@PathVariable("searchText") String searchText){
		System.out.println(" view donars list");
		return repository.searchDonarsList(searchText);
	}


	@DeleteMapping("/deleteDonar/{id}")
	public void deleteDonar(@PathVariable("id") String id){
		System.out.println(" delete donar called");
		 repository.deleteById(Long.valueOf(id));
	}

}