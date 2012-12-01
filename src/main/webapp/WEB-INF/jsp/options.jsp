<%@page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
 <head>
  <meta charset="utf-8">
  <title>optionsのサンプル</title>
 </head>
 <body>
  <form:form modelAttribute="optionsModel">
   <form:select path="selectedIsbn">
    <form:options items="${books}" itemLabel="title" itemValue="isbn" />
   </form:select><br>
  </form:form>
 </body>
</html>
