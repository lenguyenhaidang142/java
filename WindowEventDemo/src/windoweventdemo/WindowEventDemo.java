
package windoweventdemo;

import java.awt.*;        // Using AWT containers and components
import java.awt.event.*;  // Using AWT events classes and listener interfaces
 
// An AWT GUI program inherits the top-level container java.awt.Frame
public class WindowEventDemo extends Frame
      implements ActionListener, WindowListener {
      // This class acts as listener for ActionEvent and WindowEvent
      // A Java class can extend only one superclass, but it can implement multiple interfaces.
 
   private TextField tfCount;  // Declare a TextField component
   private Button btnCount;    // Declare a Button component
   private int count = 0;      // Counter's value
 
   // Constructor to setup the GUI components and event handlers
   public WindowEventDemo() {
      setLayout(new FlowLayout()); // "super" Frame sets to FlowLayout
 
      add(new Label("Counter"));   // "super" Frame adds an anonymous Label
 
      tfCount = new TextField("0", 10); // Construct the TextField
      tfCount.setEditable(false);       // read-only
      add(tfCount);                     // "super" Frame adds TextField
 
      btnCount = new Button("Count");  // Construct the Button
      add(btnCount);                   // "super" Frame adds Button
 
      btnCount.addActionListener(this);
        // btnCount (source object) fires ActionEvent upon clicking
        // btnCount adds "this" object as an ActionEvent listener
 
      addWindowListener(this);
        // "super" Frame (source object) fires WindowEvent.
        // "super" Frame adds "this" object as a WindowEvent listener.
 
      setTitle("WindowEvent Demo"); // "super" Frame sets title
      setSize(250, 100);            // "super" Frame sets initial size
      setVisible(true);             // "super" Frame shows
   }
 
   // The entry main() method
   public static void main(String[] args) {
      new WindowEventDemo();  // Let the construct do the job
   }
 
   /* ActionEvent handler */
   @Override
   public void actionPerformed(ActionEvent evt) {
      ++count;
      tfCount.setText(count + "");
   }
 
   /* WindowEvent handlers */
   // Called back upon clicking close-window button
   @Override
   public void windowClosing(WindowEvent evt) {
      System.exit(0);  // Terminate the program
   }
 
   // Not Used, but need to provide an empty body to compile.
   @Override public void windowOpened(WindowEvent evt) { }
   @Override public void windowClosed(WindowEvent evt) { }
   @Override public void windowIconified(WindowEvent evt) { }
   @Override public void windowDeiconified(WindowEvent evt) { }
   @Override public void windowActivated(WindowEvent evt) { }
   @Override public void windowDeactivated(WindowEvent evt) { }
}