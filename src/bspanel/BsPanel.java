/*
 * Panel(menu) za izbor modula aplikacije(grupe TheBookStore)
 * Morar<exdatis@gmail.com> 2016-02-15
 * Revizija:
 */
package bspanel;

import javax.swing.UIManager;

/**
 *
 * @author morar
 */
public class BsPanel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* set theme */
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
        } catch (Exception e) {
            System.out.println("Greska u inicijalizovanju teme...");
            System.out.println("Error: " + e.getMessage());
        }
        /* start panel */
        JDashboard mainPanel = new JDashboard();
        mainPanel.setVisible(true);
    }
    
}
