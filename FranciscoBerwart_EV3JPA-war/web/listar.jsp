<%-- 
    Document   : listar
    Created on : 20-12-2020, 1:20:22
    Author     : francisco.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <c:import url="partials/head.jsp"/>
        <link href="public/main.css" rel="stylesheet" type="text/css"/>
        <title>Lista Empleados</title>
    </head>
    <body>
        <c:import url="partials/nav.jsp"/>
        <h2>Lista Empleados</h2>
        <br/>
        
        <!--Aqui ira la tabla con los empleados del mantenedor.-->
        <p>Aqui ira la tabla con los empleados del mantenedor.</p>
        <hr/>
        <br/>
        <!--Tabla Temporal de demostración-->
        <table>
            <tr>Nombre Empleado</tr>
            <tr>Sueldo Empleado</tr>
        </table>
        
        
    </body>
</html>
