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
            <%@ include file="/WEB-INF/includes/product.jspf" %>
        </div>
    </body>
</html>
