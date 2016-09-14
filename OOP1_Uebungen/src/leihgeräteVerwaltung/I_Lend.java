package leihgeräteVerwaltung;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.Window.Type;
import java.awt.Font;
import java.awt.Toolkit;
public class I_Lend extends JFrame {

	private JPanel contentPane;
	private JTextField txtTxtname;
	private JTextField txtTxtvorname;
	private JTextField txtStrasse;
	private JTextField txtPlz;
	private JTextField txtOrt;
	private JTextField txtKdnr;
	private JTextField txtTel;
	private JTextField txtMobil;
	private JTextField txtMail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					I_Lend frame = new I_Lend();
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public I_Lend() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Patrick Seidel\\Pictures\\iPhone.png"));
		setTitle("iLend");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 650, 500);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JTabbedPane tabpane = new JTabbedPane(); //TabbedPane
		tabpane.setTabPlacement(JTabbedPane.LEFT);
		JPanel panelHome = new JPanel();
		
		JPanel panelAuftrag = new JPanel(); //Beginn Auftrag
		panelAuftrag.setLayout(null);
		
		
		JPanel panelKunde = new JPanel();
		panelKunde.setBorder(new EmptyBorder(0, 0, 0, 0));
		panelKunde.setLayout(null);
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 107, 46, 14);
		panelKunde.add(lblName);
		
		JLabel lblVorname = new JLabel("Vorname:");
		lblVorname.setBounds(10, 143, 74, 14);
		panelKunde.add(lblVorname);
		
		txtTxtname = new JTextField();
		txtTxtname.setBounds(10, 122, 86, 20);
		panelKunde.add(txtTxtname);
		txtTxtname.setColumns(10);
		
		txtTxtvorname = new JTextField();
		txtTxtvorname.setBounds(10, 158, 86, 20);
		panelKunde.add(txtTxtvorname);
		txtTxtvorname.setColumns(10);
		
		
		JLabel lblStrasse = new JLabel("Stra\u00DFe:");
		lblStrasse.setBounds(10, 181, 46, 14);
		panelKunde.add(lblStrasse);
		
		JLabel lblPlz = new JLabel("PLZ:");
		lblPlz.setBounds(10, 220, 46, 14);
		panelKunde.add(lblPlz);
		
		txtStrasse = new JTextField();
		txtStrasse.setBounds(10, 196, 152, 20);
		panelKunde.add(txtStrasse);
		txtStrasse.setColumns(10);
		
		txtPlz = new JTextField();
		txtPlz.setBounds(10, 234, 56, 20);
		panelKunde.add(txtPlz);
		txtPlz.setColumns(10);
		
		JLabel lblOrt = new JLabel("Ort:");
		lblOrt.setBounds(76, 220, 46, 14);
		panelKunde.add(lblOrt);
		
		txtOrt = new JTextField();
		txtOrt.setBounds(76, 234, 86, 20);
		panelKunde.add(txtOrt);
		txtOrt.setColumns(10);
		
		JLabel lblKundennummer = new JLabel("Kundennummer:");
		lblKundennummer.setBounds(10, 68, 112, 14);
		panelKunde.add(lblKundennummer);
		
		txtKdnr = new JTextField();
		txtKdnr.setBounds(10, 83, 86, 20);
		panelKunde.add(txtKdnr);
		txtKdnr.setColumns(10);
		
		JLabel lblPersnlicheDaten = new JLabel("Pers\u00F6nliche Daten");
		lblPersnlicheDaten.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPersnlicheDaten.setBounds(10, 11, 134, 14);
		panelKunde.add(lblPersnlicheDaten);
		
		JLabel lblTelefon = new JLabel("Telefon:");
		lblTelefon.setBounds(194, 143, 46, 14);
		panelKunde.add(lblTelefon);
		
		JLabel lblMobil = new JLabel("Mobil:");
		lblMobil.setBounds(194, 181, 46, 14);
		panelKunde.add(lblMobil);
		
		JLabel lblMail = new JLabel("Mail:");
		lblMail.setBounds(194, 220, 46, 14);
		panelKunde.add(lblMail);
		
		txtTel = new JTextField();
		txtTel.setBounds(194, 158, 152, 20);
		panelKunde.add(txtTel);
		txtTel.setColumns(10);
		
		txtMobil = new JTextField();
		txtMobil.setBounds(194, 196, 152, 20);
		panelKunde.add(txtMobil);
		txtMobil.setColumns(10);
		
		txtMail = new JTextField();
		txtMail.setBounds(194, 234, 152, 20);
		panelKunde.add(txtMail);
		txtMail.setColumns(10);
		
		tabpane.addTab("Home", panelHome);
		tabpane.addTab("Kundenverwaltung", panelKunde);
		
		JButton btnKundenanlegen = new JButton("Kunde anlegen");
		btnKundenanlegen.setBounds(10, 344, 134, 23);
		panelKunde.add(btnKundenanlegen);
		
		JButton btnInitialisieren = new JButton("Initialisieren");
		btnInitialisieren.setBounds(10, 310, 134, 23);
		panelKunde.add(btnInitialisieren);
		tabpane.addTab("Auftragsverwaltung", panelAuftrag);
		
		contentPane.add(tabpane);
	}
}
