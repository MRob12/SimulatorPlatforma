import javax.swing.*;
import java.awt.event.*;
import jobers.*;

public class window{
    private JButton sfjButton;
    private JPanel panel1;
    private JButton sfeButton;
    public int countSfj = 0;
    public int countSfe = 0;

    public window() {
        sfjButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                hform hf = new hform();
                hf.setVisiible();
                countSfj++;
                Logging.log("Search for a job: ",countSfj);
            }
        });
        sfeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                sfeform sfe = new sfeform();
                sfe.setVisiible();
                countSfe++;
                Logging.log("Search for an employee: ",countSfe);
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setContentPane(new window().panel1);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
