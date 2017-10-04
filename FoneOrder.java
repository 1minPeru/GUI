
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

import javax.swing.*;

public class FoneOrder implements ActionListener {
	private JFrame frame;
	private JPanel contentPane;
	JMenuBar menuBar;
	JMenu menu, about;
	JMenuItem menuItem, abt;
	
	//radio buttons
	private JRadioButton in4_5, in5,in5_5;
	private JRadioButton GB2, GB3, GB4;
	private JRadioButton mAh2k,mAh3k,mAh3_5k,mAh4k;
	private JRadioButton Black,Blue,White,Silver,Gold,Red;
	private JRadioButton GB16,GB32,GB64;

	private ButtonGroup scr,mem,batt,color,size;
	
	//check boxes
	private JCheckBox kboard,gamepad,microSD;
	
	
	//text fields
	private JTextField hPhones,Battery,pBank;
	private JTextField name,address,city;

	
	
	public static void main(String[] args) {
		Foods gui = new Foods();
		gui.start();
	}
	
	public void start() {
		frame = new JFrame("Fone Order");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		makeMenus();
		makeContent();
		frame.setSize(900, 900);
		frame.setVisible(true);
		
	}
	
	private void makeMenus() {
		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
	
		menu = new JMenu("File");
		menu.setMnemonic(KeyEvent.VK_F);
		menuBar.add(menu);
		
		about = new JMenu("About");
		about.setMnemonic(KeyEvent.VK_A);
		menuBar.add(about);

		menuItem = new JMenuItem("New Order");
		menuItem.setMnemonic(KeyEvent.VK_N);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,Event.CTRL_MASK));
		menuItem.addActionListener(this);
		menu.add(menuItem);
	
		menuItem = new JMenuItem("Save Order");
		menuItem.setMnemonic(KeyEvent.VK_S);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,Event.CTRL_MASK));
		menuItem.addActionListener(this);
		menu.add(menuItem);
		
		menu.addSeparator();
		
		menuItem = new JMenuItem("Exit");
		menuItem.setMnemonic(KeyEvent.VK_X);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,Event.ALT_MASK));
		menuItem.addActionListener(this);
		menu.add(menuItem);
		
		abt= new JMenuItem("About Fone Order");
		abt.setMnemonic(KeyEvent.VK_A);
		abt.addActionListener(this);
		about.add(abt);
		
		
	}
	
	private void makeContent()
	{
		contentPane = (JPanel) frame.getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		makeNorthRegion();
		makeCenterRegion();
		makeSouthRegion();
	}
	
	private void makeNorthRegion()
	{
		JLabel img = new JLabel(new ImageIcon(this.getClass().getResource("caterpillar.jpg")));
		contentPane.add(img,BorderLayout.NORTH);
	}
	
	private void makeCenterRegion()
	{
		JPanel panel = new JPanel();
		
		panel.setLayout(new GridLayout(2,4));
		JPanel p1,p2,p3,p4,p5,p6,p7,p71,p72,p73,p8;
		p1 = new JPanel();
		p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
		p2 = new JPanel();
		p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
		p3 = new JPanel();
		p3.setLayout(new BoxLayout(p3, BoxLayout.Y_AXIS));
		p4 = new JPanel();
		p4.setLayout(new BoxLayout(p4, BoxLayout.Y_AXIS));
		p5 = new JPanel();
		p5.setLayout(new BoxLayout(p5, BoxLayout.Y_AXIS));
		p6 = new JPanel();
		p6.setLayout(new BoxLayout(p6, BoxLayout.Y_AXIS));
		p7 = new JPanel();
		p7.setLayout(new BoxLayout(p7, BoxLayout.Y_AXIS));
		p71 = new JPanel();
		p71.setLayout(new FlowLayout());
		p72 = new JPanel();
		p72.setLayout(new FlowLayout());
		p73 = new JPanel();
		p73.setLayout(new FlowLayout());
		p8 = new JPanel();
		p8.setLayout(new BoxLayout(p8,BoxLayout.Y_AXIS));
		
		//Radio Button
		p1.setBorder(BorderFactory.createTitledBorder("Choose a Size"));
		scr = new ButtonGroup();
		// in4_5, in5,in5_5;
		in4_5 = new JRadioButton("4.5 in.");
		scr.add(in4_5);
		p1.add(in4_5);
		in5 = new JRadioButton("5 in.");
		scr.add(in5);
		p1.add(in5);
		in5_5 = new JRadioButton("5.5 in.");
		scr.add(in5_5);
		p1.add(in5_5);
		panel.add(p1);
		contentPane.add(panel,BorderLayout.CENTER);
		
		p2.setBorder(BorderFactory.createTitledBorder("Choose a RAM Size"));
		mem = new ButtonGroup();
		// GB2, GB3, GB4;
		GB2 = new JRadioButton("2 GB");
		mem.add(GB2);
		p2.add(GB2);
		GB3 = new JRadioButton("3 GB");
		mem.add(GB3);
		p2.add(GB3);
		GB4 = new JRadioButton("4 GB");
		mem.add(GB4);
		p2.add(GB4);
		panel.add(p2);
		contentPane.add(panel,BorderLayout.CENTER);
		
		p3.setBorder(BorderFactory.createTitledBorder("Choose a Battery Size"));
		batt = new ButtonGroup();
		// mAh2k,mAh3k,mAh3_5k,mAh4k;
		mAh2k = new JRadioButton("2000 mAh");
		batt.add(mAh2k);
		p3.add(mAh2k);
		mAh3k = new JRadioButton("3000 mAh");
		batt.add(mAh3k);
		p3.add(mAh3k);
		mAh3_5k = new JRadioButton("3500 mAh");
		batt.add(mAh3_5k);
		p3.add(mAh3_5k);
		mAh4k = new JRadioButton("4000 mAh");
		batt.add(mAh4k);
		p3.add(mAh4k);
		panel.add(p3);
		contentPane.add(panel,BorderLayout.CENTER);
		
		p4.setBorder(BorderFactory.createTitledBorder("Choose a Color"));
		color = new ButtonGroup();
		//Black,Blue,White,Silver,Gold,Red;
		Black = new JRadioButton("Black");
		color.add(Black);
		p4.add(Black);
		Blue = new JRadioButton("Blue");
		color.add(Blue);
		p4.add(Blue);
		Gold = new JRadioButton("Gold");
		color.add(Gold);
		p4.add(Gold);
		Red = new JRadioButton("Red");
		color.add(Red);
		p4.add(Red);
		Silver = new JRadioButton("Silver");
		color.add(Silver);
		p4.add(Silver);
		White = new JRadioButton("White");
		color.add(White);
		p4.add(White);
		panel.add(p4);
		contentPane.add(panel,BorderLayout.CENTER);
		
		p5.setBorder(BorderFactory.createTitledBorder("Choose a Storage Size"));
		size = new ButtonGroup();
		//GB16,GB32,GB64;
		GB16 = new JRadioButton("16 GB");
		size.add(GB16);
		p5.add(GB16);
		GB32 = new JRadioButton("32 GB");
		size.add(GB32);
		p5.add(GB32);
		GB64 = new JRadioButton("64 GB");
		size.add(GB64);
		p5.add(GB64);
		panel.add(p5);
		
		
		//Check Boxes
		//kboard,gamepad,microSD;
		p6.setBorder(BorderFactory.createTitledBorder("Choose Addon"));
		kboard = new JCheckBox("Keyboard",false);
		p6.add(kboard);
		gamepad = new JCheckBox("Game Pad",false);
		p6.add(gamepad);
		microSD = new JCheckBox("MicroSD (64GB)",false);
		p6.add(microSD);
		panel.add(p6);
		
		//private JTextField hPhones,Battery,pBank;
		p7.setBorder(BorderFactory.createTitledBorder("Accessories!"));
		hPhones = new JTextField("",2);
		
		p71.add(hPhones);
		p71.add(new JLabel("Headphones"));
		Battery = new JTextField("",2);
		p72.add(Battery);
		p72.add(new JLabel("Screen Protector"));
		pBank = new JTextField("",2);
		p73.add(pBank);
		p73.add(new JLabel("Phone Case"));
		p7.add(p71);
		p7.add(p72);
		p7.add(p73);
		panel.add(p7);
		
		p8.setBorder(BorderFactory.createTitledBorder("Thanks!"));
		//FIX THIS!!!!!!!!!!!!!!
		p8.add(new JLabel("Thanks For Ordering your customized phone from The Caterpillar Service! \n We have the greatest "
				+ "people working on the greatest phones ever! \n Trust me, they're the best of the best and they do nothing but the"
				+ "best. \n"));
		panel.add(p8);
		contentPane.add(panel,BorderLayout.CENTER);
	}
	
	private void makeSouthRegion()
	{
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.X_AXIS));
		panel.setBorder(BorderFactory.createTitledBorder("Deliver TO:"));
		
		JPanel smallPanel = new JPanel();
		smallPanel.setLayout(new BoxLayout(smallPanel,BoxLayout.Y_AXIS));
		smallPanel.add(new JLabel("Name: "));
		smallPanel.add(new JLabel("Address: "));
		smallPanel.add(new JLabel("City, St, Zip: "));
		
		panel.add(smallPanel);
		
		smallPanel = new JPanel();
		smallPanel.setLayout(new BoxLayout(smallPanel,BoxLayout.Y_AXIS));
		name = new JTextField();
		address = new JTextField();
		city = new JTextField();
		smallPanel.add(name);
		smallPanel.add(address);
		smallPanel.add(city);
		panel.add(smallPanel);
		smallPanel.setBorder(BorderFactory.createEmptyBorder(3,3,3,3));
		contentPane.add(panel,BorderLayout.SOUTH);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand().equals("About Fone Order"))
		{
			JOptionPane.showMessageDialog(frame,"Fone Order! \n \n"
					+ " Version 6.0.1.5.8.23.3.n \n Build 1-4M-HUN6RY"
					+"\n \n (c) Copyright Phurushotham Shekar 2016 \n All Rights preserved"
					+"\n \n \n Visit: http://www.latlmes.com/world/your-sensational-news-article-headline-1"
					+"\n Education For Me  \n Super Ez Pz Java Course"
					,"Menu Item Click",JOptionPane.INFORMATION_MESSAGE);
		}
		
		else if (e.getActionCommand().equals("Exit"))
		{
			System.exit(0);
		}
		
		else if (e.getActionCommand().equals("New Order"))
		{
			in4_5.setSelected(true);
			GB2.setSelected(true);
			mAh2k.setSelected(true);
			Black.setSelected(true);
			GB16.setSelected(true);
			
			kboard.setSelected(false);
			gamepad.setSelected(false);
			microSD.setSelected(false);
			
			hPhones.setText("");
			Battery.setText("");
			pBank.setText("");
			name.setText("");
			address.setText("");
			city.setText("");
		}
		else if (e.getActionCommand().equals("Save Order"))
		{
	 String order = "Phone Order \n"+
					"=================\n"+
					"Screen Size: \n";
	 		if(in4_5.isSelected())
	 			order+= "\t 4.5 inch screen. \n";
	 		else if(in5.isSelected())
	 			order+= "\t 5 inch screen. \n";
	 		else if(in5_5.isSelected())
	 			order+= "\t 5.5 inch screen. \n";
	 		else
	 			JOptionPane.showMessageDialog(frame, "You Must Select a Screen Size!","Screen Size error",JOptionPane.ERROR_MESSAGE);
	 		order+="RAM Size: \n";
	 		if(GB2.isSelected())
	 			order+= "\t 2 GB RAM. \n";
	 		else if(GB3.isSelected())
	 			order+= "\t 3 GB RAM. \n";
	 		else if(GB4.isSelected())
	 			order+= "\t 4 GB RAM. \n";
	 		else
	 			JOptionPane.showMessageDialog(frame, "You Must Select a RAM size!","RAM Size error",JOptionPane.ERROR_MESSAGE);
	 		
	 		order+="Battery Size: \n";
	 		if(mAh2k.isSelected())
	 			order+= "\t 2000 mAh Battery. \n";
	 		else if(mAh3k.isSelected())
	 			order+= "\t 3000 mAh Battery. \n";
	 		else if(mAh3_5k.isSelected())
	 			order+= "\t 3500 mAh Battery. \n";
	 		else if(mAh4k.isSelected())
	 			order+= "\t 4000 mAh Battery. \n";
	 		else
	 			JOptionPane.showMessageDialog(frame, "You Must Select a Battery Size!","Battery Size error",JOptionPane.ERROR_MESSAGE);
	 		
	 		order+="Color: \n";
	 		if(Black.isSelected())
	 			order+= "\t Black. \n";
	 		else if(Blue.isSelected())
	 			order+= "\t Blue. \n";
	 		else if(Gold.isSelected())
	 			order+= "\t Gold. \n";
	 		else if(Red.isSelected())
	 			order+= "\t Red. \n";
	 		else if(Silver.isSelected())
	 			order+= "\t Silver. \n";
	 		else if(White.isSelected())
	 			order+= "\t White. \n";
	 		else
	 			JOptionPane.showMessageDialog(frame, "You Must Select a Color!","Color error",JOptionPane.ERROR_MESSAGE);
	 		
	 		order+="Storage Space: \n";
	 		if(GB16.isSelected())
	 			order+= "\t 16 GB Storage. \n";
	 		else if(GB32.isSelected())
	 			order+= "\t 32 GB Storage. \n";
	 		else if(GB64.isSelected())
	 			order+= "\t 64 GB Storage. \n";
	 		else
	 			JOptionPane.showMessageDialog(frame, "You Must Select a Storage size!","Storage Size error",JOptionPane.ERROR_MESSAGE);
	 		
	 		order+="Addons: \n";
	 		//kboard,gamepad,microSD
	 		if(kboard.isSelected())
	 			order+= "\t Keyboard. \n";
	 		if(gamepad.isSelected())
	 			order+="\t Game Pad. \n";
	 		if(microSD.isSelected())
	 			order+="\t MicroSD Card (64GB). \n";
	 		
	 		//hPhones,Battery,pBank
	 		int hp=0,bat=0,pb=0;
	 		
	 		try
	 		{
	 			if(!hPhones.getText().isEmpty())
	 				hp = Integer.parseInt(hPhones.getText());
	 			if(!Battery.getText().isEmpty())
	 				bat = Integer.parseInt(Battery.getText());
	 			if(!pBank.getText().isEmpty())
	 				pb = Integer.parseInt(pBank.getText());
	 		}
	 		catch(NumberFormatException nfe)
	 		{
	 			JOptionPane.showMessageDialog(frame, "Accessory entries must be whole number", "Accessory Order Error", JOptionPane.ERROR_MESSAGE);
	 		}
	 		if(hp>0||bat>0||pb>0)
	 		{
	 			order+="Accessories: \n";
	 			if(hp>0)
	 				order+="\t "+hp+" Headphones \n";
	 			if(bat>0)
	 				order+="\t "+bat+" Screen Protector \n";
	 			if(pb>0)
	 				order+="\t "+pb+" Phone Cases \n";
	 		}
	 		
	 		if(name.getText().isEmpty()|| address.getText().isEmpty() ||city.getText().isEmpty())
	 		{
	 			JOptionPane.showMessageDialog(frame,"Address Fields shouldn't be empty", "Address Error", JOptionPane.ERROR_MESSAGE);
	 		}
	 		else
	 		{
	 			order+="Deliver To: \n";
	 			order+="\t "+name.getText()+"\n";
	 			order+="\t "+address.getText()+"\n";
	 			order+="\t "+city.getText()+"\n";
	 		}
	 			order+="\n *~*~*~* END OF ORDER, THANKS FOR YOUR PURCHASE. *~*~*~* \n";
	 			
	 		try
	 		{
				//THIS PART WHERE IT TRIES TO PRINT STUFF, and when i use the ctrl+s command which is supposed
				//save/print it, it does nothing.
	 			JFileChooser oFile = new JFileChooser();
				//soFile.showSaveDialog(null);
				BufferedWriter orders = new BufferedWriter(new FileWriter(oFile.getSelectedFile().getAbsoluteFile()));
	 			//PrintStream oFile = new PrintStream("PhoneOrder.txt");
	 			orders.write(order);
	 			orders.close();
	 		}
	 		catch(IOException ioe)
	 		{
	 			ioe.printStackTrace();
	 			System.out.println("\n *~*~*~* I/O ERROR *~*~*~* \n"+ ioe);
	 		}
		}
	}
}

