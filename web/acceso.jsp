<%-- 
    Document   : acceso
    Created on : 29/04/2021, 11:50:25 AM
    Author     : Carlos Loaeza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--String usuario = (String) request.getAttributte("nombre");--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Acceso al sistema</title>
    </head>
    <body>
    <center>
        <h2>Acceso al sistema</h2>
        <h2>Bienvenido al sistema: <%=(String) request.getAttribute("usuario")%> </h2>
    </center>
    </body>
</html>