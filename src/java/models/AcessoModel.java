/*
 * novo comentario
 */
package models;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Bruno
 */
public class AcessoModel extends FuncionarioModel {

    public FuncionarioModel validate(FuncionarioModel acesso) throws Exception {

        ArrayList<String> where = new ArrayList<>();

        where.add("email = '" + acesso.getEmail() + "'");
        where.add("senha = '" + acesso.getSenha() + "'");

        FuncionarioModel funcionario = new FuncionarioModel();

        try {
            ResultSet rs = this.findBy(where);
            if (rs.first()) {
                funcionario.setMatricula(rs.getString("matricula"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setRg(rs.getString("rg"));
                funcionario.setData_nascimento(rs.getDate("data_nascimento"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setSenha(rs.getString("senha"));
            }
        } catch (Exception e) {
            System.out.print(e);
        }
        
        return funcionario;
    }
}
