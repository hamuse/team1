package com.team1.web.MemberCommand;

import javax.servlet.http.HttpServletRequest;

import com.team1.web.Memberpools.Constants;

import lombok.Data;
@Data
public class Command implements Order{
	protected HttpServletRequest request;
	protected String action, domain, page, view;
	@Override
	public void execute() {
		this.view = String.format(Constants.VIEW_PATH, domain, page);
	}

}
