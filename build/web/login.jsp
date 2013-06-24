<%@page import="models.FuncionarioModel"%>
<%@page import="models.AcessoModel"%>
<%@page import="controllers.AcessoController"%>
<%
    AcessoController acesso = new AcessoController();
    
    if (!acesso.isSession(session)) {
        
        if (request.getParameter("email") != null && request.getParameter("senha") != null) {
            
            FuncionarioModel res = acesso.validate(request.getParameter("email"), request.getParameter("senha"), null);
            
            if (res.getEmail() != null) {
                session.setAttribute("email", res.getEmail());
                session.setAttribute("nome", res.getNome());
                session.setAttribute("cargo", res.getCargo());
                session.setAttribute("cpf", res.getCpf());
                session.setAttribute("matricula", res.getMatricula());
                session.setAttribute("rg", res.getRg());
                session.setAttribute("telefone", res.getTelefone());
            }
        } else {
        %>
        <div class="alert alert-danger">
            É necessário preencher um usário e senha
        </div>
        <% } 
    }%>
<style type="text/css">
    .form-signin {
        max-width: 300px;
        padding: 19px 29px 29px;
        margin: 0 auto 20px;
        background-color: #fff;
        border: 1px solid #e5e5e5;
        -webkit-border-radius: 5px;
        -moz-border-radius: 5px;
        border-radius: 5px;
        -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);
        -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);
        box-shadow: 0 1px 2px rgba(0,0,0,.05);
    }
    .form-signin .form-signin-heading,
    .form-signin .checkbox {
        margin-bottom: 10px;
    }
    .form-signin input[type="text"],
    .form-signin input[type="password"] {
        font-size: 16px;
        height: auto;
        margin-bottom: 15px;
        padding: 7px 9px;
    }

</style>
<div class="container body">
    <form class="form-signin" method="get" action="index.jsp">
        <h2 class="form-signin-heading">Login</h2>
        <br>
        <input class="input-block-level" type="text" placeholder="Usuario" name="email">
        <input class="input-block-level" type="password" placeholder="Senha" name="senha">
        <input type="hidden" name="url" value="login.jsp">
        <button class="btn btn-large btn-primary" id="login">Entrar</button>
    </form>
</div>