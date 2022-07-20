<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Results</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
</head>
<body>
<h1>${city} Hotels</h1>
   <c:set var = "count" value = "${count}"/>
      <c:if test = "${count < 1}">
         <p>Grades is empty!<p>
      </c:if>
<table class=table>

<thead>
	<tr>
	
	<th>Hotel Name</th>
	<th>City</th>
	<th>Price Per Night</th>
	
	</tr>
</thead>
<tbody>
<c:forEach var="hotels" items="${hotels}">
<tr><td>${hotels.hotelName}</td>
<td>${hotels.city}</td>
<td>$${hotels.pricePerNight}</td>
</c:forEach>

</tbody>

<tr></tr>
</table>
 <button class="btn"><a href="/" class="button">Back</a></button>

</body>
</html>