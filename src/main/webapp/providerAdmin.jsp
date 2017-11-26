<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<body>
	<div class="menu">

		<table>
			<tbody>
				<tr>
					<td><form method="post" action="searchprovider">
							<input name="flag" value="search" type="hidden"> 供应商名称：<input
								name="pname" class="input-text" type="text">
							&nbsp;&nbsp;&nbsp;&nbsp;供应商描述：<input name="pdecription"
								class="input-text" type="text">&nbsp;<input
								value="组 合 查 询" type="submit">
						</form></td>
				</tr>
			</tbody>
		</table>
	</div>
	<div class="main">
		<div class="optitle clearfix">
			<em><input value="添加数据" class="input-button"
				onclick="window.location='providerAdd.jsp'" type="button"></em>
			<div class="title">供应商管理&gt;&gt;</div>
		</div>

		<div class="content">
			<table class="list">
				<tbody>
					<tr>
						<td width="70" height="29"><div class="STYLE1" align="center">编号</div></td>
						<td width="80"><div class="STYLE1" align="center">供应商名称</div></td>
						<td width="100"><div class="STYLE1" align="center">供应商描述</div></td>
						<td width="100"><div class="STYLE1" align="center">联系人</div></td>

						<td width="100"><div class="STYLE1" align="center">电话</div></td>
						<td width="100"><div class="STYLE1" align="center">地址</div></td>
					</tr>
						<c:forEach items="${providers}" var="provider">
						<tr>
							<td height="23"><span class="STYLE1"> <c:out
										value="${provider.pid}"></c:out>
							</span></td>
							<td><span class="STYLE1"><a
									href="providerdetail.jsp?pid=${provider.pid}&pname=${provider.pname}&pdecription=${provider.pdecription}&plinkman=${provider.plinkman}&ptel=${provider.ptel}&paddress=${provider.paddress}">
										<c:out value="${provider.pname}"></c:out>
								</a></span></td>

							<td><span class="STYLE1"> <c:out
										value="${provider.pdecription}"></c:out>
							</span></td>
							<td><span class="STYLE1"> <c:out value="${provider.plinkman}"></c:out>
							</span></td>
							<td><span class="STYLE1"> <c:out value="${provider.ptel}"></c:out>
							</span></td>
							<td><span class="STYLE1"> <c:out
										value="${provider.paddress}"></c:out>
							</span></td>
				</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>
		<jsp:include page="fenye.jsp" flush="true"></jsp:include>
	</div>
</body>
</html>