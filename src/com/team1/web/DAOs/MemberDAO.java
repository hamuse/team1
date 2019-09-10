package com.team1.web.DAOs;

import com.team1.web.MemberDomains.MemberBean;

public interface MemberDAO {
public void insertMember(MemberBean param);
public MemberBean login(MemberBean param);
}
