
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Drawing extends Canvas {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        frame.setSize(400, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel canvasPanel2 = new JPanel();
        canvasPanel2.setLayout(new BorderLayout());
        tabbedPane.addTab("jME3 Canvas 2", canvasPanel2);
        Cards re = new Cards();
        tabbedPane.add("Cards", re);
        JButton myb = new JButton("Hi");
        YourActionListener toto = new YourActionListener();
        myb.addActionListener(toto);


        frame.getContentPane().add(tabbedPane);
        tabbedPane.add("Button",myb);
//
//        Canvas canvas = new Drawing();
//        canvas.setSize(400, 400);

        frame.setVisible(true);
    }
}
class YourActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hello World");
    }
}
class Cards extends JPanel {
        public Cards() {}


        public void paintComponent(Graphics g) {

            g.fillOval(100, 100, 200, 200);
        }

}