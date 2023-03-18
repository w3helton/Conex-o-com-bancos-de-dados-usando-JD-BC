package VIEW;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO; //importar a classe de outro pacote

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class frmLoginVIEW extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeUsuario;
	private JPasswordField txtSenhaUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmLoginVIEW frame = new frmLoginVIEW();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmLoginVIEW() {
		setResizable(false);
		setTitle("Formulario de Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(65, 73, 49, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(65, 116, 49, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNomeUsuario = new JTextField();
		txtNomeUsuario.setBounds(144, 70, 208, 20);
		contentPane.add(txtNomeUsuario);
		txtNomeUsuario.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogin.setBounds(203, 171, 89, 23);
		contentPane.add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String nome_usuario, senha_usuario;
					nome_usuario = txtNomeUsuario.getText();
					senha_usuario = txtSenhaUsuario.getText();
					
					/*
				 		Se eu preciso acessar a classe DTO, preciso instanciar essa classe
						porque atraves do meu objeto é que acesso as classes e os metodos da classe
					*/
					
					UsuarioDTO objusuariodto = new UsuarioDTO(); // instanciar a classe
					objusuariodto.setNome_usuario(nome_usuario); // atraves do objusuariodto consigo acessar todos os metodos
					objusuariodto.setSenha_usuario(senha_usuario);
					
					UsuarioDAO objusuariodao = new UsuarioDAO();
					ResultSet rsusuariodao = objusuariodao.autenticacaoUsuario(objusuariodto);
					
					if (rsusuariodao.next()) {
						// chamar tela que quero abrir
						frmPrincipalView objfrmprincipalview = new frmPrincipalView();
						objfrmprincipalview.setVisible(true);
						
						dispose(); // fecha tela de Login
					}
						
					 else {
						// enviar mensagem "senha e/ou usuario invalida"
						JOptionPane.showMessageDialog(null, "Usuario ou Senha Invalida");

					}
					
				} catch (SQLException erro) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "FRMLOGINVIEW: "+erro);
				}
			
				
				
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogin.setBounds(203, 171, 89, 23);
		contentPane.add(btnLogin);
		
		txtSenhaUsuario = new JPasswordField();
		txtSenhaUsuario.setBounds(144, 113, 202, 20);
		contentPane.add(txtSenhaUsuario);
	}
}
