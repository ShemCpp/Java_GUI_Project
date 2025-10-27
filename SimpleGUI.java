import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI {
    public static void main(String[] args) {
        // إنشاء نافذة
        JFrame frame = new JFrame("Fancy Task GUI");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(230, 240, 255)); // خلفية فاتحة

        // نص الترحيب
        JLabel label = new JLabel("Welcome to Your Task Manager!");
        label.setBounds(120, 20, 300, 30);
        label.setFont(new Font("Arial", Font.BOLD, 16));
        label.setForeground(new Color(50, 50, 120));

        // زر Click Me
        JButton button = new JButton("Click Me");
        button.setBounds(200, 150, 100, 40);
        button.setBackground(new Color(100, 150, 255));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setFont(new Font("Tahoma", Font.BOLD, 12));

        // نص متغير عند الضغط على الزر
        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(170, 220, 200, 30);
        resultLabel.setFont(new Font("Arial", Font.ITALIC, 14));
        resultLabel.setForeground(new Color(120, 30, 30));

        // حدث عند الضغط على الزر
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resultLabel.setText("Button Clicked! Task Ready!");
            }
        });

        // إضافة العناصر للنافذة
        frame.add(label);
        frame.add(button);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
}