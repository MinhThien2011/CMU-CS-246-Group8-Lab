package sprint1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CongvaNhanHaiSo extends JFrame {
    private JTextField num1Field, num2Field, resultField;
    private JButton addButton, multiplyButton;

    public CongvaNhanHaiSo() {
        setTitle("Cộng & Nhân Hai Số");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        // Tạo các thành phần giao diện
        JLabel num1Label = new JLabel("Số thứ nhất:");
        num1Field = new JTextField();

        JLabel num2Label = new JLabel("Số thứ hai:");
        num2Field = new JTextField();

        JLabel resultLabel = new JLabel("Kết quả:");
        resultField = new JTextField();
        resultField.setEditable(false); // Không cho nhập, chỉ hiển thị kết quả

        addButton = new JButton("Cộng");
        multiplyButton = new JButton("Nhân");

        // Xử lý sự kiện nút Cộng
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double sum = num1 + num2;
                    resultField.setText(String.valueOf(sum));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số hợp lệ!");
                }
            }
        });

        // Xử lý sự kiện nút Nhân
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double product = num1 * num2;
                    resultField.setText(String.valueOf(product));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số hợp lệ!");
                }
            }
        });

        // Thêm các thành phần vào giao diện
        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(resultLabel);
        add(resultField);
        add(addButton);
        add(multiplyButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new CongvaNhanHaiSo();
    }
}
