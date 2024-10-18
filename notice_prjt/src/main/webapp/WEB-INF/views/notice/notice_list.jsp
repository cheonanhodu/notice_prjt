<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>공지사항 목록조회</title>
</head>

<body>
    <h2>공지사항 리스트</h2>
    <input type="text" placeholder="검색">
    <table>
        <tr>
            <th>번호</th>
            <th>카테고리</th>
            <th>제목</th>
            <th>작성일</th>
        </tr>
        <c:forEach var="notice" items="${notices}">
            <tr>
                <td>${notice.n_idx}</td>
                <td>${notice.n_category}</td>
                <td>${notice.n_title}</td>
                <td>${notice.n_regdate}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="/notice/write"><button>등록하기</button></a>
</body>
</html>
