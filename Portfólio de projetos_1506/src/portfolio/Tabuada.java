package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tabuada extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtTabuada;
	private JTextArea txtArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabuada dialog = new Tabuada();
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
	public Tabuada() {
		setTitle("Tabuada");
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 310, 529);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tabuada");
		lblNewLabel.setBounds(31, 48, 60, 14);
		getContentPane().add(lblNewLabel);
		
		txtTabuada = new JTextField();
		txtTabuada.setBounds(90, 45, 86, 20);
		getContentPane().add(txtTabuada);
		txtTabuada.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnCalcular.setBounds(31, 91, 89, 23);
		getContentPane().add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar ();
			}
		});
		btnLimpar.setBounds(158, 91, 89, 23);
		getContentPane().add(btnLimpar);
		
		txtArea = new JTextArea();
		txtArea.setBounds(31, 171, 228, 284);
		getContentPane().add(txtArea);

	}//fim do construtor
	
	void calcular() {
		//variáveis + entrada
		int valor = Integer.parseInt(txtTabuada.getText());
		// processamento + saída
		for  (int i = 1; i < 11; i++) {
			txtArea.append(" " + String.valueOf(valor) + " x " + String.valueOf(i) + " = " + String.valueOf(valor * i) + "\n");
		}
	}
	
	void limpar() {
		txtTabuada.setText(null);
		txtArea.setText(null);
	}
	
}// fim do código
