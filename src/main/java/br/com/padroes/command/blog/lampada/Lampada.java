/**
 * @author Luan Bukowitz Beluzzo
 *
 */
package br.com.padroes.command.blog.lampada;

import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;

public class Lampada extends Sphere {
	
	private PhongMaterial onMaterial;
	private PhongMaterial offMaterial;

	public Lampada() {
		onMaterial = criarOnMaterial();
		offMaterial = criarOffMaterial();
		this.setRadius(80.0);
		this.setMaterial(offMaterial);
	}
	
	private PhongMaterial criarOnMaterial(){
		PhongMaterial material = new PhongMaterial();
		material.setDiffuseColor(Color.ORANGE);
		material.setSpecularColor(Color.BLACK);
		return material;
	}
	
	private PhongMaterial criarOffMaterial(){
		PhongMaterial material = new PhongMaterial();
		material.setDiffuseColor(Color.GRAY);
		material.setSpecularColor(Color.BLACK);
		return material;
	}
	
	public void ligar() {
		this.setMaterial(onMaterial);
		System.out.println("lampada ligou");
	}

	public void desligar() {
		this.setMaterial(offMaterial);
		System.out.println("lampada desligou");
	}

}
