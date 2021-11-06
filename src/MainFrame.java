import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JTextField FirstNameTextField;
    private JTextField lastNameTextField;
    private JButton btnOk;
    private JButton btnClear;
    private JLabel lbWelcome;
    private JPanel mainPanel;

    public MainFrame() {
        setContentPane(mainPanel);
        setTitle("Main");
        setSize(500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = FirstNameTextField.getText();
                lbWelcome.setText(name);
            }
        });
    }

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
    }
}
