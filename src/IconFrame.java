import javax.swing.*;

public class IconFrame extends JFrame {
	
	JButton load, save, subscribe, unsubscribe;

	public IconFrame()
	{
		super("Icon Frame");
		// setSize(340, 170);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		// Create icons
		ImageIcon loadIcon = new ImageIcon("load.gif");
		ImageIcon saveIcon = new ImageIcon("save.gif");
		ImageIcon subscribeIcon = new ImageIcon("subscribe.gif");
		ImageIcon unsubscribeIcon = new ImageIcon("unsubscribe.gif");
		
		// Create buttons
		load = new JButton("Load", loadIcon);
		save = new JButton("Save", saveIcon);
		subscribe = new JButton("Subscribe", subscribeIcon);
		unsubscribe = new JButton("Unsubscribe", unsubscribeIcon);
		
		// Add buttons to panel
		panel.add(load);
		panel.add(save);
		panel.add(subscribe);
		panel.add(unsubscribe);
		
		// add the panel to the frame
		add(panel);
		pack();	
		setVisible(true);
	}
	
	
	private static void setLookAndFeel()
	{
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch(Exception exc)
		{
			System.out.println("Error: " + exc.getMessage());
		}
	}
	
	
	public static void main(String[] args) 
	{
		setLookAndFeel();
		IconFrame ike = new IconFrame();
	}
}
