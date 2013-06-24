<%-- 
    Document   : cadastro-os
    Created on : 16/06/2013, 02:06:19
    Author     : Admin
--%>
<%@page import="models.OrdemServicoModel"%>
<%@page import="models.ServicoModel"%>
<%@page import="models.PecaEstoqueModel"%>
<%@page import="models.PecaEstoqueModel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="models.EquipamentoModel"%>
<%
    if (request.getParameter("codigo") != null) {
        OrdemServicoModel osm = new OrdemServicoModel();
        osm.setCodigo(Integer.parseInt(request.getParameter("codigo")));
        OrdemServicoModel os = osm.findBy(osm);
%>
<legend>Cadastro de OS</legend>

<form class="form-horizontal" method="post" action="/sos/ordem-servico?option=cadastro" name="cad-os">
    <div class="span5">
        <div class="control-group">
            <label class="control-label">Cliente</label>
            <div class="controls">
                <input type="text" value="<%=os.getCod_cliente()%>" id="codigo" name="cod_cliente">
            </div>
        </div>
        <div class="control-group">
            <label class="control-label">Equipamento</label>
            <div class="controls">
                <%
                    EquipamentoModel equipamento = new EquipamentoModel();
                    ArrayList<EquipamentoModel> equiList = equipamento.fetchAll();
                %>
                <select name="cod_equipamento">
                    <option value="">--</option>
                    <%for (EquipamentoModel item : equiList) {%>
                    <option value="<%=item.getCodigo()%>"><%=item.getDescricao()%></option>
                    <%}%>
                </select>
            </div>
        </div>
        <div class="control-group">
            <%
                PecaEstoqueModel pe = new PecaEstoqueModel();
                ArrayList<PecaEstoqueModel> peList = pe.fetchAll();
            %>
            <label class="control-label">Peça Estoque</label>
            <div class="controls">
                <select name="cod_peca_estoque">
                    <option value="">--</option>
                    <%for (PecaEstoqueModel item : peList) {%>
                    <option value="<%=item.getCodigo()%>"><%=item.getDescricao()%></option>
                    <%}%>
                </select>
            </div>
        </div>
        <div class="control-group">
            <%
                ServicoModel serv = new ServicoModel();
                ArrayList<ServicoModel> servList = serv.fetchAll();
            %>
            <label class="control-label">Cod. Serviço</label>
            <div class="controls">
                <select name="cod_servico">
                    <option value="">--</option>
                    <%for (ServicoModel item : servList) {%>
                    <option value="<%=item.getCodigo()%>"><%=item.getDescricao()%></option>
                    <%}%>
                </select>
            </div>
        </div>
        <div class="control-group">
            <label class="control-label">Data Abertura</label>
            <div class="controls">
                <input type="text" value="<%=os.getData_abertura()%>" class="date-utils" name="data_abertura">
            </div>
        </div>
        <div class="control-group">
            <label class="control-label">Data Encerramento</label>
            <div class="controls">
                <input type="text" value="<%=os.getData_encerramento()%>" name="data_encerramento">
            </div>
        </div>
        <div class="control-group">
            <label class="control-label">Situação Atual</label>
            <div class="controls">
                <input type="text" value="<%=os.getSituacao_atual()%>" name="situacao_atual">
            </div>
        </div>
    </div>
    <div class="span5">
        <div class="control-group">
            <label class="control-label">Tipo Serviço</label>
            <div class="controls">
                <input type="text" value="<%=os.getTipo_servico()%>" name="tipo_servico">
            </div>
        </div>
        <div class="control-group">
            <label class="control-label">Defeito</label>
            <div class="controls">
                <input type="text" value="<%=os.getDefeito_informado()%>" name="defeito_informado">
            </div>
        </div>
        <div class="control-group">
            <label class="control-label">Defeito Constatado</label>
            <div class="controls">
                <input type="text" value="<%=os.getDefeito_constatado()%>" name="defeito_constatado">
            </div>
        </div>
        <div class="control-group">
            <label class="control-label">Orçamento</label>
            <div class="controls">
                <input type="text" value="<%=os.getSituacao_orcamento()%>" name="situacao_orcamento">
            </div>
        </div>
        <div class="control-group">
            <label class="control-label">Observação</label>
            <div class="controls">
                <textarea name="observacao"><%=os.getObservacao()%></textarea>
            </div>
        </div>
        <div class="control-group">
            <label class="control-label">Valor R$</label>
            <div class="controls">
                <input type="number" value="<%=os.getValor()%>" name="valor">
            </div>
        </div>
    </div>
    <div class="form-actions span9">
        <button class="btn" type="reset">Limpar Formulário</button>
        <button class="btn btn-primary" type="submit">Enviar</button>
    </div>
    <input type="hidden" value="<%=os.getMatr_funcionario()%>" name="matr_funcionario">
    <input type="hidden" value="<%=os.getCodigo()%>" id="codigo" name="codigo">
</form>
</fieldset>
<% }%>