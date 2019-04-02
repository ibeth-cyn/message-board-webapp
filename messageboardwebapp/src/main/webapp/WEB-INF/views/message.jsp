<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
   <title>Type a Message</title>
</head>
<body>
<!--Heading of the page-->
<h1>Type a Message</h1>
<!--Include Icon  -->
<!--Nav Bar -->
<ul>
    <li><a href ="/welcome.co">Welcome Page</a></li>
</ul>
    <li> <!--Messages Sent under each topic listed--></li>
    <h2> Topic : ${topic.topic}</h2>
    <input type="text" name="message"/>
    <input type="button" value="Send"/>
    <input type="button" value="Quit">
</body>
</html>
