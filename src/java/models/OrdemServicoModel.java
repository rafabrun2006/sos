/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controllers.ConnectionController;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Bruno
 */
public class OrdemServicoModel extends Models {

    public String _table;
    public String _primary;
    private int codigo;
    private int cod_cliente;
    private int cod_equipamento;
    private int matr_funcionario;
    private int cod_peca_estoque;
    private int cod_servico;
    private String data_abertura;
    private String data_encerramento;
    private String situacao_atual;
    private String tipo_servico;
    private String defeito_informado;
    private String defeito_constatado;
    private String situacao_orcamento;
    private String observacao;
    private Double valor;

    public OrdemServicoModel() {
        super._primary = "codigo";
        super._table = "ordem_servico";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public int getCod_equipamento() {
        return cod_equipamento;
    }

    public void setCod_equipamento(int cod_equipamento) {
        this.cod_equipamento = cod_equipamento;
    }

    public int getMatr_funcionario() {
        return matr_funcionario;
    }

    public void setMatr_funcionario(int matr_funcionario) {
        this.matr_funcionario = matr_funcionario;
    }

    public int getCod_peca_estoque() {
        return cod_peca_estoque;
    }

    public void setCod_peca_estoque(int cod_peca_estoque) {
        this.cod_peca_estoque = cod_peca_estoque;
    }

    public int getCod_servico() {
        return cod_servico;
    }

    public void setCod_servico(int cod_servico) {
        this.cod_servico = cod_servico;
    }

    public String getData_abertura() {
        return data_abertura;
    }

    public void setData_abertura(String data_abertura) {
        this.data_abertura = data_abertura;
    }

    public String getData_encerramento() {
        return data_encerramento;
    }

    public void setData_encerramento(String data_encerramento) {
        this.data_encerramento = data_encerramento;
    }

    public String getSituacao_atual() {
        return situacao_atual;
    }

    public void setSituacao_atual(String situacao_atual) {
        this.situacao_atual = situacao_atual;
    }

    public String getTipo_servico() {
        return tipo_servico;
    }

    public void setTipo_servico(String tipo_servico) {
        this.tipo_servico = tipo_servico;
    }

    public String getDefeito_informado() {
        return defeito_informado;
    }

    public void setDefeito_informado(String defeito_informado) {
        this.defeito_informado = defeito_informado;
    }

    public String getDefeito_constatado() {
        return defeito_constatado;
    }

    public void setDefeito_constatado(String defeito_constatado) {
        this.defeito_constatado = defeito_constatado;
    }

    public String getSituacao_orcamento() {
        return situacao_orcamento;
    }

    public void setSituacao_orcamento(String situacao_orcamento) {
        this.situacao_orcamento = situacao_orcamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public ArrayList fetchAll() throws Exception {

        ArrayList<Object> array = new ArrayList<>();

        super._table = "ordem_servico";
        ResultSet rs = this.resultSet();

        while (rs.next()) {

            OrdemServicoModel os = new OrdemServicoModel();

            os.setCodigo(rs.getInt("codigo"));
            os.setCod_cliente(rs.getInt("cod_cliente"));
            os.setCod_equipamento(rs.getInt("cod_equipamento"));
            os.setMatr_funcionario(rs.getInt("matr_funcionario"));
            os.setCod_peca_estoque(rs.getInt("cod_peca_estoque"));
            os.setCod_servico(rs.getInt("cod_servico"));
            os.setData_abertura(rs.getString("data_abertura"));
            os.setData_encerramento(rs.getString("data_encerramento"));
            os.setSituacao_atual(rs.getString("situacao_atual"));
            os.setTipo_servico(rs.getString("tipo_servico"));
            os.setDefeito_informado(rs.getString("defeito_informado"));
            os.setDefeito_constatado(rs.getString("defeito_constatado"));
            os.setSituacao_orcamento(rs.getString("situacao_orcamento"));
            os.setObservacao(rs.getString("observacao"));
            os.setValor(rs.getDouble("valor"));

            array.add(os);
        }

        return array;
    }

    public Boolean save(OrdemServicoModel ordemServico) {

        PreparedStatement stmt;
        ConnectionController conn = new ConnectionController();

        try {
            _sql = "INSERT INTO " + super._table + "("
                    + "cod_cliente,"
                    + "cod_equipamento,"
                    + "matr_funcionario,"
                    + "cod_peca_estoque,"
                    + "cod_servico,"
                    + "data_abertura,"
                    + "data_encerramento,"
                    + "situacao_atual,"
                    + "tipo_servico,"
                    + "defeito_informado,"
                    + "defeito_constatado,"
                    + "situacao_orcamento,"
                    + "observacao,"
                    + "valor"
                    + ") VALUES ("
                    + "'" + ordemServico.getCod_cliente() + "'"
                    + ",'" + ordemServico.getCod_equipamento() + "'"
                    + ",'" + ordemServico.getMatr_funcionario() + "'"
                    + ",'" + ordemServico.getCod_peca_estoque() + "'"
                    + ",'" + ordemServico.getCod_servico() + "'"
                    + ",'" + ordemServico.getData_abertura() + "'"
                    + ",'" + ordemServico.getData_encerramento() + "'"
                    + ",'" + ordemServico.getSituacao_atual() + "'"
                    + ",'" + ordemServico.getTipo_servico() + "'"
                    + ",'" + ordemServico.getDefeito_informado() + "'"
                    + ",'" + ordemServico.getDefeito_constatado() + "'"
                    + ",'" + ordemServico.getSituacao_orcamento() + "'"
                    + ",'" + ordemServico.getObservacao() + "'"
                    + ",'" + ordemServico.getValor() + "'"
                    + ")";

            stmt = conn.odbcConnection().prepareStatement(_sql);
            stmt.executeUpdate();
            stmt.closeOnCompletion();

            System.out.print(_sql);
            return true;

        } catch (Exception e) {
            System.out.print("Model Ordem Servico Error: " + e);
            return false;
        }

    }

    public Boolean delete(OrdemServicoModel os) {

        try {
            super.delete(os.getCodigo());
            return true;
        } catch (Exception e) {
            System.out.print(e);
            return false;
        }
    }

    public OrdemServicoModel findBy(OrdemServicoModel os) {

        ArrayList<String> where = new ArrayList<>();
        where.add("codigo = " + os.getCodigo());

        try {
            ResultSet rs = super.findBy(where);

            os.setCodigo(rs.getInt("codigo"));
            os.setCod_cliente(rs.getInt("cod_cliente"));
            os.setCod_equipamento(rs.getInt("cod_equipamento"));
            os.setMatr_funcionario(rs.getInt("matr_funcionario"));
            os.setCod_peca_estoque(rs.getInt("cod_peca_estoque"));
            os.setCod_servico(rs.getInt("cod_servico"));
            os.setData_abertura(rs.getString("data_abertura"));
            os.setData_encerramento(rs.getString("data_encerramento"));
            os.setSituacao_atual(rs.getString("situacao_atual"));
            os.setTipo_servico(rs.getString("tipo_servico"));
            os.setDefeito_informado(rs.getString("defeito_informado"));
            os.setDefeito_constatado(rs.getString("defeito_constatado"));
            os.setSituacao_orcamento(rs.getString("situacao_orcamento"));
            os.setObservacao(rs.getString("observacao"));
            os.setValor(rs.getDouble("valor"));

            return os;
            
        } catch (Exception e) {
            System.out.print(e);
            return os;
        }
    }
}
