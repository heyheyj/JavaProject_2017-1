import javax.swing.*;
import java.awt.*;

public class base {
	public static void main(String[] args){
		Dimension dim = new Dimension(800,500);
		
		JFrame frame = new JFrame("abcd");
		frame.setLocation(300,400);
		frame.setPreferredSize(dim);
		
		JMenuBar MenuBar = new JMenuBar();
		MenuBar.setLayout(new BoxLayout(MenuBar,BoxLayout.X_AXIS));
		MenuBar.add(new JLabel("MenuBar"));
		
		JToolBar ToolBar = new JToolBar();
		ToolBar.setLayout(new BoxLayout(ToolBar,BoxLayout.X_AXIS));
		ToolBar.add(new JLabel("ToolBar"));
		
		JPanel PanelAttribute = new JPanel();
		PanelAttribute.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		PanelAttribute.add(new JLabel("Attribute Pane"));
		
		JPanel PanelEditor = new JPanel();
		PanelEditor.setLayout(new FlowLayout(FlowLayout.RIGHT,30,40));
		PanelEditor.add(new JLabel("Editor Pane"));
		
		
	
		JPanel Mainpanel = new JPanel();
		Mainpanel.setLayout(new BoxLayout(Mainpanel, BoxLayout.Y_AXIS));
		Mainpanel.add(MenuBar);
		Mainpanel.add(ToolBar);
		Mainpanel.add(PanelAttribute);
		Mainpanel.add(PanelEditor);
		
		
		frame.add(Mainpanel);
		frame.pack();
		frame.setVisible(true);
	
	}
}


