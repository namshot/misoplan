package service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AccompanyBoardDto;
import dao.MemberDao;

public class AdminPartyFormAction implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			MemberDao dao = MemberDao.getInstance();
			List<AccompanyBoardDto> list = dao.selectAdminPartyList();
			
			request.setAttribute("list", list);
			request.setAttribute("totCnt", list.size());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return "adminPartyForm.jsp";
	}

}