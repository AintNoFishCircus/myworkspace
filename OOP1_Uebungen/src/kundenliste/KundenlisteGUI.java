package kundenliste;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import java.awt.Window.Type;
import java.awt.Toolkit;

public class KundenlisteGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtVorname;
	private JTextField txtStrasse;
	private JTextField txtOrt;
	private JTextField txtPlz;
	Kundenliste liste = new Kundenliste();
	private JButton btnShow;
	private JButton btnPrevious;
	private JButton btnNext;
	private JTextArea txtrFeld;
	private JLabel lblAnzeige;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KundenlisteGUI frame = new KundenlisteGUI();
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
	public KundenlisteGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Patrick Seidel\\Documents\\Wirtschaftsinformatik\\Hausarbeit\\db.png"));
		setTitle("Kunde erfassen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(21, 25, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblVorname = new JLabel("Vorname");
		lblVorname.setBounds(21, 50, 46, 14);
		contentPane.add(lblVorname);
		
		txtName = new JTextField();
		txtName.setBounds(76, 22, 86, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtVorname = new JTextField();
		txtVorname.setBounds(76, 47, 86, 20);
		contentPane.add(txtVorname);
		txtVorname.setColumns(10);
		
		JLabel lblStrae = new JLabel("Stra\u00DFe");
		lblStrae.setBounds(228, 25, 46, 14);
		contentPane.add(lblStrae);
		
		JLabel lblOrt = new JLabel("Ort");
		lblOrt.setBounds(228, 75, 46, 14);
		contentPane.add(lblOrt);
		
		JLabel lblPlz = new JLabel("PLZ");
		lblPlz.setBounds(228, 50, 46, 14);
		contentPane.add(lblPlz);
		
		txtStrasse = new JTextField();
		txtStrasse.setBounds(266, 22, 86, 20);
		contentPane.add(txtStrasse);
		txtStrasse.setColumns(10);
		
		txtOrt = new JTextField();
		txtOrt.setBounds(266, 72, 86, 20);
		contentPane.add(txtOrt);
		txtOrt.setColumns(10);
		
		txtPlz = new JTextField();
		txtPlz.setBounds(266, 47, 86, 20);
		contentPane.add(txtPlz);
		txtPlz.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String name = txtName.getText();
				String vorname = txtVorname.getText();
				String strasse = txtStrasse.getText();
				String ort = txtOrt.getText();
				String plz = txtPlz.getText();
				
				try{
				
				liste.add(name, vorname, strasse,ort,plz);
				
				
				
				}catch(Exception error){
					
					txtrFeld.append("Kunde nicht erfasst" + error.getMessage());
				}
				
			}
		});
		btnAdd.setBounds(219, 155, 89, 23);
		contentPane.add(btnAdd);
		
		JTextArea txtrFeld = new JTextArea();
		txtrFeld.setFont(new Font("MS PGothic", Font.BOLD, 13));
		txtrFeld.setBackground(Color.LIGHT_GRAY);
		txtrFeld.setEditable(false);
		txtrFeld.setBounds(21, 120, 188, 120);
		contentPane.add(txtrFeld);
		
		btnShow = new JButton("Show");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					txtrFeld.setText("");
					txtrFeld.append(liste.toString());
					
				}catch(Exception error){
					
				}
			}
		});
		btnShow.setBounds(219, 121, 89, 23);
		contentPane.add(btnShow);
		
		btnPrevious = new JButton("<");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					if (liste.getIterator()!= liste.getTail()){
						liste.iterate(-1);
						txtrFeld.setText("");
						txtrFeld.append(liste.toString());
					}
					
				}catch(Exception error){
					txtrFeld.append("End of List");
				}
			}
		});
		btnPrevious.setBounds(219, 227, 46, 23);
		contentPane.add(btnPrevious);
		
		btnNext = new JButton(">");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					if (liste.getIterator() != liste.getHead()){
						liste.iterate(1);
						txtrFeld.setText("");
						txtrFeld.append(liste.toString());
					}
				}catch(Exception error){
					
					txtrFeld.append("End of List");
				}
			}
				
		});
		btnNext.setBounds(263, 227, 45, 23);
		contentPane.add(btnNext);
		
		lblAnzeige = new JLabel("Anzeige");
		lblAnzeige.setFont(new Font("Lucida Console", Font.PLAIN, 11));
		lblAnzeige.setBounds(21, 101, 86, 14);
		contentPane.add(lblAnzeige);
		
		
	}
}
