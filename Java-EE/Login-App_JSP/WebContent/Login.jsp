<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1 align="center">Login Form</h1>
	<hr width="50%" />
	<form action="checkUser" method="post">
		<table align="center" cellspacing="5" cellpadding="5">
			<tr>
				<td>User Id</td>
				<td><input name="userName"></td>
			</tr>

			<tr>
				<td>Password</td>
				<td><input type="password" name="password"></td>
			</tr>
			
			<tr>
			<th colspan="2">
				${msg}
			</th>
			</tr>

			<tr>

				<th colspan="2"><input type="submit" value="Login"> <input
					type="reset" value="Clear All"></th>
			</tr>

		</table>

	</form>
	<hr width="50%"/>

</body>
</html>