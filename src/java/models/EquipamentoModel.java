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
public class EquipamentoModel extends Models{
    
    private int codigo;
    private String tipo;
    private String numero_serie;
    private String descricao;
    private String marca;
    private String modelo;
    private String cor;
    private String acessorios;

    public EquipamentoModel(){
        super._table = "equipamento";
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

    public String getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(String numero_serie) {
        this.numero_serie = numero_serie;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(String acessorios) {
        this.acessorios = acessorios;
    }
    
    public ArrayList fetchAll() throws Exception{
        
        ArrayList<Object> equipamentos = new ArrayList<>();
        
        ResultSet rs = this.resultSet();
        
        while(rs.next()){
            EquipamentoModel e = new EquipamentoModel();
            
            e.setCodigo(rs.getInt("codigo"));
            e.setTipo(rs.getString("tipo"));
            e.setNumero_serie(rs.getString("numero_serie"));
            e.setDescricao(rs.getString("descricao"));
            e.setMarca(rs.getString("marca"));
            e.setModelo(rs.getString("modelo"));
            e.setCor(rs.getString("cor"));
            e.setAcessorios(rs.getString("acessorios"));
            
            equipamentos.add(e);
        }
        
        return equipamentos;
    }
}
