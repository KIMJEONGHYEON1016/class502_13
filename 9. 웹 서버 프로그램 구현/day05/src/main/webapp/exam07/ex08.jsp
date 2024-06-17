<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setBundle basename="messages.commons" />
    <form>
        <fmt:message key="EMAIL" />
        <input type="text" name="email"> <br>

        <fmt:message key="PASSWORD" />
        <input type="password" name="PASSWORD"> <br>

        <button type="submit">
            <fmt:message key="LOGIN" />
        </button>
    </form>

<h1>
    <fmt:message key="LOGIN_MSG">
        <fmt:param>이이름</fmt:param>
        <fmt:param>test@test.org</fmt:param>
    </fmt:message>
</h1>