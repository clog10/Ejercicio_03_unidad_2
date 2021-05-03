<%-- 
    Document   : calculokilocalorias_2
    Created on : 2/05/2021, 05:41:05 PM
    Author     : Carlos Loaeza
--%>

<%@page import="datos.Usuario"%>
<%@page import="datos.Actividad"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    Actividad actividad = new Actividad();
    Usuario usuario = new Usuario();
  String nombre = (String) request.getParameter("nombre");
  String s = (String) request.getParameter("sexo");
  char sexo = s.charAt(0);
  int edad = Integer.parseInt(request.getParameter("edad"));
  int estatura = Integer.parseInt(request.getParameter("estatura"));
  double peso = Double.parseDouble(request.getParameter("peso"));
  int acti = Integer.parseInt(request.getParameter("actividad"));
  
  String a = "";

    switch (acti) {
        case 0:
            a = "Sedentario (no realiza)";
            break;
        case 1:
            a = "Ligeramente Activo (realiza de 1-3 veces por semana)";
            break;
        case 2:
            a = "Moderadamente activo (realiza de 3-5 veces por semana)";
            break;
        case 3:
            a = "Muy Activo (realiza de 6-7 veces por semana)";
            break;
    }
  
            usuario=new Usuario(nombre,sexo,edad,peso,estatura,acti);
            actividad.calculaTmb(usuario);
            actividad.calculaKcalorias(actividad.getTmb(), usuario);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cálculo de KiloCalorias 2</title>
    </head>
    <body>
    <center>
        <h1>Tasa de Metabolismo Basal (TMB)</h1>
        <h2>Datos del usuario</h2>
        <h2>Nombre: <%= nombre%></h2>
        <h3>Sexo: <%=sexo%>, Edad:<%=edad%> años, Peso: <%=peso%> Kg, Estatura: <%=estatura%> cm, Actividad Física: <%= a%></h3> 
        <h2>Resultados</h2>
        <h3>TMB: <%=actividad.getTmb()%></h3>
        <h3>Requerimiento de Kilocalorías diarias: <%=actividad.getKcalorias()%></h3>
    </center>
</body>
</html>
