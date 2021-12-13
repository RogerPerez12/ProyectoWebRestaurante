<%-- 
    Document   : Detalle Factura
    Created on : 08-dic-2021, 19:48:33
    Author     : roger
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detalle Factura</title>
        <link rel="stylesheet" type="text/css" href="Style.css"/>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link href="Containers.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>DETALLE FACTURA</h1>
        </br>
        <table class="table table-bordered track_tbl">
            <tbody>
                <tr class="active">
                    <td><label for="Estado">Factura: </label>
                        <input type="text" class="form-control" id="FACTURA"  required></td>
                    <td>
                    <td><label for="Estado">Codigo Cliente: </label>

                        <input type="text" class="form-control" id="cod_Cliente"  required></td>
                    </td>
                    <td>
                    <td><label for="Estado">RUC: </label>
                        <input type="text" class="form-control" id="RUC"  required></td>
                    </td>
                    <td><label for="Estado">fecha: </label>
                        <input type="text" class="form-control" id="Fecha"  required></td>
                    </td>
                </tr>
                <tr class="active">

                    <td>Codigo</td>
                    <td>Descripcion</td>
                    <td>Precio</td>
                    <td>Cantidad</td>

                </tr> 
            </tbody>  
        </table>
        <div class="mb-3">
            <label for="Subtotal">SubTotal</label>
            <input type="text" class="form-control" id="SubTotal" placeholder="SubTotal" required>
        </div>
        <div class="mb-3">
            <label for="Subtotal">Impuesto</label>
            <input type="text" class="form-control" id="SubTotal" placeholder="Impuesto" required>
        </div>
        <div class="mb-3">
            <label for="Subtotal">TotalPagar</label>
            <input type="text" class="form-control" id="SubTotal" placeholder="TotalPagar" required>
        </div>
    </body>
</html>
