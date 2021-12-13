<%-- 
    Document   : IngresoSistema
    Created on : 07-dic-2021, 22:53:20
    Author     : roger
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio de Sesión</title>
        <link rel="stylesheet" type="text/css" href="Style.css"/>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link href="Containers.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%
            if (request.getParameter("error") != null) {
        %>
        <div class="alert alert-danger">
            <strong>Error!</strong>
            <%= request.getParameter("error")%>
            <br>
        </div>
        <%
            }
        %>
        
        <%
            if (request.getParameter("success") != null) {
        %>
        <div class="alert alert-success">
            <strong>Bienvenido!</strong>
            <%= request.getParameter("success")%>
            <br>
        </div>
        <%
            }
        %>
        <div class="container login-container">
            <div class="row">

                <div class="col-md-6 login-form-1">
                    <h3>Login de Usuario</h3>
                    <form id="login-form" class="form" action="checklogin.jsp" method="post">
                        <div class="form-group">
                            <input type="text" name="username" class="form-control" placeholder="Usuario" value="" />
                        </div>
                        <div class="form-group">
                            <input type="password" name="password" class="form-control" placeholder="Contraseña" value="" />
                        </div>
                        <div class="form-group">
                            <input type="submit" name="useringresar" class="btnSubmit" value="Ingresar" />
                        </div>
                        <div class="form-group">
                            <input type="submit" name="Salir" class="btnSubmit" value="Salir" />
                        </div>
                    </form>
                </div>  
            </div> 
        </div> 
    </body>
</html>
