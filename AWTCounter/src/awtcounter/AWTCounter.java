
package awtcounter;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
public class AWTCounter extends Frame implements ActionListener
{
   private Label lblCount;    // Declare a Label component 
   private TextField tfCount; // Declare a TextField component 
   private Button btnCount;   // Declare a Button component
   private int count = 0;     // Counter's value
   public AWTCounter () {
      setLayout(new FlowLayout());
      lblCount = new Label("Counter"); 
      add(lblCount);                    
 
      tfCount = new TextField("0", 10); 
      tfCount.setEditable(false);      
      add(tfCount);                    
 
      btnCount = new Button("Count");   
      add(btnCount);                   
 
      btnCount.addActionListener(this);
      setTitle("AWT Counter");  // "super" Frame sets its title
      setSize(250, 100);        // "super" Frame sets its initial window size
 
      // For inspecting the Container/Components objects
      // System.out.println(this);
      // System.out.println(lblCount);
      // System.out.println(tfCount);
      // System.out.println(btnCount);
 
      setVisible(true);         // "super" Frame shows
 
      // System.out.println(this);
      // System.out.println(lblCount);
      // System.out.println(tfCount);
      // System.out.println(btnCount);
   }
   public static void main(String[] args) {
      AWTCounter app = new AWTCounter();
   }
   public void actionPerformed(ActionEvent evt) {
      ++count;
      tfCount.setText(count + ""); 
   }
}