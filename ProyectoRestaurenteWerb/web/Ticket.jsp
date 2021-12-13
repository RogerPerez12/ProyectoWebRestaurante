<%-- 
    Document   : Ticket
    Created on : 08-dic-2021, 16:58:08
    Author     : roger
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ticket</title>
        <link rel="stylesheet" type="text/css" href="Style.css"/>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link href="Containers.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>Restaurante xyz</h1>
        </br>
        <table class="table table-bordered track_tbl">
            <tbody>
                <tr class="active">
                    <td><label for="Estado">Señor(es):</label>
                        <input type="text" class="form-control" id="Señor"  required></td>
                    <td>
                    <td><label for="Estado">Codigo Cliente</label>

                        <input type="text" class="form-control" id="cod_Cliente"  required></td>
                    </td>
                    <td>
                    <td><label for="Estado">Tiket de venta</label>

                        <input type="text" class="form-control" id="Fecha"  required></td>
                    </td>
                <tr class="active">
                    <td><label for="Estado">DUI: </label>
                        <input type="text" class="form-control" id="DUI"  required></td>
                    <td>
                    <td><label for="Estado">Producto</label>

                        <input type="text" class="form-control" id="Producto"  required></td>
                    </td></tr>
                <tr class="active">
                    <td><label for="Estado">Direccion: </label>
                        <input type="text" class="form-control" id="Direccion"  required></td>
                    <td>
                    <td><label for="Estado">Fecha</label>

                        <input type="text" class="form-control" id="Fecha"  required></td>
                    </td>
                </tr>
                <tr class="active">

                    <td>Codigo</td>
                    <td>Descripcion</td>
                    <td>Cantidad</td>
                    <td>Precio</td>

                </tr> 
            </tbody>

        </table>
        <div class="form-group">
            <button class="btn btn-lg btn-primary btn-block" type="submit">Realizar Calculo</button>
        </div>  
        <div class="form-group">
            <button class="btn btn-lg btn-primary btn-block" type="submit">eliminar</button>
        </div>  
        <div class="form-group">
            <button class="btn btn-lg btn-primary btn-block" type="submit">Realizar Pago</button>
        </div>
        <div class="form-group">
            <button class="btn btn-lg btn-primary btn-block" type="submit">Salir</button>
        </div>
        <div class="container"> 
                <label for="Estado">Total</label>
                <input type="text" class="form-control" id="buscar" placeholder="Total" required>
            </div>
    </body>
</html>
