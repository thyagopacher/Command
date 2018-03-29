/**
 * @author Luan Bukowitz Beluzzo
 *
 */
package br.com.padroes.command.blog.comandos;

import br.com.padroes.command.blog.lampada.Lampada;

public class ComandoDesligar implements Comando{

	private final Lampada lampada;
	
	public ComandoDesligar(Lampada lampada) {
		this.lampada = lampada;
	}

	@Override
	public void executar() {
		this.lampada.desligar();
	}

}
