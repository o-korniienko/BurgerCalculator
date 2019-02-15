package view;

import burgers.BigBurger;
import burgers.LittleBurger;
import burgers.MediumBurger;
import interfaces.Burger;
import interfaces.Supplements;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import supplements.*;

import java.math.BigDecimal;

public class ViewBurger {

    private BigBurger bigBurger;
    private MediumBurger mediumBurger;
    private LittleBurger littleBurger;
    private Salat salat;
    private Tomato tomato;
    private Peppers peppers;
    private Potatoes potatoes;
    private Meat meat;
    private Cheese cheese;


    public ViewBurger() {
    }

    public void setBigBurger(BigBurger bigBurger) {
        this.bigBurger = bigBurger;
    }

    public void setMediumBurger(MediumBurger mediumBurger) {
        this.mediumBurger = mediumBurger;
    }

    public void setLittleBurger(LittleBurger littleBurger) {
        this.littleBurger = littleBurger;
    }

    public void setSalat(Salat salat) {
        this.salat = salat;
    }

    public void setTomato(Tomato tomato) {
        this.tomato = tomato;
    }

    public void setPeppers(Peppers peppers) {
        this.peppers = peppers;
    }

    public void setPotatoes(Potatoes potatoes) {
        this.potatoes = potatoes;
    }

    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public Scene setStage() {
        AnchorPane pane = new AnchorPane();

        final TextField fieldCurrent = new TextField();
        fieldCurrent.setPrefSize(150, 20);
        fieldCurrent.setLayoutX(20);
        fieldCurrent.setLayoutY(10);

        final Button burgerBig = new Button("Big Burger");
        burgerBig.setPrefSize(115, 20);
        burgerBig.setLayoutX(10);
        burgerBig.setLayoutY(45);
        burgerBig.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                actionBurgersButtons(burgerBig, fieldCurrent, "Big Burger", event, bigBurger);
            }
        });


        final Button burgerMedium = new Button("Medium Burger");
        burgerMedium.setPrefSize(115, 20);
        burgerMedium.setLayoutX(140);
        burgerMedium.setLayoutY(45);
        burgerMedium.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                actionBurgersButtons(burgerMedium, fieldCurrent, "Medium Burger", event, mediumBurger);
            }
        });
        final Button burgerLittle = new Button("Little Burger");
        burgerLittle.setPrefSize(115, 20);
        burgerLittle.setLayoutX(265);
        burgerLittle.setLayoutY(45);
        burgerLittle.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                actionBurgersButtons(burgerLittle, fieldCurrent, "Little Burger", event, littleBurger);
            }
        });

        final Button salatB = new Button("Salat");
        salatB.setPrefSize(80, 20);
        salatB.setLayoutX(17);
        salatB.setLayoutY(85);
        salatB.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                actionSupplementsButtons(salatB, fieldCurrent, "Salat", event, salat);
            }
        });

        final Button tomatoB = new Button("Tomato");
        tomatoB.setPrefSize(80, 20);
        tomatoB.setLayoutX(109);
        tomatoB.setLayoutY(85);
        tomatoB.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                actionSupplementsButtons(tomatoB, fieldCurrent, "Tomato", event, tomato);
            }
        });

        final Button peppersB = new Button("Peppers");
        peppersB.setPrefSize(80, 20);
        peppersB.setLayoutX(201);
        peppersB.setLayoutY(85);
        peppersB.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                actionSupplementsButtons(peppersB, fieldCurrent, "Peppers", event, peppers);
            }
        });

        final Button potatoesB = new Button("Potatoes");
        potatoesB.setPrefSize(80, 20);
        potatoesB.setLayoutX(293);
        potatoesB.setLayoutY(85);
        potatoesB.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                actionSupplementsButtons(potatoesB, fieldCurrent, "Potatoes", event, potatoes);
            }
        });

        final Button meatB = new Button("Meat");
        meatB.setPrefSize(80, 20);
        meatB.setLayoutX(17);
        meatB.setLayoutY(125);
        meatB.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                actionSupplementsButtons(meatB, fieldCurrent, "Meat", event, meat);
            }
        });

        final Button cheeseB = new Button("Cheese");
        cheeseB.setPrefSize(80, 20);
        cheeseB.setLayoutX(109);
        cheeseB.setLayoutY(125);
        cheeseB.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                actionSupplementsButtons(cheeseB, fieldCurrent, "Cheese", event, cheese);
            }
        });

        Button reset = new Button("Reset");
        reset.setPrefSize(80, 20);
        reset.setLayoutX(215);
        reset.setLayoutY(10);
        reset.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                fieldCurrent.setText("");
                burgerBig.setText("Big Burger");
                burgerLittle.setText("Little Burger");
                burgerMedium.setText("Medium Burger");
                salatB.setText("Salat");
                tomatoB.setText("Tomato");
                peppersB.setText("Peppers");
                potatoesB.setText("Potatoes");
                meatB.setText("Meat");
                cheeseB.setText("Cheese");
            }
        });


        pane.getChildren().addAll(fieldCurrent, reset, burgerBig, burgerMedium, burgerLittle, salatB, meatB,
                tomatoB, peppersB, potatoesB, cheeseB);
        Scene scene = new Scene(pane, 390, 160);

        return scene;
    }

    private void actionBurgersButtons(Button button, TextField field, String nameButton, MouseEvent event, Burger burger) {
        int count = 0;
        if (event.getButton() == MouseButton.SECONDARY) {
            if (field.getText().isEmpty()) {
                return;
            }
            if (button.getText().equals(nameButton)) {
                return;
            } else {
                String counts = button.getText();
                counts = counts.substring(counts.length() - 1);
                count = Integer.parseInt(counts) - 1;
                if (count == -1) {
                    return;
                } else {
                    String get = field.getText();
                    BigDecimal result = BigDecimal.valueOf(Double.parseDouble(get)).subtract(burger.totalPrice());
                    field.setText(String.valueOf(result));
                    button.setText(nameButton + "-" + count);
                }
            }
        } else {
            if (field.getText().isEmpty()) {
                field.setText(String.valueOf(burger.totalPrice()));
                count++;
                button.setText(nameButton + "-" + count);

            } else {
                if (button.getText().equals(nameButton)) {
                    String get = field.getText();
                    BigDecimal result = BigDecimal.valueOf(Double.parseDouble(get)).add(burger.totalPrice());
                    field.setText(String.valueOf(result));
                    count++;
                    button.setText(nameButton + "-" + count);

                } else {
                    String get = field.getText();
                    BigDecimal result = BigDecimal.valueOf(Double.parseDouble(get)).add(burger.totalPrice());
                    field.setText(String.valueOf(result));
                    String counts = button.getText();
                    counts = counts.substring(counts.length() - 1);
                    count = Integer.parseInt(counts) + 1;
                    button.setText(nameButton + "-" + count);
                }
            }
        }
    }


    private void actionSupplementsButtons(Button button, TextField field, String nameButton, MouseEvent event, Supplements supplements) {
        int count = 0;
        if (event.getButton() == MouseButton.SECONDARY) {
            if (field.getText().isEmpty()) {
                return;
            }
            if (button.getText().equals(nameButton)) {
                return;
            } else {
                String counts = button.getText();
                counts = counts.substring(counts.length() - 1);
                count = Integer.parseInt(counts) - 1;
                if (count == -1) {
                    return;
                } else {
                    String get = field.getText();
                    BigDecimal result = BigDecimal.valueOf(Double.parseDouble(get)).subtract(supplements.getPrice());
                    field.setText(String.valueOf(result));
                    button.setText(nameButton + "-" + count);
                }
            }
        } else {
            if (field.getText().isEmpty()) {
                field.setText(String.valueOf(supplements.getPrice()));
                count++;
                button.setText(nameButton + "-" + count);
            } else {
                if (button.getText().equals(nameButton)) {
                    String get = field.getText();
                    BigDecimal result = BigDecimal.valueOf(Double.parseDouble(get)).add(supplements.getPrice());
                    field.setText(String.valueOf(result));
                    count++;
                    button.setText(nameButton + "-" + count);
                } else {
                    String get = field.getText();
                    BigDecimal result = BigDecimal.valueOf(Double.parseDouble(get)).add(supplements.getPrice());
                    field.setText(String.valueOf(result));
                    String counts = button.getText();
                    counts = counts.substring(counts.length() - 1);
                    count = Integer.parseInt(counts) + 1;
                    button.setText(nameButton + "-" + count);
                }
            }
        }
    }

}
