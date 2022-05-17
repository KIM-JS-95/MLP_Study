<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%--  new suggest.SuggestDAO랑 같은 의미다 생각 --%>
<jsp:useBean id="dao" class="SuggestDAO"/> 
<%
	request.setCharacterEncoding("utf-8"); // 요청지에서 post방식으로 보낸 한글 처리 코드
	String keyword = request.getParameter("keyword");
	System.out.println(keyword);
	int count = dao.getCount(keyword);
	List<String> list = dao.getsqlquery(keyword);
	
	out.print(count + "|");
	
	for(int i=0; i<list.size(); i++){
		count = count -1;
		String key = list.get(i);
		out.print(key);
		if(count > 0){
			out.print(",");
		}
	}
	
%>