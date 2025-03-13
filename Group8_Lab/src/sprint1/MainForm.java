package sprint1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {

    public MainForm() {
        setTitle("Main Form");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Tạo thanh menu
        JMenuBar menuBar = new JMenuBar();
        JMenu menuOperations = new JMenu("Chức năng");
        
        // Tạo các mục menu
        JMenuItem addMenuItem = new JMenuItem("Cộng 2 số");
        JMenuItem subtractMenuItem = new JMenuItem("Trừ 2 số");
        JMenuItem multiplyMenuItem = new JMenuItem("Nhân 2 số");
        JMenuItem divideMenuItem = new JMenuItem("Chia 2 số");
        JMenuItem calculatePriceMenuItem = new JMenuItem("Nhập số lượng và tính tiền");
        JMenuItem calculateAreaMenuItem = new JMenuItem("Tính diện tích hình tròn");
        
        // Thêm sự kiện tạm thời (sẽ bổ sung sau)
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Chức năng: " + e.getActionCommand());
            }
        };
        
        // Gán sự kiện
        addMenuItem.addActionListener(actionListener);
        subtractMenuItem.addActionListener(actionListener);
        multiplyMenuItem.addActionListener(actionListener);
        divideMenuItem.addActionListener(actionListener);
        calculatePriceMenuItem.addActionListener(actionListener);
        calculateAreaMenuItem.addActionListener(actionListener);
        
        // Thêm mục menu vào menu chính
        menuOperations.add(addMenuItem);
        menuOperations.addSeparator();
        menuOperations.add(subtractMenuItem);
        menuOperations.addSeparator();
        menuOperations.add(multiplyMenuItem);
        menuOperations.addSeparator();
        menuOperations.add(divideMenuItem);
        menuOperations.addSeparator();
        menuOperations.add(calculatePriceMenuItem);
        menuOperations.addSeparator();
        menuOperations.add(calculateAreaMenuItem);
        
        // Thêm menu vào thanh menu
        menuBar.add(menuOperations);
        
        // Gán thanh menu vào frame
        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainForm().setVisible(true);
        });
    }
}
