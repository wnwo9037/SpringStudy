<% @page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Index: ORM learning programming</title>
</head>
<body>
<h1>Title part</h1>
<div>
    <div>Very simple!</div>
    <!-- SpEl: Spring Expression Language 사용 -->
    <div th:text="${greeting}">Greeting</div>
</div>
</body>
</html>
