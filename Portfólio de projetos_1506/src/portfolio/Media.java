package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Media extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtDisciplina;
	private JTextField txt1Bim;
	private JTextField txt2Bim;
	private JTextField txt3Bim;
	private JTextField txt4Bim;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Media dialog = new Media();
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
	public Media() {
		setTitle("C\u00E1lculo da M\u00E9dia");
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(10, 11, 46, 14);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Idade");
		lblNewLabel_1.setBounds(10, 45, 46, 14);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Disciplina");
		lblNewLabel_2.setBounds(10, 80, 57, 14);
		getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("1\u00BA Bim");
		lblNewLabel_3.setBounds(10, 120, 46, 14);
		getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("2\u00BA Bim");
		lblNewLabel_4.setBounds(239, 120, 46, 14);
		getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("3\u00BA Bim");
		lblNewLabel_5.setBounds(10, 158, 46, 14);
		getContentPane().add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("4\u00BA Bim");
		lblNewLabel_6.setBounds(239, 158, 46, 14);
		getContentPane().add(lblNewLabel_6);

		txtNome = new JTextField();
		txtNome.setBounds(121, 8, 248, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);

		txtIdade = new JTextField();
		txtIdade.setBounds(121, 42, 46, 20);
		getContentPane().add(txtIdade);
		txtIdade.setColumns(10);

		txtDisciplina = new JTextField();
		txtDisciplina.setBounds(121, 77, 105, 20);
		getContentPane().add(txtDisciplina);
		txtDisciplina.setColumns(10);

		txt1Bim = new JTextField();
		txt1Bim.setBounds(121, 117, 46, 20);
		getContentPane().add(txt1Bim);
		txt1Bim.setColumns(10);

		txt2Bim = new JTextField();
		txt2Bim.setBounds(323, 117, 46, 20);
		getContentPane().add(txt2Bim);
		txt2Bim.setColumns(10);

		txt3Bim = new JTextField();
		txt3Bim.setBounds(121, 155, 46, 20);
		getContentPane().add(txt3Bim);
		txt3Bim.setColumns(10);

		txt4Bim = new JTextField();
		txt4Bim.setBounds(323, 155, 46, 20);
		getContentPane().add(txt4Bim);
		txt4Bim.setColumns(10);

		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnNewButton.setBounds(158, 214, 89, 23);
		getContentPane().add(btnNewButton);

	}// fim do construtor

	// Método responsável pelo cálculo da média do aluno

	void calcular() {
		// Variáveis
		String nome, disciplina;
		int idade;
		double bim1, bim2, bim3, bim4, media;

		// Entrada
		// Armazenando o conteúdo da caixa de texto na variável
		nome = txtNome.getText();
		disciplina = txtDisciplina.getText();
		// Integer.parseInt (converter o conteúdo da caixa de texto para número inteiro)
		idade = Integer.parseInt(txtIdade.getText());
		// Double.parseDouble (converte o conteúdo da caixa de texto para números
		// inteiros e não inteiro)
		bim1 = Double.parseDouble(txt1Bim.getText());
		bim2 = Double.parseDouble(txt2Bim.getText());
		bim3 = Double.parseDouble(txt3Bim.getText());
		bim4 = Double.parseDouble(txt4Bim.getText());

		// Processamento
		media = (bim1 + bim2 + bim3 + bim4) / 4;

		// Saída
		if (media < 5) {
			JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade + "\nDisciplina: " + disciplina +  "\nMedia: " + media + "\nStatus: REPROVADO", "Boletim Escolar", JOptionPane.ERROR_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade + "\nDisciplina: " + disciplina +  "\nMedia: " + media + "\nStatus: APROVADO", "Boletim Escolar", JOptionPane.DEFAULT_OPTION);
		}

		// A linha abaixo exibe o nome armazenado na variável em uma caixa de mensagem.
		// Para personalizar a caixa de mensagem devemos adicionar um texto para o
		// título e um ícone personalizado

	}

}
