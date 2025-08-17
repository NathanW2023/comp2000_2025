import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
      Main window = new Main();
      window.run();
    }

    class Cell{

    }

    class Grid{
      
    }
    class Canvas extends JPanel {
      public Canvas() {
        setPreferredSize(new Dimension(720, 720));
      }

      @Override
      public void paint(Graphics g) {
	g.setColor(java.awt.Color.BLACK);
	g.drawRect(10, 10, 700, 700);
      for (int row = 0; row < 20; row++) {
        for (int col = 0; col < 20; col++) {
          int x = 10 + (col * 35);
          int y = 10 + (row * 35);
          g.drawRect(x, y, 35, 35);
          }
        }
      }
    }


    private Main() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Canvas canvas = new Canvas();
      this.setContentPane(canvas);
      this.pack();
      this.setVisible(true);
    }

    public void run() {
      while(true) {
        repaint();
      }
    }
}
