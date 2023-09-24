import javax.swing.*;

public class Authentication extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JButton loginButton;
    private JButton newAccountButton;

    public Authentication () {
        setTitle("iBanking");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,200);
        setLocationRelativeTo(null);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Authentication();
    }
}
