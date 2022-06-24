package com.blinov.bars;

import com.blinov.bars.config.AbstractJavaFxApplicationSupport;
import com.blinov.bars.controller.ConfigurationController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;

@Lazy
@SpringBootApplication
public class BarsApplication extends AbstractJavaFxApplicationSupport {

//	public static void main(String[] args) {
//		SpringApplication.run(BarsApplication.class, args);
//	}
//@Value("${ui.title:JavaFX приложение}")
//private String windowTitle;

	@Autowired
	private ConfigurationController.View view;


	public static void main(String[] args) {
		launchApp(BarsApplication.class, args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("blabla");
		stage.setScene(new Scene(view.getView()));
		stage.setResizable(true);
		stage.centerOnScreen();
		stage.show();
	}
}

