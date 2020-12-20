<%-- 
    Document   : agregar
    Created on : 20-12-2020, 1:13:33
    Author     : francisco
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <c:import url="partials/head.jsp" />
        <title>JSP Page</title>
    </head>
    <body>
        <c:import url="partials/nav.jsp" />
        <h2 style="text-align: center">
            Agregar un Empleado.
        </h2>
        
        <!--Formulario para agregar un nuevo Empleado.-->
        <div class="container p-5">
            <div class="row">
                <div class="col-sm-4 offset-md-4">
                    <div class="card animated flipInY">
                        <div class="card-header bg-dark text-white text-center">
                            <h3>Agregue un nuevo Empleado</h3>
                        </div>
                        <div class="card-body">
                            <form action="agregar.do" method="get">
                                <div class="form-group">
                                    <input id="nombre" type="text" name="txtNombre">
                                    <label for="nombre">Nombres Empleado</label>
                                </div>
                                <div class="form-group">
                                    <input id="apePat" type="text" name="txtApePat">
                                    <label for="apePat">Apellido Paterno Empleado</label>
                                </div>
                                <div class="form-group">
                                    <input id="apeMat" type="text" name="txtApeMat">
                                    <label for="apeMat">Apellido Materno Empleado</label>
                                </div>
                                <div class="form-group">
                                    <input id="sueldo" type="number" name="txtSueldo">
                                    <label for="sueldo">Sueldo Empleado</label>
                                </div>
                                <div class="form-group">
                                    <button name="btn" value="1" type="submit" class="btn btn-success">
                                        Registrar Empleado
                                    </button>
                                </div>
                            </form>
                        </div>
                        <c:if test="${not empty msg}">
                            <p style="color: yellowgreen">${requestScope.msg}</p>
                        </c:if>
                    </div>
                </div>
            </div>
        </div>
        
    </body>
</html>
