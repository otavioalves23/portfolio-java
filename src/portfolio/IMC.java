package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IMC extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtPeso;
	private JTextField txtAltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IMC dialog = new IMC();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public IMC() {
		setModal(true);
		setTitle("IMC");
		setResizable(false);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(41, 42, 46, 14);
		getContentPane().add(lblNewLabel);

		txtNome = new JTextField();
		txtNome.setBounds(95, 39, 272, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);

		JButton txtSalvar = new JButton("Salvar");
		txtSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();

			}
		});
		txtSalvar.setBounds(41, 178, 89, 23);
		getContentPane().add(txtSalvar);

		JLabel lblNewLabel_1 = new JLabel("Idade");
		lblNewLabel_1.setBounds(41, 80, 46, 14);
		getContentPane().add(lblNewLabel_1);

		txtIdade = new JTextField();
		txtIdade.setBounds(95, 77, 86, 20);
		getContentPane().add(txtIdade);
		txtIdade.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Peso");
		lblNewLabel_2.setBounds(41, 118, 46, 14);
		getContentPane().add(lblNewLabel_2);

		txtPeso = new JTextField();
		txtPeso.setBounds(95, 115, 86, 20);
		getContentPane().add(txtPeso);
		txtPeso.setColumns(10);

		txtAltura = new JTextField();
		txtAltura.setBounds(257, 115, 86, 20);
		getContentPane().add(txtAltura);
		txtAltura.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Altura");
		lblNewLabel_3.setBounds(200, 118, 46, 14);
		getContentPane().add(lblNewLabel_3);

	}// fim do construtor

	// Método responsável pelo cálculo do IMC
	void calcular() {
		// Validação
		if (txtNome.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o nome");
			txtNome.requestFocus();
		} else if (txtIdade.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a idade");
			txtIdade.requestFocus();
		} else if (txtPeso.getText().isEmpty()){
			JOptionPane.showMessageDialog(null, "Preencha o peso");
			txtPeso.requestFocus();
		} else if (txtAltura.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a altura");
			txtAltura.requestFocus();
		} else {	
			// Variáveis
			String nome;
			int idade;
			double peso, altura, imc;
			
			// Entrada
			// Armazenando o conteúdo da caixa de texto na variável
			nome = txtNome.getText();
			// Integer.parseInt (converter o conteúdo da caixa de texto para número inteiro)
			idade = Integer.parseInt(txtIdade.getText());
			// Double.parseDouble (converte o conteúdo da caixa de texto para números inteiros e não inteiro)
			peso = Double.parseDouble(txtPeso.getText());
			altura = Double.parseDouble(txtAltura.getText());
			
			// Processamento
			imc = peso / (altura * altura);
			
	        // Saída
			// A linha abaixo exibe o nome armazenado na variável em uma caixa de mensagem.
			// Para personalizar a caixa de mensagem devemos adicionar um texto para o título e um ícone personalizado
			JOptionPane.showMessageDialog(null,
					"Nome: " + nome + "\nIdade: " + idade + "\nPeso: " + peso + "\nAltura: " + altura + "\nIMC: " + imc, "Ficha do aluno",
					JOptionPane.DEFAULT_OPTION);
		}
		
		
	}
}
