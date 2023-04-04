<%@page import="com.model.customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Insert title here</title>
</head>
<%
	List<customer> clist = (List<customer>) request.getAttribute("customerlist");
%>
<body>
	<h1>Login SuccessFully Login.....!!!</h1>
	<form name="mypage">
		<table border="4" style="background-color: yellow;">
			<thead>
				<tr>
					<th>select</th>
					<th>id</th>
					<th>Name</th>
					<th>Address</th>
					<th>userName</th>
					<th>Password</th>
					<th>Edit</th>
					<th>Delete</th>

				</tr>
			</thead>
			<tbody>
				<tr>
					<%for (customer c : clist) {%>
					<td><input type="radio" value="<%=c.getId()%>" name="id"></td>
					<td style="color: red; text-align: center"><%=c.getId()%></td>
					<td style="color: green; text-align: center"><%=c.getName()%></td>
					<td><%=c.getAdress()%></td>
					<td><%=c.getUname()%></td>
					<td><%=c.getPass()%></td>
					<td><input type="submit" onclick="EditData();" value="Edit"></td>
					<td><input type="submit" onclick="DeleteData();"value="Delete"></td>
						
				</tr>
				
					<%}%>
				
			</tbody>
		</table>
	</form>
	<script type="text/javascript">
		function EditData() {
			alert("called Edit Function");
			document.mypage.action = "Edit";
			document.mypage.submit();
		}
	
	
		function DeleteData() {
			alert("Called Delete Function");
			document.mypage.action = "del";
			document.mypage.submit();
		}
	</script>
</body>
</html>