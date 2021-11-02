import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import jobers.*;

public class sjform {
    private JPanel panel2;
    private JRadioButton fullTimeRadioButton;
    private JRadioButton partTimeRadioButton;
    private JTextField textField1;
    private JLabel money;
    private JComboBox comboBox1;
    private JButton introduceButton;
    private JLabel state;

    boolean typef;
    boolean typep;
    String domain;
    int moneys;

    public sjform() {


        introduceButton.addActionListener(new ActionListener() {
            EployerClass empl;
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                moneys = Integer.parseInt(textField1.getText());//Utilizare get/set
                domain = String.valueOf(comboBox1.getSelectedItem());
                money.setText(domain);



                if(fullTimeRadioButton.isSelected() & partTimeRadioButton.isSelected() == false){
                    empl = new EployerClass(domain,moneys);
                }else{
                    empl = new EployerClass(domain,moneys, typep, typef);
                }

                JOptionPane.showMessageDialog(null, "Your chances to  be employed are " + empl.chances());
            }
        });
        final String A = "Architecture";
        final String B = "Engineering";
        final String C = "Medicine";
        ArrayList<String> jobs = new ArrayList<String>();//initializarea ArrayList
        jobs.add(A);
        jobs.add(B);
        jobs.add(C);
        for (int i = 0; i < jobs.size(); i++)
            comboBox1.addItem(jobs.get(i));
    }

    public void setVisiible(){
        JFrame frame = new JFrame();
        frame.setContentPane(new sjform().panel2);

        frame.pack();
        frame.setVisible(true);

    }
    public static void main(String[] args){



    }
}
