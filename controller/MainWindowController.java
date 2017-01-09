package controller;

import java.io.File;

import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;


public class MainWindowController {

	private Main main;
	private Stage primaryStage;
	
	public void setMain(Main main, Stage primaryStage){
		this.main = main;
		this.primaryStage = primaryStage;
	}
	
	public void getData(){
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Wybierz plik z danymi");
		fileChooser.getExtensionFilters().addAll(new ExtensionFilter("Pliki tekstowe", "*.txt"));
		
		File selectFile = fileChooser.showOpenDialog(primaryStage);
	}
}
