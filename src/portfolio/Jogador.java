package portfolio;

import java.awt.Color;
import java.awt.Graphics;

public class Jogador {
	public boolean up;
	public boolean down;
	public int x;
	public int y;
	public int larguraJogador;
	public int alturaJogador;
	
	public Jogador(int x, int y) {
		this.x = x;
		this.y = y;
		this.larguraJogador = 10;
		this.alturaJogador = 100;
	}
	
	public void desenhar (Graphics g) {
		g.setColor(new Color(255, 255, 255));
		g.fillRect(x, y, larguraJogador, alturaJogador);
	}
	
	public void atualizar() {
		if(up) {
			y = y - 4;
		} else if(down) {
			y = y + 4;
		}
		
		if(y+alturaJogador > Pong.altura) {
			y = Pong.altura - alturaJogador;
		} else if(y < 0) {
			y = 0;
		}
	}
}
