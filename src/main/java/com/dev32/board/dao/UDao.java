package com.dev32.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dev32.board.dto.UserDTO;

@Repository
public class UDao implements IDao {

	@Autowired
	private SqlSession session;

	private static String namespace = "com.dev32.board.UDao";

	@Override
	public List<UserDTO> list() {
		return session.selectList(namespace + ".list");
	}
}