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
        <p>Colocar un buscador de Empleados en base a un a tributo(por definir...)</p>

        <!--Formulario para agregar un nuevo Empleado.-->
        <div class="container p-5">
            <div class="row">
                <div class="col-sm-4 offset-md-4">
                    <div class="card animated flipInY">
                        <div class="card-header bg-dark text-white text-center">
                            <h3>Busqueda de Empleado</h3>
                            <p>Por construir....</p>
                        </div>
                        <div class="card-body">
                            <form action="buscar.do" method="get">
                                <div class="form-group">
                                    <input id="nombre" type="text" name="txtNombre">
                                    <label for="nombre">Nombres Empleado</label>
                                </div>
                                <div class="form-group">
                                    <input id="apePat" type="text" name="txtApePat">
                                    <label for="apePat">Apellido Paterno Empleado</label>
                                </div>
                                <div class="form-group">
                                    <button name="btn" value="1" type="submit" class="btn btn-primary">
                                        Buscar Empleado
                                    </button>
                                </div>
                            </form>
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
