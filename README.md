# Conexão-com-bancos-de-dados-usando-JDBC


Features
Ferramentas utilizadas nesse projeto:
XAMPP é um pacote com os principais servidores de código aberto do mercado, incluindo FTP, banco de dados MySQL e Apache com suporte as linguagens PHP e Perl

https://www.apachefriends.org/pt_br/download.html

Eclipse IDE 2023‑03 – IDE de desenvolvimento Java leve e gratuita

https://www.eclipse.org/downloads/

Getting Start
•	Criar um novo projeto JAVA
Cria 3 pacotes:
•	DAO  acesso aos objetos (classe Conexao.java)
•	DTO  transferência de objetos (getters e setters)
•	VIEW  interfaces gráficas e códigos correspondentes a interface 
No pacote VIEW criar a interface gráfica:

•	Criar a classe de conexão chamada ConexaoDAO.java (clicar com o botão direito na pasta src/New/Class)
•	Criar o método ConexaoBD público do tipo Connection (CTRL+Espaço para abrir o ajuda do editor de códigos)
•	Criar um bloco try .. catch
Baixar e importar o driver de conexão em:
https://dev.mysql.com/downloads/connector/j/

Descompactar o arquivo em uma pasta
•	Adicionar o driver num projeto, clique com o botão direito na pasta Library/BuildPath/Configure BuildPath
•	Clique em ModulePath/add External JARS
•	Aponte a pasta do drive, clique em Apply, e em seguida Apply and Close.
•	Criar um banco de dados chamado: bancoteste (mesmo nome feito no método ConexaoDAO) e uma tabela chamada usuario.
•	Use o Xampp
•	Na barra de endereço do navegador digite: http://localhost/phpmyadmin

