<%-- 
    Document   : calculokilocalorias
    Created on : 30/04/2021, 03:48:02 PM
    Author     : Carlos Loaeza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int actividad = (Integer) request.getAttribute("acti");
    String acti = "";

    switch (actividad) {
        case 0:
            acti = "Sedentario (no realiza)";
            break;
        case 1:
            acti = "Ligeramente Activo (realiza de 1-3 veces por semana)";
            break;
        case 2:
            acti = "Moderadamente activo (realiza de 3-5 veces por semana)";
            break;
        case 3:
            acti = "Muy Activo (realiza de 6-7 veces por semana)";
            break;
    }
%>
<!DOCTYPE html> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cálculo de KiloCalorias</title>
    </head>
    <body>
    <center>
        <h1>Tasa de Metabolismo Basal (TMB)</h1>
        <h2>Datos del usuario</h2>
        <h2>Nombre: ${usuario.getNombre()}</h2>
        <h3>
            Sexo: ${usuario.getSexo()}, Edad:${usuario.getEdad()} años, Peso: ${usuario.getPeso()} Kg, Estatura: ${usuario.getEstatura()} cm, Actividad Física: <%= acti%>
        </h3>
        <h2>Resultados</h2>
        <h3>TMB: ${actividad.getTmb()}</h3>
        <h3>Requerimiento de Kilocalorías diarias: ${actividad.getKcalorias()}</h3>
    </center>
</body>
</html>
