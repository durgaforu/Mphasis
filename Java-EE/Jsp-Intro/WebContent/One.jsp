<%@page import="java.util.*,java.io.*" %>
<%@page import="javax.sql.*"%>

<h1>Welcome to JSP</h1>
<h2>Welcome</h2>
<button>Click</button>

String s1="Abc";
<hr />

<h1>date: <%=new Date()%> </h1>

<%!
 String getName(String s1){
	return "Hello "+s1;
}

%>

<h1><%=getName("Ozvitha") %></h1>

<%
	String s1 = "Praveen";
	out.println("<h1>Name is " + s1);
	String s2 = "James";
	request.setAttribute("user", "Admin");
%>
<%
	out.println("<h2>Name " + s2);
%>
<hr/>
<h1> My Name is <%=s1 %> </h1>
<h2>User Name is <%=request.getAttribute("user") %>  </h2> <hr/>








