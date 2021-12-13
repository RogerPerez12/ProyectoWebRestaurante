<%-- 
    Document   : Platillos
    Created on : 08-dic-2021, 16:34:27
    Author     : roger
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Platillos</title>
        <link rel="stylesheet" type="text/css" href="Style.css"/>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link href="Containers.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="p-4">
            <div class="container"> 
                <label for="Estado">Buscar Platillos</label>
                <input type="text" class="form-control" id="buscar" placeholder="buscar platillo" required>
            </div>
            </br>
            <div class="container"> 
                <label for="Estado">Mostrar Todo</label>
                <input type="text" class="form-control" id="buscar" placeholder="Mostrar" required>
            </div>
            </br>
            <div class="mb-3">
                <label for="mostrar" class="form-label">Mostrar</label>
                <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
            </div>
        </div>
    </body>
</html>
