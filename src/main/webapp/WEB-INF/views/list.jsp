<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>显示用户</h3>
    ${users}
    <table border="1">
        <tr>
            <td>用户名</td>
            <td>密码</td>
        </tr>

            <c:forEach items="${users}" var="user">
                <tr>
                     <td>${user.username}</td>
                     <td>${user.password}</td>
              </tr>
            </c:forEach>
    </table>

</body>
</html>
