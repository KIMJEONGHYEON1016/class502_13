    <%@ page contentType="text/html; charset=UTF-8" %>
    <%@ page import="java.util.*" %>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
    <%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
    <c:set var="date" value="<%=new Date()%>" />
    <fmt:formatDate value="${date}" />
    type: date - <fmt:formatDate value="${date}" /> <br><br>
    type: time - <fmt:formatDate type="time" value="${date}" /> <br> <br>
    type: both - <fmt:formatDate type="both" value="${date}" />

    style: full - <fmt:formatDate type="both" value="${date}" dateStyle="full" timeStyle="full" /> <br> <br>
    style: short - <fmt:formatDate type="both" value="${date}" dateStyle="short" timeStyle="short" /> <br> <br>

    pattern - <fmt:formatDate type="both" value="${date}" pattern="yyyy.MM.dd HH:mm:ss" /> <br> <br>