<%-- 
    Document   : Principal
    Created on : 08-dic-2021, 11:43:32
    Author     : roger
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Principal</title>
        <link rel="stylesheet" type="text/css" href="Style.css"/>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link href="Containers.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <form action="action">
            <div class="container1">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                            <a data-toggle="" data-parent="#accordion" href="menu.jsp"><span class="glyphicon glyphicon-th" href="menu.jsp">
                                </span>Archivos</a>
                        </h4>
                    </div>
                </div>


                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                            <a data-toggle="" data-parent="#accordion" href="Perfil_usuario.jsp"><span class="glyphicon glyphicon-user" href="Perfil_usuario.jsp">
                                </span>Mantenimiento</a>
                        </h4>
                    </div>
                </div>


                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                            <a data-toggle="" data-parent="#accordion" href="DetalleOrden.jsp"><span class="glyphicon glyphicon-th" href="ordenes_activas.jsp">
                                </span>Cobrar</a>
                        </h4>
                    </div>
                </div>


                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                            <a data-toggle="collapse" data-parent="#accordion" href="#collapseFour"><span class="glyphicon glyphicon-file">
                                </span>Consultas</a>
                        </h4>
                    </div> 
                </div>
            </div>
        </form>
    </body>
</html>
