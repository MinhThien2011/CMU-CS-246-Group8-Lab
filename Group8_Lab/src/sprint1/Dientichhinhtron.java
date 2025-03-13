
package sprint1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dientichhinhtron {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tính Diện Tích Hình Tròn");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 2));
        
        JLabel lblRadius = new JLabel("Bán kính:");
        JTextField txtRadius = new JTextField();
        
        JLabel lblArea = new JLabel("Diện tích:");
        JTextField txtArea = new JTextField();
        txtArea.setEditable(false);
        
        JButton btnCalculate = new JButton("Tính toán");
        
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double radius = Double.parseDouble(txtRadius.getText());
                    double area = Math.PI * radius * radius;
                    txtArea.setText(String.format("%.2f", area));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        frame.add(lblRadius);
        frame.add(txtRadius);
        frame.add(lblArea);
        frame.add(txtArea);
        frame.add(btnCalculate);
        
        frame.setVisible(true);
    }
}
