<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>


<jsp:useBean id="dao" class="SuggestDAO"/>
<%

	request.setCharacterEncoding("utf-8");
	String keyword = request.getParameter("keyword");

	int count = dao.getCount(keyword);
	List<String> list = dao.getsqlquery(keyword);
	
	for(int i=0; i<list.size(); i++){
		count = count -1;
		String key = list.get(i);
		if(count > 0){
			out.print(",");
		}
	}
	
%>