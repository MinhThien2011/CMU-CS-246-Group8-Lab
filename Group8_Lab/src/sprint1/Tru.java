package sprint1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tru extends JFrame {
    private JTextField txtA, txtB, txtResult;
    private JButton btnSubtract;

    public Tru() {
        setTitle("Máy tính - Phép trừ");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        // Tạo giao diện nhập liệu
        add(new JLabel("Nhập số A:"));
        txtA = new JTextField();
        add(txtA);

        add(new JLabel("Nhập số B:"));
        txtB = new JTextField();
        add(txtB);

        add(new JLabel("Kết quả:"));
        txtResult = new JTextField();
        txtResult.setEditable(false);
        add(txtResult);

        // Tạo nút bấm Trừ
        btnSubtract = new JButton("Trừ");
        add(btnSubtract);

        // Xử lý sự kiện khi nhấn nút Trừ
        btnSubtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(txtA.getText());
                    double b = Double.parseDouble(txtB.getText());
                    double result = a - b;
                    txtResult.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số hợp lệ!");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Tru();
    }
}