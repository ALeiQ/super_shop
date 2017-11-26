<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
<script type="text/javascript">
	function checkit() {
		//判断是否是数字的正则表达式
		return true;
	}
</script>
</head>
<body>
	<div class="main">
		<div class="optitle clearfix">
			<div class="title">账单管理&gt;&gt;</div>

		</div>
		<form id="form1" name="form1" method="post" action="updateaccount"
			onsubmit="return checkit();">
			<input type="hidden" name="aid" value="${param.aid}">
			<div class="content">
				<table class="box">
					<font color="red"></font>

					<tr>
						<td class="field">商品名称：</td>
						<td><input type="text" name="aname" class="text"
							id="textfield2" value="${param.aname}" /> <font color="red">*</font></td>
					</tr>
					<tr>
						<td class="field">商品数量：</td>

						<td><input type="text" value="${param.acount}"
							name="acount" class="text" id="textfield2" /> <font
							color="red">*</font></td>
					</tr>

	<tr>
						<td class="field">交易金额：</td>

						<td><input type="text" value="${param.amoney}"
							name="amoney" class="text" id="textfield2" /> <font
							color="red">*</font></td>
					</tr>
					<tr>
						<td class="field">是否付款：</td>
						<td><select name="aispay" id="select">
								<c:if test="${param.aispay==1}">
								<option value="1" selected="selected">已付款</option>
								<option value="0">未付款</option>
								</c:if>
								<c:if test="${param.aispay==0}">
								<option value="1" >已付款</option>
								<option value="0" selected="selected">未付款</option>
								</c:if>
						</select></td>
					</tr>

					<tr>
						<td class="field">供应商名称：</td>
						<td><input type="text" value="${param.apname }" name="apname"
							class="text" id="textfield2" /> <font color="red">*</font></td>
					</tr>
					<tr>
						<td class="field">商品描述：</td>
						<td><textarea name="ainfo" id="textarea" class="text"
								cols="45" rows="5">${param.ainfo}</textarea></td>
					</tr>
					
				</table>
			</div>
			<div class="buttons">

				<input type="submit" name="button" id="button" value="修改"
					class="input-button" /> <input type="submit" name="button"
					id="button" value="删除" class="input-button" /> <input
					type="button" name="button" id="button"
					onclick="window.location='allaccount';" value="返回"
					class="input-button" />
			</div>

		</form>
	</div>
</body>
</html>