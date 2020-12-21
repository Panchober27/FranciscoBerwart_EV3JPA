<%-- 
    Document   : buscar
    Created on : 20-12-2020, 1:16:57
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
        <title>Buscar Empleado</title>
    </head>
    <body>
        <c:import url="partials/nav.jsp"/>
        <h2>Buscar Empleado.</h2>

        <!--Generar un buscador para un empleado en base a un atriuto.-->
        <p>Colocar un buscador de Empleados en base a un a tributo(por construir...)</p>

        <!--Formulario para agregar un nuevo Empleado.-->
        <div class="container p-5">
            <div class="row">
                <div class="col-sm-4 offset-md-4">
                    <div class="card animated flipInY">
                        <div class="card-header bg-dark text-white text-center">
                            <h3>Empleado</h3>
                        </div>
                        <div class="card-body">
                            <table>
                                <tr>
                                    <th>Codigo Empleado</th>
                                    <th>Nombre Empleado</th>
                                    <th>Apellido Paterno Empleado</th>
                                    <th>Apellido Materno Empleado</th>
                                    <th>Sueldo Empleado</th>
                                </tr>
                                <c:forEach items="${requestScope.lista}" var="e">
                                    <tr>
                                        <td>${e.codEmpleado}</td>
                                        <td>${e.nombre}</td>
                                        <td>${e.apePat}</td>
                                        <td>${e.apeMat}</td>
                                        <td>${e.sueldo}</td>
                                    </tr>
                                </c:forEach>
                            </table>
                        </div>
                        <c:if test="${not empty msg}">
                            <p style="color: red">${requestScope.msg}</p>
                        </c:if>
                    </div>
                </div>
            </div>
        </div>


    </body>
</html>
