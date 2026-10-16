/** 
 * A simple graphics program
 */

import java.awt.*;
import javax.swing.*;

public class Shapes extends JPanel {

   private int myWindowWidth = 300;
   private int myWindowHeight = 400;

   public Shapes() {
      JFrame easel = new JFrame();		
      easel.setSize (myWindowWidth, myWindowHeight);
      easel.add (this);
      easel.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      easel.setVisible (true);
   }


   public void paintComponent (Graphics g) {
      //Experiment with new methods here. Don't forget setColor!
      // g.setColor(Color.red);
      // g.fillOval(100, 100, 50, 50);
      // g.setColor(Color.green);
      // g.fillRect(200,200,25,25);
      this.drawBullsEye(g);
      this.olympicRings(g);
      //this.trafficLight(g);
   }

   public void drawBullsEye(Graphics g){
      g.setColor(Color.black);
      g.fillOval(100, 100, 250, 250);
      g.setColor(Color.red);
      g.fillOval(125, 125, 200, 200);
      g.setColor(Color.black);
      g.fillOval(150, 150, 150, 150);
      g.setColor(Color.red);
      g.fillOval(175, 175, 100, 100);
      

   }

   public void olympicRings(Graphics g){
      g.setColor(Color.blue);
      g.drawOval(100, 100, 50, 50);
      g.setColor(Color.yellow);
      g.drawOval(125, 125, 50, 50);
      g.setColor(Color.black);
      g.drawOval(150, 100, 50, 50);
      g.setColor(Color.green);
      g.drawOval(175, 125, 50, 50);
      g.setColor(Color.red);
      g.drawOval(200, 100, 50, 50);
   }
}
