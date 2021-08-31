package kr.hs.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hs.study.model.dao.MemberDAO;
import kr.hs.study.model.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDAO dao;
	
	public List<MemberDTO> list() {
		// TODO Auto-generated method stub
		return dao.list();
	}

	public void insert(MemberDTO dto) {
		// TODO Auto-generated method stub
		dao.insert(dto);
	}

	public MemberDTO read(String userid) {
		// TODO Auto-generated method stub
		return dao.read(userid);
	}

	public boolean Check(String userid, String passwd) {
		// TODO Auto-generated method stub
		return dao.Check(userid, passwd);
	}

	public void update(MemberDTO dto) {
		// TODO Auto-generated method stub
		dao.update(dto);
	}

	public void delete(String userid) {
		// TODO Auto-generated method stub
		dao.delete(userid);
	}

}
