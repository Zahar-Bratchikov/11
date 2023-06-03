import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class z_5 extends Application {

    private LineChart<Number, Number> lineChart;

    public z_5() {
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("График попадания точки в область");

        // Создание осей
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        lineChart = new LineChart<>(xAxis, yAxis);

        // Создание главной панели
        VBox mainPane = new VBox(20);
        mainPane.setPadding(new Insets(20));
        mainPane.getChildren().add(lineChart);

        // Построение графика
        plotGraph();

        Scene scene = new Scene(mainPane, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void plotGraph() {
        // Создание серии данных 1
        XYChart.Series<Number, Number> series1 = new XYChart.Series<>();
        series1.setName("Серия 1");

        for (double x = -3; x <= -1; x += 0.01) {
            double y = Math.sqrt(3 - Math.pow(x, 2) - 2 * x) + 1;
            series1.getData().add(new XYChart.Data<>(x, y));
        }
        // Создание серии данных 2
        XYChart.Series<Number, Number> series2 = new XYChart.Series<>();
        series2.setName("Серия 2");
        for (double y = 3; y <= 5; y += 0.01) {
            double x = -1;
            series2.getData().add(new XYChart.Data<>(x, y));
        }
        //3
        XYChart.Series<Number, Number> series3 = new XYChart.Series<>();
        series3.setName("Серия 3");
        for (double x = -1; x <= 2; x += 0.01) {
            double y = 5;
            series3.getData().add(new XYChart.Data<>(x, y));
        }

        //4
        XYChart.Series<Number, Number> series4 = new XYChart.Series<>();
        series4.setName("Серия 4");
        for (double x = 2; x >= 0; x -= 0.01) {
            double y = 1.5 * x + 2;
            series4.getData().add(new XYChart.Data<>(x, y));
        }

        //5
        XYChart.Series<Number, Number> series5 = new XYChart.Series<>();
        series5.setName("Серия 5");
        for (double x = 0; x <= 2; x += 0.01) {
            double y = 2 - x;
            series5.getData().add(new XYChart.Data<>(x, y));
        }

        //6
        XYChart.Series<Number, Number> series6 = new XYChart.Series<>();
        series6.setName("Серия 6");
        for (double x = 2; x >= -2; x -= 0.01) {
            double y = -0.25 * x + 0.5;
            series6.getData().add(new XYChart.Data<>(x, y));
        }

        //7
        XYChart.Series<Number, Number> series7 = new XYChart.Series<>();
        series7.setName("Серия 7");
        for (double x = -2; x <= 0; x += 0.01) {
            double y = -x - 1;
            series7.getData().add(new XYChart.Data<>(x, y));
        }

        //8
        XYChart.Series<Number, Number> series8 = new XYChart.Series<>();
        series8.setName("Серия 8");
        for (double x = 0; x <= 1; x += 0.01) {
            double y = -3 * x - 1;
            series8.getData().add(new XYChart.Data<>(x, y));
        }

        //9
        XYChart.Series<Number, Number> series9 = new XYChart.Series<>();
        series9.setName("Серия 9");
        for (double x = 1; x >= -1; x -= 0.01) {
            double y = -1.5 * x - 2.5;
            series9.getData().add(new XYChart.Data<>(x, y));
        }

        //10
        XYChart.Series<Number, Number> series10 = new XYChart.Series<>();
        series10.setName("Серия 10");
        for (double x = -1; x >= -3; x -= 0.01) {
            double y = -Math.sqrt(3 - Math.pow(x, 2) - 2 * x) + 1;
            series10.getData().add(new XYChart.Data<>(x, y));
        }
        double x0 = -3;
        double y0 = Math.sqrt(3 - Math.pow(x0, 2) - 2 * x0) + 1;
        series10.getData().add(new XYChart.Data<>(x0, y0));
        //11
        XYChart.Series<Number, Number> series11 = new XYChart.Series<>();
        series11.setName("Серия 11");
        for (double x = 2; x <= 3; x += 0.01) {
            double y = 3*x-5;
            series11.getData().add(new XYChart.Data<>(x, y));
        }
        //12
        XYChart.Series<Number, Number> series12 = new XYChart.Series<>();
        series12.setName("Серия 12");
        for (double x = 3; x <= 4; x += 0.01) {
            double y = -3*x+13;
            series12.getData().add(new XYChart.Data<>(x, y));
        }
        //13
        XYChart.Series<Number, Number> series13 = new XYChart.Series<>();
        series13.setName("Серия 13");
        for (double x = 6; x <= 7; x += 0.01) {
            double y = -2*x+11;
            series13.getData().add(new XYChart.Data<>(x, y));
        }
        //14
        XYChart.Series<Number, Number> series14 = new XYChart.Series<>();
        series14.setName("Серия 14");
        for (double x = 5; x <= 7; x += 0.01) {
            double y = x-10;
            series14.getData().add(new XYChart.Data<>(x, y));
        }
        //15
        XYChart.Series<Number, Number> series15 = new XYChart.Series<>();
        series15.setName("Серия 15");
        for (double x = 3; x <= 5; x += 0.01) {
            double y = -0.5*x-2.5;
            series15.getData().add(new XYChart.Data<>(x, y));
        }
        //16
        XYChart.Series<Number, Number> series16 = new XYChart.Series<>();
        series16.setName("Серия 16");
        for (double x = 3; x <= 4; x += 0.01) {
            double y = x-7;
            series16.getData().add(new XYChart.Data<>(x, y));
        }
        //17
        XYChart.Series<Number, Number> series17 = new XYChart.Series<>();
        series17.setName("Серия 17");
        for (double x = 2; x <= 3; x += 0.01) {
            double y = -x+1;
            series17.getData().add(new XYChart.Data<>(x, y));
        }
        //18
        XYChart.Series<Number, Number> series18 = new XYChart.Series<>();
        series18.setName("Серия 18");
        for (double x = 3; x <=4; x += 0.01) {
            double y = 2*x-8;
            series18.getData().add(new XYChart.Data<>(x, y));
        }
        //19
        XYChart.Series<Number, Number> series19 = new XYChart.Series<>();
        series19.setName("Серия 19");
        for (double x = 2; x <= 4; x += 0.01) {
            double y = -0.5*x+2;
            series19.getData().add(new XYChart.Data<>(x, y));
        }
        //20
        XYChart.Series<Number, Number> series20 = new XYChart.Series<>();
        series20.setName("Серия 20");
        for (double x = 4; x <= 6; x += 0.01) {
            double y = Math.sqrt(-12 - Math.pow(x, 2) + 8 * x) - 1;
            series20.getData().add(new XYChart.Data<>(x, y));
        }
        // Создание серии данных 21
        XYChart.Series<Number, Number> series21 = new XYChart.Series<>();
        series21.setName("Серия 21");
        for (double x = 2; x <= 4; x += 0.01) {
            double y = -Math.sqrt(-12 - Math.pow(x, 2) + 8 * x) - 1;
            series21.getData().add(new XYChart.Data<>(x, y));
        }

        // Очистка предыдущих серий данных и добавление новых серий на график
        lineChart.getData().clear();
        lineChart.setCreateSymbols(false); // Отключение отображения точек данных
        lineChart.getData().addAll(
                series1, series2, series3, series4, series5, series6, series7, series8, series9, series10,
                series11, series12, series13, series14, series15, series16, series17, series18, series19, series20, series21
        );
    }

    public static void main(String[] args) {
        launch(args);
    }
}
