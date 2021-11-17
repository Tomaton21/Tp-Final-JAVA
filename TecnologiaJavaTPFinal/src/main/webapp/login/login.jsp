<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
		<title>Insert title here</title>
		<%
			String mensaje = "";
			boolean error = request.getParameter("error");
			out.print(error);
			if (error){
				out.print(error);
				mensaje="Los datos ingresados son incorrectos, intentar de nuevo";
			}
	
		%>
	</head>
	<body class="container-fluid">
	<div class="alert bg-primary text-center" role="alert">
       <h3 class="text-center fst-italic">Ingrese</h3>
    </div>
    <div class="row">
        <div class="col-3"></div>
        <div class="col-6">

        <form action="login-destino.jsp" method="POST">
			<div class="mb-3">
				<label for="usuario" class="form-label">Ingrese el usuario</label>
				<input type="text" class="form-control" id="usuario" name="usuario">
			</div>
			<div class="mb-3">
				<label for="clave" class="form-label">Ingrese la Contraseña</label>
				<input type="text" class="form-control" id="clave" name="clave">
			</div>
			<p><% out.print(mensaje); %></p>
			<button type="submit" class="btn btn-primary">Ingresar</button>			
		</form>
		
		</div>
    </div>
	</body>
</html>