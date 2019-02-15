package main;

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import view.ViewBurger;

public class StartBurger extends Application {

    public StartBurger() {
    }

    public static ViewBurger setViewBurger(ViewBurger viewBurger) {
        ViewBurger burger = viewBurger;
        return burger;
    }

    public void start(Stage primaryStage) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("ContextBurger.xml");
        ViewBurger viewBurger = (ViewBurger) context.getBean("view");

        primaryStage.setScene(setViewBurger(viewBurger).setStage());
        primaryStage.setTitle("Burger Calculator");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }


}
