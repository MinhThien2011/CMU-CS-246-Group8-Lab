package sprint1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tinhthanhtien {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tính Thành Tiền");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2));
        
        JLabel lblQuantity = new JLabel("Số lượng:");
        JTextField txtQuantity = new JTextField();
        
        JLabel lblPrice = new JLabel("Đơn giá:");
        JTextField txtPrice = new JTextField();
        
        JLabel lblTotal = new JLabel("Thành tiền:");
        JTextField txtTotal = new JTextField();
        txtTotal.setEditable(false);
        
        JButton btnCalculate = new JButton("Tính toán");
        
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int quantity = Integer.parseInt(txtQuantity.getText());
                    double price = Double.parseDouble(txtPrice.getText());
                    double total = quantity * price;
                    txtTotal.setText(String.format("%.2f", total));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        frame.add(lblQuantity);
        frame.add(txtQuantity);
        frame.add(lblPrice);
        frame.add(txtPrice);
        frame.add(lblTotal);
        frame.add(txtTotal);
        frame.add(btnCalculate);
        
        frame.setVisible(true);
    }
}
