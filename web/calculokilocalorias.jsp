<%-- 
    Document   : calculokilocalorias
    Created on : 30/04/2021, 03:48:02 PM
    Author     : Carlos Loaeza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cálculo de KiloCalorias</title>
    </head>
    <body>
    <center>
        <h1>Tasa de Metabolismo Basal (TMB)</h1>
        
        <h3>TMB: ${actividad.getTmb()}</h3>
        <h3>Requerimiento de Kilocalorías diarias: ${actividad.getKcalorias()}</h3>
    </center>
    </body>
</html>
