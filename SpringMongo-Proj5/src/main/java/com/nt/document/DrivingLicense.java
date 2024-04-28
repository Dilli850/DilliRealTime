package com.nt.document;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class DrivingLicense {
	@Id
	private Long licenseNo;
	private String type;
	private LocalDate expiryTime;
	private Person personDetails;
//	@Override
//	public String toString() {
//		return "DrivingLicense [licenseNo=" + licenseNo + ", type=" + type + ", expiryTime=" + expiryTime
//				+ ", personDetails=" + personDetails + "]";
//	}
	
	

}
