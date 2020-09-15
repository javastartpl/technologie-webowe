<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP Test</title>
</head>
<body>
    <h1>This is HomePage</h1>
    <p>Example JSP page without Java code</p>
    <%!
        public void jspInit() {
            System.out.println("INIT");
        }

        public void jspDestroy() {
            System.out.println("DESTROY");
        }

    %>
</body>
</html>
