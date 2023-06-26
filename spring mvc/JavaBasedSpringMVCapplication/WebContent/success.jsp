<%@page import="com.Entity.Customer"%>
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
	List<Customer> clist = (List<Customer>) request.getAttribute("customerlist");
%>
<body>
	<h1>successfully login</h1>
	<form name="mypage" method="post">
		<table border="5">
			<thead>
				<tr>
					<th>select</th>
					<th>id</th>
					<th>name</th>
					<th>Adress</th>
					<th>uname</th>
					<th>pass</th>

				</tr>
			</thead>
			<tbody>
				<tr>
					<%
						for (Customer c : clist) {
					%>
					<td><input type="radio" value="<%=c.getId()%>" name="id"></td>
					<td>
						<%=c.getId()
						%>
					</td>
					<td>
						<%=c.getName()
						%>
					</td>
					<td>
						<%=c.getAddress()
						%>
					</td>
					<td>
						<%=c.getUname()
						%>
					</td>
					<td>
						<%=c.getPass()
						%>
					</td>
					<td><input type="submit" onclick="EditData();" value="Edit"></td>
					<td><input type="submit" onclick="DeleteData();"
						value="Delete"></td>

				</tr>
				<%
					}
				%>
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