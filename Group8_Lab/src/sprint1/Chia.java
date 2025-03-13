package sprint1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chia extends JFrame {
    private JTextField txtA, txtB, txtResult;
    private JButton btnDivide;

    public Chia() {
        setTitle("Máy tính - Phép Chia");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 10, 10));

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

        // Nút Chia
        btnDivide = new JButton("Chia");
        add(btnDivide);

        // Xử lý sự kiện khi nhấn nút Chia
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(txtA.getText());
                    double b = Double.parseDouble(txtB.getText());
                    if (b == 0) {
                        JOptionPane.showMessageDialog(null, "Lỗi: Không thể chia cho 0!");
                    } else {
                        double result = a / b;
                        txtResult.setText(String.valueOf(result));
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số hợp lệ!");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Chia();
    }
}
