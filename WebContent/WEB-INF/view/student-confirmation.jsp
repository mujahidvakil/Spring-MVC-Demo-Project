<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>student confirmation</title>
</head>
<body>
<h1>student detail:</h1>
First Name : ${student.firstName} 
<br><br>
Last Name :${student.lastName }
<br><br>
Country :${student.country}
<br><br>
favourite Language: ${student.favoriteLanguage }
<br><br>
Oprating System: 
<ul>
<c:forEach var="temp" items="${student.opratingSystem}" >
<li>${temp}</li>
</c:forEach>
</ul>
</body>
</html>