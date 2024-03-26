import javax.swing.*;
import java.awt.*;

public class Nolayout {
    Nolayout(){
        JFrame frame=new JFrame();
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        JLabel label=new JLabel("Hello world");
        label.setBounds(100,50,200,50);
        JLabel label2=new JLabel("New Label");
        label2.setBounds(100,180,200,50);

        frame.add(label);
        frame.add(label2);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Nolayout();
    }
}
