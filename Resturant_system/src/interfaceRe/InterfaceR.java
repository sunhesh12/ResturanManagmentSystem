package interfaceRe;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
//import java.awt.Label;
//import javax.swing.JRadioButton;
//import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;





public class InterfaceR {
		
	protected static final JComponent JdrinkCombobox = null;
	double first;
	double second;
	double result;
	String operation;
	String answer;

	private JFrame frmResturantManagementSystem;
	//private final ButtonGroup buttonGroup = new ButtonGroup();  //for future updates
	private JTextField JChickenBurgerT;
	private JTextField JChickenBurgerMT;
	private JTextField JCheeseBurgerT;
	private JTextField JQTYT;
	private JTextField JCurrencyPT;
	private JTextField JCurrencyT;
	private JTextField JCostOfDrinksT;
	private JTextField JCostOfMealT;
	private JTextField JCostOfDeliveryT;
	private JTextField JTotalT;
	private JTextField JSubTotalT;
	private JTextField JtaxT;
	private JTextField textField_12;
	protected JComboBox<Object> JCurrencyComboBox;
	
	
	
	

	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceR window = new InterfaceR();
					window.frmResturantManagementSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfaceR() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmResturantManagementSystem = new JFrame();
		frmResturantManagementSystem.setResizable(false);
		frmResturantManagementSystem.setIconImage(Toolkit.getDefaultToolkit().getImage(InterfaceR.class.getResource("/img/5027823_calculator_coin_dollar_money_icon (1).png")));
		frmResturantManagementSystem.setTitle("Resturant Management System");
		frmResturantManagementSystem.getContentPane().setBackground(SystemColor.activeCaptionText);
		frmResturantManagementSystem.setBounds(0, 0, 1364, 728);
		frmResturantManagementSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmResturantManagementSystem.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		//panel.setBackground(SystemColor.inactiveCaptionText);
		panel.setBackground(new Color(0,0,0,180));
		panel.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 153), 4, true), new LineBorder(new Color(153, 0, 0), 4)));
		panel.setBounds(113, 83, 424, 353);
		frmResturantManagementSystem.getContentPane().add(panel);
		panel.setLayout(null);
		
	
		
		
		JLabel lblNewLabel_1 = new JLabel("Chicken Burger");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1.setBounds(23, 36, 131, 27);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Chicken Burger Meal");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(23, 84, 168, 27);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Cheese Burger");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(23, 127, 131, 27);
		panel.add(lblNewLabel_1_2);
		
		JChickenBurgerT = new JTextField();
		JChickenBurgerT.setForeground(Color.WHITE);
		JChickenBurgerT.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		JChickenBurgerT.setToolTipText("Type Chiken Burger Quantity");
		JChickenBurgerT.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				if(JChickenBurgerT.getText().length()>0) {
					return;
				}else {
					JChickenBurgerT.setText("0");
				}
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JChickenBurgerT.getText().length()>1) {
					return;
				}else {
					JChickenBurgerT.setText(null);
				}
			}
		});
		JChickenBurgerT.setHorizontalAlignment(SwingConstants.RIGHT);
		JChickenBurgerT.setText("0");
		JChickenBurgerT.setFont(new Font("Arial", Font.PLAIN, 16));
		JChickenBurgerT.setBounds(212, 36, 195, 27);
		panel.add(JChickenBurgerT);
		JChickenBurgerT.setColumns(10);
		JChickenBurgerT.setBackground(Color.BLACK);
		
		JChickenBurgerMT = new JTextField();
		JChickenBurgerMT.setBackground(Color.BLACK);
		JChickenBurgerMT.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		JChickenBurgerMT.setForeground(Color.WHITE);
		JChickenBurgerMT.setToolTipText("Type Chiken Burger Meal Quantity");
		JChickenBurgerMT.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				if(JChickenBurgerMT.getText().length()>0) {
					return;
				}else {
					JChickenBurgerMT.setText("0");
				}
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JChickenBurgerMT.getText().length()>1) {
					return;
				}else {
					JChickenBurgerMT.setText(null);
				}
			}
		});
		JChickenBurgerMT.setHorizontalAlignment(SwingConstants.RIGHT);
		JChickenBurgerMT.setText("0");
		JChickenBurgerMT.setFont(new Font("Arial", Font.PLAIN, 16));
		JChickenBurgerMT.setColumns(10);
		JChickenBurgerMT.setBounds(212, 84, 195, 27);
		panel.add(JChickenBurgerMT);
		
		JCheeseBurgerT = new JTextField();
		JCheeseBurgerT.setForeground(Color.WHITE);
		JCheeseBurgerT.setBackground(Color.BLACK);
		JCheeseBurgerT.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
		JCheeseBurgerT.setToolTipText("Type Cheese Burger Quantity");
		JCheeseBurgerT.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				if(JCheeseBurgerT.getText().length()>0) {
					return;
				}else {
					JCheeseBurgerT.setText("0");
				}
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JCheeseBurgerT.getText().length()>1) {
					return;
				}else {
					JCheeseBurgerT.setText(null);
				}
			}
		});
		JCheeseBurgerT.setHorizontalAlignment(SwingConstants.RIGHT);
		JCheeseBurgerT.setText("0");
		JCheeseBurgerT.setFont(new Font("Arial", Font.PLAIN, 16));
		JCheeseBurgerT.setColumns(10);
		JCheeseBurgerT.setBounds(212, 127, 195, 27);
		panel.add(JCheeseBurgerT);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(23, 175, 384, 3);
		panel.add(panel_6);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Drink");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1_2_1.setBounds(23, 189, 131, 27);
		panel.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Qty");
		lblNewLabel_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1_2_1_1.setBounds(212, 189, 131, 27);
		panel.add(lblNewLabel_1_2_1_1);
		
		JQTYT = new JTextField();
		JQTYT.setForeground(Color.WHITE);
		JQTYT.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
		JQTYT.setBackground(Color.BLACK);
		JQTYT.setToolTipText("Quantity of drinks");
		JQTYT.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				if(JQTYT.getText().length()>0) {
					return;
				}else {
					JQTYT.setText("0");
				}
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JQTYT.getText().length()>1) {
					return;
					
				}else {
					JQTYT.setText(null);					
					JQTYT.setBackground(Color.BLACK);
				}
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				JQTYT.setBackground(Color.BLACK);
				//JdrinkCombobox.setBackground(Color.black);
			}
		});
		JQTYT.setText("0");
		JQTYT.setHorizontalAlignment(SwingConstants.RIGHT);
		JQTYT.setFont(new Font("Arial", Font.PLAIN, 16));
		JQTYT.setColumns(10);
		JQTYT.setBounds(212, 227, 195, 27);
		panel.add(JQTYT);
		
		final JCheckBox JHomeDeliveryCB = new JCheckBox("Home Delivery");
		JHomeDeliveryCB.setToolTipText("tik to add delivery chage");
		JHomeDeliveryCB.setFont(new Font("Arial", Font.BOLD, 14));
		JHomeDeliveryCB.setForeground(SystemColor.text);
		JHomeDeliveryCB.setBackground(SystemColor.inactiveCaptionText);
		JHomeDeliveryCB.setBounds(23, 273, 131, 23);
		panel.add(JHomeDeliveryCB);
		
		final JCheckBox JTaxCB = new JCheckBox("TAX");
		JTaxCB.setToolTipText("tik to add TAX");
		JTaxCB.setForeground(Color.WHITE);
		JTaxCB.setFont(new Font("Arial", Font.BOLD, 14));
		JTaxCB.setBackground(Color.BLACK);
		JTaxCB.setBounds(23, 299, 131, 23);
		panel.add(JTaxCB);
		
		final JComboBox<Object> JdrinkCombobox = new JComboBox<Object>();
		JdrinkCombobox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JdrinkCombobox.setBackground(SystemColor.inactiveCaptionText);
				JQTYT.setBackground(Color.BLACK);
			}
		});
		JdrinkCombobox.setToolTipText("Choose Drink");
		
		JdrinkCombobox.setModel(new DefaultComboBoxModel<Object>(new String[] {
				"Select a drink", 
				"Milkshakes", 
				"strawberry milkshake", 
				"chocolate milkshake", 
				"coca cola", 
				"pepsi ", 
				"sprite"
				}));
		JdrinkCombobox.setBounds(23, 227, 152, 27);
		JdrinkCombobox.setBackground(SystemColor.inactiveCaptionText);
		JdrinkCombobox.setForeground(SystemColor.text);
		JdrinkCombobox.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(JdrinkCombobox);
		
