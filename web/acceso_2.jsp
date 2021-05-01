<%-- 
    Document   : acceso_2
    Created on : 29/04/2021, 12:16:28 PM
    Author     : Carlos Loaeza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Acceso al sistema 2</title>
    </head>
    <body>
    <center>
        <h1>Bienvenido al sistema 2</h1>
        <form name="calculo" action="CalculoCalorias" method="get">
            <table>
                <thead>
                <th colspan="2" align="center">Datos del Usuario</th>
                </thead>
                <tbody>
                    <tr>
                        <td align="right">Nombre: </td>
                        <td>${dato.getNombre()}</td>
                    </tr>
                    <tr>
                        <td align="right">Sexo: </td>
                        <td> 
                            <input type="radio" name="sexo" value="M"> Mujer
                            <input type="radio" name="sexo" value="H"> Hombre
                        </td>
                    </tr>
                    <tr>
                        <td align="right">Edad: </td>
                        <td>
                            <input type="text" name="edad" required>
                        </td>
                    </tr>
                    <tr>
                        <td align="right">Estatura (en cm): </td>
                        <td>
                            <input type="text" name="estatura" required>
                        </td>
                    </tr>
                    <tr>
                        <td align="right">Peso (en kg): </td>
                        <td>
                            <input type="text" name="peso" required>
                        </td>
                    </tr>
                    <tr>
                        <td align="right">Actividad Física: </td>
                        <td>
                            <select name="actividad">
                                <option value="0">Sedentario (no realiza)</option>
                                <option value="1">Ligeramente Activo (realiza de 1-3 veces por semana)</option>
                                <option value="2">Moderadamente activo (realiza de 3-5 veces por semana)</option>
                                <option value="3">Muy Activo (realiza de 6-7 veces por semana)</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center"><input type="submit" value="Calcular" ></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </center>
</body>
</html>
