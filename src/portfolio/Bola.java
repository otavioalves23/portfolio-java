package portfolio;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Bola {
	public double x;
	public double y;
	public int larguraBola;
	public int alturaBola;
	public double dx;
	public double dy;
	public double speed = 8.5;

	public Bola(int x, int y) {
		this.x = x;
		this.y = y;
		this.larguraBola = 7;
		this.alturaBola = 7;

		int angulo = new Random().nextInt(70);
		dx = Math.cos(Math.toRadians(angulo));
		dy = Math.sin(Math.toRadians(angulo));
	}

	public void desenhar(Graphics g) {
		g.setColor(new Color(255, 255, 255));
		g.fillRect((int) x, (int) y, larguraBola, alturaBola);
	}

	public void atualizar() {
		if (y + (dy * speed) + alturaBola >= Pong.altura) {
			dy *= -1;
		} else if (y + (dy * speed) < 0) {
			dy *= -1;
		}
		Rectangle bola = new Rectangle((int)(x+(dx*speed)), (int)(y+(dy*speed)), larguraBola, alturaBola);
		Rectangle jogador = new Rectangle(Pong.jogador.x, Pong.jogador.y, Pong.jogador.larguraJogador, Pong.jogador.alturaJogador);
		Rectangle inimigo = new Rectangle((int)Pong.inimigo.x, (int)Pong.inimigo.y, (int)Pong.inimigo.larguraInimigo, (int)Pong.inimigo.alturaInimigo);

		if(bola.intersects(jogador)) {
			int angulo = new Random().nextInt(70);
			dx = Math.cos(Math.toRadians(angulo));
			dy = Math.sin(Math.toRadians(angulo));
			if(dx < 0) {
				dx*=-1;
			}
		}else if(bola.intersects(inimigo)) {
			int angulo = new Random().nextInt(70);
			dx = Math.cos(Math.toRadians(angulo));
			dy = Math.sin(Math.toRadians(angulo));
			if(dx > 0) {
				dx*=-1;
			}
		}
		
		if(x <= 0) {
			System.out.println("Ponto do Inimigo");
			new Pong();
		} else if(x >= 450) {
			System.out.println("Ponto do Jogador");
			new Pong();
		}
		
		x += dx * speed;
		y += dy * speed;
	}
}
