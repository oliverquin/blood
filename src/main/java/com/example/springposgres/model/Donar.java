package com.example.springposgres.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "donar_details")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Donar implements Serializable {

	private static final long serialVersionUID = -2343243243242432341L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;

	@Column(name = "bloodgroup")
	private String bloodgroup;

	@Column(name = "city")
	private String city;

}