<%-- 
    Document   : usuarios
    Created on : 16/06/2013, 02:07:00
    Author     : Bruno
--%>

<%@page import="models.FuncionarioModel"%>
<%@page import="controllers.FuncionarioController"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuários</title>
    </head>
    <body>
        <h3>Usuários</h3>

        <table class="table table-bordered table-striped">
            <thead>
            <th>ID</th>
            <th>Nome</th>
            <th>Email</th>
            <th>Cargo</th>
            <th>CPF</th>
            <th>RG</th>
            <th>Telefone</th>
            <th>Data Nasc.</th>
            <th></th>
        </thead>
        <tbody>
            <%
                FuncionarioController funcionarios = new FuncionarioController();
                ArrayList<FuncionarioModel> list = funcionarios.fetchAll();

                for (FuncionarioModel item : list) {
            %>        
            <tr>
                <td><%=item.getMatricula() %></td>
                <td><%=item.getNome() %></td>
                <td><%=item.getEmail() %></td>
                <td><%=item.getCargo() %></td>
                <td><%=item.getCpf() %></td>
                <td><%=item.getRg() %></td>
                <td><%=item.getTelefone() %></td>
                <td><%=item.getData_nascimento() %></td>
                <td class="btn-group">
                    <a href="#" class="btn btn-mini"><i class="icon-pencil"></i></a>
                    <a href="#" class="btn btn-mini"><i class="icon-trash"></i></a>
                </td>
            </tr>
            <% }%>
        </tbody>
    </table>
</body>
</html>
