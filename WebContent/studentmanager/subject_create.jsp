<%-- 科目登録画面 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="../common/base.jsp">
	<c:param name="title">
		得点管理システム
	</c:param>
	<c:param name="content">
	<section class="mp-4">
	<h2 class="h3 mb-3 fw-norma bg-secondary bg-opacity-10 py-2 px-4">科目情報登録</h2>
	<form action="SubjectCreateExecute.action" method="post">
	<p>科目コード<br><input type="text" name="subject_cd" value="科目コードを入力してください" size="95"></p>
	<p>科目名<br><input type="text" name="subject_name" value="科目名を入力してください" size="95"></p>
	<input type="button" onclick="location.href='href'../studentmanager/subject_create_done.jsp" value="登録">
	<a href="../studentmanager/subject_list.jsp">戻る</a>

	</form>
	</section>
	</c:param>
</c:import>