<%-- 
    Document   : listagem
    Created on : Mar 25, 2019, 10:26:11 AM
    Author     : Eduardo
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Usuarios</title>
    </head>
    <body>
        <h1>Listagem</h1>
        <form method="post" action="ProdutoControle?cmd=filtrar">
            <label>Pesquisa:</label>
            <input type="text" id="input" name =" filtro" placeholder="Search for names.."/>
            <input id = "botao" value="filtrar" type="submit"/>
        </form>
        <table  border = "1">
            <tr>
                <th>Usuario</th>
                <th>Cargo</th>
                <th>Email</th>
                <th>Telefone</th>
                <th>Cpf</th>
                <th>Login</th>
                <th>Senha</th>
                <th>Rua</th>
                <th>Número</th>
                <th>Complemento</th>
                <th>Cep</th>
            </tr>
            <c:forEach var="usuario" items="${usuarios}">
                <tr>
                    <td>${usuario.nome} </td>
                    <td>${usuario.cargo}</td>
                    <td>${usuario.email}</td>
                    <td>${usuario.telefone}</td>
                    <td>${usuario.cpf}</td>
                    <td>${usuario.login}</td>
                    <td>${usuario.senha}</td>
                    <td>${usuario.endereco.rua}</td>
                    <td>${usuario.endereco.numero}</td>
                    <td>${usuario.endereco.complemento}</td>
                    <td>${usuario.endereco.cep}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
