package co.edu.bootstraptest.home;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.bootstraptest.comm.Command;

public class Home implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 홈 페이지를 보여준다.
		return "home/home";
	}

}
