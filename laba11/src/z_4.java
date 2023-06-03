import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;

public class z_4 extends Application {

    private TextArea resultTextArea;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Генератор случайных чисел");

        // Создание кнопки
        Button generateButton = new Button("Генерировать");
        generateButton.setOnAction(e -> generateNumbers());

        // Создание текстового поля для отображения результатов
        resultTextArea = new TextArea();
        resultTextArea.setEditable(false);

        // Создание главной панели
        VBox mainPane = new VBox(10);
        mainPane.setPadding(new Insets(10));
        mainPane.getChildren().addAll(generateButton, resultTextArea);

        Scene scene = new Scene(mainPane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void generateNumbers() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        // Генерация 7 случайных чисел
        for (int i = 0; i < 7; i++) {
            int randomNumber = random.nextInt();
            sb.append(randomNumber).append("\n");
        }

        // Отображение результатов в текстовом поле
        resultTextArea.setText(sb.toString());
    }

    public static void main(String[] args) {
        launch(args);
    }
}