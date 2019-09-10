package com.team1.web.MemberControllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.team1.web.MemberCommand.Receiver;
import com.team1.web.MemberCommand.Sender;
import com.team1.web.MemberEnums.Action;


@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Receiver.init(request);
		String action = (request.getParameter("action")==null)?"MOVE":Action.valueOf(request.getParameter("action").toUpperCase()).toString();
		switch (Action.valueOf(action)) {
		case LOGIN:
			if(request.getAttribute("LOGIN").equals("SUCCESS")) {
				Sender.forward(request,response);
			}else {
				Sender.redirect(request,response,"/member.do?page=login");
			}
			break;
		default:
			Sender.forward(request,response);
			break;
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
