package awtcounteranonymousinnerclass;
import java.awt.*;
import java.awt.event.*;
public class AWTCounterAnonymousInnerClass extends Frame {
    private TextField tfCount;
   private Button btnCount;
   private int count = 0;
 public AWTCounterAnonymousInnerClass () {
      setLayout(new FlowLayout());  
      add(new Label("Counter"));    
      tfCount = new TextField("0", 10);
      tfCount.setEditable(false);   
      add(tfCount); 
      btnCount = new Button("Count");
      add(btnCount);      
      btnCount.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            ++count;
            tfCount.setText(count + "");
         }
      });
      setTitle("AWT Counter");
      setSize(250, 100);
      setVisible(true);
   }
   public static void main(String[] args) {
      new AWTCounterAnonymousInnerClass();
   }
}