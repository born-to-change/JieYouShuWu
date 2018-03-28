<%@ page contentType="text/html;charSet=GBK" language="java" import="java.util.*" pageEncoding="GBK"  %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>ϵͳ??ҳ</title>
</head>

<body>
<br><br>
<center>?û?ע????ϵͳ??¼</center>

<center>
    <form method="get" action="/testLogin/register.jsp">
        username:
        <input type="text" name="username"/>
        password:
        <input type="password" name="password"/>
        <br><br><br>
        <input type="submit" value="ע??">
    </form>

    <form method="get" action="/testLogin/login.jsp">
        username:
        <input type="text" name="username">
        password:
        <input type="password" name="password">
        <br><br>
        <input type="submit" value="??¼">
    </form>
</center>
</body>
</html>
