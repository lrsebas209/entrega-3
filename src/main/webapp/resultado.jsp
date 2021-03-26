<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="co.edu.eafit.protoapp.Bot" %>
<%! Bot bot = new Bot();%>
<%
    String hi = bot.Saludo();
    String answer = bot.Responder();
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
            <p><%= hi%></p>
            <p><%= answer%></p>
        </div>
    </body>
</html>
