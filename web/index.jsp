<%-- 
    Document   : index
    Created on : 29/04/2021, 11:28:51 AM
    Author     : Carlos Loaeza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Acceso</title>
    </head>
    <body>
    <center>
        <form name="acceso" action="Control" method="post">
            <table>
                <thead>
                <th>Acceso</th>
                </thead>
                <tbody>
                    <tr>
                        <td>Usuario: </td>
                        <td><input type="text" name="usuario"></td>
                    </tr>
                     <tr>
                        <td>Contraseña: </td>
                        <td><input type="password" name="password"></td>
                    </tr>
                     <tr>
                        <td><input type="submit" value="Acceder" ></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </center>
    </body>
</html>