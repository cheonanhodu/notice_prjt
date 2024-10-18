<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>공지사항 작성</title>
</head>

<body>
    <h2>공지사항 등록</h2>
    <form action="/notice/writeProcess" method="post">
        <label>카테고리: </label><input type="text" name="n_category"/><br>
        <label>제목: </label><input type="text" name="n_title"/><br>
        <label>내용: </label><textarea name="n_content"></textarea><br>
        <button type="submit">작성</button>
    </form>
</body>
</html>
