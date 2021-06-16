<%-- 
    Document   : tiro
    Created on : 16-jun-2021, 16:30:04
    Author     : DAW-B
--%>


<%@page import="modelo.Coordenada"%>
<%@page import="modelo.Tiro"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Tiro parabólico</h1>
        
        <%ArrayList<String> listaGrados= (ArrayList<String>) request.getAttribute("grados");%>
        <%ArrayList<Coordenada> coordenadas = new ArrayList();%>
        <% Tiro tr = (Tiro) request.getAttribute("tr");%>
        
        
        <form action="servletTiro" method="post">
                    <label for="velocidad">Velocidad:</label>
                    <input type="number" name="velocidad"><br>
                    <label for="angulo">Ángulo:</label>
                    <select name="angulo">
                        <%
                            for (String g : listaGrados) {
                                String textoSelected = "";
                                 {
                                    textoSelected = "selected";
                                }
                        %>
                            <option <%= textoSelected%> value="<%= g%>"><%= g%></option>

                            <%     }   %>

                    </select>
                    <br>
                    <input type="submit" value="Lanzar">
            
        </form>
     
                            
        <% if (tr!=null){ %>                   
            <h1>El alcance es: <%= tr.getAlcance() %> </h1>
            <h1>La altura máxima es: <%=tr.getAltura()%> </h1>
        <%}
            
        else{ System.out.println("el valor es nulo");}
        
        %>   
        
        <% coordenadas = (ArrayList<Coordenada>) request.getAttribute("coordenadas");%>
            
        
        <table class="table" style="border: solid;">

            <%if (coordenadas != null) {%>
            <th>X</th>
            <th>Y</th>
            
                <%
                        for (Coordenada c : coordenadas) {%>


            <tr>
                <td style="border: solid;"><%=c.getX()%></td>
                <td style="border: solid;"><%=c.getY()%></td>
            </tr>
            <%}
                }%> 


        </table>
                       
                            
        
                
       
    </body>
</html>
