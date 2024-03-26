import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddButton implements ActionListener {
    int c=1;
    JPanel p2=new JPanel();
    JFrame frame=new JFrame("frame 3");
    AddButton(){

        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2,1));

        JPanel p1=new JPanel();

        p1.setLayout(new FlowLayout());
        p2.setLayout(new FlowLayout());
        JButton add=new JButton("ADD");
        add.addActionListener(this);
        p1.add(add);

        frame.add(p1);
        frame.add(p2);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b=new JButton("b"+c);
        c++;
        p2.add(b);
        frame.revalidate();
    }

    public static void main(String[] args) {
        new AddButton();
    }
}
