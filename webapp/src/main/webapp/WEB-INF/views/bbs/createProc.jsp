<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/ssi/ssi_bbs.jsp" %>
<jsp:useBean id="dao" class="bbs.BbsDAO" />
<jsp:useBean id="dto" class="bbs.BbsDTO" />
<jsp:setProperty name="dto" property="*"/>
<%
   boolean flag = dao.create(dto);
%>
<!DOCTYPE html>
<html>
<head>
  <title>게시판생성</title>
  <meta charset="utf-8">
</head>
<body>
<jsp:include page="/menu/top.jsp"/>
<div class="container">
<div class="well well-lg">
<%
   if(flag){
     out.print("글 등록 성공입니다.");
   }else{
     out.print("글 등록 실패입니다.");
   }

%>

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