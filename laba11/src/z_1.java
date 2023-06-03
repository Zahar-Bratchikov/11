import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class z_1 extends JFrame {

    private final JTextField textField1;
    private final JTextField textField2;

    public z_1() {
        setTitle("Запись в файл");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создание метки и полей ввода
        JLabel label1 = new JLabel("Текст (макс. 25 символов):");
        textField1 = new JTextField(25);
        JLabel label2 = new JLabel("Путь к файлу:");
        textField2 = new JTextField(25);

        // Создание кнопки
        JButton button = new JButton("Записать в файл");

        // Добавление обработчика события нажатия на кнопку
        button.addActionListener(e -> {
            String text = textField1.getText();
            String path = textField2.getText();
            writeToFile(text, path);
        });

        // Создание панели и добавление компонентов на неё
        JPanel panel = new JPanel();
        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(button);

        // Добавление панели на окно
        getContentPane().add(panel);

        setVisible(true);
    }

    private void writeToFile(String text, String path) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            if(text.length()<=25){
                writer.write(text);
                writer.flush();
                System.out.println("Данные успешно записаны в файл.");
            }else {
                System.out.println("Ошибка при записи в файл: ");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new z_1();
    }
}