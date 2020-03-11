
package textfieldtest;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

        
        
        


public class JFrame extends TextFieldTest {
    private JTextfield textfield1;
    private JTextfield textfield3;
    private JTextfield textfield2;
    private JPasswordField passwordField;
    
    
    public TextFieldFrame(){
        super("testing jtextfield and passwordfild");
        setLayout(new FlowLayout());
        textField1 = new JTextField(10);
        add(textField1);("enter text here");
        
        textField2 = new JTextField(10);
        add(textField2);("enter text here");
        
        textField3 = new JTextField("uneditable text field", 21);
        textField3.setEditable(false);
        add(textField3);
        
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener( handler );
        textField2.addActionListener( handler );
        textField3.addActionListener( handler ) ;
        passwordField.addActionListener(handler);
            
    }
    private class TextFieldHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            String string="";
            if (event.getSource()==textField2)
                string = String.format("textField1:%s",event.getActionCommand());
            else if (event.getSource()==textField2)
                string = String.format("textField2:%s",event.getActionCommand());
                else if (event.getSource()==textField3)
                    string = String.format("textField3:%s",event.getActionCommand());
                else if (event.getSource()==passwordField)
                        string = String.format("passwordField:%s", event.getActionCommand());
            JOptionPane.showMessageDialog(null,string);
        }
        }
    }
    
    
    
    
}
