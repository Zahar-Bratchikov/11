import java.io.*;
import javax.swing.*;

public class z_2 extends JFrame {

    public JTextField lastNameField;
    public final JTextField firstNameField;
    public JTextField middleNameField;
    public JTextField birthDateField;
    public JTextField groupField;

    public z_2() {
        setTitle("Форма ввода данных");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создание меток и полей ввода
        JLabel lastNameLabel = new JLabel("Фамилия:");
        lastNameField = new JTextField(20);
        JLabel firstNameLabel = new JLabel("Имя:");
        firstNameField = new JTextField(20);
        JLabel middleNameLabel = new JLabel("Отчество:");
        middleNameField = new JTextField(20);
        JLabel birthDateLabel = new JLabel("Дата рождения:");
        birthDateField = new JTextField(20);
        JLabel groupLabel = new JLabel("Учебная группа:");
        groupField = new JTextField(20);

        // Создание кнопок
        JButton saveButton = new JButton("Записать");
        JButton loadButton = new JButton("Загрузить");

        // Добавление обработчика события нажатия на кнопку "Записать"
        saveButton.addActionListener(e -> saveDataToFile());

        // Добавление обработчика события нажатия на кнопку "Загрузить"
        loadButton.addActionListener(e -> loadDataFromFile());

        // Создание панели и добавление компонентов на неё
        JPanel panel = new JPanel();
        panel.add(lastNameLabel);
        panel.add(lastNameField);
        panel.add(firstNameLabel);
        panel.add(firstNameField);
        panel.add(middleNameLabel);
        panel.add(middleNameField);
        panel.add(birthDateLabel);
        panel.add(birthDateField);
        panel.add(groupLabel);
        panel.add(groupField);
        panel.add(saveButton);
        panel.add(loadButton);

        // Добавление панели на окно
        getContentPane().add(panel);

        setVisible(true);
    }

    private void saveDataToFile() {
        String lastName = lastNameField.getText();
        String firstName = firstNameField.getText();
        String middleName = middleNameField.getText();
        String birthDate = birthDateField.getText();
        String group = groupField.getText();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"))) {
            writer.write(lastName + "\n");
            writer.write(firstName + "\n");
            writer.write(middleName + "\n");
            writer.write(birthDate + "\n");
            writer.write(group + "\n");
            writer.flush();
            JOptionPane.showMessageDialog(this, "Данные успешно записаны в файл.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Ошибка при записи в файл: " + e.getMessage());
        }
    }

    private void loadDataFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String lastName = reader.readLine();
            String firstName = reader.readLine();
            String middleName = reader.readLine();
            String birthDate = reader.readLine();
            String group = reader.readLine();

            lastNameField.setText(lastName);
            firstNameField.setText(firstName);
            middleNameField.setText(middleName);
            birthDateField.setText(birthDate);
            groupField.setText(group);

            JOptionPane.showMessageDialog(this, "Данные успешно загружены из файла.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Ошибка при загрузке из файла: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new z_2();
    }
}
