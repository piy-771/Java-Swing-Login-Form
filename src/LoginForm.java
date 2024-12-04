import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginForm extends JFrame {
    private JPanel loginPage;
    private JTextField loginForm;
    private JTextField piyushTextField;
    private JPasswordField PasswordField;
    private JButton LOGINButton;

    public LoginForm() {
        LOGINButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = piyushTextField.getText();
                char[] password = PasswordField.getPassword();
                File file = new File("f:\\logindata.txt");
                try{
                    FileWriter fileWriter = new FileWriter(file,true);
                    PrintWriter printWriter = new PrintWriter(fileWriter);
                    printWriter.print(name +" " + password + " ");
                    printWriter.close();
                    fileWriter.close();
                    JOptionPane.showMessageDialog(LOGINButton,"Data written in file");
                }catch (IOException ex){
                    System.out.println(ex);
                }
                piyushTextField.setText(" ");
                PasswordField.setText("");
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }

    public static void main(String[] args) {
        LoginForm ob = new LoginForm();
        ob.setContentPane(ob.loginPage);
        ob.setBounds(600,300,500,300);
        ob.setTitle("Login Page");
       // ob.setSize(500,300);
        ob.setVisible(true);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
