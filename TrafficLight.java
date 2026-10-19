import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
    
   public class TrafficLight extends JPanel implements MouseListener {
	private int xClick = -9999;
	private int yClick = -9999;
    private int light = 0;

    public TrafficLight () {
        JFrame myFrame = new JFrame();      
        myFrame.setSize (400, 1000);
        myFrame.add (this);
        myFrame.setVisible (true);
                
        addMouseListener (this);
    }
    public void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(10.0f));
        //draw three circles well spaced
        g.drawOval(100, 100, 200, 200);
        g.drawOval(100, 350, 200, 200);
        g.drawOval(100, 600, 200, 200);

        //conditionals that determine whether to draw a filloval
        //in a particular color
        

		//g.drawOval(xClick - 50, yClick - 50, 100, 100);

        if(light % 3 == 1){
            g.setColor(Color.green);
            g.fillOval(100, 100, 200, 200);
        }
        else if(light % 3 == 2){
            g.setColor(Color.yellow);
            g.fillOval(100, 350, 200, 200);
        }
        else if(light % 3 == 0){
            g.setColor(Color.red);
            g.fillOval(100, 600, 200, 200);
        }

		}
	
	public void mouseDragged(MouseEvent event){
		this.xClick = event.getX();
		this.yClick = event.getY();
		repaint();
	}

	public void mouseMoved(MouseEvent event){
	
	}
    public void mouseClicked (MouseEvent event) {
        light += 1;
        System.out.println(light);
        repaint();
		//this.xClick = event.getX();
		//this.yClick = event.getY();
		//repaint();
	}
	
	public void mouseReleased (MouseEvent event) {
	}
	
	public void mousePressed (MouseEvent event) {
	}
	
	public void mouseEntered (MouseEvent event) {
	}
	
	public void mouseExited (MouseEvent event) {
	}
}
