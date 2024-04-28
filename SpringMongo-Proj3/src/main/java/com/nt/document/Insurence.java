package com.nt.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Insurence  {
	@Id
	private Integer insurenceid;
	private String insurencename;
	private double insurencebrand;
	

}
