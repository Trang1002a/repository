<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>add</h1>
	<form method="POST">
		<input type="hidden" name="action" value="add" />
		<input type="hidden" name="counts" value="0" />
		<table>
			<tr>
				<td>Id</td>
				<td><input type="text" name="id" placeholder="Nhap Id ..." /></td>
			</tr>
			<tr>
				<td>Name</td>

				<td><input type="text" name="name" placeholder="Nhap Name ..." />
				</td>
			
			</tr>
			<tr>
				<td></td>

				<td><button>Them</button>
				</td>
			
			</tr>
		</table>
	</form>
</body>
</html>