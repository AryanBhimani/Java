import java.applet.Applet;
import java.awt.Graphics;
import javax.crypto.spec.GCMParameterSpec;
public class p18b extends Applet {
    public void init(){
        super.init();
        setSize(350,350);
    }
    public void paint(Graphics g){
        g.drawOval(50,50,150,150);
        g.drawString("aryan",110,130);
    }
}