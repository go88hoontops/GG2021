package GG2021.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import GG2021.dao.AdminDao;
import GG2021.model.Member;

@Service
public class AdminService {
	@Autowired
	private AdminDao dao;
	
	public List<Member> getMemberList()	{
		return dao.getMemberList();
	}
	
	public int getMemberCount() {
		return dao.getMemberCount();
	}
}
