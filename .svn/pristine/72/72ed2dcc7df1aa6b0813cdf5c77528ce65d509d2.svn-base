<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>JSON DATA 테스트</title>
</head>

<body>
	 <h2>Test2</h2> 
	 <c:forEach var="item" items="${list}" varStatus="idx">
	 	${idx.index}, ${item}<br /> 
	 </c:forEach> 
		 
	<form action="test4" method="post" name="frm" id="frm" onSubmit="return false;">
		<div>
		   ID: <input type="text" name="userid" />
		   PASSWD: <input type="text" name="passwd" />
		   <button id="post">Submit</button>
		   <button id="ajax">Ajax</button>
		   
		   <div id="content"></div>
		</div>
	</form>
</body>

<script type="text/javascript">
	window.onload = function() { 
		var button1 = document.getElementById('post'); 
		var button2 = document.getElementById('ajax'); 

		button1.onclick = function() { 
			document.frm.submit();
		}; 

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

		
		$('#ajax').click(function() {
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
		            console.log(json);
		            console.log(json.userid);
	                $("#content").html(json.userid);
	            }
	        });

		});
	};

</script>
</html>