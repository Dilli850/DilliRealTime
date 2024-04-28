package com.nt.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Student {
	
	@Id
	private Integer sid;
	private String Sname;
	private double Sfee;

}
