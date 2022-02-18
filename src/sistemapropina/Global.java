package sistemapropina;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class Global {
    public static void showContent(JPanel panelOrigen, JPanel panelContent) {
        int xDimensions = panelOrigen.getWidth();
        int yDimensions = panelOrigen.getHeight();
        
        panelContent.setSize(xDimensions, yDimensions);
        panelContent.setLocation(0, 0);
        
        panelOrigen.removeAll();
        panelOrigen.add(panelContent, BorderLayout.CENTER);
        panelOrigen.revalidate();
        panelOrigen.repaint();
    }
}
