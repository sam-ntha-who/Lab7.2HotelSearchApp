<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hotel Search</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
</head>
<body>
<h1>Hotel Search</h1>
           <form action="/result" method="post">
          			
           <label for="city">City</label>
                           <select name="city">
  <option value="Chicago">Chicago</option>
  <option value="Detroit">Detroit</option>
  <option value="Louisville">Louisville</option>
  <option value="Toronto">Toronto</option>
 
</select>
      	<br>
      	<br>
        <input class="button" type="submit"/>
        <input class="button" type="reset" value="Reset" />
        
         </form>
</body>
</html>