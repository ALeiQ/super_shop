<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#page").change(function() {
			window.location.href="${request.getServletPath}?pageNum="+$("#page").val()+"&pageSize=${pageInfo.pageSize}&uname=${param.uname}&pname=${param.pname}&pdecription=${param.pdecription}&aname=${param.aname}&aispay=${param.aispay}";	
		})
	})
</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
			<c:if test="${!pageInfo.isFirstPage}">
			<a href="${request.getServletPath}?pageNum=${pageInfo.prePage}&pageSize=${pageInfo.pageSize}&uname=${param.uname}&pname=${param.pname}&pdecription=${param.pdecription}&aname=${param.aname}&aispay=${param.aispay}">上一页</a>
			</c:if>
			<c:if test="${!pageInfo.isLastPage}">
			<a href="${request.getServletPath}?pageNum=${pageInfo.nextPage}&pageSize=${pageInfo.pageSize}&uname=${param.uname}&pname=${param.pname}&pdecription=${param.pdecription}&aname=${param.aname}&aispay=${param.aispay}">下一页</a>
			</c:if>
			<a href="${request.getServletPath}?pageNum=${pageInfo.firstPage}&pageSize=${pageInfo.pageSize}&uname=${param.uname}&pname=${param.pname}&pdecription=${param.pdecription}&aname=${param.aname}&aispay=${param.aispay}">首页</a>
			<a href="${request.getServletPath}?pageNum=${pageInfo.lastPage}&pageSize=${pageInfo.pageSize}&uname=${param.uname}&pname=${param.pname}&pdecription=${param.pdecription}&aname=${param.aname}&aispay=${param.aispay}">尾页</a>
		</div>
		<div>
			选择页码<select name="page" id="page">
				<c:forEach begin="1" end="${pageInfo.pages}" varStatus="st">
				<c:choose>
				<c:when test="${st.count==param.pageNum}">
					<option value="${st.count}" selected="selected">第${st.count}页</option>
				</c:when>
				<c:otherwise>
					<option value="${st.count}">第${st.count}页</option>
				</c:otherwise>
				</c:choose>	
				</c:forEach>
			</select>
		</div>
</body>
</html>