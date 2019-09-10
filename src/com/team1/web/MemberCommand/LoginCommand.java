package com.team1.web.MemberCommand;

import javax.servlet.http.HttpServletRequest;

import com.team1.web.MemberDomains.MemberBean;
import com.team1.web.MemberServices.MemberService;
import com.team1.web.MemberServicesImpls.MemberServiceImpl;

public class LoginCommand extends Command{
	public LoginCommand(HttpServletRequest request) throws Exception{
		setRequest(request);
		setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
		setPage(request.getParameter("page"));
		setAction(request.getParameter("action"));
		execute();
	}
	@Override
	public void execute() {
		super.execute();
		
		MemberBean param = new MemberBean();
		MemberService service = new MemberServiceImpl();
		param.setId(request.getParameter("id"));
		param.setPw(request.getParameter("pw"));
		MemberBean cust = service.login(param);
		
		if(cust == null) {
			request.setAttribute("LOGIN", "FAIL");
		}else {
			request.setAttribute("member",cust);
			request.setAttribute("LOGIN", "SUCCESS");
		}
	}
}
