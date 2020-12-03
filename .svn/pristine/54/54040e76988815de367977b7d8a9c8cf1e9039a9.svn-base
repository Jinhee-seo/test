<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta http-equiv="Content-Type" content= "text/html; charset=UTF-8">
	<!-- BootStrap CDN -->
	<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
	<title>게시글 상세</title>
</head>
<style>
	body {
	  margin: 0;
	  padding: 0;
	  background-color: #17a2b8;
	  height: 100vh;
	}
	#board .container #bbs-row #bbs-column #bbs-box {
	  margin-top: 120px;
	  max-width: 800px;
	  height: 520px;
	  border: 1px solid #9C9C9C;
	  background-color: #EAEAEA;
	}
	#board .container #bbs-row #bbs-column #bbs-box {
	  padding: 20px;
	}
</style>
<body>
	<div id="board">
		<h3 class="text-center text-white pt-5"></h3>
        <div class="container">
            <div id="bbs-row" class="row justify-content-center align-items-center">
                <div id="bbs-column" class="col-md-6">
                    <div id="bbs-box" class="col-md-12">
                    	<c:if  test="${empty userInfo}">
				        	<button class="btn" style="float : right;" onclick="location.href='/login'">로그인</button>
				        </c:if>
				        <c:if  test="${not empty userInfo}">
				        	<span style="text-align:right;">[${userInfo.username}] 님 환영합니다.</span>
				        	<button class="btn" style="float : right;" onclick="location.href='/login'">로그아웃</button>
				        </c:if>
                    	<h3 class="text-center text-info">게시글 상세</h3>
                    	<table class="table">
                    		<colgroup>
	                            <col width="14%">
	                            <col width="16%">
	                            <col width="18%">
	                            <col width="24%">
	                            <col width="14%">
	                            <col width="16%">
	                        </colgroup>
	                        <tbody>
	                        	<tr>
						            <th>제목</th>
						            <td colspan="5">${board.subject}</td>
						        </tr>
						        <tr>
						            <th>작성자</th>
						            <td>${board.writer}</td>
						            <th>작성날짜</th>
						            <td><fmt:formatDate value="${board.reg_date}" pattern="MM/ dd" /></td>
						            <th>조회수</th>
						            <td>${board.hit}</td>
						        </tr>
						        <tr>
						            <th>내용</th>
						            <td colspan="5">${board.content}</td>
						        </tr>
	                        </tbody>
					    </table>
					    <div class="form-group" style="float:right;">
					          <input type="button" value="목록" onclick='location.href="/board"' />
					          <c:if  test="${not empty userInfo}">
					          <input type="button" value="수정" onclick='location.href="/board/post/${board.bno}"' />
					          <input type="button" value="삭제" onclick='location.href="/board/delete/${board.bno}"'>
					          </c:if>
					    </div>
                     </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>