<%-- 
    Document   : usuarios
    Created on : 16/06/2013, 02:07:00
    Author     : Bruno
--%>

<%@page import="models.ClienteModel"%>
<%@page import="controllers.ClienteController"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<h3>Clientes</h3>

<table class="table table-bordered table-striped">
    <thead>
    <th>ID</th>
    <th>Nome</th>
    <th>CPF</th>
    <th>Endereço</th>
    <th>Data Nasc.</th>
    <th>Telefone Celular</th>
    <th>Telefone Residêncial</th>
    <th>Email</th>
    <th></th>
</thead>
<tbody>
    <%
        ClienteController cliente = new ClienteController();
        ArrayList<ClienteModel> list = cliente.fetchAll();

        for (ClienteModel item : list) {
    %>        
    <tr>
        <td><%=item.getCodigo()%></td>
        <td><%=item.getNome()%></td>
        <td><%=item.getCpf()%></td>
        <td><%=item.getData_nascimento()%></td>
        <td><%=item.getEndereco()%></td>
        <td><%=item.getTelefone_celular()%></td>
        <td><%=item.getTelefone_residencial()%></td>
        <td><%=item.getEmail()%></td>
        <td class="btn-group">
            <a href="#" class="btn btn-mini"><i class="icon-pencil"></i></a>
            <a href="#" class="btn btn-mini"><i class="icon-trash"></i></a>
        </td>
    </tr>
    <% }%>
</tbody>
</table>