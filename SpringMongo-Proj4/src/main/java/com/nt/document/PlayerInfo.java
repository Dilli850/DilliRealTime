package com.nt.document;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class PlayerInfo {
@Id
private Integer pid;
private String pname;
private String paddrs;
private List<String> nicknames;
private Set<Long> conactNumbers;
private String[] friends;
private Map<String, String> impknocks;
private Properties idDetails;


}
