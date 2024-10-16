
package component.scrollcostume;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

public class ScrollBarCustom extends JScrollBar {
    
    public ScrollBarCustom() {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(10,10));
        setForeground(new Color(94,139,231));
        setUnitIncrement(20);
        setOpaque(false);
    }
    
}
