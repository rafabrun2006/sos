/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Bruno
 */
public class ServicoModel extends Models implements library.Models {

    private int codigo;
    private String descricao;
    private Double valor;

    public ServicoModel(){
        super._table = "servico";
        super._primary = "codigo";
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public ArrayList fetchAll() throws Exception {
        ArrayList<ServicoModel> servicos = new ArrayList<>();

        ResultSet rs = this.resultSet();

        while (rs.next()) {
            ServicoModel s = new ServicoModel();
            
            s.setCodigo(rs.getInt("codigo"));
            s.setDescricao(rs.getString("descricao"));
            s.setValor(rs.getDouble("valor"));
            
            servicos.add(s);
        }

        return servicos;
    }
    
}
