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

public class fullbat {
    private JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    fullbat window = new fullbat();
                    window.frame.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public fullbat() {
        this.initialize();
    }

    private void initialize() {
        this.frame = new JFrame();
        this.frame.setIconImage(Toolkit.getDefaultToolkit().getImage("/home/rlopes/.battery_warning/img/batt_full.png"));
        this.frame.setResizable(false);
        this.frame.setAlwaysOnTop(true);
        this.frame.setBounds(100, 100, 600, 220);
        this.frame.setDefaultCloseOperation(3);
        this.frame.getContentPane().setLayout((LayoutManager)null);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int)((dimension.getWidth() - (double)this.frame.getWidth()) / 2.0D);
        int y = (int)((dimension.getHeight() - (double)this.frame.getHeight()) / 2.0D);
        this.frame.setLocation(x, y);
        JLabel label = new JLabel("lbl_img_low");
        label.setIcon(new ImageIcon("/home/rlopes/.battery_warning/img/batt_full.png"));
        label.setBounds(12, 30, 100, 100);
        this.frame.getContentPane().add(label);
        JLabel lblDisconnectYourLaptop = new JLabel("Disconnect your laptop adapter.");
        lblDisconnectYourLaptop.setFont(new Font("Ubuntu", 1, 16));
        lblDisconnectYourLaptop.setBounds(124, 33, 382, 23);
        this.frame.getContentPane().add(lblDisconnectYourLaptop);
        JLabel lblyourBatteryAlmost = new JLabel("<html>Your battery almost fully charger. Unplug your charger from the outlet to conserve energy.</html>");
        lblyourBatteryAlmost.setVerticalAlignment(1);
        lblyourBatteryAlmost.setFont(new Font("Ubuntu", 0, 16));
        lblyourBatteryAlmost.setBounds(124, 68, 431, 58);
        this.frame.getContentPane().add(lblyourBatteryAlmost);
        JButton btnOk = new JButton("OK");
        btnOk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnOk.setFont(new Font("Ubuntu", 1, 16));
        btnOk.setBounds(455, 139, 100, 30);
        this.frame.getContentPane().add(btnOk);
    }
}