//		<============================future updates area start==================================>
//		
//		JButton btnNewButton_1 = new JButton("ADD Drinks to databass");
//		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 15));
//		btnNewButton_1.setBounds(212, 274, 195, 35);
//		panel.add(btnNewButton_1);
//	<===================================future update area close===============================>
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0,0,0,180));
		panel_1.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 153), 4, true), new LineBorder(new Color(153, 0, 0), 4)));
		panel_1.setBounds(545, 83, 313, 353);
		frmResturantManagementSystem.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Currency Converter");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_2.setForeground(new Color(255, 255, 0));
		lblNewLabel_2.setBounds(37, 11, 243, 47);
		panel_1.add(lblNewLabel_2);
		

		
		JCurrencyPT = new JTextField();
		JCurrencyPT.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
		JCurrencyPT.setBackground(Color.BLACK);
		JCurrencyPT.setForeground(Color.WHITE);
		JCurrencyPT.setText("0");
		JCurrencyPT.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				JCurrencyPT.setBackground(Color.BLACK);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JCurrencyPT.getText().length()>4) {
					return;
				}else {
					JCurrencyPT.setText(null);
				}
			}
		});
		JCurrencyPT.setToolTipText("Ttype currency value here");
		JCurrencyPT.setHorizontalAlignment(SwingConstants.RIGHT);
		JCurrencyPT.setFont(new Font("Arial", Font.PLAIN, 20));
		JCurrencyPT.setColumns(10);
		JCurrencyPT.setBounds(37, 127, 243, 35);
		panel_1.add(JCurrencyPT);
		
		JCurrencyT = new JTextField();
		JCurrencyT.setEditable(false);
		JCurrencyT.setHorizontalAlignment(SwingConstants.RIGHT);
		JCurrencyT.setForeground(SystemColor.text);
		JCurrencyT.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
		JCurrencyT.setBackground(SystemColor.inactiveCaptionText);
		JCurrencyT.setFont(new Font("Arial", Font.PLAIN, 20));
		JCurrencyT.setColumns(10);
		JCurrencyT.setBounds(37, 180, 243, 35);
		panel_1.add(JCurrencyT);
		
		
		
		final JComboBox<Object> JCurrencyComboBox = new JComboBox<Object>();
		JCurrencyComboBox.setToolTipText("Select Currency");
		JCurrencyComboBox.setModel(new DefaultComboBoxModel<Object>(new String[] {
				"Select Currency", 
				"AUS Dollar",
				"Brazilian Real", 
				"Canadian Dollar",  
				"Chinese Yuan Renminbi", 
				"Colombian Peso", 
				"Euro", 
				"Hong Kong Dollar", 
				"Indian Rupee", 
				"Japanese Yen", 
				"Russian Ruble",
				"Sri Lankan Rupees", 
				"Swiss Franc"
				}));
		
		JCurrencyComboBox.setBounds(37, 74, 243, 31);
		JCurrencyComboBox.setBackground(Color.BLACK);
		JCurrencyComboBox.setForeground(Color.WHITE);
		JCurrencyComboBox.setFont(new Font("Arial", Font.BOLD, 20));
		panel_1.add(JCurrencyComboBox);
		
		//----------------------------------------show price in text box------------------------------------------
		
		final JButton btnConvert = new JButton("Convert");
		btnConvert.setFocusPainted(false);
		btnConvert.setToolTipText("Convert Button");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double USD = Double.parseDouble(JCurrencyPT.getText());
				Double SC =0*USD;
				double SL =365.14*USD;				
				double AUSD =1.46*USD;
				double BR =0.01*USD;
				double CD =0.003*USD;
				double CYR=52.10*USD;
				double CP=2.45*USD;
				double EU=0.002*USD;
				double HKD =0.02*USD;
				double  IR =0.22*USD;
				double JY =0.38*USD;
				double RR =0.17*USD;
				double SF=0.002*USD;
				
							
				
				if(JCurrencyComboBox.getSelectedItem().equals("Select Currency")) {
					String Sc =String.format("%.2f", SC);
					JCurrencyT.setText(Sc);
					JCurrencyPT.setBackground(Color.lightGray);
					JOptionPane.showMessageDialog(null, "Select the currency what you need to convert");
					JCurrencyPT.setBackground(Color.lightGray);
					
					
				}
				if(JCurrencyComboBox.getSelectedItem().equals("Sri Lankan Rupees")) {
					String SlR =String.format("%.2f", SL);
					JCurrencyT.setText(SlR);
					
					
				}
				if(JCurrencyComboBox.getSelectedItem().equals("AUS Dollar")) {
					String AUSd =String.format("%.2f", AUSD);
					JCurrencyT.setText(AUSd);
					
     			}
				if(JCurrencyComboBox.getSelectedItem().equals("Brazilian Real")) {
					String AUSd =String.format("%.2f", BR);
					JCurrencyT.setText(AUSd);
					
     			}
				if(JCurrencyComboBox.getSelectedItem().equals("Canadian Dollar")) {
					String AUSd =String.format("%.2f", CD);
					JCurrencyT.setText(AUSd);
					
     			}
				if(JCurrencyComboBox.getSelectedItem().equals("Chinese Yuan Renminbi")) {
					String AUSd =String.format("%.2f", CYR);
					JCurrencyT.setText(AUSd);
					
     			}
				if(JCurrencyComboBox.getSelectedItem().equals("Colombian Peso")) {
					String AUSd =String.format("%.2f", CP);
					JCurrencyT.setText(AUSd);
					
     			}
				if(JCurrencyComboBox.getSelectedItem().equals("Euro")) {
					String AUSd =String.format("%.2f", EU);
					JCurrencyT.setText(AUSd);
					
     			}
				if(JCurrencyComboBox.getSelectedItem().equals("Hong Kong Dollar")) {
					String AUSd =String.format("%.2f", HKD);
					JCurrencyT.setText(AUSd);
					
     			}
				if(JCurrencyComboBox.getSelectedItem().equals("Indian Rupee")) {
					String AUSd =String.format("%.2f", IR);
					JCurrencyT.setText(AUSd);
					
     			}
				
				if(JCurrencyComboBox.getSelectedItem().equals("Japanese Yen")) {
					String AUSd =String.format("%.2f", JY);
					JCurrencyT.setText(AUSd);
					
     			}
				if(JCurrencyComboBox.getSelectedItem().equals("Russian Ruble")) {
					String AUSd =String.format("%.2f", RR);
					JCurrencyT.setText(AUSd);
					
     			}
				if(JCurrencyComboBox.getSelectedItem().equals("Swiss Franc")) {
					String AUSd =String.format("%.2f", SF);
					JCurrencyT.setText(AUSd);
					
     			}
				
				

     		}
					
		});
		btnConvert.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnConvert.setBorder(new LineBorder(new Color(0, 128, 0), 4, true));
				btnConvert.setBackground(new Color(0, 128, 0));
				btnConvert.setForeground(Color.black);
				btnConvert.setFont(new Font("Arial", Font.BOLD, 18));
				btnConvert.setBounds(39, 282, 119, 42);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnConvert.setBorder(new LineBorder(new Color(0, 128, 0), 4, true));
				btnConvert.setBackground(SystemColor.inactiveCaptionText);
				btnConvert.setForeground(SystemColor.text);
				btnConvert.setFont(new Font("Arial", Font.BOLD, 18));
				btnConvert.setBounds(37, 280, 119, 42);
			}
		});

		btnConvert.setBorder(new LineBorder(new Color(0, 128, 0), 4, true));
		btnConvert.setBackground(SystemColor.inactiveCaptionText);
		btnConvert.setForeground(SystemColor.text);
		btnConvert.setFont(new Font("Arial", Font.BOLD, 18));
		btnConvert.setBounds(37, 280, 119, 42);
		panel_1.add(btnConvert);
		
		final JButton btnClose = new JButton("Clear");
		btnClose.setFocusPainted(false);
		btnClose.setToolTipText("Clear Button");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCurrencyT.setText(null);
				JCurrencyPT.setText("0");
			}
		});
		btnClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnClose.setForeground(Color.black);
				btnClose.setFont(new Font("Arial", Font.BOLD, 18));
				btnClose.setBorder(new LineBorder(new Color(204, 0, 0), 4, true));
				btnClose.setBackground(new Color(204, 0, 0));
				btnClose.setBounds(182, 282, 99, 42);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnClose.setForeground(Color.WHITE);
				btnClose.setFont(new Font("Arial", Font.BOLD, 18));
				btnClose.setBorder(new LineBorder(new Color(204, 0, 0), 4, true));
				btnClose.setBackground(Color.BLACK);
				btnClose.setBounds(180, 280, 99, 42);
			}
		});
		btnClose.setForeground(Color.WHITE);
		btnClose.setFont(new Font("Arial", Font.BOLD, 18));
		btnClose.setBorder(new LineBorder(new Color(204, 0, 0), 4, true));
		btnClose.setBackground(Color.BLACK);
		btnClose.setBounds(180, 280, 99, 42);
		panel_1.add(btnClose);
		
		final JButton btnAddTotalTo = new JButton("ADD TOTAL TO CONVERT");      //currency converter total add button
		btnAddTotalTo.setFocusPainted(false);
		btnAddTotalTo.setToolTipText("Click to Total Add and convert ");
		btnAddTotalTo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAddTotalTo.setOpaque(true);
				btnAddTotalTo.setBorder(new LineBorder(Color.ORANGE, 4, true));
				btnAddTotalTo.setForeground(Color.BLACK);
				btnAddTotalTo.setBackground(Color.ORANGE);
				btnAddTotalTo.setBounds(40, 229, 243, 42);
				
				
			}
			@Override
			public void mouseExited(MouseEvent e) {	
				btnAddTotalTo.setForeground(Color.WHITE);		
				btnAddTotalTo.setBackground(Color.BLACK);
				btnAddTotalTo.setBounds(37, 226, 243, 42);
				btnAddTotalTo.setBorder(new LineBorder(Color.ORANGE, 4, true));
		
			}
		});
		
		
		btnAddTotalTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ADTCU = Double.parseDouble(JTotalT.getText());
				String AD = String.format("%.2f", ADTCU);
				JCurrencyPT.setText(AD);
				
				double USD = Double.parseDouble(JCurrencyPT.getText()); 
				Double SC =0*USD;
				double SL =365.14*USD;				
				double AUSD =1.46*USD;
				double BR =0.01*USD;
				double CD =0.003*USD;
				double CYR=52.10*USD;
				double CP=2.45*USD;
				double EU=0.002*USD;
				double HKD =0.02*USD;
				double  IR =0.22*USD;
				double JY =0.38*USD;
				double RR =0.17*USD;
				double SF=0.002*USD;
				
				
				
				if(JCurrencyComboBox.getSelectedItem().equals("Select Currency")) {
					
					String Sc =String.format("%.2f", SC);
					JCurrencyT.setText(Sc);
					JCurrencyPT.setBackground(Color.lightGray);
					JOptionPane.showMessageDialog(null, "Select the currency what you need to convert and Re-Try to convert");
					
				}
				if(JCurrencyComboBox.getSelectedItem().equals("Sri Lankan Rupees")) {
					String SlR =String.format("%.2f", SL);
					JCurrencyT.setText(SlR);
					
					
				}
				if(JCurrencyComboBox.getSelectedItem().equals("AUS Dollar")) {
					String AUSd =String.format("%.2f", AUSD);
					JCurrencyT.setText(AUSd);
					
     			}
				if(JCurrencyComboBox.getSelectedItem().equals("AUS Dollar")) {
					String AUSd =String.format("%.2f", AUSD);
					JCurrencyT.setText(AUSd);
					
     			}
				if(JCurrencyComboBox.getSelectedItem().equals("Brazilian Real")) {
					String AUSd =String.format("%.2f", BR);
					JCurrencyT.setText(AUSd);
					
     			}
				if(JCurrencyComboBox.getSelectedItem().equals("Canadian Dollar")) {
					String AUSd =String.format("%.2f", CD);
					JCurrencyT.setText(AUSd);
					
     			}
				if(JCurrencyComboBox.getSelectedItem().equals("Chinese Yuan Renminbi")) {
					String AUSd =String.format("%.2f", CYR);
					JCurrencyT.setText(AUSd);
					
     			}
				if(JCurrencyComboBox.getSelectedItem().equals("Colombian Peso")) {
					String AUSd =String.format("%.2f", CP);
					JCurrencyT.setText(AUSd);
					
     			}
				if(JCurrencyComboBox.getSelectedItem().equals("Euro")) {
					String AUSd =String.format("%.2f", EU);
					JCurrencyT.setText(AUSd);
					
     			}
				if(JCurrencyComboBox.getSelectedItem().equals("Hong Kong Dollar")) {
					String AUSd =String.format("%.2f", HKD);
					JCurrencyT.setText(AUSd);
					
     			}
				if(JCurrencyComboBox.getSelectedItem().equals("Indian Rupee")) {
					String AUSd =String.format("%.2f", IR);
					JCurrencyT.setText(AUSd);
					
     			}
				
				if(JCurrencyComboBox.getSelectedItem().equals("Japanese Yen")) {
					String AUSd =String.format("%.2f", JY);
					JCurrencyT.setText(AUSd);
					
     			}
				if(JCurrencyComboBox.getSelectedItem().equals("Russian Ruble")) {
					String AUSd =String.format("%.2f", RR);
					JCurrencyT.setText(AUSd);
					
     			}
				if(JCurrencyComboBox.getSelectedItem().equals("Swiss Franc")) {
					String AUSd =String.format("%.2f", SF);
					JCurrencyT.setText(AUSd);
					
     			}
				
			}
		});
		btnAddTotalTo.setOpaque(false);
		btnAddTotalTo.setForeground(Color.WHITE);
		btnAddTotalTo.setFont(new Font("Arial", Font.BOLD, 18));
		btnAddTotalTo.setBorder(new LineBorder(Color.ORANGE, 4, true));
		btnAddTotalTo.setBackground(Color.BLACK);
		btnAddTotalTo.setBounds(37, 226, 243, 42);
		panel_1.add(btnAddTotalTo);


		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0,0,0,180));
		panel_2.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 153), 4, true), new LineBorder(new Color(153, 0, 0), 4)));
		panel_2.setBounds(864, 83, 351, 508);
		frmResturantManagementSystem.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setName("");
		tabbedPane.setBounds(41, 21, 273, 428);
		panel_2.add(tabbedPane);
		
		final JPanel panel_5 = new JPanel();
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		panel_5.setToolTipText("If you want to select please click");
		panel_5.setBackground(SystemColor.textInactiveText);
		tabbedPane.addTab("Receipt", null, panel_5, null);
		tabbedPane.setBackgroundAt(0, SystemColor.windowBorder);
		panel_5.setLayout(null);
		
		final JTextArea textArea = new JTextArea();
		textArea.setForeground(Color.WHITE);
		textArea.setBackground(Color.BLACK);
		textArea.setFont(new Font("Arial", Font.BOLD, 14));
		textArea.setEditable(false);
		textArea.setBounds(8, 7, 252, 386);
		panel_5.add(textArea);
		
		JPanel panel_4 = new JPanel();
		panel_4.setToolTipText("If you want to select please click");
		panel_4.setBackground(Color.DARK_GRAY);
		tabbedPane.addTab("Calculator", null, panel_4, null);
		panel_4.setLayout(null);
		
		//=========================================================================================================
		//================================================calculator start=========================================
		//========================================================================================================
		
		//--------------------------------------display of calculator---------------------------------------------
		
		textField_12 = new JTextField();
		textField_12.setBackground(new Color(30, 30, 30));
		textField_12.setForeground(Color.WHITE);
		textField_12.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_12.setEditable(false);
		textField_12.setBounds(18, 11, 234, 93);
		panel_4.add(textField_12);
		textField_12.setColumns(10);
		
		//======================================================number area start================================================
		
		//-----------------------------------------------button 0------------------------------------------------
		
		final JButton btn0 = new JButton("0");
		btn0.setFocusPainted(false);
		btn0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {  //button 0 mouse enter
				btn0.setBackground(Color.GRAY);
				btn0.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {  //button 0 mouse exit
				btn0.setForeground(SystemColor.menu);
				btn0.setBackground(Color.BLACK);
			}
		});
		btn0.addActionListener(new ActionListener() {  //button 0 action listener
			public void actionPerformed(ActionEvent e) {
				String number = textField_12.getText() + btn0.getText();
				textField_12.setText(number);
			}
		});
		btn0.setForeground(SystemColor.menu);
		btn0.setFont(new Font("Candara", Font.BOLD, 25));
		btn0.setBackground(Color.BLACK);
		btn0.setBounds(18, 279, 51, 41);
		panel_4.add(btn0);
		
		//------------------------------------------button 1----------------------------------------------------
		
				final JButton btn1 = new JButton("1");
				btn1.setFocusPainted(false);
				btn1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {  //button 1 mouse enter
						btn1.setBackground(Color.GRAY);
						btn1.setForeground(Color.black);
					}
					@Override
					public void mouseExited(MouseEvent e) {  //button 1 mouse exit
						btn1.setForeground(SystemColor.menu);
						btn1.setBackground(Color.BLACK);
					}
				});
				btn1.addActionListener(new ActionListener() {  //button 1 action listener
					public void actionPerformed(ActionEvent e) {
						String number = textField_12.getText() + btn1.getText();
						textField_12.setText(number);
					}
				});
				btn1.setForeground(SystemColor.menu);
				btn1.setFont(new Font("Candara", Font.BOLD, 25));
				btn1.setBackground(Color.BLACK);
				btn1.setBounds(18, 227, 51, 41);
				panel_4.add(btn1);
				
				//----------------------------------button 2----------------------------------------------------
				
				final JButton btn2 = new JButton("2");
				btn2.setFocusPainted(false);
				btn2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {  //button 2 mouse enter
						btn2.setBackground(Color.GRAY);
						btn2.setForeground(Color.black);
					}
					@Override
					public void mouseExited(MouseEvent e) {  //button 2 mouse exit
						btn2.setForeground(SystemColor.menu);
						btn2.setBackground(Color.BLACK);
					}
				});
				btn2.addActionListener(new ActionListener() {  //button 2 action listener
					public void actionPerformed(ActionEvent e) {
						String number = textField_12.getText() + btn2.getText();
						textField_12.setText(number);
					}
				});
				btn2.setForeground(SystemColor.menu);
				btn2.setFont(new Font("Candara", Font.BOLD, 25));
				btn2.setBackground(Color.BLACK);
				btn2.setBounds(79, 227, 51, 41);
				panel_4.add(btn2);
				
				//-------------------------------------button 3-----------------------------------------
				
				final JButton btn3 = new JButton("3");
				btn3.setFocusPainted(false);
				btn3.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {  //button 3 mouse enter
						btn3.setBackground(Color.GRAY);
						btn3.setForeground(Color.black);
					}
					@Override
					public void mouseExited(MouseEvent e) {  //button 3 mouse exit
						btn3.setForeground(SystemColor.menu);
						btn3.setBackground(Color.BLACK);
					}
				});
				btn3.addActionListener(new ActionListener() {  //button 3 action listener
					public void actionPerformed(ActionEvent e) {
						String number = textField_12.getText() + btn3.getText();
						textField_12.setText(number);
					}
				});
				btn3.setForeground(SystemColor.menu);
				btn3.setFont(new Font("Candara", Font.BOLD, 25));
				btn3.setBackground(Color.BLACK);
				btn3.setBounds(140, 227, 51, 41);
				panel_4.add(btn3);
				
				
		
		//----------------------------------------------button4--------------------------------------------
		
				final JButton btn4 = new JButton("4");
				btn4.setFocusPainted(false);
				btn4.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {  //button 4 mouse enter
						btn4.setBackground(Color.GRAY);
						btn4.setForeground(Color.black);
					}
					@Override
					public void mouseExited(MouseEvent e) {  //button 4 mouse exit
						btn4.setForeground(SystemColor.menu);
						btn4.setBackground(Color.BLACK);
					}
				});
				btn4.addActionListener(new ActionListener() {  //button 4 action listener
					public void actionPerformed(ActionEvent e) {
						String number = textField_12.getText() + btn4.getText();
						textField_12.setText(number);
					}
				});
				btn4.setForeground(SystemColor.menu);
				btn4.setFont(new Font("Candara", Font.BOLD, 25));
				btn4.setBackground(Color.BLACK);
				btn4.setBounds(18, 175, 51, 41);
				panel_4.add(btn4);
				
				//---------------------------------------button 5-------------------------------------------------
				
				final JButton btn5 = new JButton("5");
				btn5.setFocusPainted(false);
				btn5.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {  //button 5 mouse enter
						btn5.setBackground(Color.GRAY);
						btn5.setForeground(Color.black);
					}
					@Override
					public void mouseExited(MouseEvent e) {  //button 5 mouse exit
						btn5.setForeground(SystemColor.menu);
						btn5.setBackground(Color.BLACK);
					}
				});
				btn5.addActionListener(new ActionListener() {  //button 5 action listener
					public void actionPerformed(ActionEvent e) {
						String number = textField_12.getText() + btn5.getText();
						textField_12.setText(number);
					}
				});
				btn5.setForeground(SystemColor.menu);
				btn5.setFont(new Font("Candara", Font.BOLD, 25));
				btn5.setBackground(Color.BLACK);
				btn5.setBounds(79, 175, 51, 41);
				panel_4.add(btn5);
				
				//-----------------------------------------button 6------------------------------------------
				final JButton btn6 = new JButton("6");
				btn6.setFocusPainted(false);
				btn6.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {  //button 6 mouse enter
						btn6.setBackground(Color.GRAY);
						btn6.setForeground(Color.black);
					}
					@Override
					public void mouseExited(MouseEvent e) {  //button 6 mouse exit
						btn6.setForeground(SystemColor.menu);
						btn6.setBackground(Color.BLACK);
					}
				});
				btn6.addActionListener(new ActionListener() {  //button 6 action listener
					public void actionPerformed(ActionEvent e) {
						String number = textField_12.getText() + btn6.getText();
						textField_12.setText(number);
					}
				});
				
				btn6.setToolTipText("");
				btn6.setForeground(SystemColor.menu);
				btn6.setFont(new Font("Candara", Font.BOLD, 25));
				btn6.setBackground(Color.BLACK);
				btn6.setBounds(140, 175, 51, 41);
				panel_4.add(btn6);
				
				//-----------------------------------------------------button 7---------------------------------------------
				
				final JButton btn7 = new JButton("7");
				btn7.setFocusPainted(false);
				btn7.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {  //button 7 mouse enter
						btn7.setBackground(Color.GRAY);
						btn7.setForeground(Color.black);
					}
					@Override
					public void mouseExited(MouseEvent e) {  //button 7 mouse exit
						btn7.setForeground(SystemColor.menu);
						btn7.setBackground(Color.BLACK);
					}
				});
				btn7.addActionListener(new ActionListener() {  //button 7 action listener
					public void actionPerformed(ActionEvent e) {
						String number = textField_12.getText() + btn7.getText();
						textField_12.setText(number);
					}
				});
				
				btn7.setForeground(SystemColor.menu);
				btn7.setFont(new Font("Candara", Font.BOLD, 25));
				btn7.setBackground(Color.BLACK);
				btn7.setBounds(18, 125, 51, 41);
				panel_4.add(btn7);
				
				//------------------------------------------------------button 8--------------------------------------------------------
				final JButton btn8 = new JButton("8");
				btn8.setFocusPainted(false);
				btn8.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {  //button 8 mouse enter
						btn8.setBackground(Color.GRAY);
						btn8.setForeground(Color.black);
					}
					@Override
					public void mouseExited(MouseEvent e) {  //button 8 mouse exit
						btn8.setForeground(SystemColor.menu);
						btn8.setBackground(Color.BLACK);
					}
				});
				btn8.addActionListener(new ActionListener() {  //button 8 action listener
					public void actionPerformed(ActionEvent e) {
						String number = textField_12.getText() + btn8.getText();
						textField_12.setText(number);
					}
				});
				
				
				btn8.setForeground(SystemColor.menu);
				btn8.setFont(new Font("Candara", Font.BOLD, 25));
				btn8.setBackground(Color.BLACK);
				btn8.setBounds(79, 125, 51, 41);
				panel_4.add(btn8);
				
				//------------------------------------------------button 9-----------------------------------------
				
				final JButton btn9 = new JButton("9");
				btn9.setFocusPainted(false);
				btn9.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {  //button 9 mouse enter
						btn9.setBackground(Color.GRAY);
						btn9.setForeground(Color.black);
					}
					@Override
					public void mouseExited(MouseEvent e) {  //button 9 mouse exit
						btn9.setForeground(SystemColor.menu);
						btn9.setBackground(Color.BLACK);
					}
				});
				btn9.addActionListener(new ActionListener() {  //button 9 action listener
					public void actionPerformed(ActionEvent e) {
						String number = textField_12.getText() + btn9.getText();
						textField_12.setText(number);
					}
				});
				
				
				btn9.setForeground(SystemColor.menu);
				btn9.setFont(new Font("Candara", Font.BOLD, 25));
				btn9.setBackground(Color.BLACK);
				btn9.setBounds(140, 125, 51, 41);
				panel_4.add(btn9);
				
				//===============================================number area finished==========================================
				

				//-----------------------------------------Full Stop Button---------------------------------------
				final JButton btnFS = new JButton(".");
				btnFS.setFocusPainted(false);
				btnFS.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if(JChickenBurgerT.getText().contains(".")) {
							return;
						}else{
							String stop = textField_12.getText() + btnFS.getText();
							
							textField_12.setText(stop);
						}
						
						

					}
				});
				btnFS.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {  //button full stop mouse enter
						btnFS.setBackground(Color.GRAY);
						btnFS.setForeground(Color.black);
					}
					@Override
					public void mouseExited(MouseEvent e) {  //button full stop mouse exit
						btnFS.setForeground(SystemColor.menu);
						btnFS.setBackground(Color.BLACK);
					}
				});
				btnFS.setForeground(SystemColor.menu);
				btnFS.setFont(new Font("Candara", Font.BOLD, 25));
				btnFS.setBackground(Color.BLACK);
				btnFS.setBounds(79, 279, 51, 41);
				panel_4.add(btnFS);
				
				//------------------------------------------Button deviation--------------------------------------------------
				
				final JButton btnD = new JButton("/");
				btnD.setFocusPainted(false);
				btnD.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {  //button deviation mouse enter
						btnD.setBackground(Color.GRAY);
						btnD.setForeground(Color.black);
					}
					@Override
					public void mouseExited(MouseEvent e) {  //button deviation mouse exit
						btnD.setForeground(SystemColor.menu);
						btnD.setBackground(Color.BLACK);
					}
				});
				
				btnD.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						

							first = Double.parseDouble(textField_12.getText());
							textField_12.setText("");
							operation = "/";
	
							
						}
				});
				
				btnD.setForeground(SystemColor.menu);
				btnD.setFont(new Font("Candara", Font.BOLD, 25));
				btnD.setBackground(Color.BLACK);
				btnD.setBounds(201, 125, 51, 41);
				panel_4.add(btnD);
				
				//---------------------------------------------Button Multiplication------------------------------------------------------
				final JButton btnM = new JButton("x");
				btnM.setFocusPainted(false);
				btnM.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						first = Double.parseDouble(textField_12.getText());
						textField_12.setText("");
						operation = "*";
							
							
							
						}
				});
				btnM.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {  //button multiplication mouse enter
						btnM.setBackground(Color.GRAY);
						btnM.setForeground(Color.black);
					}
					@Override
					public void mouseExited(MouseEvent e) {  //button multiplication mouse exit
						btnM.setForeground(SystemColor.menu);
						btnM.setBackground(Color.BLACK);
					}
				});
				btnM.setForeground(SystemColor.menu);
				btnM.setFont(new Font("Candara", Font.BOLD, 25));
				btnM.setBackground(Color.BLACK);
				btnM.setBounds(201, 175, 51, 41);
				panel_4.add(btnM);
				
				
				
				//-------------------------------------------button subtraction-----------------------------------------------------
				
				final JButton btnS = new JButton("-");
				btnS.setFocusPainted(false);
				btnS.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
							
						first = Double.parseDouble(textField_12.getText());
						textField_12.setText("");
						operation = "-";
								
								
								
							
					}
				});
				btnS.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {  //button Subtraction mouse enter
						btnS.setBackground(Color.GRAY);
						btnS.setForeground(Color.black);
					}
					@Override
					public void mouseExited(MouseEvent e) {  //button Subtraction mouse exit
						btnS.setForeground(SystemColor.menu);
						btnS.setBackground(Color.BLACK);
					}
				});
				btnS.setForeground(SystemColor.menu);
				btnS.setFont(new Font("Candara", Font.BOLD, 25));
				btnS.setBackground(Color.BLACK);
				btnS.setBounds(201, 227, 51, 41);
				panel_4.add(btnS);
				
				
				
				
				//===================================Answer(equal) button ====================================================
				
				final JButton btnEQ = new JButton("=");
				btnEQ.setFocusPainted(false);
				btnEQ.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						second = Double.parseDouble(textField_12.getText());
						
						//====================================Operation area Start===========================================
						
						//--------------------------------------------Addition Operation---------------------------------------
						
						if(operation == "+") {
							result = first + second;
									
                 
                    if (Double.toString(result).endsWith(".0")) {
                        textField_12.setText(Double.toString(result).replace(".0", ""));
                    } else {
                        //textField_12.setText(Double.toString(result));
                    	answer=String.format("%.2f", result);
                    	textField_12.setText(answer);
                    }
                    
					
						//-----------------------------------------------Subtraction operation-----------------------------------
                    
						}else if(operation == "-") {
							result = first - second;

							
                    if (Double.toString(result).endsWith(".0")) {
                        textField_12.setText(Double.toString(result).replace(".0",""));
                    } else {
                       // textField_12.setText(Double.toString(result));
                    	answer=String.format("%.2f", result);
                    	textField_12.setText(answer);
                    }
                    
						//--------------------------------------------Deviation Operation--------------------------------------------	
                    
						}else if(operation == "/"){
							result = first / second;

							
                    if (Double.toString(result).endsWith(".0")) {
                        textField_12.setText(Double.toString(result).replace(".0",""));
                    } else {
                       // textField_12.setText(Double.toString(result));
                    	answer=String.format("%.2f", result);
                    	textField_12.setText(answer);
                    }
                    
						//------------------------------------------------------Multiplication Operation----------------------------------------
                    
						}else if(operation == "*"){
							result = first * second;

							
                    if (Double.toString(result).endsWith(".0")) {
                        textField_12.setText(Double.toString(result).replace(".0",""));
                    } else {
                        //textField_12.setText(Double.toString(result));
                    	answer=String.format("%.2f", result);
                    	textField_12.setText(answer);
                    }
						}
					
					}
				});
				//================================================Operation area close========================================
				btnEQ.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {  //button Equal mouse enter
						btnEQ.setBackground(Color.GRAY);
						btnEQ.setForeground(Color.black);
					}
					@Override
					public void mouseExited(MouseEvent e) {  //button Equal mouse exit
						btnEQ.setForeground(SystemColor.menu);
						btnEQ.setBackground(Color.BLACK);
					}
				});
				btnEQ.setForeground(SystemColor.menu);
				btnEQ.setFont(new Font("Candara", Font.BOLD, 25));
				btnEQ.setBackground(Color.BLACK);
				btnEQ.setBounds(140, 279, 51, 41);
				panel_4.add(btnEQ);
				
				final JButton btnP = new JButton("+");
				btnP.setFocusPainted(false);
				btnP.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
							
						first = Double.parseDouble(textField_12.getText());
						textField_12.setText("");
						operation = "+";
							
							
							
						}
					});
				
				
				//----------------------------------------------Plus Button-------------------------------------
				btnP.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {  //button plus mouse enter
						btnP.setBackground(Color.GRAY);
						btnP.setForeground(Color.black);
					}
					@Override
					public void mouseExited(MouseEvent e) {  //button Plus mouse exit
						btnP.setForeground(SystemColor.menu);
						btnP.setBackground(Color.BLACK);
					}
				});
				
				btnP.setForeground(SystemColor.menu);
				btnP.setFont(new Font("Candara", Font.BOLD, 25));
				btnP.setBackground(Color.BLACK);
				btnP.setBounds(201, 279, 51, 93);
				panel_4.add(btnP);
				
				//-----------------------------------------Clear button-------------------------------
				
				final JButton btnclear = new JButton("clear");
				btnclear.setFocusPainted(false);
				btnclear.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						textField_12.setText(null);
					}
				});
				btnclear.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {  //button clear mouse enter
						btnclear.setBackground(Color.GRAY);
						btnclear.setForeground(Color.black);
					}
					@Override
					public void mouseExited(MouseEvent e) {  //button Clear mouse exit
						btnclear.setForeground(SystemColor.menu);
						btnclear.setBackground(Color.BLACK);
					}
				});
				btnclear.setForeground(SystemColor.menu);
				btnclear.setFont(new Font("Candara", Font.BOLD, 25));
				btnclear.setBackground(Color.BLACK);
				btnclear.setBounds(18, 331, 112, 41);
				panel_4.add(btnclear);
				
				//----------------------------------- back button-----------------------------------
				
				final JButton btnBack = new JButton("\uF0E7");
				btnBack.setFocusPainted(false);
				btnBack.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String Backspace = null;
						if(textField_12.getText().length()>0) {
							StringBuilder str = new StringBuilder(textField_12.getText());
							str.deleteCharAt(textField_12.getText().length()-1);
							Backspace = str.toString();
							textField_12.setText(Backspace);
							
						}
					}
					
				});
				btnBack.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {  //button Back mouse enter
						btnBack.setBackground(Color.GRAY);
						btnBack.setForeground(Color.black);
					}
					@Override
					public void mouseExited(MouseEvent e) {  //button Back mouse exit
						btnBack.setForeground(SystemColor.menu);
						btnBack.setBackground(Color.BLACK);
					}
				});
				
				btnBack.setForeground(SystemColor.menu);
				btnBack.setFont(new Font("Wingdings", Font.BOLD, 15));
				btnBack.setBackground(Color.BLACK);
				btnBack.setBounds(140, 331, 51, 41);
				panel_4.add(btnBack);
		
		//=====================================future update area==============================================
		
		final JButton print = new JButton("Print");
		print.setFocusPainted(false);
		print.setToolTipText("Click and you can get Recept as a print");
		print.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				print.setBorder(new LineBorder(new Color(0, 128, 0), 4));
				print.setBackground(new Color(0, 128, 0));
				print.setForeground(Color.black);
				print.setBounds(219, 454, 97, 41);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				print.setBorder(new LineBorder(new Color(0, 128, 0), 4));
				print.setBackground(SystemColor.inactiveCaptionText);
				print.setForeground(SystemColor.text);
				print.setBounds(217, 452, 97, 41);
			}
		});
		print.setBorder(new LineBorder(new Color(0, 128, 0), 4, true));
		print.setBackground(SystemColor.inactiveCaptionText);
		print.setForeground(SystemColor.text);
		print.setVisible(false);
		print.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int opt = JOptionPane.showConfirmDialog(null, "Are You Sure You want to Print this", "Print",JOptionPane.YES_NO_OPTION);
				if(opt==0) {
					try {
						
						
						textArea.print();
					}
					catch(java.awt.print.PrinterException e1) {
						System.err.format("No Printer Found", e1.getMessage());
					}
					
					
				}
							
				
			}
				
				
			
		});
		print.setFont(new Font("Arial", Font.PLAIN, 20));
		print.setBounds(217, 456, 97, 41);
		panel_2.add(print);
		
		//===========================================================================================================================
		//==========================================================calculator finished==============================================
		//===========================================================================================================================
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0,0,0,180));
		panel_3.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 153), 4, true), new LineBorder(new Color(153, 0, 0), 4)));
		panel_3.setBounds(113, 440, 424, 151);
		frmResturantManagementSystem.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Cost of Drinks");
		lblNewLabel_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1_2_2.setBounds(26, 23, 131, 27);
		panel_3.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Cost of Meal");
		lblNewLabel_1_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1_2_2_1.setBounds(26, 60, 131, 27);
		panel_3.add(lblNewLabel_1_2_2_1);
		
		JLabel lblNewLabel_1_2_2_2 = new JLabel("Cost of Delivery");
		lblNewLabel_1_2_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_2.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1_2_2_2.setBounds(26, 98, 131, 27);
		panel_3.add(lblNewLabel_1_2_2_2);
		
		JCostOfDrinksT = new JTextField();
		
		JCostOfDrinksT.setText("0");
		JCostOfDrinksT.setEditable(false);
		JCostOfDrinksT.setForeground(SystemColor.text);
		JCostOfDrinksT.setHorizontalAlignment(SwingConstants.RIGHT);
		JCostOfDrinksT.setFont(new Font("Arial", Font.PLAIN, 20));
		JCostOfDrinksT.setColumns(10);
		JCostOfDrinksT.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
		JCostOfDrinksT.setBackground(Color.BLACK);
		JCostOfDrinksT.setBounds(167, 15, 243, 35);
		panel_3.add(JCostOfDrinksT);
		
		JCostOfMealT = new JTextField();
		JCostOfMealT.setText("0");
		JCostOfMealT.setHorizontalAlignment(SwingConstants.RIGHT);
		JCostOfMealT.setForeground(SystemColor.text);
		JCostOfMealT.setEditable(false);
		JCostOfMealT.setFont(new Font("Arial", Font.PLAIN, 20));
		JCostOfMealT.setColumns(10);
		JCostOfMealT.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
		JCostOfMealT.setBackground(Color.BLACK);
		JCostOfMealT.setBounds(167, 52, 243, 35);
		panel_3.add(JCostOfMealT);
		
		JCostOfDeliveryT = new JTextField();
		JCostOfDeliveryT.setText("0");
		JCostOfDeliveryT.setForeground(SystemColor.text);
		JCostOfDeliveryT.setHorizontalAlignment(SwingConstants.RIGHT);
		JCostOfDeliveryT.setEditable(false);
		JCostOfDeliveryT.setFont(new Font("Arial", Font.PLAIN, 20));
		JCostOfDeliveryT.setColumns(10);
		JCostOfDeliveryT.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
		JCostOfDeliveryT.setBackground(Color.BLACK);
		JCostOfDeliveryT.setBounds(167, 90, 243, 35);
		panel_3.add(JCostOfDeliveryT);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(new Color(0,0,0,180));
		panel_3_1.setLayout(null);
		panel_3_1.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 153), 4, true), new LineBorder(new Color(153, 0, 0), 4)));
		panel_3_1.setBounds(545, 440, 313, 151);
		frmResturantManagementSystem.getContentPane().add(panel_3_1);
		
		JLabel lblNewLabel_1_2_2_3 = new JLabel("TAX");
		lblNewLabel_1_2_2_3.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_3.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1_2_2_3.setBounds(10, 16, 75, 27);
		panel_3_1.add(lblNewLabel_1_2_2_3);
		
		JLabel lblNewLabel_1_2_2_1_1 = new JLabel("Sub Total");
		lblNewLabel_1_2_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_1_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1_2_2_1_1.setBounds(10, 56, 84, 27);
		panel_3_1.add(lblNewLabel_1_2_2_1_1);
		
		JLabel lblNewLabel_1_2_2_2_1 = new JLabel("Total");
		lblNewLabel_1_2_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_2_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1_2_2_2_1.setBounds(10, 94, 75, 27);
		panel_3_1.add(lblNewLabel_1_2_2_2_1);
		
		JTotalT = new JTextField();
		JTotalT.setEditable(false);
		JTotalT.setText("0");
		JTotalT.setForeground(SystemColor.text);
		JTotalT.setHorizontalAlignment(SwingConstants.RIGHT);
		JTotalT.setFont(new Font("Arial", Font.PLAIN, 20));
		JTotalT.setColumns(10);
		JTotalT.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
		JTotalT.setBackground(Color.BLACK);
		JTotalT.setBounds(95, 86, 194, 35);
		panel_3_1.add(JTotalT);
		
		JSubTotalT = new JTextField();
		JSubTotalT.setEditable(false);
		JSubTotalT.setText("0");
		JSubTotalT.setForeground(SystemColor.text);
		JSubTotalT.setHorizontalAlignment(SwingConstants.RIGHT);
		JSubTotalT.setFont(new Font("Arial", Font.PLAIN, 20));
		JSubTotalT.setColumns(10);
		JSubTotalT.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
		JSubTotalT.setBackground(Color.BLACK);
		JSubTotalT.setBounds(95, 48, 194, 35);
		panel_3_1.add(JSubTotalT);
		
		JtaxT = new JTextField();
		JtaxT.setText("0");
		JtaxT.setHorizontalAlignment(SwingConstants.RIGHT);
		JtaxT.setForeground(SystemColor.text);
		JtaxT.setEditable(false);
		JtaxT.setFont(new Font("Arial", Font.PLAIN, 20));
		JtaxT.setColumns(10);
		JtaxT.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
		JtaxT.setBackground(Color.BLACK);
		JtaxT.setBounds(95, 11, 194, 35);
		panel_3_1.add(JtaxT);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBackground(new Color(0,0,0,180));
		panel_3_2.setLayout(null);
		panel_3_2.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 153), 4, true), new LineBorder(new Color(153, 0, 0), 4)));
		panel_3_2.setBounds(113, 595, 1102, 83);
		frmResturantManagementSystem.getContentPane().add(panel_3_2);
		
