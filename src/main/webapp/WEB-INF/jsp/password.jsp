<%@page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
 <head>
  <meta charset="utf-8">
  <title>passwordのサンプル</title>
 </head>
 <body>
  <form:form modelAttribute="passwordModel">
   <form:label path="password1">パスワード:</form:label><!--
--><form:password path="password1" size="40" /><br>
   <form:label path="password2">パスワード（表示）:</form:label><!--
--><form:password path="password2" size="40" showPassword="true" /><br>
  </form:form>
 </body>
</html>
