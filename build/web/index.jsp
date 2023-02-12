<%-- 
    Document   : index
    Created on : 4 de dez. de 2022, 15:31:17
    Author     : Iasmim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./css/style.css">
    <script src="https://kit.fontawesome.com/20a820f995.js" crossorigin="anonymous"></script>

    <title>Login</title>
    <style>
            @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@600&display=swap');

      body{
          font-family:'Poppins', sans-serif;
          background-image: linear-gradient(45deg , #F64851, #AE2C68);
      }

      .login{
          background-color:#fff;
          position: absolute;
          top: 50%;
          left: 50%;
          transform: translate(-50%, -50%);
          padding: 80px;
          border-radius: 15px;
          color: #1D1D1F;
          text-align: center;

      }

      input{
          min-width: 280px;
          border-radius: 22px;
          border: 2px #F64851 solid; 
          padding: 5px;
          margin: 0px 0px 12px -5px;
          outline: none;
          font-family: 'Poppins', sans-serif;
          font-style: italic;

      }


      button{
          font-family: 'Poppins', sans-serif;
          background: linear-gradient(45deg , #F64851, #AE2C68);
          width: 100%;
          height: 40px;
          border: none;
          font-size: 1.2em;
          border-radius: 22px;
          outline: none;
          cursor: pointer;
          color: transparent;

      }

      button:hover{
          background: linear-gradient(#fff);
          cursor: pointer;
          background-color: #AE2C68;
      }

      a:link{
          text-decoration: none;
          color: #fff;
          border: none;

      }

      a:hover{
         text-decoration: none;
         color: #fff;
      }
    </style>
  </head>
  <body>
        <div class="login">
        <h1>Login</h1>
        <input type="text" placeholder="E-mail">
        <br><br>
        <input type="password" placeholder="Senha">
        <br><br>
        <button><a href="./minhacolecao.jsp">Entrar</a></button>
        <br><br>
        <button><a href="./cadastro.jsp">Cadastrar-se</a></button>
    </div>
  </body>
  
</html>