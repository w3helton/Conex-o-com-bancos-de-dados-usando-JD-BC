# Conexão-com-bancos-de-dados-usando-JDBC


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
  <p> 


<h1>Ferramentas utilizadas nesse projeto:</h1>
<b>XAMPP</b>  é um pacote com os principais servidores de código aberto do mercado, incluindo FTP, banco de dados MySQL e Apache com suporte as linguagens PHP e Perl
<a href="https://www.apachefriends.org/pt_br/download.html">https://www.apachefriends.org/pt_br/download.html</a><br><br>

<b> ECLIPSE </b>– IDE de desenvolvimento Java leve e gratuita
<a href="https://www.eclipse.org/downloads/">https://www.eclipse.org/downloads/</a>

<h1>Getting Start</h1>

Criar um novo projeto JAVA<br><br>
Criar 3 pacotes:
<ul><li>DAO - acesso aos objetos (classe Conexao.java)</li>
<li>DTO - transferência de objetos (getters e setters)</li>
<li>VIEW - interfaces gráficas e códigos correspondentes a interface </li></ul>
No pacote VIEW criar a interface gráfica:<br><br>
<img src="https://raw.githubusercontent.com/w3helton/Conexao-com-bancos-de-dados-usando-JDBC/main/img/interface%20login.png" alt="interface" height="300" width="500">
<img src="https://raw.githubusercontent.com/w3helton/Conexao-com-bancos-de-dados-usando-JDBC/main/img/ID%20e%20senha.PNG" alt="interface" height="200" width="400">
<ul><li>Criar a classe de conexão chamada ConexaoDAO.java (clicar com o botão direito na pasta src/New/Class)</li>
<li>Criar o método ConexaoBD público do tipo Connection (CTRL+Espaço para abrir o ajuda do editor de códigos)</li>
<li>Criar um bloco try .. catch</li></ul>
Baixar e importar o driver de conexão em:
<a href="https://dev.mysql.com/downloads/connector/j/">https://dev.mysql.com/downloads/connector/j/</a><br><br>

Descompactar o arquivo em uma pasta
<ul><li>Adicionar o driver num projeto, clique com o botão direito na pasta Library/BuildPath/Configure BuildPath</li>
        <li>Clique em ModulePath/add External JARS</li>
            <li>Aponte a pasta do drive, clique em Apply, e em seguida Apply and Close.</li>
Criar um banco de dados chamado: bancoteste (mesmo nome feito no método ConexaoDAO) e uma tabela chamada usuario. ID= Admin Senha=123<br>
<li>Use o Xampp</li>
    <img src="https://raw.githubusercontent.com/w3helton/Conexao-com-bancos-de-dados-usando-JDBC/main/img/xampp.png" alt="xampp" height="300" width="500">
    <li>Na barra de endereço do navegador digite: <a href="http://localhost/phpmyadmin">http://localhost/phpmyadmin</a></li><br>

    Execute o programa a partir da interface login.<br>
    
    Se o login estiver correto vai chamar a tela principal, caso contrario será apresentado uma mensagem de alerta.<br><br>
    <img src="https://raw.githubusercontent.com/w3helton/Conexao-com-bancos-de-dados-usando-JDBC/main/img/mensagem.PNG" alt="mensagem" height="300" width="400">

<h1>Referência</h1>
   <img src="https://raw.githubusercontent.com/w3helton/Conexao-com-bancos-de-dados-usando-JDBC/main/img/youtube.png" alt="youtube" height="30" width="40"> <a href="https://www.youtube.com/playlist?list=PLA177te8KCzejCXMA_Jd1sJU9pw-utKJ_"> Autenticação de Usuário - Login JAVA com MYSQL </a></ul><br>
   
<strong> BrunoDuarte </strong><br>
</p> 
</body>
</html>
