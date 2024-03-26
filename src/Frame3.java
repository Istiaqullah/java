import javax.swing.*;
import java.awt.*;

public class Frame3 {
    Frame3(){
        JFrame frame=new JFrame("frame 3");
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JButton b=new JButton("click me");
        frame.add(b);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Frame3();
    }
}
