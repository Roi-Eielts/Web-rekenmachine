<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>rekenmachine spr8</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href=css/style.css">
</head>
<body>
<div class="container">
    <div>
        <div class="container">
            <s:form action="rekenmachine" method="post">
                <s:textfield required="true" name="getal1" label="getal1"></s:textfield><br>
                <p>choose from: +, -, *, /, ^2 and ^n as opperator</p>
                <s:textfield required="true" name="opperator" label="operator"></s:textfield><BR>
                <s:textfield name="getal2" label="getal2"></s:textfield><BR>
                <s:submit value="=" align="center" style="margin-left:60px; width:60px;"/>
            </s:form>

            <h3>${resultaat}</h3>
        </div>
    </div>
</div>
</body>
</html>
