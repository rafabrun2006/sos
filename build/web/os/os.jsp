<%-- 
    Document   : usuarios
    Created on : 16/06/2013, 02:07:00
    Author     : Bruno
--%>

<%@page import="controllers.OrdemServicoController"%>
<%@page import="models.OrdemServicoModel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<h3>Clientes</h3>

<table class="table table-bordered table-striped">
    <thead>
    <th>ID</th>
    <th>Cliente</th>
    <th>Mat. Func</th>
    <th>Cod Peç. Estoque</th>
    <th>Data Aberto</th>
    <th>Data Encerr.</th>
    <th>Defeito Inf.</th>
    <th>Defeito Const.</th>
    <th>Valor R$</th>
    <th></th>
</thead>
<tbody>
    <%
        OrdemServicoController os = new OrdemServicoController();
        ArrayList<OrdemServicoModel> list = os.fetchAll();

        for (OrdemServicoModel item : list) {
    %>        
    <tr>
        <td><%=item.getCodigo()%></td>
        <td><%=item.getCod_cliente()%></td>
        <td><%=item.getMatr_funcionario()%></td>
        <td><%=item.getCod_peca_estoque()%></td>
        <td><%=item.getData_abertura()%></td>
        <td><%=item.getData_encerramento()%></td>
        <td><%=item.getDefeito_informado()%></td>
        <td><%=item.getDefeito_constatado()%></td>
        <td><%=item.getObservacao()%></td>
        <td><%=item.getValor()%></td>
        <td class="btn-group">
            <a href="#" class="btn btn-mini"><i class="icon-pencil"></i></a>
            <a href="/sos/ordem-servico?option=excluir&codigo=<%=item.getCodigo()%>" class="btn btn-mini"><i class="icon-trash"></i></a>
        </td>
    </tr>
    <% }%>
</tbody>
</table>