//      <=========================================================================================================================================>
//		<==================================================future updates area start==============================================================>
//		<=========================================================================================================================================>
//		
//		Label label = new Label("Theam");
//		label.setFont(new Font("Arial", Font.BOLD, 16));
//		label.setForeground(SystemColor.textHighlightText);
//		label.setBounds(50, 13, 62, 22);
//		panel_3_2.add(label);
//		
//		
//
//		
//		
//		final JRadioButton rdbtnNewRadioButton = new JRadioButton("Dark");
//		rdbtnNewRadioButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//				
//			}
//		});
//		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				rdbtnNewRadioButton.setForeground(Color.RED);
//			}
//			@Override
//			public void mouseExited(MouseEvent e) {
//				rdbtnNewRadioButton.setForeground(SystemColor.text);
//			}
//		});
//		buttonGroup.add(rdbtnNewRadioButton);
//		rdbtnNewRadioButton.setForeground(SystemColor.text);
//		rdbtnNewRadioButton.setBackground(SystemColor.inactiveCaptionText);
//		rdbtnNewRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
//		rdbtnNewRadioButton.setBounds(17, 41, 67, 23);
//		panel_3_2.add(rdbtnNewRadioButton);
//		
//		final JRadioButton rdbtnLight = new JRadioButton("light");
//		rdbtnLight.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//				//need to update 
//				
//				
//			}
//		});
//		rdbtnLight.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				rdbtnLight.setForeground(Color.RED);
//			}
//			@Override
//			public void mouseExited(MouseEvent e) {
//				rdbtnLight.setForeground(Color.WHITE);
//			}
//		});
//		buttonGroup.add(rdbtnLight);
//		rdbtnLight.setForeground(Color.WHITE);
//		rdbtnLight.setFont(new Font("Arial", Font.BOLD, 14));
//		rdbtnLight.setBackground(Color.BLACK);
//		rdbtnLight.setBounds(91, 41, 62, 23);
//		panel_3_2.add(rdbtnLight);
		
