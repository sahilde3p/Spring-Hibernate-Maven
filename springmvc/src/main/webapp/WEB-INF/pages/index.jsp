<%@ taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!</h2>

<c:forEach var="c" items="${theCustomers}">

${c.firstName} |  ${c.lastName}

<br>

</c:forEach>


</body>
</html>
