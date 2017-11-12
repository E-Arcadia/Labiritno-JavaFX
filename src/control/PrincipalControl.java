package control;

import java.net.URL;
import java.util.ResourceBundle;

import application.Principal;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class PrincipalControl implements Initializable {
//	@FXML private TextField txQtdeColunas, txQtdeLinhas, txPercentilComplexidade;
    @FXML private AnchorPane anchorPane;
	
	private int qtdeColunas;
	private int qtdeLinhas;
	private int percentilComplexidade;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
//		anchorPane.getChildren().add(new Label("ASDASD"));
		iniciaJogo();
	}
	
	@FXML
	public void iniciaJogo() {
//		anchorPane.getChildren().add(new Label("ASDASD"));
//		qtdeColunas = Integer.valueOf(txQtdeColunas.getText());
//		qtdeLinhas = Integer.valueOf(txQtdeLinhas.getText());
//		percentilComplexidade = Integer.valueOf(txPercentilComplexidade.getText());
		
	
		
		GridPane gridPane = new GridPane();
		for(int coluna=0; coluna <qtdeColunas; coluna++) {
			Button label = new Button("ADFASDF");
			gridPane.setConstraints(label, 1,1, 1, 1, HPos.CENTER, VPos.CENTER);
//			anchorPane.getChildren().add(label);
		}

//	anchorPane.getChildren().add(gridPane);
	}

}
