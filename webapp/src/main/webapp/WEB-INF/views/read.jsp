<%@ page contentType="text/html; charset=UTF-8" %> 
<%@ page import="webapp.bbs.*" %>
<jsp:useBean id="dao" class="webapp.bbs.BbsDAO" />
<%
	int bbsno = Integer.parseInt(request.getParameter("bbsno"));
	dao.upViewcnt(bbsno); //조회수 증가
	BbsDTO dto = dao.read(bbsno); //한건의 레코드 조회
%>

<!DOCTYPE html> 
<html> 
<head>
  <title>homepage</title>
  <meta charset="utf-8">

</head>
<body> 
<jsp:include page="./menu/top.jsp"/>
<div class="container">
<h1>조회</h1>
<div class="panel panel-default">
	<div class="panel-heading">작성자</div>
	<div class="panel-body"><%=dto.getWname() %></div>
	<div class="panel-heading">제목</div>
	<div class="panel-body"><%=dto.getTitle() %></div>
	<div class="panel-heading">내용</div>
	<div class="panel-body" style='height:170px'><%=dto.getContent() %></div>
	<div class="panel-heading">조회수</div>
	<div class="panel-body"><%=dto.getViewcnt() %></div>
	<div class="panel-heading">등록일</div>
	<div class="panel-body"><%=dto.getWdate() %></div>
</div>
<div>
	<button>등록</button>
	<button onclick="javascript:update('<%=dto.getBbsno()%>')">수정</button>

	<button onclick="javascript:delete1('<%=dto.getBbsno()%>')">삭제</button>

	<button onclick="location.href='/bbs/list'">목록</button>
</div>
<br>
</div>

  <script type="text/javascript">
  	function update(bbsno){
  		let url = 'updateForm?bbsno='+bbsno;
  		location.href = url;
  	}
  </script>

  <script type="text/javascript">
  	function delete1(bbsno){
      	let url = 'deleteProc?bbsno='+bbsno;
      	location.href = url;
    }
  </script>

</body>
</html> 