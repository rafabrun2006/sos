<%-- 
    Document   : index
    Created on : 16/06/2013, 13:54:48
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="assets/css/bootstrap.css">
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <script type="text/javascript" src="assets/js/jquery.js"></script>
        <script type="text/javascript" src="assets/js/bootstrap.js"></script>
        <script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="assets/js/dropdown-boostrap.js"></script>
        <title>Principal</title>
    </head>
    <body>
        <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container">
                    <button data-target=".nav-collapse" data-toggle="collapse" class="btn btn-navbar" type="button">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a href="index.jsp" class="brand">Sistema de OS</a>
                    <div class="nav-collapse collapse">
                        <ul class="nav">
                            <li class="active"><a href="index.jsp">Principal</a></li>
                            <li><a href="?url=os/cadastro-os.jsp">Nova OS</a></li>
                            <li class="dropdown">
                                <a data-toggle="dropdown" class="dropdown-toggle" href="#">Administração<b class="caret"></b></a>
                                <ul class="dropdown-menu">
                                    <li class="nav-header">Menú Rápido</li>
                                    <li><a href="?url=os/os.jsp&type=1">Pendentes</a></li>
                                    <li><a href="?url=os/os.jsp&type=2">Concluidas</a></li>
                                    <li><a href="?url=os/os.jsp">Todas</a></li>
                                    <li class="divider"></li>
                                    <li class="nav-header">Pessoal</li>
                                    <li><a href="?url=pessoa/clientes.jsp">Clientes</a></li>
                                    <li><a href="?url=pessoa/funcionarios.jsp">Funcionários</a></li>
                                    <li class="nav-header">Gerais</li>
                                    <li><a href="?">Equipamento</a></li>
                                    <li><a href="?">Serviço</a></li>
                                    <li><a href="?">Pedidos</a></li>
                                    <li><a href="?">Estoque de Peças</a></li>
                                    <li><a href="?">Pedido Compra</a></li>
                                </ul>
                            </li>
                        </ul>
                        <form class="navbar-form pull-right">
                            <input type="text" placeholder="Email" class="span2">
                            <input type="password" placeholder="Senha" class="span2">
                            <button class="btn" type="submit">Entrar</button>
                        </form>
                    </div><!--/.nav-collapse -->
                </div>
            </div>
        </div>
        <br>
        <br>
        <br>
        <%-- if(1==1){ response.sendRedirect("login.jsp"); } --%>
        <div class="container">
            <!-- Main hero unit for a primary marketing message or call to action -->
            <!--            <div class="hero-unit">
                            <h2>Sistema de Ordens de Serviço</h2>
                        </div>-->
            <!-- Example row of columns -->
            <div class="row">
                <section class="span12">
                    <% if (request.getParameter("url") != null) {%>
                    <jsp:include page="<%=request.getParameter("url")%>"></jsp:include>
                    <% } else {%>
                    <p>
                        O sistema de ordens de serviço foi feito para que o usuário tenha um feedback de seus pedidos
                        além de manter um hitórico de trabalho da area de suporte.
                    </p>
                    <% }%>
                </section>
            </div>
            <hr>
            <div class="row">
                <div class="span6">
                    <h3>Ultimas OS</h3>
                    <ul>
                        <li>Suporte para sistema...</li>
                        <li>Instalação do pacote....</li>
                    </ul>
                    <p><a class="btn" href="#">Ver Todas</a></p>
                </div>
                <div class="span6">
                    <h3>Pendentes</h3>
                    <ul>
                        <li>Instalação do windows...</li>
                        <li>Instalação do pacote....</li>
                    </ul>
                    <p><a class="btn" href="#">Ver Todas</a></p>
                </div>
            </div>
            <hr>
            <footer>
                Todos os direitos reservados 2013
            </footer>
        </div>
    </body>
</html>