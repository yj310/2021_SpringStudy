package kr.hs.study.model.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.hs.study.model.dto.MemberDTO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	SqlSessionTemplate sqlsessiontemplate;
	
	public List<MemberDTO> list() {
		// TODO Auto-generated method stub
		return sqlsessiontemplate.selectList("member.getlist");
	}

	public void insert(MemberDTO dto) {
		// TODO Auto-generated method stub
		sqlsessiontemplate.insert("member.addMember", dto);
	}

	public MemberDTO read(String userid) {
		// TODO Auto-generated method stub
		return sqlsessiontemplate.selectOne("member.read", userid);
	}

	public boolean Check(String userid, String passwd) {
		// TODO Auto-generated method stub
		boolean result = false;
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("userid", userid);
		map.put("passwd", passwd);
		
		int count = sqlsessiontemplate.selectOne("member.check", map);
		
		if(count == 1)
			result = true;

		return result;
	}

	public void update(MemberDTO dto) {
		// TODO Auto-generated method stub
		sqlsessiontemplate.update("member.update", dto);
	}

	public void delete(String userid) {
		// TODO Auto-generated method stub
		sqlsessiontemplate.delete("member.delete", userid);
	}

}
