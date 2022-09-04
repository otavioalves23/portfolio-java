package portfolio;

import java.awt.Color;
import java.awt.Graphics;

public class Inimigo {
	public double x;
	public double y;
	public int larguraInimigo;
	public int alturaInimigo;

	public Inimigo(int x, int y) {
		this.x = x;
		this.y = y;
		this.larguraInimigo = 10;
		this.alturaInimigo = 100;

	}
	
	public void desenhar(Graphics g) {
		g.setColor(new Color(255, 255, 255));
		g.fillRect((int)x, (int)y, larguraInimigo, alturaInimigo);
	}
	
	public void atualizar() {
		y+= (Pong.bola.y - y - 5) * 0.5;
	}
}