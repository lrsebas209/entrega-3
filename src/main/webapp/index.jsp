<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="co.protoapp.Bot" %>
<%! Bot bot = new Bot();%>
<%
    String Hi = bot.Saludo();
%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Bot</title>
    </head>
    <body>
        <div>
            <h1>Bot</h1>
            <form action="resultado.jsp">
                <p><%= Hi%></p>
                <input name="mensaje" type="text" /><input value="Enviar" type="submit" />
            </form>
        </div>
    </body>
</html>
