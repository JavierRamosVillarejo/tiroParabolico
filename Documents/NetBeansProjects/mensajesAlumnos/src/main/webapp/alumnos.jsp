<%@page import="java.util.ArrayList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Mensaje a alumnos</h1>
        <%
            
            String grupoSeleccionado = (String) request.getAttribute("grupo");
            ArrayList<String> grupos = (ArrayList<String>) request.getAttribute("grupos");
            String texto = "";
        %>
        <h3>Grupo Seleccionado: <%=grupoSeleccionado%></h3>
        <form action="servletMensajes" method="get">
            Grupo:<select name="grupo">
                <%
                    for(String gru: grupos){
                        if(grupoSeleccionado.equals(gru)){
                            texto="selected";
                %>
                            <option selected="selected" value="<%=gru%>"><%=gru%></option>
                <%
                        } else { 
                %>
                            <option value="<%=gru%>"><%=gru%></option>
                <%
                        }
                    }
                %>
            </select>
            <br>
            <input type="submit" value="Enviar">    
        </form>
        </table> 
        <input type="submit" value="Enviar">
        </form>
    </body>
</html>
