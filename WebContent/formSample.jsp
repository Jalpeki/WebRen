<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登録もどき</title>
</head>
<body>

<form action="/WebRen/FormRen" method ="post">
名前  <input type ="text"  name ="name"/>
<br>
男
<input type ="radio" name = "gender" value ="1"/>
女
<input type ="radio" name = "gender" value ="2"/>
<br>
<input type="submit"  value= "送信"/>

</form>
</body>
</html>