package com.team1.web.MemberCommand;

import javax.servlet.http.HttpServletRequest;

public class MoveCommand extends Command {
		public MoveCommand(HttpServletRequest request) throws Exception{
			setRequest(request);
			setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
			setPage(request.getParameter("page"));
			setAction(request.getParameter("action"));
			execute();
			
		}
}
