import jobers.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class sfeform {
    private JRadioButton fullTimeRb;
    private JRadioButton partTimeRb;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JButton introduceButton;
    private JPanel panel3;

    boolean typef;
    boolean typep;
    String domain;
    int moneys;

    public sfeform() {

        introduceButton.addActionListener(new ActionListener() {
            Employee empl;
            candidates cand;
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                moneys = Integer.parseInt(textField1.getText());
                domain = String.valueOf(comboBox1.getSelectedItem());


                if(fullTimeRb.isSelected() & partTimeRb.isSelected() == false){
                    empl = new Employee(domain,moneys);
                }else{
                    empl = new Employee(domain,moneys, typep, typef);
                }

                int ch = JOptionPane.showConfirmDialog(null, "Your chances to  be employed are " + empl.chances() + " with nuber of candidates: " + empl.candidatsquant());
                if (ch == 0){
                     cand = new candidates();
                     cand.setVisiible();
                }
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
    public static void main(String[] args){

    }
    public void setVisiible(){
        JFrame frame = new JFrame();
        frame.setContentPane(new sfeform().panel3);
        frame.pack();
        frame.setVisible(true);
    }
}
