package com.dev32.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev32.user.dao.UserDao;
import com.dev32.user.dto.UserDTO;
import com.thedeanda.lorem.LoremIpsum;

@Service
public class UserService {
	@Autowired
	private UserDao dao;
	public String getRandomName() {
		LoremIpsum loremIpsum = new LoremIpsum();
		String result = loremIpsum.getName();
		return result;
	}
	public List<UserDTO> list(){
		return dao.list();
	}
}
