package com.team1.web.MemberDAOImpls;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.concurrent.ExecutionException;

import com.team1.web.DAOs.MemberDAO;
import com.team1.web.MemberDomains.MemberBean;
import com.team1.web.Memberpools.Constants;

public class MemberDAOImpl implements MemberDAO{

	@Override
	public void insertMember(MemberBean param) {
		try {
			File file = new File(Constants.FILE_PATH+"member.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
			writer.write(String.format("%s,%s,%s,%s,%s", param.getId(),param.getPw(),param.getName(),param.getSsn(),param.getCredit()));
			writer.newLine();
			writer.flush();
			writer.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public MemberBean login(MemberBean param) {
		MemberBean member = null;
		try {
			File file = new File(Constants.FILE_PATH+"member.txt");
			
			@SuppressWarnings("resource")
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String[] user = reader.readLine().split(",");
			if(user[0].equals(param.getId())&&user[1].equals(param.getPw())) {
				member = new MemberBean();
				member.setId(user[0]);						
				member.setPw(user[1]);
				member.setName(user[2]);
				member.setSsn(user[3]);
				member.setCredit(user[4]);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return member;
	}

}
