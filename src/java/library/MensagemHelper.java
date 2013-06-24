/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author Bruno
 */
public class MensagemHelper {

    public static String getMensagem(String type) {

        String mensagem = "";

        switch (type) {
            case "1":
                mensagem = "<div class='alert alert-success'>Dados cadastrados com sucesso</div>";
                break;
            case "2":
                mensagem = "<div class='alert alert-success'>Dados alterados com sucesso</div>";
                break;
            case "3":
                mensagem = "<div class='alert alert-success'>Dados apagados com sucesso</div>";
                break;
            default:
                mensagem = "<div class='alert alert-success'>Operação desconhecida</div>";
        }
        
        return mensagem;
    }
}