//      <=========================================================================================================================================>
//		<================================================future updates area close================================================================>
//		<=========================================================================================================================================>
		
		final JButton btnReset = new JButton("Reset");
		btnReset.setFocusPainted(false);
		btnReset.setToolTipText("Click to Reset Projevt");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JCheeseBurgerT.setText("0");
				JChickenBurgerMT.setText("0");
				JChickenBurgerT.setText("0");				
				JQTYT.setText("0");
				JdrinkCombobox.setSelectedItem("Select a drink");				
				JHomeDeliveryCB.setSelected(false);
				JTaxCB.setSelected(false);
				
				
				JCostOfMealT.setText("0");
				JCostOfDeliveryT.setText("0");
				JCostOfDrinksT.setText("0");
				
				JCurrencyComboBox.setSelectedItem("Select Currency");
				JCurrencyPT.setText("0");
				JCurrencyT.setText(null);
				
				JtaxT.setText("0");
				JSubTotalT.setText("0");
				JTotalT.setText("0");
				
				textField_12.setText(null);
				textArea.setText(null);
				print.setVisible(false);
			
				
			}
		});
		btnReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnReset.setFont(new Font("Arial", Font.BOLD, 18));
				btnReset.setForeground(Color.yellow);
				btnReset.setBackground(new Color(0, 0, 255));
				btnReset.setBorder(new LineBorder(new Color(0, 0, 255), 4, true));
				btnReset.setBounds(661, 24, 99, 42);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnReset.setFont(new Font("Arial", Font.BOLD, 18));
				btnReset.setForeground(SystemColor.text);
				btnReset.setBackground(SystemColor.inactiveCaptionText);
				btnReset.setBorder(new LineBorder(new Color(0, 0, 255), 4, true));
				btnReset.setBounds(659, 22, 99, 42);
			}
		});
		btnReset.setFont(new Font("Arial", Font.BOLD, 18));
		btnReset.setForeground(SystemColor.text);
		btnReset.setBackground(SystemColor.inactiveCaptionText);
		btnReset.setBorder(new LineBorder(new Color(0, 0, 255), 4, true));
		btnReset.setBounds(659, 22, 99, 42);
		panel_3_2.add(btnReset);
		
		final JButton btnExit = new JButton("Exit");
		btnExit.setFocusPainted(false);
		btnExit.setToolTipText("Click to Exit Project");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opt = JOptionPane.showConfirmDialog(null, "Are You Sure You want to Exit", "Exit",JOptionPane.YES_NO_OPTION);
				if(opt==0) {
					JOptionPane.showMessageDialog(null, "Have a nice day...!");
					System.exit(0);          
					    
				}
				 
				
				
			}
		});
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnExit.setBorder(new LineBorder(new Color(204, 0, 0), 4, true));
				btnExit.setFont(new Font("Arial", Font.BOLD, 18));
				btnExit.setBackground(new Color(204, 0, 0));
				btnExit.setForeground(Color.black);
				btnExit.setBounds(950, 24, 99, 42);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnExit.setBorder(new LineBorder(new Color(204, 0, 0), 4, true));
				btnExit.setFont(new Font("Arial", Font.BOLD, 18));
				btnExit.setBackground(SystemColor.inactiveCaptionText);
				btnExit.setForeground(SystemColor.text);
				btnExit.setBounds(948, 22, 99, 42);
				
			}
		
		});
		
		
		btnExit.setBorder(new LineBorder(new Color(204, 0, 0), 4, true));
		btnExit.setFont(new Font("Arial", Font.BOLD, 18));
		btnExit.setBackground(SystemColor.inactiveCaptionText);
		btnExit.setForeground(SystemColor.text);
		btnExit.setBounds(948, 22, 99, 42);
		panel_3_2.add(btnExit);
		
		
		
		final JButton btnReceipt = new JButton("Receipt");
		btnReceipt.setFocusPainted(false);
		btnReceipt.setToolTipText("Click to get Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double chicken_bur = Double.parseDouble(JChickenBurgerT.getText());				
				double priceChickenBur = 3.2;
				double TPCB=0; //total price of chicken burger
				TPCB=(chicken_bur*priceChickenBur);
				String ChB = String.format("%.2f", TPCB);				
				
				double chicken_bur_Meal = Double.parseDouble(JChickenBurgerMT.getText());
				double priceChickenBurMeal = 2.5;
				double TPCBM=0 ; //total price of chicken burger Meal
				TPCBM=(chicken_bur_Meal*priceChickenBurMeal);
				String ChBM = String.format("%.2f", TPCBM + TPCB );
	
				double TPCheeseB =0;             //total price of cheese burger
				double priceCheeseBur = 3.8; 
				double cheesebur = Double.parseDouble(JCheeseBurgerT.getText()); 
				TPCheeseB=(cheesebur*priceCheeseBur);
				String chee = String.format("%.2f", TPCheeseB+TPCBM + TPCB);
				
				
				
				if(JdrinkCombobox.getSelectedItem().equals("Select a drink")) {
					textArea.setText(
							"\n                     22PYJVB2021\n\n"
							+ "      No.93 Horana Road,Pliyandala\n"
							+ " Tel:011-2224448     Open 6AM - 7PM\n"
							+ "-------------------------------------------------------\n"
							+" Chicken Burger"+"x"+JChickenBurgerT.getText()+"-----------$"+ ChB +"\n"
							+" Chicken Burger Meal"+"x"+JChickenBurgerMT.getText()+"---$"+ ChBM +"\n" 
							+" Cheese Burger"+"x"+JCheeseBurgerT.getText()+"-----------$"+ chee +"\n\n"
							+ "================================\n\n"
							+ " Cost of Meal"+"                         $"+JCostOfMealT.getText()+          " \n"
							+ " Cost Of Delivery                  $"+JCostOfDeliveryT.getText()+"\n"
							+ " TAX                                        $"+JtaxT.getText()+"\n"
							+ "                                            ---------------\n"
							+ ""
							+ " Total                                      $"+JTotalT.getText()+"\n\n"
							+ "       THANK YOU FOR COMMING.\n                 HAVE A NICE DAY!"
							);
				}
				else if(JdrinkCombobox.getSelectedItem()!=("Select a drink") && JQTYT.getText()!="") {
					textArea.setText(
							"                     22PYJVB2021\n\n"
							+ "      No.93 Horana Road,Pliyandala\n"
							+ " Tel:011-2224448     Open 6AM - 7PM\n"
							+ "--------------------------------------------------------\n"
							+" "+JdrinkCombobox.getSelectedItem()+"x"+JQTYT.getText()+"---$"+JCostOfDrinksT.getText()+"\n\n" //drink bill
							+" Chicken Burger"+"x"+JChickenBurgerT.getText()+"-----------$"+ ChB +"\n"
							+" Chicken Burger Meal"+"x"+JChickenBurgerMT.getText()+"---$"+ ChBM +"\n" 
							+" Cheese Burger"+"x"+JCheeseBurgerT.getText()+"-----------$"+ chee +"\n\n"
							+"=================================\n\n" 
							+ " Cost Of Drink"+"                       $"+JCostOfDrinksT.getText()+"\n"
							+ " Cost of Meal"+"                        $"+JCostOfMealT.getText()+          " \n"
							+ " Cost Of Delivery                  $"+JCostOfDeliveryT.getText()+"\n"
							+ " TAX                                        $"+JtaxT.getText()+"\n"
							+ "                                            ---------------\n"
							+ " Total                                      $"+JTotalT.getText()+"\n\n"
							+ "       THANK YOU FOR COMMING.\n                 HAVE A NICE DAY!"
							);
				}
				

			
				
				
				
			}
		});
		btnReceipt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnReceipt.setForeground(Color.yellow);
				btnReceipt.setFont(new Font("Arial", Font.BOLD, 18));
				btnReceipt.setBorder(new LineBorder(new Color(0, 0, 255), 4, true));
				btnReceipt.setBackground(new Color(0, 0, 255));
				btnReceipt.setBounds(474, 24, 99, 42);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnReceipt.setForeground(Color.WHITE);
				btnReceipt.setFont(new Font("Arial", Font.BOLD, 18));
				btnReceipt.setBorder(new LineBorder(new Color(0, 0, 255), 4, true));
				btnReceipt.setBackground(Color.BLACK);
				btnReceipt.setBounds(472, 22, 99, 42);
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				print.setVisible(true);
				panel_5.setVisible(true);
				
			}
		});
		btnReceipt.setForeground(Color.WHITE);
		btnReceipt.setFont(new Font("Arial", Font.BOLD, 18));
		btnReceipt.setBorder(new LineBorder(new Color(0, 0, 255), 4, true));
		btnReceipt.setBackground(Color.BLACK);
		btnReceipt.setBounds(472, 22, 99, 42);
		panel_3_2.add(btnReceipt);
		
		final JButton btnTotal = new JButton("Total");
		btnTotal.setFocusPainted(false);
		btnTotal.setToolTipText("Click to get Total Value");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JdrinkCombobox.setBackground(Color.black);
				JQTYT.setBackground(Color.BLACK);
