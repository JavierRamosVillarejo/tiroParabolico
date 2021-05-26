<%-- 
    Document   : formulario
    Created on : 26-may-2021, 17:45:22
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
        <h1>Banco Bosco</h1>
        <h2>Solicitud de Prestamos</h2>
        
        <%ArrayList<String> lista = (ArrayList) request.getAttribute("lista");%>
        
        <form action="servletBanco" method="post">
            Nombre: <input type="text" name="nombre" ><br>
            Capital que solicita: <input type="number" step="any" name="capital"  ><br>
            Interes: <input type="number" step="any" name="interes"  ><br>
            <% for (String t : lista) {
                        String seleccion = "";
                    
                %>
                <option <%=t%> <%=seleccion%> value="<%=t%>"><%=t%></option>
                <%}%>

            <input type="submit" value="Consultar">


        </form>
    </body>
</html>
