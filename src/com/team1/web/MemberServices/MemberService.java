package com.team1.web.MemberServices;

import com.team1.web.MemberDomains.MemberBean;

public interface MemberService {
	public void join(MemberBean param);
	public MemberBean login(MemberBean param);
}
