<%-- 
    Document   : cadastro
    Created on : 4 de dez. de 2022, 15:31:34
    Author     : Iasmim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./css/cadastrostyle.css">
    <script src="https://kit.fontawesome.com/20a820f995.js" crossorigin="anonymous"></script>
    <title>Cadastrar-se</title>
    <style>
                @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@600&display=swap');

        *{
            margin: 0;
            padding: 0;

        }

        body{
            width: 100%;
            height: 100vh;
            font-family: 'Poppins', sans-serif;
            background: linear-gradient(45deg , #F64851, #AE2C68);
        }

        #form{
            position: relative;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            background-color:   #fff;
            border-radius: 10px;
            padding: 60px;
            width: min-content;
            align-items: center;
            color: #1D1D1F;
        }

        .title{
            font-size: 1.8em;
            margin-bottom: 10%;
            text-align: center;
        }

        .input{
            min-width: 280px;
            border-radius: 22px;
            border: 2px #F64851 solid; 
            padding: 5px;
            margin: 0px 0px 12px -5px;
            outline: none;
        }

        .input input{
            width: 80%;
            border: none;
            outline: none;
            font-family: 'Poppins', sans-serif;
            transform: translateV(-10%);
            color: #1D1D1F;
            font-size: 11pt;
            font-style: italic;
        }

        .input i{
            font-size: 1.2em;
            padding: 5px;
            background: -webkit-linear-gradient(45deg , #F64851, #AE2C68);
            -webkit-background-clip: text;
            -webkit-text-fill-color: transparent;
        }

        #btn{
            margin-top: 10%;
            width: 100%;
            text-align: top;
        }

        #btn button{
            font-family: 'Poppins', sans-serif;
            background: linear-gradient(45deg , #F64851, #AE2C68);
            width: 100%;
            height: 40px;
            border: none;
            font-size: 1.2em;
            color: #fff;
            border-radius: 22px;
            outline: none;
            cursor: pointer;
        }

        #btn2 button{
            font-family: 'Poppins', sans-serif;
            border: none;
            width: 100%;
            height: 40px;
            background-color: #fff;
            color: #9F2960;

        }

        #btn button:hover{
            background: linear-gradient(45deg , #E0414A, #9F2960);
        }

        a:link{
            text-decoration: none;
            color: #F64851;
        }

        a:hover{
           text-decoration: none;
           color: #9F2960;
        }
    </style>
</head>
<body>
    <div id="form">
        <form name="frm" action="Gerenciamento?operacao=1" method="post">
            <h2 class="title">Cadastrar-se</h2>

            <label for="nome">Nome</label>
            <div class="input">
                <i class="fa-solid fa-user"></i> 
                <input id="nome" name="nome" placeholder="Nome" type="text">
            </div>

            <label for="email">E-mail</label>
            <div class="input">
                <i class="fa-solid fa-envelope"></i>
                <input id="email" name="email" placeholder="E-mail" type="text"> 
            </div>

            <label for="senha">Senha</label>
            <div class="input">
                <i class="fa-solid fa-lock"></i>
                <input id="senha" name="senha" placeholder="Senha" type="password">
            </div>

            <div id="btn">
                <button type="submit"><a href="./index.jsp">Cadastrar</a></button>
            </div>
        </form>
    </div>
</body>
</html>
