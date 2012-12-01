<%@page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
 <head>
  <meta charset="utf-8">
  <title>radiobuttonのサンプル</title>
 </head>
 <body>
  <form:form modelAttribute="radiobuttonModel">
   <form:radiobutton path="sendMail" label="今後XX社からのメールを受け取る" value="send" />
  </form:form>
 </body>
</html>
