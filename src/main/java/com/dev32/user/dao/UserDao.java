package com.dev32.user.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dev32.user.dto.UserDTO;

@Repository
public class UserDao {

	@Autowired
	private SqlSession session;

	private static String namespace = "com.dev32.user.dao.UserMapper";

	public List<UserDTO> list() {
		return session.selectList(namespace + ".list");
	}

}