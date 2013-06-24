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
public class PecaEstoqueModel extends Models implements library.Models {

    private int codigo;
    private String tipo;
    private String descricao;
    private String fabricante;
    private int quantidade;
    private Date data_entrada;
    private Double valor_venda;
    private Double valor_compra;
    private int nota_fiscal;

    public PecaEstoqueModel() {
        super._table = "peca_estoque";
        super._primary = "codigo";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getData_entrada() {
        return data_entrada;
    }

    public void setData_entrada(Date data_entrada) {
        this.data_entrada = data_entrada;
    }

    public Double getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(Double valor_venda) {
        this.valor_venda = valor_venda;
    }

    public Double getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(Double valor_compra) {
        this.valor_compra = valor_compra;
    }

    public int getNota_fiscal() {
        return nota_fiscal;
    }

    public void setNota_fiscal(int nota_fiscal) {
        this.nota_fiscal = nota_fiscal;
    }

    @Override
    public ArrayList fetchAll() throws Exception {
        
        ArrayList<Object> pecaEstoque = new ArrayList<>();
        
        ResultSet rs = this.resultSet();
        
        while(rs.next()){
            PecaEstoqueModel pe = new PecaEstoqueModel();
            
            pe.setCodigo(rs.getInt("codigo"));
            pe.setData_entrada(rs.getDate("data_entrada"));
            pe.setDescricao(rs.getString("descricao"));
            pe.setFabricante(rs.getString("fabricante"));
            pe.setNota_fiscal(rs.getInt("notafiscal"));
            pe.setQuantidade(rs.getInt("quantidade"));
            pe.setTipo(rs.getString("tipo"));
            pe.setValor_compra(rs.getDouble("valor_compra"));
            pe.setValor_venda(rs.getDouble("valor_venda"));
            
            pecaEstoque.add(pe);
        }
        
        return pecaEstoque;
    }

}
