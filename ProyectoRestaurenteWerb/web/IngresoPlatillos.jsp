<%-- 
    Document   : IngresoPlatillos
    Created on : 08-dic-2021, 19:08:33
    Author     : roger
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingreso Platillos</title>
        <link rel="stylesheet" type="text/css" href="Style.css"/>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link href="Containers.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>INGRESO PLATILLOS</h1>
        <form action="action">
            <table class="table table-bordered track_tbl">
                <tbody>
                    <tr class="active">
                        <td><div class="container"> 
                                <label for="Estado">Codigo: </label>
                                <input type="text" class="form-control" id="buscar" placeholder="Codigo" required></td>
                                <td>
                                    <button class="btn btn-lg btn-primary btn-block" type="submit">Nuevo</button>
                                    <button class="btn btn-lg btn-primary btn-block" type="submit">Actualizar</button>
                                </td>
                    </tr>
                    <tr class="active">
                        <td><div class="container"> 
                                <label for="Estado">Descripcion: </label>
                                <input type="text" class="form-control" id="buscar" placeholder="Codigo" required></td> 
                                <td>
                                    <button class="btn btn-lg btn-primary btn-block" type="submit">Cancelar</button>
                                    <button class="btn btn-lg btn-primary btn-block" type="submit">Salir</button>
                                </td>
                    </tr>
                    <tr class="active">
                        <td><div class="container"> 
                                <label for="Estado">Precio: </label>
                                <input type="text" class="form-control" id="buscar" placeholder="Codigo" required></td>    
                                </tr>

                                </form>
                                </body>
                                </table>
                                <div class="container"> 
                                    <label for="Estado">Buscar</label>
                                    <input type="text" class="form-control" id="buscar" placeholder="buscar platillo" required>
                                </div>
                                </br>
                                <div class="container"> 
                                    <label for="Estado">Mostrar Todo</label>
                                    <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
                                </div>
                                </html>
