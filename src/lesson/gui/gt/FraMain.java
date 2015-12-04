package lesson.gui.gt;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class FraMain extends JFrame {
    PanMain panMain;
    PanRed panRed;
    
    public FraMain() {
        panMain = new PanMain();
        panRed = new PanRed();
        setVisible(true);
        setTitle("JUDDY @ GUI");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(panMain, BorderLayout.CENTER);
        add(panRed, BorderLayout.NORTH);
    }
}
