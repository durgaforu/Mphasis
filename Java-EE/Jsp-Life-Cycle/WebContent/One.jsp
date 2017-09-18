
<%@page errorPage="/Error.jsp"  isErrorPage="true" session="true" isThreadSafe="false" %><h1>Welcome to One.jsp</h1>
<h1>This is James</h1>

<%
session.setAttribute("name", "Praveen");

%>

<h1>${100+200}</h1>
<h1>${1000>200}</h1>

<jsp:forward page="/Disp.jsp"></jsp:forward>

