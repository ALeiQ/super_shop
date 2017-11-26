<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
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
			<div class="title">供应商管理&gt;&gt;</div>

		</div>
		<form id="form1" name="form1" method="post" action="deleteorupdate"
			onsubmit="return checkit();">
			<input type="hidden" name="pid" value="${param.pid}">
			<div class="content">
				<table class="box">
					<font color="red"></font>

					<tr>
						<td class="field">供应商名称：</td>
						<td><input type="text" name="pname" class="text"
							id="textfield2" value="${param.pname}" /> <font color="red">*</font></td>
					</tr>
					<tr>
						<td class="field">供应商描述：</td>

						<td><input type="text" value="${param.pdecription}"
							name="pdecription" class="text" id="textfield2" /> <font
							color="red">*</font></td>
					</tr>

					<tr>
						<td class="field">联系人：</td>
						<td><input type="text" value="${param.plinkman}" name="plinkman"
							class="text" id="textfield2" /> <font color="red">*</font></td>
					</tr>
					<tr>
						<td class="field">供应商电话：</td>
						<td><input type="text" name="ptel" value="${param.ptel }"
							class="text" id="textfield2" /> <font color="red">*</font></td>

					</tr>
					<tr>
						<td class="field">供应商地址：</td>
						<td><textarea name="paddress" id="textarea" class="text"
								cols="45" rows="5">${param.paddress}</textarea></td>
					</tr>
				</table>
			</div>
			<div class="buttons">

				<input type="submit" name="button" id="button" value="修改"
					class="input-button" /> <input type="submit" name="button"
					id="button" value="删除" class="input-button" /> <input
					type="button" name="button" id="button"
					onclick="window.location='userlist';" value="返回"
					class="input-button" />
			</div>

		</form>
	</div>
</body>
</html>