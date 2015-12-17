import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Random;
import java.util.Arrays;

public class Interface extends JFrame {
  
  private JSlider slider = new JSlider();
  private Button button = new Button();
  private Checkbox bubblechbx = new Checkbox();
  private Checkbox heapchbx = new Checkbox();
  private Checkbox bogobogochbx = new Checkbox();
  private Checkbox cosmicraychbx = new Checkbox();
  private Checkbox quickchbx = new Checkbox();
  private Label label1 = new Label();
  private TextField showtime = new TextField();
  private Label label2 = new Label();
  
  
  public Interface(String title) { 
    
    super(title);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 493; 
    int frameHeight = 387;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    
    
    slider.setBounds(16, 16, 358, 70);
    slider.setMinorTickSpacing(10);
    slider.setMajorTickSpacing(2000);
    slider.setPaintTicks(true);
    slider.setPaintLabels(true);
    slider.setMaximum(10000);
    cp.add(slider);
    button.setBounds(384, 24, 91, 305);
    button.setLabel("START");
    button.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        button_ActionPerformed(evt);
      }
    });
    button.setBackground(new Color(0xC0C0C0));
    button.setFont(new Font("Impact", Font.PLAIN, 18));
    cp.add(button);
    bubblechbx.setBounds(24, 120, 100, 20);
    bubblechbx.setLabel("BubbleSort");
    cp.add(bubblechbx);
    heapchbx.setBounds(24, 152, 100, 20);
    heapchbx.setLabel("HeapSort");
    cp.add(heapchbx);
    bogobogochbx.setBounds(24, 216, 116, 20);
    bogobogochbx.setLabel("BogoBogoSort");
    cp.add(bogobogochbx);
    cosmicraychbx.setBounds(24, 248, 124, 20);
    cosmicraychbx.setLabel("CosmicRaySort");
    cp.add(cosmicraychbx);
    quickchbx.setBounds(24, 184, 100, 20);
    quickchbx.setLabel("QuickSort");
    cp.add(quickchbx);
    label1.setBounds(16, 80, 130, 36);
    label1.setText("LENGTH OF ARRAY");
    label1.setFont(new Font("Impact", Font.PLAIN, 18));
    cp.add(label1);
    showtime.setBounds(152, 96, 222, 236);
    cp.add(showtime);
    label2.setBounds(16, 280, 110, 26);
    label2.setText("ALGORITHM");
    label2.setFont(new Font("Impact", Font.PLAIN, 18));
    cp.add(label2);
    
    
    setVisible(true);
  } 
  
  public int randomInteger(int min, int max) {
    Random rand = new Random();
    int randomNum = rand.nextInt((max - min) + 1) + min;
    
    return randomNum;
  }
  
  private int[] randarr(int length) {
    int[] a = new int[length];
    for (int i = 0; i <= length - 1; i++) {
      a[i] = 1 + randomInteger(1, 10000);
    }
    return a;
  }
  
  public void button_ActionPerformed(ActionEvent evt) {
    //INSERT CODE
    int[] tbs = randarr(slider.getValue());
  } 
  
  public static void main(String[] args) {
    new Interface("Interface");
  } 
} 