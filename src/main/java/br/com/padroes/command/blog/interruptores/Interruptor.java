/**
 * @author Luan Bukowitz Beluzzo
 *
 */
package br.com.padroes.command.blog.interruptores;

import br.com.padroes.command.blog.comandos.Comando;

public class Interruptor {
	
	public void executar(Comando comando){
		comando.executar();
	}
	
}
