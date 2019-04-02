<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>List of Topics</title>
</head>
<body>
<!--Heading of the page-->
<h1>Select a Topic</h1>
<!--Include Icon  -->
<!--Nav Bar -->
<ul>
    <li><a href ="/welcome.co">Welcome Page</a></li>
</ul>
<!--Join a conversation on a Topic to share your message-->

<p>Please enter a topic that doesn't exist already. If the topic exists, join the conversation.</p>

<ol>
    <c:forEach items="${topics}" var="topic">
        <h2>${topic.topic}  &nbsp; &nbsp;
            <a href="/message.co"><input type="button" name="join" value="Join Conversation"/></a>
            <a href="/deletetopic.co?topic=${topic.topic}"><input type="button" name="delete" value="Delete Topic"/></a>
        </h2>
    </c:forEach>
</ol>
<form action="/listtopic.co" method ="post">
    <input type="text" name="topic"/> <input type="submit" value="Add"/>
</form>
<!--Develop a Post Message Section to Let the User share Message-->
</body>
</html>
