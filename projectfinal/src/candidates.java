import javax.swing.*;

public class candidates {
    private JPanel panel4;
    private JButton button1;
    private JTextField textField1;

    public static void main(String[] args){

    }
    public void setVisiible(){
        JFrame frame = new JFrame();
        frame.setContentPane(new candidates().panel4);
        frame.pack();
        frame.setVisible(true);
    }
}
