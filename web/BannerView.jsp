<%@ page import="net.ciklum.study.webfifteens.Banner" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: John
  Date: 6/5/13
  Time: 4:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Banner Display Page</title>
</head>
<body>
<%
    List<Banner> listToDisplay = (List<Banner>) application.getAttribute("listToDisplay");

    for (int i = 0; i < listToDisplay.size(); i++) {
       out.println("<tr>" + "<td>" + listToDisplay.get(i).toString() + "</td>");
       out.println("</tr>");
    }

%>


<form action="Banner.do" method="POST">
    <b>Username:</b>
    <input type="checkbox" name="displayType" value="Fixed">Display banners as is <br>
    <input type="checkbox" name="displayType" value="Random">Display random banners
    <input type="SUBMIT" value="Submit">
</form>

</body>
</html>