package Othersampleprograms;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WaterMark {
  public static void main(String[] args) throws IOException {
    URL url = new URL("http://www.java2s.com/style/download.png");
    BufferedImage im = ImageIO.read(url);
    URL url2 = new URL("http://w3.ibm.com/newbp/images/profile.jpg");
    BufferedImage im2 = ImageIO.read(url2);
    Graphics2D g = im.createGraphics();
    g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.4f));
    g.drawImage(im2, (im.getWidth() - im2.getWidth()) / 1,
        (im.getHeight() - im2.getHeight()) / 1, null);
    g.dispose();

    display(im);
    ImageIO.write(im, "jpeg", new File("output.jpeg"));
  }

  public static void display(BufferedImage image) {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.getContentPane().add(new JLabel(new ImageIcon(image)));
    f.pack();
    f.setVisible(true);
  }
}