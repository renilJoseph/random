<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<html>
<body>
<h2>Hello World!</h2>

I am  feeling : ${mood.feeling} .

<a href="reason/?mood=${mood.feeling}">reason</a>


</body>
</html>
