package DAO;

import java.sql.Connection;// importado automaticamente quando uso Connection
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexaoDAO {
	
	public Connection conectaBD() {
		Connection conn = null; // cria uma variavel conn com valor null
		
		try {
			
			String url="jdbc:mysql://localhost:3306/bancoteste?user=root&password=";
			/* 
			 jdbc:mysql:// --> tipo de drive de conexão 
			 localhost:3306 é o endereço --> no caso computador local, a porta 3306 é opcional
			 bancoteste é o nome do banco de dados;
			 o usuario do banco é root e no caso está sem senha,por isso password está vazio
			*/
			conn = DriverManager.getConnection(url);// estabelece a comunicação
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());// exibe uma caixa de mensagem com o erro
		}
		return conn;
	}

}

