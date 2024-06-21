    <%@ page contentType="text/html; charset=UTF-8" %>
    <%@ taglib prefix="util" tagdir="/WEB-INF/tags/utils" %>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
    <c:url var="loginUrl" value="/member/Login" />
    <c:url var="joinUrl" value="/member/Join" />
    <c:url var="logoutUrl" value="/member/Logout" />

    로그인 상태 : ${isLogin} <br>
    <%-- 미로그인 상태 --%>
    <util:GuestOnly>
        <a href="${loginUrl}">로그인</a>
        <a href="${joinUrl}">회원가입</a>
    </util:GuestOnly>

    <%-- 로그인 상태 --%>
    <util:MemberOnly>
        ${loggedMember.userName}(${loggedMember.email})님 로그인...
        <a href="${logoutUrl}">로그아웃</a>
    </util:MemberOnly>
