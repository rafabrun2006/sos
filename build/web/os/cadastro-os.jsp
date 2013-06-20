<%-- 
    Document   : cadastro-os
    Created on : 16/06/2013, 02:06:19
    Author     : Admin
--%>
<fieldset>
    <legend>Cadastro de OS</legend>

    <form class="form-horizontal" action="" name="cad-os">
        <div class="span5">
            <div class="control-group">
                <label class="control-label">Codigo</label>
                <div class="controls">
                    <input type="text" name="codigo">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Cliente</label>
                <div class="controls">
                    <input type="text" name="cod_cliente">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Equipamento</label>
                <div class="controls">
                    <input type="text" name="cod_equipamento">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Funcionario</label>
                <div class="controls">
                    <input type="text" name="matr_funcionario">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Peça Estoque</label>
                <div class="controls">
                    <input type="text" name="cod_peca_estoque">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Cod. Serviço</label>
                <div class="controls">
                    <input type="text" name="cod_servico">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Data Abertura</label>
                <div class="controls">
                    <input type="date" name="data_abertura">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Data Encerramento</label>
                <div class="controls">
                    <input type="date" name="data_encerramento">
                </div>
            </div>
        </div>
        <div class="span5">
            <div class="control-group">
                <label class="control-label">Situação Atual</label>
                <div class="controls">
                    <input type="text" name="situacao_atual">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Tipo Serviço</label>
                <div class="controls">
                    <input type="text" name="tipo_servico">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Defeito</label>
                <div class="controls">
                    <input type="text" name="defeito_informado">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Defeito Constatado</label>
                <div class="controls">
                    <input type="text" name="defeito_constatado">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Orçamento</label>
                <div class="controls">
                    <input type="text" name="situacao_orcamento">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Observação</label>
                <div class="controls">
                    <textarea name="observacao"></textarea>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Valor R$</label>
                <div class="controls">
                    <input type="number" name="valor">
                </div>
            </div>
        </div>
        <div class="form-actions pull-right span9 btn-group">
            <button class="btn" type="reset">Limpar Formulário</button>
            <button class="btn btn-primary" type="submit">Enviar</button>
        </div>
    </form>
</fieldset>