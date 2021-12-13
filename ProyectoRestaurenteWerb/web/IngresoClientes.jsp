<%-- 
    Document   : IngresoClientes
    Created on : 08-dic-2021, 19:19:58
    Author     : roger
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingreso Clientes</title>
        <link rel="stylesheet" type="text/css" href="Style.css"/>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link href="Containers.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>INGRESO CLIENTES</h1>
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
                                <label for="Estado">Nombre: </label>
                                <input type="text" class="form-control" id="Nombre" placeholder="Codigo" required></td> 
                                <td>
                                    <button class="btn btn-lg btn-primary btn-block" type="submit">Cancelar</button>
                                    <button class="btn btn-lg btn-primary btn-block" type="submit">Salir</button>
                                </td>
                    </tr>
                    <tr class="active">
                        <td><div class="container"> 
                                <label for="Estado">Sexo: </label>
                                <input type="text" class="form-control" id="Sexo" placeholder="Codigo" required></td>    
                                </tr>
                                <tr class="active">
                                    <td><div class="container"> 
                                            <label for="Estado">DUI: </label>
                                            <input type="text" class="form-control" id="Sexo" placeholder="Codigo" required></td>    
                                            </tr>
                                            <tr class="active">
                                                <td><div class="container"> 
                                                        <label for="Estado">Email: </label>
                                                        <input type="text" class="form-control" id="Sexo" placeholder="Codigo" required></td>    
                                                        </tr>
                                                        <tr class="active">
                                                            <td><div class="container"> 
                                                                    <label for="Estado">Direccion: </label>
                                                                    <input type="text" class="form-control" id="Sexo" placeholder="Codigo" required></td>    
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
                                                                    </body>
                                                                    </html>
