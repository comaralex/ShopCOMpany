<%-- 
    Document   : catalog
    Created on : 13.12.2016, 16:39:01
    Author     : COMar-PC
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>${lang.tr("ShopCOMpany")}: ${lang.tr("Catalog")}</title>
        <link href="<c:url value='/css/style.css'/>" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <%@ include file="/WEB-INF/includes/profile.jspf" %>
        <%@ include file="/WEB-INF/includes/header.jspf" %>
        <div class="content-block container clearfix">
            <form action="" method="get" class="search-block">
                <input class="search" name="word" type="text"
                       placeholder="${lang.tr("Find a movie by title")}" value="">
                <input type="submit" class="search-submit" value="">
            </form>
            <%@ include file="/WEB-INF/includes/catalog.jspf" %>
        </div>
    </body>
</html>
