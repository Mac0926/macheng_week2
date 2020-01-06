<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/jquery-3.2.1.js"></script>
<title>Insert title here</title>
</head>



<script type="text/javascript">


	function upd(nid){
		
		location="upd.do?nid="+nid;
	}


</script>



<body>



	<form action="list.do" method="post">

		id:<input type="text" name="id" value="${vo.id }"> 公司名称:<input
			type="text" name="gongsiname" value="${vo.gongsiname }">
		公司地址:<input type="text" name="address" value="${vo.address }">
		公司资本:<input type="text" name="ziben" value="${vo.ziben }">
		<button>查询</button>

	</form>


	<table>
		<tr>
			<th>编号</th>
			<th>关键字</th>
			<th>描述</th>
			<th>公司名称</th>
			<th>主营产品</th>
			<th>地址</th>
			<th>注册资本</th>
			<th>成立时间</th>
			<th>年检日期</th>
			<th>备注</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${info.list }" var="n">
		<tr>
			<td>${n.nid }</td>
			<td>${n.nname }</td>
			<td>${n.nmiaoshu }</td>
			<td>${n.ngongsi }</td>
			<td>${n.nzhuying }</td>
			<td>${n.naddress }</td>
			<td>${n.nzhuce }</td>
			<td>${n.ntime }</td>
			<td>${n.ndata }</td>
			<td>${n.ntime }</td>
			<td>${n.nstatu }</td>
			<td>${n.nbeizhu }</td>
			<td>
				<input type="button" value="年检审核" onclick="upd(${n.nid})">
			</td>
		</tr>
		</c:forEach>
		<tr>
			<td>
				<a href="list.do?pageNum=1">首页</a>
				<a href="list.do?pageNum=${info.prePage }">上一页</a>
				<a href="list.do?pageNum=${info.nextPage }">下一页</a>
				<a href="list.do?pageNum=${info.pages }">尾页</a>
			</td>
		</tr>
	</table>



</body>
</html>