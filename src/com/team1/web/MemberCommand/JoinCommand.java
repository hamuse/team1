package com.team1.web.MemberCommand;

import javax.servlet.http.HttpServletRequest;

import com.team1.web.MemberDomains.MemberBean;
import com.team1.web.MemberServices.MemberService;
import com.team1.web.MemberServicesImpls.MemberServiceImpl;

public class JoinCommand extends MoveCommand{
	public JoinCommand(HttpServletRequest request) throws Exception{
		super(request);
	}
	@Override
	public void execute() {
		super.execute();
		MemberBean param = new MemberBean();
		MemberService service = new MemberServiceImpl();
		param.setCredit(request.getParameter("credit"));
		param.setId(request.getParameter("id"));
		param.setName(request.getParameter("name"));
		param.setPw(request.getParameter("pw"));
		param.setSsn(request.getParameter("ssn"));
		service.join(param);
		Receiver.cmd.setPage("login");
		
	}
}
