<%-- 
    Document   : DetalleTicket
    Created on : 08-dic-2021, 19:41:45
    Author     : roger
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detalle Ticket</title>
        <link rel="stylesheet" type="text/css" href="Style.css"/>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link href="Containers.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>DETALLE TICKET</h1>
        </br>
        <table class="table table-bordered track_tbl">
            <tbody>
                <tr class="active">
                    <td><label for="Estado">Ticket: </label>
                        <input type="text" class="form-control" id="Ticket"  required></td>
                    <td>
                    <td><label for="Estado">Codigo Cliente: </label>

                        <input type="text" class="form-control" id="cod_Cliente"  required></td>
                    </td>
                    <td>
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

        <label for="total">Total</label>
        <input type="text" class="form-control" id="SubTotal" placeholder="Total" required>
    </div>
</body>
</html>
