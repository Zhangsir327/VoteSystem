<%--
  Created by IntelliJ IDEA.
  User: zhangsirui
  Date: 15/12/21
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<s:actionerror cssStyle="color: red"/>
<s:fielderror cssStyle="color: red"/>
<s:form action="login" theme="simple">
    username: <s:textfield name="username" label="username"/><br>
    password: <s:password name="password" label="password"/><br>
    <s:submit value="submit"/><s:reset value="reset"/>
</s:form>

</body>
</html>
