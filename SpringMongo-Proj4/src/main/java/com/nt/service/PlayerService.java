package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.PlayerInfo;
import com.nt.repo.IPlayerRepo;
@Service
public class PlayerService implements IPlayrMgmtService {
@Autowired
private IPlayerRepo repo;
	@Override
	public String savePlayerInfo(PlayerInfo info) {
		// TODO Auto-generated method stub
		return "player info register with id"+repo.insert(info).getPid() ;
	}

}
