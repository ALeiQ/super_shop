<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>

	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
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
			<div class="title">用户管理&gt;&gt;</div>

		</div>
		<form id="form1" name="form1" method="post" action="insertordelete"
			onsubmit="return checkit();">
			<input type="hidden" name="uid" value="${param.uid}">
			<div class="content">
				<table class="box">
					<font color="red"></font>
					<tr>
						<td class="field">用户名称：</td>
						<td><input type="text" name="uname" class="text"
							id="textfield2" value="${param.uname}" /> <font color="red">*</font></td>
					</tr>
					<tr>
						<td class="field">用户密码：</td>

						<td><input type="password" value="${param.upassword}"
							name="upassword" class="text" id="textfield2" /> <font
							color="red">*</font></td>
					</tr>


					<tr>
						<td class="field">用户性别：</td>
						<td><select name="usex" id="select">
								<c:if test="${param.usex==0}">
								<option value="1">男</option>
								<option value="0" selected="selected">女</option>
								</c:if>
								<c:if test="${param.usex==1}">
								<option value="1" selected="selected">男</option>
								<option value="0">女</option>
								</c:if>
						</select></td>
					</tr>

					<tr>
						<td class="field">用户年龄：</td>
						<td><input type="text" value="${param.uage }" name="uage"
							class="text" id="textfield2" /> <font color="red">*</font></td>
					</tr>
					<tr>
						<td class="field">用户电话：</td>
						<td><input type="text" name="utel" value="${param.utel }"
							class="text" id="textfield2" /> <font color="red">*</font></td>

					</tr>
					<tr>
						<td class="field">用户地址：</td>
						<td><textarea name="uaddress" id="textarea" class="text"
								cols="45" rows="5">${param.uaddress}</textarea></td>
					</tr>
					<tr>
						<td class="field">用户权限：</td>

						<td><c:if test="${param.uissupper==0}">
								<input type="radio" name="uissupper" id="auth" value="0"
									checked="checked" />普通用户
							<input type="radio" name="uissupper" id="auth" value="1" />经理
							
							</c:if> <c:if test="${param.uissupper==1}">
								<input type="radio" name="uissupper" id="auth" value="0" />普通用户
							<input type="radio" checked="checked" name="uissupper" id="auth"
									value="1" />经理
							
								</c:if></td>
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