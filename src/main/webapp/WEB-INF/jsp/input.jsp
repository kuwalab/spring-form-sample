<%@page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
 <head>
  <meta charset="utf-8">
  <title>inputのサンプル</title>
  <style type="text/css">
.error {
  background-color: #f00;
}
  </style>
 </head>
 <body>
  <form:form modelAttribute="inputModel" action="inputSend" method="post">
   <form:errors path="*" />
   <form:label path="name">名前:</form:label><form:input path="name" size="40" /><br>
   <form:label path="age">年齢:</form:label><form:input path="age" size="5" cssErrorClass="error" /><br>
   <input type="submit" value="送信">
  </form:form>
 </body>
</html>
