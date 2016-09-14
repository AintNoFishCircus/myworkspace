
	import java.awt.Color;
		import javax.swing.JDialog;
		import javax.swing.JPanel;
		import javax.swing.JTabbedPane;
		
public class JTabbedPaneBeispiel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Import-Anweisungen
	
		 
		
		        // Erzeugung eines neuen Dialoges
		        JDialog meinJDialog = new JDialog();
		        meinJDialog.setTitle("JPanel Beispiel");
		        meinJDialog.setSize(450,300);
		 
		        // Hier erzeugen wir unsere JPanels
		        JPanel panelRot = new JPanel();
		        JPanel panelBlue = new JPanel();
		        JPanel panelGreen = new JPanel();
		        JPanel panelYellow = new JPanel();
		        JPanel panelPink = new JPanel();
		        JPanel panelBlack = new JPanel();
		 
		        // Hier setzen wir die Hintergrundfarben für die JPanels
		        panelRot.setBackground(Color.RED);
		        panelBlue.setBackground(Color.BLUE);
		        panelGreen.setBackground(Color.GREEN);
		        panelYellow.setBackground(Color.YELLOW);
		        panelPink.setBackground(Color.PINK);
		        panelBlack.setBackground(Color.BLACK);
		 
		        // Erzeugung eines JTabbedPane-Objektes
		        JTabbedPane tabpane = new JTabbedPane
		            (JTabbedPane.TOP,JTabbedPane.SCROLL_TAB_LAYOUT );
		 
		        // Hier werden die JPanels als Registerkarten hinzugefügt
		        tabpane.addTab("Ich bin rot", panelRot);
		        tabpane.addTab("Ich bin blau", panelBlue);
		        tabpane.addTab("Ich bin grün", panelGreen);
		        tabpane.addTab("Ich bin gelb", panelYellow);
		        tabpane.addTab("Ich bin pink", panelPink);
		        tabpane.addTab("Ich bin schwarz", panelBlack);
		 
		        // JTabbedPane wird unserem Dialog hinzugefügt
		        meinJDialog.add(tabpane);
		        // Wir lassen unseren Dialog anzeigen
		        meinJDialog.setVisible(true);
		    }
		}

	