//				double TotalePrice;
			
				//--------------------------Chicken burger calculation------------------------------
				
				double chicken_bur = Double.parseDouble(JChickenBurgerT.getText());
				double priceChickenBur = 3.2;
				double TPCB=0; //total price of chicken burger
				TPCB=(chicken_bur*priceChickenBur);
				String costOfMeal = String.format("%.2f", TPCB);
				JCostOfMealT.setText(costOfMeal);
				
				//---------------------------Chicken burger Meal calculation----------------------------
				
				double chicken_bur_Meal = Double.parseDouble(JChickenBurgerMT.getText());
				double priceChickenBurMeal = 2.5;
				double TPCBM=0 ; //total price of chicken burger Meal
				TPCBM=(chicken_bur_Meal*priceChickenBurMeal);
				String costOfBM = String.format("%.2f", TPCBM + TPCB );
				JCostOfMealT.setText(costOfBM);
				
				//-----------------Cheese burger calculation---------------------------------------
				
				double TPCheeseB =0;             //total price of cheese burger
				double priceCheeseBur = 3.8; 
				double cheesebur = Double.parseDouble(JCheeseBurgerT.getText()); 
				TPCheeseB=(cheesebur*priceCheeseBur);
				String TPCheeseBu = String.format("%.2f", TPCheeseB+TPCBM + TPCB);
				JCostOfMealT.setText(TPCheeseBu);
				
			   //------------------------------future update area----------------------------------------
				
				
