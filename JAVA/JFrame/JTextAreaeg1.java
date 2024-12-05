package JFrame;
import javax.swing.JFrame;
import javax.swing.JTextArea;



public class JTextAreaeg1 {
    JTextAreaeg1(){
       JFrame f = new JFrame(); 
       JTextArea area = new JTextArea("welcom to Pratik area");
       area.setBounds(10,30,200,200);
       f.add(area);
       f.setSize(300,300);
       f.setLayout(null);
       f.setVisible(true);
    }
    public static void main(String[] args) {
     new JTextAreaeg1();
    }
}
