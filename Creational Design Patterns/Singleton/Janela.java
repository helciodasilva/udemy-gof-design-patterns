import java.awt.Dimension;

import javax.swing.JFrame;

public class Janela extends JFrame {

  private static Janela j;

  private Janela() {
    setPreferredSize(new Dimension(640, 480));
  }

  public static Janela getInstance() {
    if (j == null) {
      j = new Janela();
    }
    return j;
  }

}