<%-- 
    Document   : product
    Created on : 20.10.2016, 11:28:01
    Author     : COMar-PC
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>${lang.tr("ShopCOMpany")}: ${prod.getMovieName()}</title>
        <link href="<c:url value='/css/style.css'/>" rel="stylesheet" type="text/css" />
        <link href="<c:url value='/css/product.css'/>" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <%@ include file="/WEB-INF/includes/profile.jspf" %>
        <header><%@ include file="/WEB-INF/includes/header.jspf" %></header>
        <h2>Hello World!</h2>
        <script>
            window.defaultPage = ${defaultPage};
        </script>
    </body>
</html>
