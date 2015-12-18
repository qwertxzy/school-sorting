import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;



public class Interface extends JFrame {
  // Anfang Attribute
  private JSlider slider = new JSlider();
  private Button button = new Button();
  private Checkbox bubblechbx = new Checkbox();
  private Checkbox heapchbx = new Checkbox();
  private Checkbox bogochbx = new Checkbox();
  private Checkbox cosmicraychbx = new Checkbox();
  private Checkbox quickchbx = new Checkbox();
  private Label label1 = new Label();
  private TextField showtime = new TextField();
  private Label label2 = new Label();
  private Checkbox bogobogochbx = new Checkbox();
  // Ende Attribute
  
  public Interface(String title) { 
    // Frame-Initialisierung
    super(title);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 493; 
    int frameHeight = 377;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    slider.setBounds(16, 16, 358, 70);
    slider.setMinorTickSpacing(1000);
    slider.setMajorTickSpacing(2000);
    slider.setPaintTicks(true);
    slider.setPaintLabels(true);
    slider.setMaximum(10000);
    cp.add(slider);
    button1.setBounds(384, 24, 91, 305);
    button1.setLabel("START");
    button1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        button1_ActionPerformed(evt);
      }
    });
    button1.setBackground(new Color(0xC0C0C0));
    button1.setFont(new Font("Impact", Font.PLAIN, 18));
    cp.add(button1);
    bubblechbx.setBounds(24, 120, 100, 20);
    bubblechbx.setLabel("BubbleSort");
    cp.add(bubblechbx);
    heapchbx.setBounds(24, 152, 100, 20);
    heapchbx.setLabel("HeapSort");
    cp.add(heapchbx);
    bogochbx.setBounds(24, 216, 116, 20);
    bogochbx.setLabel("BogoSort");
    cp.add(bogochbx);
    cosmicraychbx.setBounds(24, 280, 124, 20);
    cosmicraychbx.setLabel("CosmicRaySort");
    cp.add(cosmicraychbx);
    quickchbx.setBounds(24, 184, 100, 20);
    quickchbx.setLabel("QuickSort");
    cp.add(quickchbx);
    label1.setBounds(16, 80, 354, 28);
    label1.setText("LENGTH OF ARRAY");
    label1.setFont(new Font("Impact", Font.PLAIN, 18));
    cp.add(label1);
    showtime.setBounds(152, 120, 222, 212);
    cp.add(showtime);
    label2.setBounds(16, 304, 110, 26);
    label2.setText("ALGORITHM");
    label2.setFont(new Font("Impact", Font.PLAIN, 18));
    cp.add(label2);
    bogobogochbx.setBounds(24, 248, 108, 20);
    bogobogochbx.setLabel("BogoBogoSort");
    cp.add(bogobogochbx);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public SortingProgram
  
  // Anfang Methoden
  public void button1_ActionPerformed(ActionEvent evt) {
    
  } // end of button1_ActionPerformed
  
  // Ende Methoden
  
  public static void main(String[] args) {
    new Interface("Sort your array!");
  } // end of main
  
} // end of class SortingProgram
