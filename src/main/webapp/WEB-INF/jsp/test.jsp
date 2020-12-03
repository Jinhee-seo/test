<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>JSON DATA 테스트!!!!!!!!!!!</title>
</head>

<body>
	 <h2>Test</h2> 
	 <c:forEach var="item" items="${list}" varStatus="idx">
	 	USERID ${idx.index}: ${item.userid}<br/> 
	 </c:forEach> 
	* 비밀번호는 모두 1234 입니다.
	
	<form method="post" name="frm" id="frm" onSubmit="return false;">
		<div style="padding-top:15px;">
		   ID: <input type="text" name="userid" />
		   PASSWD: <input type="text" name="passwd" />
		   <button id="vo">Vo</button>
		   <button id="map">Map</button>
		   <div id="content" style="padding-top:15px;"></div>
		</div>
	</form>
</body>

<script type="text/javascript">
	window.onload = function() { 
		var button2 = document.getElementById('ajax'); 

		jQuery.fn.serializeObject = function() { 
	      var obj = null; 
	      try { 
	          if(this[0].tagName && this[0].tagName.toUpperCase() == "FORM" ) { 
	              var arr = this.serializeArray(); 
	              if(arr){ obj = {}; 
	              jQuery.each(arr, function() { 
	                  obj[this.name] = this.value; }); 
	              } 
	          } 
	      }catch(e) { 
	          alert(e.message); 
	      }finally {} 
	      return obj; 
	    }

		$('#vo').click(function() {
	        $.ajax({
	            type : 'post',
	            contentType: "application/json",
	            url : 'test3',
	            data : JSON.stringify($("#frm").serializeObject()),
	            dataType : 'json',
	            error: function(xhr, status, error){
	                alert(error);
	            },
	            success : function(json){
		            if(json.userid == null){
		            	$("#content").html("없는 계정입니다");
			        }else{
			        	$("#content").html(JSON.stringify(json));
					}
	            }
	        });
		});

		
		$('#map').click(function() {
	        $.ajax({
	            type : 'post',
	            url : 'test4',
	            data : $("#frm").serialize(),
	            dataType : 'json',
	            error: function(xhr, status, error){
	                console.log(xhr);
	                console.log(status);
	                console.log(error);
	            },
	            success : function(json){
		            if(json.userid == null){
		            	$("#content").html("없는 계정입니다");
			        }else{
			        	$("#content").html(JSON.stringify(json));
					}
	            }
	        });
		});
	};

</script>
</html>