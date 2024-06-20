    <%@ page contentType="text/html; charset=UTF-8" %>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
    <c:url var="loginUrl" value="/member/Login" />
    <c:url var="joinUrl" value="/member/Join" />
    <c:url var="logoutUrl" value="/member/Logout" />

    <c:if test="${sessionScope.member == null}">
        <%--미로그인 --%>
        <a href="${loginUrl}">로그인</a>
        <a href="${joinUrl}">회원가입</a>
    </c:if>
    <c:if test="${sessionScope.member != null}">
        ${sessionScope.member.userName}(${sessionScope.member.email})님 로그인...
        <a href="${logoutUrl}">로그아웃</a>
    </c:if>
