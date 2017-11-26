<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="shrio" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script src="js/jquery-1.8.3.min.js"></script>
<script>
	$(function() {
		$("#logout").click(function() {

			$.ajax({

				type : "get",
				url : "loginout",
				async : true,
				success : function(xhr) {
					if (xhr == 1) {
						//请求成功跳转页面
						//top最顶部的window对象
						window.top.location.href = "login.jsp"

					}
				}

			})

		})

	})
</script>
</head>
<body class="frame-bd">
	<ul class="left-menu">
		<li><a href="allaccount" target="mainFrame"><img
				src="images/btn_bill.gif" /></a></li>
		<!-- 涉及安全，权限一定不能使用js控制显隐 -->

		<shrio:hasRole name="经理">
			<li><a href="queryAll" target="mainFrame"><img
					src="images/btn_suppliers.gif" /></a></li>
			<li><a href="userlist" target="mainFrame"><img
					src="images/btn_users.gif" /></a></li>
		</shrio:hasRole>
		

		<li><a href="#" id="logout"><img src="images/btn_exit.gif" /></a></li>
	</ul>
</body>
</html>
