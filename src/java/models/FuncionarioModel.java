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
public class FuncionarioModel extends Models {
    
    private String matricula;
    private String nome;
    private String cpf;
    private String rg;
    private Date data_nascimento;
    private String endereco;
    private String telefone;
    private String email;
    private String cargo;
    private String senha;

    public FuncionarioModel(){
        super._table = "funcionario";
        super._primary = "matricula";
    }
    
    public String getMatricula() {
        return matricula;
    }

    /**
     *
     * @param matricula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ArrayList fetchAll() throws Exception {

        ArrayList<Object> funcionarios = new ArrayList<>();
        
        ResultSet rs = this.resultSet();

        while (rs.next()) {

            FuncionarioModel f = new FuncionarioModel();

            f.setMatricula(rs.getString("matricula"));
            f.setNome(rs.getString("nome"));
            f.setCpf(rs.getString("cpf"));
            f.setRg(rs.getString("rg"));
            f.setData_nascimento(rs.getDate("data_nascimento"));
            f.setEmail(rs.getString("email"));
            f.setCargo(rs.getString("cargo"));
            f.setTelefone(rs.getString("telefone"));
            f.setSenha(rs.getString("senha"));

            funcionarios.add(f);
        }

        return funcionarios;
    }
}
