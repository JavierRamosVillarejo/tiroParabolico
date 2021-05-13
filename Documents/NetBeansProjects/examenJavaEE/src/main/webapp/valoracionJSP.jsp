<%-- 
    Document   : valoracionJSP
    Created on : 12-may-2021, 17:21:48
    Author     : DAW-B
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Valoración Coches</h1>
        <%
            ArrayList<String> listaAnios = (ArrayList<String>) request.getAttribute("listaAnios");
        %>    
        <form action="ServletValoracion">
            <p><label for="nombre">Nombre</label><input type="text" name="nombre"></p>
            <p><label for="precio_nuevo">Precio Nuevo</label><input type="text" name="precio_nuevo" value="0"></p>
            <p><label for="precio_desguace">Precio Desguace</label><input type="text" name="precio_desguace" value="0"></p>
            <p><label>Año matriculación</label></p>
            <select name="anioMat">
                <%
                    for (String a: listaAnios){
                        out.println("option value" + a + ">" + a + "</option>");
                    }
                %>
            </select>
        </form>
    </body>
</html>
