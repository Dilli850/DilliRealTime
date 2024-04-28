package com.nt.runner;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.PlayerInfo;
import com.nt.service.IPlayrMgmtService;
@Component
public class PlayerInfoRunner implements CommandLineRunner {
@Autowired
private IPlayrMgmtService service;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		PlayerInfo info=new PlayerInfo();
		info.setPid(1122);
		info.setPname("alki");
		info.setFriends(new String[] {"sachin","ahul","rohit","kohli"});
		info.setNicknames(List.of("man","bujji"));
		info.setConactNumbers(Set.of(12345L,234567L,546576879L));
		info.setImpknocks(Map.of("asia cup","34 runds","ipl","78runs"));
		Properties properties=new Properties();
		properties.put("aadhar", "785444554");
		properties.put("pancard", "hjsd5fdnfdfj");
		info.setIdDetails(properties);
		System.out.println(service.savePlayerInfo(info));
		

	}

}
