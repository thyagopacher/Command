package br.com.padroes.command.app;

import br.com.padroes.command.blog.comandos.ComandoDesligar;
import br.com.padroes.command.blog.comandos.ComandoLigar;
import br.com.padroes.command.blog.interruptores.Interruptor;
import br.com.padroes.command.blog.lampada.Lampada;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Adaptado de FREEMAN, E.; FREEMAN, E.; SIERRA, K.; BATES, B. Use a Cabeça! Padrões de Projetos. Alta Books, 2009.
 * */
public class App extends Application {

	private Lampada lampada;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		this.lampada = new Lampada();

		final Group group = new Group();
		group.getChildren().add(lampada);

		final Button bLigar = new Button("Ligar");
		bLigar.setMinWidth(300);
		bLigar.setOnAction(a -> new Interruptor().executar(new ComandoLigar(lampada)));
		final Button bDesligar = new Button("Desligar");
		bDesligar.setMinWidth(300);
		bDesligar.setOnAction(a -> new Interruptor().executar(new ComandoDesligar(lampada)));

		final HBox menu = new HBox();
		menu.setMinWidth(600);
		menu.setMinHeight(30);
		menu.setMaxHeight(30);
		menu.getChildren().addAll(bDesligar, bLigar);

		final BorderPane painelPrincipal = new BorderPane();
		painelPrincipal.setCenter(group);
		painelPrincipal.setBottom(menu);

		Scene scene = new Scene(painelPrincipal, 600, 300);
		stage.setTitle("Comandos");
		stage.setScene(scene);
		stage.show();
	}

}
