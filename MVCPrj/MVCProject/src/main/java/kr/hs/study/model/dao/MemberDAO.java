package kr.hs.study.model.dao;

import java.util.List;

import kr.hs.study.model.dto.MemberDTO;

public interface MemberDAO {
	
	public List<MemberDTO> list();						// select
	public void insert(MemberDTO dto);					// insert
	public MemberDTO read(String userid);				// select where userid
	public boolean Check(String userid, String passwd);	// check password
	public void update(MemberDTO dto);					// update
	public void delete(String userid);					// delete where userid
	
}
