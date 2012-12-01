<%@page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
 <head>
  <meta charset="utf-8">
  <title>checkboxのサンプル</title>
 </head>
 <body>
  <form:form modelAttribute="checkboxModel">
   <form:checkbox path="sendMail" label="今後XX社からのメールを受け取る" />
  </form:form>
 </body>
</html>
