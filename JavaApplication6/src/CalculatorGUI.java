import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI {
    private Calculator calculator = new Calculator();
    private JTextField num1Field, num2Field, resultField;
    public CalculatorGUI() {
        JFrame frame = new JFrame("Калькулятор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(3, 4));

        JLabel label1 = new JLabel("Число 1:");
        num1Field = new JTextField();
        JLabel label2 = new JLabel("Число 2:");
        num2Field = new JTextField();
        JLabel resultLabel = new JLabel("Результат:");
        resultField = new JTextField();
        resultField.setEditable(false);

        JButton addButton = new JButton("+");
        JButton subButton = new JButton("-");
        JButton mulButton = new JButton("*");
        JButton divButton = new JButton("/");
        JButton powButton = new JButton("^");

        addButton.addActionListener(e -> calculate('+'));
        subButton.addActionListener(e -> calculate('-'));
        mulButton.addActionListener(e -> calculate('*'));
        divButton.addActionListener(e -> calculate('/'));
        powButton.addActionListener(e -> calculate('^'));

        frame.add(label1);
        frame.add(num1Field);
        frame.add(label2);
        frame.add(num2Field);
        frame.add(resultLabel);
        frame.add(resultField);
        frame.add(addButton);
        frame.add(subButton);
        frame.add(mulButton);
        frame.add(divButton);
        frame.add(powButton);
        frame.setVisible(true);
    }

    private void calculate(char operation) {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = 0;
            
            switch (operation) {
                case '+': result = calculator.add(num1, num2); break;
                case '-': result = calculator.subtract(num1, num2); break;
                case '*': result = calculator.multiply(num1, num2); break;
                case '/': 

                    result = calculator.divide(num1, num2);
                    break;
                case '^': result = calculator.power(num1, num2); break;
            }
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ошибка: введите корректные числа!");
        }
    }

}
