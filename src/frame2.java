import javax.swing.*;
import java.awt.*;

public class frame2 {
    frame2(){
        JFrame frame=new JFrame();
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2,2));

        JLabel label=new JLabel("Hello world");
        JLabel label1=new JLabel("label1");
        JLabel label2=new JLabel("label2");
        JLabel label3=new JLabel("label3");

        frame.add(label);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new frame2();
    }
}
