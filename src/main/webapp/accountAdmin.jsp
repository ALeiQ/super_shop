<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link type="text/css" rel="stylesheet" href="css/style.css" />

</head>
<body>
	<div class="menu">
		<form method="get" action="searchaccount">
			商品名称：<input type="text" name="aname" class="input-text" />&nbsp;&nbsp;&nbsp;&nbsp;
			是否付款：<select name="aispay">
				<option value="">请选择</option>
				<option value="1">已付款</option>
				<option value="0">未付款</option>
			</select>&nbsp;&nbsp;&nbsp;&nbsp; <input type="submit" name="submit"
				value="组合查询" class="button" />
		</form>
	</div>
	<div class="main">
		<div class="optitle clearfix">
			<em><input type="button" name="button" value="添加数据"
				class="input-button" onclick="location.href='accountAdd.jsp'" /></em>
			<div class="title">账单管理&gt;&gt;</div>
		</div>
		<div class="content">
			<table class="list">
				<tr>
					<td>账单编号</td>
					<td>商品名称</td>
					<td>商品数量</td>
					<td>交易金额</td>
					<td>是否付款</td>
					<td>供应商名称</td>
					<td>商品描述</td>
					<td>账单时间</td>
				</tr>
				<c:forEach items="${accounts}" var="account">
					<tr>
						<td height="23"><span class="STYLE1"> <c:out
									value="${account.aid}"></c:out>
						</span></td>
						<td><span class="STYLE1"><a
								href="accountdetail.jsp?aid=${account.aid}&aname=${account.aname}&acount=${account.acount}&amoney=${account.amoney}&aispay=${account.aispay}&apname=${account.apname}&ainfo=${account.ainfo}&atime=${account.atime}">
									<c:out value="${account.aname}"></c:out>
							</a></span></td>

						<td><span class="STYLE1"> <c:out
									value="${account.acount}"></c:out>
						</span></td>
						<td><span class="STYLE1"> <c:out
									value="${account.amoney}"></c:out>
						</span></td>
						<td><span class="STYLE1"> <c:out
										value="${account.aispay==1?'是':'否'}"></c:out>
						</span></td>
						<td><span class="STYLE1"> <c:out
									value="${account.apname}"></c:out>
						</span></td>
						<td><span class="STYLE1"> <c:out
									value="${account.ainfo}"></c:out>
						</span></td>
						<td><span class="STYLE1"> 
						<jsp:useBean id="dateObject" class="java.util.Date"></jsp:useBean>
						<jsp:setProperty property="time" name="dateObject" value="${account.atime}"/>
						<fmt:formatDate value="${dateObject}" pattern="yyyy-MM-dd HH:mm:ss" /> 
						</span></td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<jsp:include page="fenye.jsp" flush="true"></jsp:include>
	</div>
</body>
</html>
