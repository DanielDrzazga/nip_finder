<%--
  Created by IntelliJ IDEA.
  User: Daniel
  Date: 19.05.19
  Time: 19:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title><s:message code="menu.nipFinder"/></title>

    <style>
        #companyDescription {
            width: 150px;
            text-align: left;
        }

        table {
            width: 800px;
            border: 0;
        }

        th, td {
            padding: 5px;
        }

    </style>

    <script type="text/javascript">
        function changeTrBg(row) {
            row.style.backgroundColor = "#e6e6e6";
        }

        function defaultTrBg(row) {
            row.style.backgroundColor = "white";
        }
    </script>
</head>

<body>


<table align="center">
    <form:form method="POST" modelAttribute="company">
        <tr>
            <td colspan="2" align="right">
                <s:message code="menu.enterNip"/>
                <form:input path="nip"/>
                <input type="submit" value="<s:message code="button.search"/>">
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <font color="red">
                    <form:errors path="nip"/>
                    <c:out value="${message}"/>
                </font>
            </td>
        </tr>
    </form:form>

    <c:set var="c" value="${company}"/>
    <tr onmouseover="changeTrBg(this)" onmouseout="defaultTrBg(this)">
        <th id="companyDescription">
            <s:message code="company.regon"/>
        </th>
        <td>
            ${c.regon}
        </td>
    </tr>
    <tr onmouseover="changeTrBg(this)" onmouseout="defaultTrBg(this)">
        <th id="companyDescription">
            <s:message code="company.nip"/>
        </th>
        <td>
            <c:if test="${company.nip.length()==10 && company.nip.matches('[0-9]+')}">
                ${c.nip}
            </c:if>
        </td>
    </tr>
    <tr onmouseover="changeTrBg(this)" onmouseout="defaultTrBg(this)">
        <th id="companyDescription">
            <s:message code="company.name"/>
        </th>
        <td>
            ${c.name}
        </td>
    </tr>
    <tr onmouseover="changeTrBg(this)" onmouseout="defaultTrBg(this)">
        <th id="companyDescription">
            <s:message code="company.woj"/>
        </th>
        <td>
            ${c.woj}
        </td>
    </tr>
    <tr onmouseover="changeTrBg(this)" onmouseout="defaultTrBg(this)">
        <th id="companyDescription">
            <s:message code="company.pow"/>
        </th>
        <td>
            ${c.pow}
        </td>
    </tr>
    <tr onmouseover="changeTrBg(this)" onmouseout="defaultTrBg(this)">
        <th id="companyDescription">
            <s:message code="company.gm"/>
        </th>
        <td>
            ${c.gm}
        </td>
    </tr>
    <tr onmouseover="changeTrBg(this)" onmouseout="defaultTrBg(this)">
        <th id="companyDescription">
            <s:message code="company.city"/>
        </th>
        <td>
            ${c.city}
        </td>
    </tr>
    <tr onmouseover="changeTrBg(this)" onmouseout="defaultTrBg(this)">
        <th id="companyDescription">
            <s:message code="company.postCode"/>
        </th>
        <td>
            ${c.postCode}
        </td>
    </tr>
    <tr onmouseover="changeTrBg(this)" onmouseout="defaultTrBg(this)">
        <th id="companyDescription">
            <s:message code="company.streer"/>
        </th>
        <td>
            ${c.street}
        </td>
    </tr>
    <tr onmouseover="changeTrBg(this)" onmouseout="defaultTrBg(this)">
        <th id="companyDescription">
            <s:message code="company.type"/>
        </th>
        <td>
            ${c.type}
        </td>
    </tr>
    <tr onmouseover="changeTrBg(this)" onmouseout="defaultTrBg(this)">
        <th id="companyDescription">
            <s:message code="company.silosID"/>
        </th>
        <td>
            ${c.silosID}
        </td>
    </tr>
</table>


</body>
</html>
