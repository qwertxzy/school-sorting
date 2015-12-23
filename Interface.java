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
  private Checkbox bogochbx = new Checkbox();
  private Checkbox cosmicraychbx = new Checkbox();
  private Checkbox selectchbx = new Checkbox();
  private Label label1 = new Label();
  private TextArea showtime = new TextArea();
  private Label label2 = new Label();
  private Checkbox bogobogochbx = new Checkbox();
  // Ende Attribute
  
  public Interface(String title) { 
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
    
    slider.setBounds(16, 16, 358, 70);
    slider.setMinorTickSpacing(1000);
    slider.setMajorTickSpacing(2000);
    slider.setPaintTicks(true);
    slider.setPaintLabels(true);
    slider.setMaximum(10000);
    cp.add(slider);
    button.setBounds(384, 24, 91, 305);
    button.setLabel("Start");
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
    bogochbx.setBounds(24, 216, 116, 20);
    bogochbx.setLabel("BogoSort");
    cp.add(bogochbx);
    cosmicraychbx.setBounds(24, 280, 124, 20);
    cosmicraychbx.setLabel("CosmicRaySort");
    cp.add(cosmicraychbx);
    selectchbx.setBounds(24, 184, 100, 20);
    selectchbx.setLabel("SelectionSort");
    cp.add(selectchbx);
    label1.setBounds(16, 80, 354, 28);
    label1.setText("LENGTH OF ARRAY");
    label1.setFont(new Font("Impact", Font.PLAIN, 18));
    cp.add(label1);
    showtime.setBounds(152, 120, 222, 212);
    showtime.setEditable(false);
    cp.add(showtime);
    label2.setBounds(16, 304, 110, 26);
    label2.setText("ALGORITHM");
    label2.setFont(new Font("Impact", Font.PLAIN, 18));
    cp.add(label2);
    bogobogochbx.setBounds(24, 248, 108, 20);
    bogobogochbx.setLabel("BogoBogoSort");
    cp.add(bogobogochbx);
    
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
      a[i] = randomInteger(1, 10000);
    }
    return a;
  }
  
  public void button_ActionPerformed(ActionEvent evt) {
    int[] tbs = randarr(slider.getValue());
    button.setLabel("Working..");
    if (bubblechbx.getState()) {
      int[] bubbleclone = tbs.clone();
      long startTime = System.nanoTime();
      BubbleSort.sort(bubbleclone);
      long duration = System.nanoTime() - startTime;
      showtime.setText(showtime.getText() + "Bubblesort just finished in " + Long.toString(duration) + " Nanoseconds \n");
    }
    if (heapchbx.getState()) {
      int[] heapclone = tbs.clone();
      long startTime = System.nanoTime();
      HeapSort.sort(heapclone);
      long duration = System.nanoTime() - startTime;
      showtime.setText(showtime.getText() + "Heapsort just finished in " + Long.toString(duration) + " Nanoseconds \n");
    }
    if (selectchbx.getState()) {
      int[] selectclone = tbs.clone();
      long startTime = System.nanoTime();
      SelectionSort.sort(selectclone);
      long duration = System.nanoTime() - startTime;
      showtime.setText(showtime.getText() + "Selectionsort just finished in " + Long.toString(duration) + " Nanoseconds \n");
    }
    if (bogochbx.getState()) {
      int[] bogoclone = tbs.clone();
      long startTime = System.nanoTime();
      BogoSort.sort(bogoclone);
      long duration = System.nanoTime() - startTime;
      showtime.setText(showtime.getText() + "Bogosort just finished in " + Long.toString(duration) + " Nanoseconds \n");
    }
    if (bogobogochbx.getState()) {
      int[] bogobogoclone = tbs.clone();
      long startTime = System.nanoTime();
      BogoBogoSort.sort(bogobogoclone);
      long duration = System.nanoTime() - startTime;
      showtime.setText(showtime.getText() + "I highly doubt that this will ever be shown but Bogobogo Sort finisehd in " + Long.toString(duration) + " Nanoseconds \n");
    }
    if (cosmicraychbx.getState()) {
      int[] cosmicrayclone = tbs.clone();
      long startTime = System.nanoTime();
      CosmicRaySort.sort(cosmicrayclone);
      long duration = System.nanoTime() - startTime;
      showtime.setText(showtime.getText() + "Is the solar system dead yet? If not, it finished in " + Long.toString(duration) + " Nanoseconds \n"); 
    }
    button.setLabel("Start");
  }
  
  public static void main(String[] args) {
    new Interface("School-Sorting");
  }
}
