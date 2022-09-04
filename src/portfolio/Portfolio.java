
package portfolio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Cursor;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.util.Date;

public class Portfolio extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Portfolio frame = new Portfolio();
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
	public Portfolio() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				// evento "ativar janela"
				Date data = new Date();
				DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
				lblStatus.setText(formatador.format(data));

			}
		});
		setIconImage(Toolkit.getDefaultToolkit().getImage(Portfolio.class.getResource("/img/Portf\u00F3lio.png")));
		setResizable(false);
		setTitle("Portf\u00F3lio de Projetos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 549);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setToolTipText("IMC");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon(Portfolio.class.getResource("/img/IMC.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// as linhas abaixo fazem o link com o formul�rio IMC
				TelaIMC imc = new TelaIMC();
				imc.setVisible(true);
			}
		});
		btnNewButton.setBounds(39, 11, 64, 64);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setToolTipText("Sobre");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setIcon(new ImageIcon(Portfolio.class.getResource("/img/Sobre.png")));
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// evento clicar no bot�o
				Sobre sobre = new Sobre();
				sobre.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(239, 373, 64, 64);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setToolTipText("M\u00E9dia");
		btnNewButton_2.setIcon(new ImageIcon(Portfolio.class.getResource("/img/M\u00E9dia.png")));
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Media media = new Media();
				media.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(239, 99, 64, 64);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_3.setToolTipText("Temperaura");
		btnNewButton_3.setIcon(new ImageIcon(Portfolio.class.getResource("/img/Temperatura.png")));
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConversaoTemperatura conversao = new ConversaoTemperatura();
				conversao.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(39, 99, 64, 64);
		contentPane.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_4.setToolTipText("Porcentagem");
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setIcon(new ImageIcon(Portfolio.class.getResource("/img/Porcentagem.png")));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalculoPorcentagem porcentagem = new CalculoPorcentagem();
				porcentagem.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(144, 11, 64, 64);
		contentPane.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setToolTipText("Etanol X Gasolina");
		btnNewButton_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_5.setContentAreaFilled(false);
		btnNewButton_5.setBorderPainted(false);
		btnNewButton_5.setIcon(new ImageIcon(Portfolio.class.getResource("/img/Etanol X Gasolina.png")));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EtanolXGasolina combustivel = new EtanolXGasolina();
				combustivel.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(239, 11, 64, 64);
		contentPane.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_6.setToolTipText("Eleitor");
		btnNewButton_6.setIcon(new ImageIcon(Portfolio.class.getResource("/img/Eleitor.png")));
		btnNewButton_6.setContentAreaFilled(false);
		btnNewButton_6.setBorderPainted(false);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eleitor eleitor = new Eleitor();
				eleitor.setVisible(true);
			}
		});
		btnNewButton_6.setBounds(144, 188, 64, 64);
		contentPane.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setToolTipText("Dado");
		btnNewButton_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_7.setContentAreaFilled(false);
		btnNewButton_7.setBorderPainted(false);
		btnNewButton_7.setIcon(new ImageIcon(Portfolio.class.getResource("/img/Dado.png")));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dado dado = new Dado();
				dado.setVisible(true);
			}
		});
		btnNewButton_7.setBounds(144, 99, 64, 64);
		contentPane.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_8.setToolTipText("Tabuada");
		btnNewButton_8.setIcon(new ImageIcon(Portfolio.class.getResource("/img/Tabuada.png")));
		btnNewButton_8.setContentAreaFilled(false);
		btnNewButton_8.setBorderPainted(false);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tabuada tabuada = new Tabuada();
				tabuada.setVisible(true);
			}
		});
		btnNewButton_8.setBounds(39, 282, 64, 64);
		contentPane.add(btnNewButton_8);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(266, 469, 168, 41);
		contentPane.add(panel);
		panel.setLayout(null);

		lblStatus = new JLabel("New label");
		lblStatus.setBounds(37, 0, 141, 41);
		panel.add(lblStatus);
		lblStatus.setForeground(SystemColor.text);
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 16));

		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Carta carta = new Carta();
				carta.setVisible(true);
			}
		});
		btnNewButton_10.setIcon(new ImageIcon(Portfolio.class.getResource("/img/deck.png")));
		btnNewButton_10.setContentAreaFilled(false);
		btnNewButton_10.setBorderPainted(false);
		btnNewButton_10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_10.setToolTipText("Sorteio de uma carta");
		btnNewButton_10.setBounds(239, 188, 64, 64);
		contentPane.add(btnNewButton_10);

		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaJogo telajogo = new TelaJogo();
				telajogo.setVisible(true);
			}
		});
		btnNewButton_9.setIcon(new ImageIcon(Portfolio.class.getResource("/img/handscissors.png")));
		btnNewButton_9.setToolTipText("JoKenPo");
		btnNewButton_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_9.setContentAreaFilled(false);
		btnNewButton_9.setBorderPainted(false);
		btnNewButton_9.setBounds(39, 373, 64, 64);
		contentPane.add(btnNewButton_9);

		JButton btnNewButton_11 = new JButton("");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AppServico appservico = new AppServico();
				appservico.setVisible(true);
			}
		});
		btnNewButton_11.setIcon(new ImageIcon(Portfolio.class.getResource("/img/jog.png")));
		btnNewButton_11.setToolTipText("Calculo Hora de Servi\u00E7o");
		btnNewButton_11.setContentAreaFilled(false);
		btnNewButton_11.setBorderPainted(false);
		btnNewButton_11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_11.setBounds(144, 282, 64, 64);
		contentPane.add(btnNewButton_11);

		JButton btnNewButton_12 = new JButton("");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JurosCompostos juroscompostos = new JurosCompostos();
				juroscompostos.setVisible(true);
			}
		});
		btnNewButton_12.setIcon(new ImageIcon(Portfolio.class.getResource("/img/calculator.png")));
		btnNewButton_12.setToolTipText("Calculadora de Juros Compostos");
		btnNewButton_12.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_12.setBorderPainted(false);
		btnNewButton_12.setContentAreaFilled(false);
		btnNewButton_12.setBounds(239, 282, 64, 64);
		contentPane.add(btnNewButton_12);

		JButton btnNewButton_13 = new JButton("");
		btnNewButton_13.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cep cep = new Cep();
				cep.setVisible(true);
			}
		});
		btnNewButton_13.setIcon(new ImageIcon(Portfolio.class.getResource("/img/cep.png")));
		btnNewButton_13.setToolTipText("Buscador de CEP");
		btnNewButton_13.setContentAreaFilled(false);
		btnNewButton_13.setBorderPainted(false);
		btnNewButton_13.setBounds(39, 188, 64, 64);
		contentPane.add(btnNewButton_13);

		JButton btnNewButton_14 = new JButton("");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pong pong = new Pong();
				pong.setVisible(true);
			}
		});
		btnNewButton_14.setIcon(new ImageIcon(Portfolio.class.getResource("/img/pong.png")));
		btnNewButton_14.setToolTipText("Jogo Pong");
		btnNewButton_14.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_14.setContentAreaFilled(false);
		btnNewButton_14.setBorderPainted(false);
		btnNewButton_14.setBounds(144, 373, 64, 64);
		contentPane.add(btnNewButton_14);
	}// fim do construtor
}
