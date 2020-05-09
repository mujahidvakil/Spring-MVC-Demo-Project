<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Student Information form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
First Name: <form:input path="firstName" />
<br><br>
Last Name: <form:input path="lastName" />
<br><br>
Country:
 <form:select path="country">
  <form:options items="${student.countryOption }"/>
</form:select>
<br><br>
Favorite Language:
java <form:radiobutton path="favoriteLanguage" value="java"/>
c# <form:radiobutton path="favoriteLanguage" value="c#"/>
python <form:radiobutton path="favoriteLanguage" value="python"/>
C++ <form:radiobutton path="favoriteLanguage" value="C++"/>
<br><br>

Oprating System:
linux <form:checkbox path="opratingSystem" value="linux"/>
windows <form:checkbox path="opratingSystem" value="windows"/>
mac <form:checkbox path="opratingSystem" value="mac"/>

<br><br>
<input type="submit" value="submit"/>
</form:form>
</body>

</html>