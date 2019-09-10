package com.team1.web.MemberCommand;

import com.team1.web.MemberEnums.*;
import javax.servlet.http.HttpServletRequest;

public class Commander {
	public static Command order(HttpServletRequest request) {
		String action= (request.getParameter("action")==null)?
				"MOVE": Action.valueOf(request.getParameter("action").toUpperCase()).toString();
		Command cmd = new Command();
		try {
			switch (Action.valueOf(action)) {
			case LOGIN: 
				cmd = new LoginCommand(request);				
				break;
			case JOIN:
				cmd = new JoinCommand(request);
				break;
			default :
				cmd = new MoveCommand(request);
				break;
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return cmd;
	}

}
