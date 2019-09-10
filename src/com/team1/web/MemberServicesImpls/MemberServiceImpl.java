package com.team1.web.MemberServicesImpls;

import com.team1.web.DAOs.MemberDAO;
import com.team1.web.MemberDAOImpls.MemberDAOImpl;
import com.team1.web.MemberDomains.MemberBean;
import com.team1.web.MemberServices.MemberService;

public class MemberServiceImpl implements MemberService{
	private MemberDAO dao;
	
	public MemberServiceImpl() {
		dao = new MemberDAOImpl();
	}
	
	@Override
	public void join(MemberBean param) {
	dao.insertMember(param);
	}

	@Override
	public MemberBean login(MemberBean param) {
		return dao.login(param);
	}

}
