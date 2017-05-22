import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class base {
	base(){
		Dimension dim = new Dimension(800,500);
		
		JFrame frame = new JFrame("abcd");
		frame.setLocation(300,400);
		frame.setPreferredSize(dim);
		
		// 메뉴바구현
		JMenuBar MenuBar = new JMenuBar();
		MenuBar.setLayout(new BoxLayout(MenuBar,BoxLayout.X_AXIS));
			
		JMenu filemenu = new JMenu("파일(F)");
		filemenu.setMnemonic('F');
			
		JMenuItem newfile = new JMenuItem("새파일(N)");
		newfile.setMnemonic('N');
		filemenu.add(newfile);
			
		JMenuItem close = new JMenuItem("닫기(C)");
		close.setMnemonic('C');
		filemenu.add(close);
			
		MenuBar.add(filemenu);
		
		/*ActionListener action = new ActionListener();{
			public void actionPerformed(ActionEvent e){
				Object obj = e.getSource();
				if(obj == newfile){
					JOptionPane.showMessageDialog("새로운 파일 생성",JOptionPane.INFORMATION_MESSAGE);
				}
				else if(obj == close){
					System.exit(1);
				}
			}
		}
		
		newfile.addActionListener(action);
		close.addActionListener(action);
		*/
		
		
		
		// 툴바구현
		JToolBar ToolBar = new JToolBar();
		ToolBar.setLayout(new BoxLayout(ToolBar,BoxLayout.X_AXIS));
		ToolBar.add(new JLabel("ToolBar"));
		
		// 속성/Editor패널구현
		JPanel PanelAttribute = new JPanel();
		PanelAttribute.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		PanelAttribute.add(new JLabel("Attribute Pane"));
		
		JPanel PanelEditor = new JPanel();
		PanelEditor.setLayout(new FlowLayout(FlowLayout.RIGHT,30,40));
		PanelEditor.add(new JLabel("Editor Pane"));
		
		// 메인패널 구현(Frame위에 메뉴바,툴바,패널들 표시하기 위함)
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
	
	public static void main(String[] args){
		base Base = new base();		
	}
}


