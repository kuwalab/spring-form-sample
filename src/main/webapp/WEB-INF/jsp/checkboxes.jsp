<%@page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
 <head>
  <meta charset="utf-8">
  <title>checkboxesのサンプル</title>
 </head>
 <body>
  <form:form modelAttribute="checkboxesModel" action="checkboxesPost" method="get">
   <form:checkboxes path="selectedIsbns" items="${books}" itemLabel="title" itemValue="isbn" delimiter="&nbsp;<span style='color: #f00;'>｜</span>&nbsp;" />
   <input type="submit" value="送信">
  </form:form>
 </body>
</html>
