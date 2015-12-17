package Proyecto;

/**
 *
 * @author Erick
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;

public class PantallaCargando
  extends JWindow
{
  BorderLayout borderLayout1 = new BorderLayout();
  JLabel imageLabel = new JLabel();
  JPanel southPanel = new JPanel();
  FlowLayout southPanelFlowLayout = new FlowLayout();
  JProgressBar progressBar = new JProgressBar();
  ImageIcon imageIcon;
  
  public PantallaCargando(ImageIcon imageIcon)
  {
    this.imageIcon = imageIcon;
    dibujaVentana();
  }
  
  public void dibujaVentana()
  {
    this.imageLabel.setIcon(this.imageIcon);
    getContentPane().setLayout(this.borderLayout1);
    this.southPanel.setLayout(this.southPanelFlowLayout);
    this.southPanel.setBackground(Color.black);
    getContentPane().add(this.imageLabel, "Center");
    getContentPane().add(this.southPanel, "South");
    this.southPanel.add(this.progressBar, null);
    pack();
  }
  
  public void setProgresoMax(int maxProgress)
  {
    this.progressBar.setMaximum(maxProgress);
  }
  
  public void setProgreso(int progress)
  {
    int progreso = progress;
    this.progressBar.setValue(progreso);
  }
  
  public void setProgreso(String message, int progress)
  {
    int progreso = progress;
    String theMessage = message;
    setProgreso(progress);
    this.progressBar.setValue(progreso);
    setMessage(theMessage);
  }
  
  private void setMessage(String message)
  {
    if (message == null)
    {
      message = "";
      this.progressBar.setStringPainted(false);
    }
    else
    {
      this.progressBar.setStringPainted(true);
    }
    this.progressBar.setString(message);
  }
  
  public void velocidadDeCarga()
  {
    for (int i = 0; i <= 100; i++)
    {
      String poop;
      for (long j = 0L; j < 2250000L; j += 1L) {
        poop = "" + (j + i);
      }
      setProgreso("Cargando: " + i + "%", i);
    }
    dispose();
  }
}
