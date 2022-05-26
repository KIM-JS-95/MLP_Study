<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*, webapp.utility.*" %>
<jsp:useBean id="dto" class="webapp.bbs.BbsDTO" />
<jsp:useBean id="dao" class="webapp.bbs.BbsDAO" />
<jsp:setProperty name="dto" property="*"/>
<%
     boolean flag = dao.create(dto);
     if(flag){
%>

<script>
	alert("등록되었습니다.");
</script>

<%
      }
      else{
%>
<script>
        alert("등록에 실패입니다.");
</script>
<%
      }
%>

<!DOCTYPE html>
<html>
<head>
  <title>게시판생성</title>
  <meta charset="utf-8">
</head>
<body>
<jsp:include page="./menu/top.jsp"/>
<div class="container">
<div class="well well-lg">
</div>
    <button class="btn"
    onclick="location.href='createForm.jsp'"
    >다시 등록</button>
    <button type="button" class="btn"
    onclick="location.href='list.jsp'"
    >목록</button>

 </div>

</body>
</html>