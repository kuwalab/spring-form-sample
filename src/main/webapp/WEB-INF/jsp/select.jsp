<%@page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
 <head>
  <meta charset="utf-8">
  <title>selectのサンプル</title>
 </head>
 <body>
  <form:form modelAttribute="selectModel">
   <form:select path="selectedIsbn" items="${books}" itemLabel="title" itemValue="isbn" /><br>
   <form:select path="selectedIsbns" items="${books}" itemLabel="title" itemValue="isbn" size="3" multiple="true" />
  </form:form>
 </body>
</html>
