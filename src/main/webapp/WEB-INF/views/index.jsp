<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Auth Demo</title>
<link rel="stylesheet" href="/style.css" />
</head>
<body>
private String firstName;
	private String lastName;
	private String innovation;
	private Integer year;
	<h1>Inventors</h1>
	<c:forEach var="inventor" items="${ inventors }">
		<div>
			<h3>${inventor.name}</h3>
			<p>Invented: ${inventor.invented}</p>
			<p>Year: ${inventor.year}</p>
		</div>
	</c:forEach>
	 
	<h1>Innovators</h1>
	<c:forEach var="innovator" items="${ innovators }">
		<div>
			<h3>${innovator.firstName} ${innovator.lastName}</h3>
			<p>Innovated: ${innovator.innovation}</p>
			<p>Year: ${innovator.year}</p>
		</div>
	</c:forEach>
</body>
</html>