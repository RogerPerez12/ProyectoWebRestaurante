<%-- 
    Document   : Clientes
    Created on : 08-dic-2021, 17:49:56
    Author     : roger
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="javax.swing.table.DefaultTableModel"%>
<%@page import="java.sql.Connection"%>
<%@page import="claseConectar.conectar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clientes</title>
        <link rel="stylesheet" type="text/css" href="Style.css"/>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link href="Containers.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <table class="table table-bordered track_tbl">
            <tbody>
                <tr class="active">
                    <td><label for="Estado">Buscar Cliente</label>
                       
                        <input type="text" class="form-control" id="Buscar"  required></td>
                    <td> <button class="btn btn-lg btn-primary btn-block" type="submit">Mostrar Todo</button></td>
                    <td> <button class="btn btn-lg btn-primary btn-block" type="submit">Buscar Cliente</button></td>
                </tr>
            <div class="mb-3"> 
                <label for="mostrar" class="form-label">Mostrar</label>
                <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
            </div>   
            
            
           
    </body>
</html>
