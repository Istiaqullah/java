import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame4 implements ActionListener {
    JButton b=new JButton("click me");
    Frame4(){
        JFrame frame=new JFrame("frame 3");
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        b.addActionListener(this);
        frame.add(b);

        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(b.getText().equals("click me")){
            b.setText("clicked");
        }else{
            b.setText("click me");
        }
    }

    public static void main(String[] args) {
        new Frame4();
    }
}
