<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:bundle basename="messages.commons">
    <form>
        <fmt:message key="EMAIL" />
        <input type="text" name="email"> <br>

        <fmt:message key="PASSWORD" />
        <input type="password" name="PASSWORD"> <br>

        <button type="submit">
            <fmt:message key="LOGIN" />
        </button>
    </form>
</fmt:bundle>