import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class clase_combo {
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JLabel TextDisplay1;
    private JPanel root;

    String aux = null;
    public clase_combo() {
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("clase_combo");
        frame.setContentPane(new clase_combo().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
