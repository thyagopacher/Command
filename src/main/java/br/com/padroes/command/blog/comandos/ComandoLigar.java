/**
 * @author Luan Bukowitz Beluzzo
 *
 */
package br.com.padroes.command.blog.comandos;

import br.com.padroes.command.blog.lampada.Lampada;

public class ComandoLigar implements Comando {

	private final Lampada lampada;

	public ComandoLigar(Lampada lampada) {
		this.lampada = lampada;
	}

	public void executar() {
		this.lampada.ligar();
	}

}
