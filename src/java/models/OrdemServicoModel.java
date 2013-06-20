/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Bruno
 */
public class OrdemServicoModel extends Models{

    public String _table;
    public String _primary;
    private int codigo;
    private int cod_cliente;
    private int cod_equipamento;
    private int matr_funcionario;
    private int cod_peca_estoque;
    private int cod_servico;
    private Date data_abertura;
    private Date data_encerramento;
    private String situacao_atual;
    private String tipo_servico;
    private String defeito_informado;
    private String defeito_constatado;
    private String situacao_orcamento;
    private String observacao;
    private Double valor;

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

    public Date getData_abertura() {
        return data_abertura;
    }

    public void setData_abertura(Date data_abertura) {
        this.data_abertura = data_abertura;
    }

    public Date getData_encerramento() {
        return data_encerramento;
    }

    public void setData_encerramento(Date data_encerramento) {
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

        ArrayList<Object> os = new ArrayList<>();
        
        super._table = "ordem_servico";
        ResultSet rs = this.resultSet();

        while (rs.next()) {

            OrdemServicoModel o = new OrdemServicoModel();

            o.setCodigo(rs.getInt("codigo"));
            o.setCod_cliente(rs.getInt("cod_cliente"));
            o.setCod_equipamento(rs.getInt("cod_equipamento"));
            o.setMatr_funcionario(rs.getInt("matr_funcionario"));
            o.setCod_peca_estoque(rs.getInt("cod_peca_estoque"));
            o.setCod_servico(rs.getInt("cod_servico"));
            o.setData_abertura(rs.getDate("data_abertura"));
            o.setData_encerramento(rs.getDate("data_encerramento"));
            o.setSituacao_atual(rs.getString("situacao_atual"));
            o.setTipo_servico(rs.getString("tipo_servico"));
            o.setDefeito_informado(rs.getString("defeito_informado"));
            o.setDefeito_constatado(rs.getString("defeito_constatado"));
            o.setSituacao_orcamento(rs.getString("situacao_orcamento"));
            o.setObservacao(rs.getString("observacao"));
            o.setValor(rs.getDouble("valor"));
            
            os.add(o);
        }

        return os;
    }
}
