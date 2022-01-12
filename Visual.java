//Russell Deady
//A cool visual I created on a GUI with Java.
//Started on 1/8/22 and last edited on 1/12/22

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Visual extends JPanel implements ActionListener{

   private static JFrame frame;
   private static int flag = 1;
   
   public void paintComponent(Graphics g){
      super.paintComponent(g);
      this.setBackground(Color.WHITE);
      
      //creating the random and g2D objects
      Random rand = new Random();
      Graphics2D g2D = (Graphics2D) g;
            
      //declaring the variables      
      int x1 = 0;
      int y1 = 0;
     
      int thickness;
      
      if (flag == 1){
         for (int i = 0; i < 20; i++){
            x1 = rand.nextInt(getWidth());
            y1 = rand.nextInt(getHeight());
            
            //randomize how thick the rectangle is
            thickness = rand.nextInt(15) + 1;
            g2D.setStroke(new BasicStroke(thickness));
   
            //randomize the color of the rectangle
            g2D.setPaint(new Color(rand.nextInt(256), 
                           rand.nextInt(256), 
                           rand.nextInt(256)));
            
            //draws the rectangle
            g2D.drawRect(x1, y1, 100, 100);  
         }
      }
      else if (flag == 2){
         for (int i = 0; i < 40; i++){
            x1 = rand.nextInt(getWidth());
            y1 = rand.nextInt(getHeight());
            
            //randomize how thick the rectangle is
            thickness = rand.nextInt(15) + 1;
            g2D.setStroke(new BasicStroke(thickness));
   
            //randomize the color of the rectangle
            g2D.setPaint(new Color(rand.nextInt(256), 
                           rand.nextInt(256), 
                           rand.nextInt(256)));
            
            //draws the rectangle
            g2D.drawRect(x1, y1, 100, 100);  
         }
      }
      else if (flag == 3){
         for (int i = 0; i < 80; i++){
            x1 = rand.nextInt(getWidth());
            y1 = rand.nextInt(getHeight());
            
            //randomize how thick the rectangle is
            thickness = rand.nextInt(15) + 1;
            g2D.setStroke(new BasicStroke(thickness));
   
            //randomize the color of the rectangle
            g2D.setPaint(new Color(rand.nextInt(256), 
                           rand.nextInt(256), 
                           rand.nextInt(256)));
            
            //draws the rectangle
            g2D.drawRect(x1, y1, 100, 100);  
         }
      }
      else if (flag == 4){
         for (int i = 0; i < 120; i++){
            x1 = rand.nextInt(getWidth());
            y1 = rand.nextInt(getHeight());
            
            //randomize how thick the rectangle is
            thickness = rand.nextInt(15) + 1;
            g2D.setStroke(new BasicStroke(thickness));
   
            //randomize the color of the rectangle
            g2D.setPaint(new Color(rand.nextInt(256), 
                           rand.nextInt(256), 
                           rand.nextInt(256)));
            
            //draws the rectangle
            g2D.drawRect(x1, y1, 100, 100);  
         }
      }
      else if (flag == 5){
         for (int i = 0; i < 150; i++){
            x1 = rand.nextInt(getWidth());
            y1 = rand.nextInt(getHeight());
            
            //randomize how thick the rectangle is
            thickness = rand.nextInt(15) + 1;
            g2D.setStroke(new BasicStroke(thickness));
   
            //randomize the color of the rectangle
            g2D.setPaint(new Color(rand.nextInt(256), 
                           rand.nextInt(256), 
                           rand.nextInt(256)));
            
            //draws the rectangle
            g2D.drawRect(x1, y1, 100, 100);  
         }
      }
      else if (flag == 6){
         for (int i = 0; i < 200; i++){
            x1 = rand.nextInt(getWidth());
            y1 = rand.nextInt(getHeight());
            
            //randomize how thick the rectangle is
            thickness = rand.nextInt(15) + 1;
            g2D.setStroke(new BasicStroke(thickness));
   
            //randomize the color of the rectangle
            g2D.setPaint(new Color(rand.nextInt(256), 
                           rand.nextInt(256), 
                           rand.nextInt(256)));
            
            //draws the rectangle
            g2D.drawRect(x1, y1, 100, 100);  
         }
      }
      else if (flag == 7){
         for (int i = 0; i < 250; i++){
            x1 = rand.nextInt(getWidth());
            y1 = rand.nextInt(getHeight());
            
            //randomize how thick the rectangle is
            thickness = rand.nextInt(15) + 1;
            g2D.setStroke(new BasicStroke(thickness));
   
            //randomize the color of the rectangle
            g2D.setPaint(new Color(rand.nextInt(256), 
                           rand.nextInt(256), 
                           rand.nextInt(256)));
            
            //draws the rectangle
            g2D.drawRect(x1, y1, 100, 100);  
         }
      }
      else if (flag == 8){
         for (int i = 0; i < 300; i++){
            x1 = rand.nextInt(getWidth());
            y1 = rand.nextInt(getHeight());
            
            //randomize how thick the rectangle is
            thickness = rand.nextInt(15) + 1;
            g2D.setStroke(new BasicStroke(thickness));
   
            //randomize the color of the rectangle
            g2D.setPaint(new Color(rand.nextInt(256), 
                           rand.nextInt(256), 
                           rand.nextInt(256)));
            
            //draws the rectangle
            g2D.drawRect(x1, y1, 100, 100);  
         }
      }
    
   } //end of paintComponent method
   
   public static void main(String[] args){
      //create and set the defaults for the JFrame
      frame = new JFrame("Rectangle Takeover");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(1000,800);
      frame.setLocationRelativeTo(null);
      
      Visual v = new Visual();
      
      JPanel panel = new JPanel();
      frame.add(panel);
      frame.add(v);
      
      //timer set to delay of 1500, or 1.5 seconds
      int delay = 1500;
      Timer time = new Timer(delay, v);
      time.start();
   
      frame.setVisible(true);
   } //end of main
   
   public void actionPerformed(ActionEvent e){
      repaint();
            
      if (flag == 1){
         flag = 2;
      }
      else if (flag == 2){
         flag = 3;
      }
      else if (flag == 3){
         flag = 4;
      } 
      else if (flag == 4){
         flag = 5;
      }
      else if (flag == 5){
         flag = 6;
      }
      else if (flag == 6){
         flag = 7;
      }
      else if (flag == 7){
         flag = 8;
      }
      else {
         flag = 1;
      }
      
   }
   
}
