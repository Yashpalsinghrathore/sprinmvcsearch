<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>show student</title>
</head>
<body>
<h1>hello i am showing</h1>
${studnet}
<hr>
${studnet.address}

<h1>
 city name is ${studnet.address.city}
</h1>
</body>
</html>