//				TotalePrice =(TPCB+TPCBM+TPCheeseB);
//				String TP = String.format("%.2f", TotalePrice);
//				COM.setText(TP);
				
			//---------------------------Home delivery calculation----------------------------------------	
				
				double idelivery2 = 4.0;
				if(JHomeDeliveryCB.isSelected()) {
					String delivery = String.format("%.2f", idelivery2);
					JCostOfDeliveryT.setText(delivery);
				}else {
					JCostOfDeliveryT.setText("0");
				}
				
			//-------------------------------tax calculation----------------------------------------	
				double taxP = 1.0;
				if(JTaxCB.isSelected()) {
					String tax = String.format("%.2f", taxP);
					JtaxT.setText(tax);
				}else {
					JtaxT.setText("0");
				}
				
				//-----------------------------------Drink Combo box calculation---------------------------------------------
				
				//-------------------------------------drink price calculation-------------------------------------------------
				double qty = Double.parseDouble(JQTYT.getText()); 
				double milkshakes =2*qty;				
				double strmilkshake =3*qty;	
				double chomilkshake=2.5*qty;				
				double softDrink =1.5*qty;
				
				//----------------------------------------show price in text box------------------------------------------
				if(JdrinkCombobox.getSelectedItem().equals("Select a drink")) {
					JCostOfDrinksT.setText("0");
					if(qty==0) {
						JQTYT.setText("0");
					}else {
						JdrinkCombobox.setBackground(Color.DARK_GRAY);
						JOptionPane.showMessageDialog(null, "You add Qty without Select Drink Please Re-chek");
						
					}
					
					
					
				}
				if(JdrinkCombobox.getSelectedItem().equals("Milkshakes")) {
					String MS =String.format("%.2f", milkshakes);
					JCostOfDrinksT.setText(MS);
					
					if(milkshakes==0) {
						
						int opt = JOptionPane.showConfirmDialog(null, "You didn't Add Qty,You want to add it...?", "Countinue",JOptionPane.YES_NO_OPTION);
						if(opt==0) {
							JQTYT.setBackground(Color.red);
							        
							    
						}
					}
					
					
				}
				if(JdrinkCombobox.getSelectedItem().equals("strawberry milkshake")) {
					String sMS =String.format("%.2f", strmilkshake);
					JCostOfDrinksT.setText(sMS);
					if(strmilkshake==0) {
						int opt = JOptionPane.showConfirmDialog(null, "You didn't Add Qty,You want to add it...?", "Countinue",JOptionPane.YES_NO_OPTION);
						if(opt==0) {
							JQTYT.setBackground(Color.red);
							            
							    
						}
					}
					
					
				}
				if(JdrinkCombobox.getSelectedItem().equals("chocolate milkshake")) {
					String cMS =String.format("%.2f", chomilkshake);
					JCostOfDrinksT.setText(cMS);
					if(chomilkshake==0) {
						int opt = JOptionPane.showConfirmDialog(null, "You didn't Add Qty,You want to add it...?", "Countinue",JOptionPane.YES_NO_OPTION);
						if(opt==0) {
							JQTYT.setBackground(Color.red);
							           
							    
						}
					}
					
					
				}
				if(JdrinkCombobox.getSelectedItem().equals("coca cola")) {
					String sdcc =String.format("%.2f", softDrink);
					JCostOfDrinksT.setText(sdcc);
					if(softDrink==0) {
						int opt = JOptionPane.showConfirmDialog(null, "You didn't Add Qty,You want to add it...?", "Countinue",JOptionPane.YES_NO_OPTION);
						if(opt==0) {
							JQTYT.setBackground(Color.red);
						           
							    
						}
					}
					
					
				}
				if(JdrinkCombobox.getSelectedItem().equals("pepsi")) {
					String sdp =String.format("%.2f", softDrink);
					JCostOfDrinksT.setText(sdp);
					if(softDrink==0) {
						int opt = JOptionPane.showConfirmDialog(null, "You didn't Add Qty,You want to add it...?", "Countinue",JOptionPane.YES_NO_OPTION);
						if(opt==0) {
							JQTYT.setBackground(Color.red);
							           
							    
						}
					}
					
					
				}
				if(JdrinkCombobox.getSelectedItem().equals("sprite")) {
					String sds =String.format("%.2f", softDrink);
					JCostOfDrinksT.setText(sds);
					if(softDrink==0) {
						int opt = JOptionPane.showConfirmDialog(null, "You didn't Add Qty,You want to add it...?", "Countinue",JOptionPane.YES_NO_OPTION);
						if(opt==0) {
							JQTYT.setBackground(Color.red);
							           
							    
						}
					}
					
					
				}
				
				//------------------------------------sub total------------------------------
				
				
				double x= Double.parseDouble(JCostOfDrinksT.getText());
				double y= Double.parseDouble(JCostOfMealT.getText()); 
				double z= Double.parseDouble(JCostOfDeliveryT.getText()); 
				double stotal=(x+y+z);
				String st =String.format("%.2f", stotal);
				JSubTotalT.setText(st);

				//--------------------------------------final total--------------------------------------------------
				
				double ST = Double.parseDouble(JSubTotalT.getText());
				double TT = Double.parseDouble(JtaxT.getText());
				double Ftotal=(ST+TT);
				String FT =String.format("%.2f", Ftotal);
				JTotalT.setText(FT);
				
				
				
						
			}
		});
		
		
		btnTotal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnTotal.setForeground(Color.yellow);
				btnTotal.setFont(new Font("Arial", Font.BOLD, 18));
				btnTotal.setBorder(new LineBorder(new Color(0, 0, 255), 4, true));
				btnTotal.setBackground (new Color(0, 0, 255));
				btnTotal.setBounds(293, 24, 99, 42);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnTotal.setForeground(Color.WHITE);
				btnTotal.setFont(new Font("Arial", Font.BOLD, 18));
				btnTotal.setBorder(new LineBorder(new Color(0, 0, 255), 4, true));
				btnTotal.setBackground(Color.BLACK);
				btnTotal.setBounds(291, 22, 99, 42);
				
			}
		});
		btnTotal.setForeground(Color.WHITE);
		btnTotal.setFont(new Font("Arial", Font.BOLD, 18));
		btnTotal.setBorder(new LineBorder(new Color(0, 0, 255), 4, true));
		btnTotal.setBackground(Color.BLACK);
		btnTotal.setBounds(291, 22, 99, 42);
		panel_3_2.add(btnTotal);
		
		JLabel lblNewLabel = new JLabel("Restaurant Mangement System-22PYJVB2021");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setBounds(0, 11, 1338, 54);
		frmResturantManagementSystem.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(InterfaceR.class.getResource("/img/pexels-pixabay-260922.jpg")));
		lblNewLabel_3.setBounds(0, 0, 1348, 689);
		frmResturantManagementSystem.getContentPane().add(lblNewLabel_3);
	}
}
