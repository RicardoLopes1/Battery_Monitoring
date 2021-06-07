//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class lowbat {
    private JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    lowbat window = new lowbat();
                    window.frame.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public lowbat() {
        this.initialize();
    }

    private void initialize() {
        this.frame = new JFrame();
        this.frame.setIconImage(Toolkit.getDefaultToolkit().getImage("/home/rlopes/.battery_warning/img/batt_low.png"));
        this.frame.setFont(new Font("Ubuntu", 0, 14));
        this.frame.setResizable(false);
        this.frame.setAlwaysOnTop(true);
        this.frame.setBounds(100, 100, 600, 220);
        this.frame.setDefaultCloseOperation(3);
        this.frame.getContentPane().setLayout((LayoutManager)null);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int)((dimension.getWidth() - (double)this.frame.getWidth()) / 2.0D);
        int y = (int)((dimension.getHeight() - (double)this.frame.getHeight()) / 2.0D);
        this.frame.setLocation(x, y);
        JLabel lblLblimglow = new JLabel("lbl_img_low");
        lblLblimglow.setIcon(new ImageIcon("/home/rlopes/.battery_warning/img/batt_low.png"));
        lblLblimglow.setBounds(12, 25, 100, 100);
        this.frame.getContentPane().add(lblLblimglow);
        JLabel lblHeader = new JLabel("You are now running on reserve battery power.");
        lblHeader.setFont(new Font("Ubuntu", 1, 16));
        lblHeader.setBounds(124, 25, 382, 23);
        this.frame.getContentPane().add(lblHeader);
        JLabel lblLblcontent = new JLabel("<html>You need to plug the power adapter into your computer and into a power outlet. If you don't your computer will go to sleep in a few minutes to preserve its memory contents.</html>");
        lblLblcontent.setFont(new Font("Ubuntu", 0, 16));
        lblLblcontent.setVerticalAlignment(1);
        lblLblcontent.setBounds(124, 57, 442, 68);
        this.frame.getContentPane().add(lblLblcontent);
        JButton button = new JButton("OK");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        button.setFont(new Font("Ubuntu", 1, 16));
        button.setBounds(465, 147, 100, 30);
        this.frame.getContentPane().add(button);
    }
}
