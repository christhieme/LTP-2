import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Login extends JFrame {
    private final JLabel myLabel1;
    private final JLabel myLabel2;
    private final JLabel myLabel3;
    
    private final JTextField myName;
    private final JPasswordField myPassword;
    
    public Login () {
        super("Sistema XPTO");
        setLayout(new FlowLayout());
        
        myLabel1 = new JLabel("Para entrar no sistema XPTO, digite seu nome e senha:");
        add(myLabel1);
        
        myLabel2 = new JLabel("Nome:");
         add(myLabel2);
        
            
        myName = new JTextField(10);
        add(myName); 
        
        myLabel3 = new JLabel("Senha:");
        add(myLabel3);
        
        myPassword = new JPasswordField("Password");
        add(myPassword);
        
        TextFieldHandler handler = new TextFieldHandler();
        myName.addActionListener(handler);
        myPassword.addActionListener(handler);
    }
    
    private class TextFieldHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event){
            String string = "";        
            if (event.getSource() == myName) {
                string = String.format("Obrigado por digitar seu nome: %s", event.getActionCommand());
                
            } else if (event.getSource() == myPassword) {
                string = String.format("Obrigado por digitar sua senha: %s", event.getActionCommand());
            }
            JOptionPane.showMessageDialog(null, string);
        }
    }
}

