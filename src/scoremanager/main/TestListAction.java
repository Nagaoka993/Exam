package scoremanager.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Student;
import dao.
import tool.Action;

public class TestListAction extends Action{
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

		String ent_year_str = req.getParameter("ent_year");
		String class_num = req.getParameter("class_num");
		String subject_name = req.getParameter("subject_name");


		student_num = req.getParameter("student_num");

		//科目情報で検索されたときの処理
		if(ent_year_str!= null && class_num!=null && subject_name!=null){

		}
		//学生番号で検索された時の処理
		if(student_num != null){

		}
	}
}
