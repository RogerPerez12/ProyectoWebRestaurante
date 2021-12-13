<%-- 
    Document   : ConsultaTicket
    Created on : 08-dic-2021, 20:05:47
    Author     : roger
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta Ticket</title>
        <link rel="stylesheet" type="text/css" href="Style.css"/>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link href="Containers.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>CONSULTA TICKET</h1>
        <div class="form-check">
  <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1">
  <label class="form-check-label" for="flexRadioDefault1">
    Mostrar Por Numero
     <input type="text" class="form-control" id="Impuesto" required>
    
  </label>
</div>
<div class="form-check">
  <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault2" checked>
  <label class="form-check-label" for="flexRadioDefault2">
    Mostrar Por Fecha
     <input type="text" class="form-control" id="Impuesto"  required>
  </label>
</div>
        <div class="form-check">
  <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault2" checked>
  <label class="form-check-label" for="flexRadioDefault2">
    Mostrar todas
   
  </label>
  
   </br>
</div>
         <div class="form-group">
            <button class="btn btn-lg btn-primary btn-block" type="submit">BUSCAR</button>
        </div>
         </br>
        <div class="mb-3">
                <label for="mostrar" class="form-label">Mostrar</label>
                <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
            </div>
    </body>
</html>
