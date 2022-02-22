
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="validation" method="post">}>
        <p>${question.question}</p><br>
        <input type="radio" id="option1" name="options" value="${question.option1}"/>
        <label for="option1">${question.option1}</label><br>
        <input type="radio" id="option2" name="options" value="${question.option2}"/>
        <label for="option2">${question.option2}</label><br>
        <input type="radio" id="option3" name="options" value="${question.option3}"/>
        <label for="option3">${question.option3}</label><br>
        <input type="radio" id="option4" name="options" value="${question.option4}"/>
        <label for="option4">${question.option4}</label><br>
        <button type="submit" name="next" id="next">Next</button>
</form>

</body>
</html>
