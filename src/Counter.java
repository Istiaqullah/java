import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter implements ActionListener {
    JTextField textField=new JTextField(20);
    JButton count=new JButton("count");
    JButton reset=new JButton("reset");
    Counter(){
        JFrame frame=new JFrame("frame 3");
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label=new JLabel("Counter:");
        textField.setText("0");
        frame.add(label);
        frame.add(textField);

        count.addActionListener(this);
        reset.addActionListener(this);

        frame.add(count);
        frame.add(reset);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==count){
            String t=textField.getText();
            int c=Integer.parseInt(t);
            c++;
            //textField.setText(String.valueOf(c));
            textField.setText(c+"");
        }else{
            textField.setText("0");
        }
    }

    public static void main(String[] args) {
        new Counter();
    }
}
