import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class hform {

    private String data;
    private JButton button2;
    private JTextField textField1;
    private JPanel panel5;
    private JLabel lable1;
    private JTextPane textPane1;
    private JButton button1;


    public static void main(String[] args) {
    }
    public hform(){
        ArrayList<String> skills = new ArrayList<String>();//initializarea ArrayList

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                skills.add(textField1.getText());//Urmatoarele linii - utilizarea ArrayList
                textField1.setText("");
                textPane1.setText(skills.toString());//implementarea si folosirea metodei toString
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sjform sj =  new sjform();
                sj.setVisiible();

            }
        });
    }


    public void setVisiible(){
        JFrame frame = new JFrame();
        frame.setContentPane(new hform().panel5);
        frame.setPreferredSize(new Dimension(400, 200 ));
        frame.pack();
        frame.setVisible(true);
    }
}
