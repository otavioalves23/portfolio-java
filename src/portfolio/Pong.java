package portfolio;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class Pong extends Canvas implements Runnable, KeyListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static int largura = 450;
	public static int altura = 400;
	public static Jogador jogador;
	public static Inimigo inimigo;
	public static Bola bola;

	public Pong() {
		setPreferredSize(new Dimension(largura, altura));
		this.addKeyListener(this);
		jogador = new Jogador(15, 150);
		inimigo = new Inimigo(430, 170);
		bola = new Bola(225, 200);

	}

	public static void main(String args[]) {
		Pong jogo = new Pong();
		JFrame jframe = new JFrame();
		jframe.setVisible(true);
		jframe.add(jogo);
		jframe.pack();
		jframe.setLocationRelativeTo(null);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		new Thread(jogo).start();
	}

	@Override
	public void run() {
		try {
			while (true) {
				Thread.sleep(1000 / 30);
				desenhar();
				atualizar();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void atualizar() {
		 jogador.atualizar();
		 inimigo.atualizar();
		 bola.atualizar();
	}

	private void desenhar() {
		BufferStrategy bs = getBufferStrategy();
		if (bs == null) {
			createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		g.setColor(new Color(0, 0, 0));
		g.fillRect(0, 0, largura, altura);
		jogador.desenhar(g);
		inimigo.desenhar(g);
		bola.desenhar(g);
		bs.show();
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_W) {
			jogador.up = true;
		} else if (e.getKeyCode() == KeyEvent.VK_S) {
			jogador.down = true;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_W) {
			jogador.up = false;
		} else if (e.getKeyCode() == KeyEvent.VK_S) {
			jogador.down = false;
		}

	}

}
