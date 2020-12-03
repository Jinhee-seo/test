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
	<title>게시글 작성</title>
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
        	<form method="POST" action="/board/update/${board.bno}" onsubmit="return false;">
	            <div id="bbs-row" class="row justify-content-center align-items-center">
	                <div id="bbs-column" class="col-md-6">
	                    <div id="bbs-box" class="col-md-12">
	                    	<h3 class="text-center text-info">게시글 수정</h3>
	                    	<table class="table">
	                    		<colgroup>
		                            <col width="30%">
		                            <col width="70%">
		                        </colgroup>
		                        <tbody>
		                        	<tr>
							            <th>제목</th>
							            <td><input type="text" name="subject" value="${board.subject}" class="form-control"></td>
							        </tr>
							        <tr>
							            <th>작성자</th>
							            <td><input type="text" name="writer" value="${board.writer}" class="form-control"></td>
							        </tr>
							        <tr>
							            <th>내용</th>
							            <td><textarea name="content" class="form-control" rows="5">${board.content}</textarea></td>
							        </tr>
		                        </tbody>
						    </table>
						    <div class="form-group" style="float:right;">
						    	<button onclick='location.href="/board"' class="btn btn-primary btn-sm" style="margin: 10px 10px;">목록</button>
								<button type="submit" class="btn btn-primary btn-sm" style="float : right;margin: 10px 0;">작성</button>
						    </div>
	                     </div>
	                </div>
	            </div>
        	</form>
        </div>
    </div>
</body>
</html>