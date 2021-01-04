package com.focat;

import org.apache.log4j.Logger;



public class ControllerMapper {
	Logger logger = Logger.getLogger(ControllerMapper.class);
	public static Action getController(String command, String saveDir) {
		Action action = null;
		String commands[] = command.split("/");
		if(commands.length == 2) {
			String work = commands[0];//member
			String requestName = commands[1];
			if("member".equals(work)) {
				action = new MemberController(requestName,saveDir);
			}
			else if("cat".equals(work)) {
				action = new CatController(requestName,saveDir);
			}
			else if("firstB".equals(work)) {
				action = new FirstBController(requestName,saveDir);
			}
			else if("secondB".equals(work)) {
				action = new SecondBController(requestName,saveDir);
			}
		}
		return action;
	}
}