<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*, webapp.bbs.BbsDTO, webapp.utility.*" %>
<jsp:useBean id="dao" class="webapp.bbs.BbsDAO" />

<%
     int bbsno = Integer.parseInt(request.getParameter("bbsno"));
     boolean flag = dao.delete(bbsno);
     if(flag){
%>

<script>
	alert("삭제되었습니다.");
</script>

<%
      }
      else{
%>
<script>
        alert("글 삭제 실패입니다.");
</script>
<%
      }
%>
