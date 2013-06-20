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
public class ClienteModel extends Models{

    public String _table;
    public String _primary;
    private int codigo;
    private String nome;
    private String cpf;
    private Date data_nascimento;
    private String endereco;
    private String telefone_celular;
    private String telefone_residencial;
    private String email;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone_celular() {
        return telefone_celular;
    }

    public void setTelefone_celular(String telefone_celular) {
        this.telefone_celular = telefone_celular;
    }

    public String getTelefone_residencial() {
        return telefone_residencial;
    }

    public void setTelefone_residencial(String telefone_residencial) {
        this.telefone_residencial = telefone_residencial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public ArrayList fetchAll() throws Exception {

        ArrayList<Object> cliente = new ArrayList<>();
        
        super._table = "cliente";
        ResultSet rs = this.resultSet();

        while (rs.next()) {

            ClienteModel c = new ClienteModel();

            c.setCodigo(rs.getInt("codigo"));
            c.setNome(rs.getString("nome"));
            c.setCpf(rs.getString("cpf"));
            c.setData_nascimento(rs.getDate("data_nascimento"));
            c.setEmail(rs.getString("email"));
            c.setEndereco(rs.getString("endereco"));
            c.setTelefone_celular(rs.getString("telefone_celular"));
            c.setTelefone_residencial(rs.getString("telefone_residencial"));

            cliente.add(c);
        }

        return cliente;
    }
}
