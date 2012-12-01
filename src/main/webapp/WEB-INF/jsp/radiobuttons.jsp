<%@page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
 <head>
  <meta charset="utf-8">
  <title>radiobuttonsのサンプル</title>
 </head>
 <body>
  <form:form modelAttribute="radiobuttonsModel">
   <form:radiobuttons path="selectedIsbn" items="${books}" itemLabel="title" itemValue="isbn" delimiter="&nbsp;" />
  </form:form>
 </body>
</html>
