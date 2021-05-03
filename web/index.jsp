<%-- 
    Document   : index
    Created on : 29/04/2021, 11:28:51 AM
    Author     : Carlos Loaeza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
            //Al hacer click en el botón ingresar
            if (request.getParameter("btn_ingresar") != null) 
            {
                //Crea dos strings, una para el user y otra para el password.
                String username = request.getParameter("txt_username");
                String password = request.getParameter("txt_password");
                
                //Si ambas son "admin"...
                if (username.equals("admin")&&password.equals("admin"))
                {
                    //Redirecciona al servlet 'crear_departamento.do'
                    response.sendRedirect("crear_departamento.do");
                }
                //Si no...
                else
                {
                    //Muestra un mensaje javascript señalando que hay daros erróneos
                    out.println("<script>alert('Usuario o contraseña incorrecta');</script>");
                }
            }
        %>

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
                <th colspan="2" align="center"><h1>Acceso</h1></th>
                </thead>
                <tbody>
                    <tr>
                        <td>Usuario: </td>
                        <td><input type="text" name="usuario" required></td>
                    </tr>
                     <tr>
                        <td>Contraseña: </td>
                        <td><input type="password" name="password" required></td>
                    </tr>
                     <tr>
                        <td colspan="2" align="center"><input type="submit" value="Acceder" ></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </center>
    </body>
</html>