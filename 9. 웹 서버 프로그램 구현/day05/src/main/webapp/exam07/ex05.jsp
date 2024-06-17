<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="date" value="<%=new Date()%>" />
서울 : <fmt:formatDate value="${date}" type="both" /> <br>


<fmt:timeZone value="America/New_York">
뉴욕 : <fmt:formatDate value="${date}" type="both" /> <br>
</fmt:timeZone>


<fmt:setTimeZone value="Europe/London" />
런던 : <fmt:formatDate value="${date}" type="both" /> <br>


