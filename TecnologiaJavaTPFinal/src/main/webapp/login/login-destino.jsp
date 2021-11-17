<%@page import="dao.UsuariosDAO"%>
<%@page import="dao.conexion"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
%>
<%

String usuario = request.getParameter("usuario");
String clave = request.getParameter("clave");
UsuariosDAO usuariosDAO = new UsuariosDAO();
if (usuariosDAO.logear(usuario, clave)){
	response.sendRedirect("../index.jsp");
}else{
	response.sendRedirect("login.jsp?error=hola");
}
%>
</body>
</html>