<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>系统登录 - 超市账单管理系统</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
	<script type="text/javascript">
function checkForm() {
		var flag=true;
		var name=document.getElementById("uname");
		var name_value=name.value;
		var reg=new RegExp("^([a-z]|[A-Z]){6,14}$");
		var name_result=reg.test(name_value);
		alert(name_result);
		var error_name=document.getElementById("uname_error");
		if(name_result){
			error_name.innerHTML="用户名正常可以使用";
			error_name.style.color="green";
		}
		else{
			error_name.innerHTML="用户名的格式不对,请输入6-14位的字母";
			error_name.style.color="red";
			flag=false;
		}
		var password=document.getElementById("upassword");
		var password_value=password.value;
		var reg2=new RegExp("^[0-9]{6,8}$");
		var password_result=reg2.test(password_value);
		var error_pwd=document.getElementById("password_error");
		if(password_result){
			error_pwd.innerHTML="密码正常可以使用";
			error_pwd.style.color="green";
		}
		else{
			error_pwd.innerHTML="密码的格式不对,请输入6-8位的数字";
			error_pwd.style.color="red";
			flag=false;
		}
	return flag;
}
</script>
</head>
<body class="blue-style">
	<div id="login">
		<div class="icon"></div>
		<div class="login-box">
			<form method="post" action="login" onsubmit="return checkForm()">
				<dl>
					<dt>用户名：</dt>
					<dd>
						<input type="text" name="uname" id="uname" class="input-text" />
						<span id="uname_error"></span>
					</dd>
					
					<dt>密 码：</dt>
					<dd>
						<input type="password" name="upassword" id="upassword" class="input-text" />
						<span id="password_error"></span>
					</dd>
					</dl>
				<div class="buttons">
					<input type="submit" name="submit" value="登录系统"
						class="input-button"/> <input type="reset" name="reset"
						value="重　　填" class="input-button" />
				</div>
			</form>
		</div>
	</div>
</body>
</html>
