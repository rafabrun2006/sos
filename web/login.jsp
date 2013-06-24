
<%@page import="models.FuncionarioModel"%>
<%@page import="models.AcessoModel"%>
<%@page import="controllers.AcessoController"%>
<%
    AcessoController acesso = new AcessoController();

    if (!acesso.isSession(session)) {

        if (request.getParameter("email") != "" && request.getParameter("senha") != "") {

            FuncionarioModel res = acesso.validate(request.getParameter("email"), request.getParameter("senha"), null);

            if (res.getEmail() != null) {
                session.setAttribute("email", res.getEmail());
                session.setAttribute("nome", res.getNome());
                session.setAttribute("cargo", res.getCargo());
                session.setAttribute("cpf", res.getCpf());
                session.setAttribute("matricula", res.getMatricula());
                session.setAttribute("rg", res.getRg());
                session.setAttribute("telefone", res.getTelefone());
                
                //Redirecionando para pagina principal
                out.print("<meta http-equiv='refresh' content='0; url=index.jsp'>");
            }
        } else {
            if (request.getParameter("action") == "login") {%>
                <div class="alert alert-danger">É necessário preencher um usário e senha</div>
            <% }
        } 
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
<meta http-equiv="refresh">
<div class="container body">
    <form class="form-signin" name="form" method="get" action="index.jsp">
        <h2 class="form-signin-heading">Login</h2>
        <br>
        <input class="input-block-level" type="text" placeholder="Usuario" id="email" name="email">
        <input class="input-block-level" type="password" placeholder="Senha" id="senha" name="senha">
        <input type="hidden" name="action" value="login">
        <input type="hidden" name="url" value="login.jsp">
        <button class="btn btn-large btn-primary" id="login">Entrar</button>
    </form>
</div>
<script type="text/javascript">
    $("#login").click(function(){
       if(!$("#email").val() || !$("#senha").val()){
           alert("É necessário informar um usuário e senha");
           return false;
       }
    });
</script>