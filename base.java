import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class base extends JFrame{
	JLabel la;
	base(){
		Dimension dim = new Dimension(1000,1000);
		setPreferredSize(dim);
		setLocation(10,0);
		setTitle("base");
		setVisible(true);
		setDefaultCloseOperation(base.EXIT_ON_CLOSE);
		
		// 메뉴바구현
		JMenuBar MenuBar = new JMenuBar();
			
		JMenu filemenu = new JMenu("파일(F)");
		filemenu.setMnemonic('F');
			
		JMenuItem newfile = new JMenuItem("새로 만들기(N)");
		newfile.setMnemonic('N');
		filemenu.add(newfile);
		newfile.addActionListener(new MenuListener());
		
		JMenuItem open = new JMenuItem("열기(O)");
		open.setMnemonic('O');
		filemenu.add(open);
		open.addActionListener(new MenuListener());
		
		JMenuItem save = new JMenuItem("저장(S)");
		save.setMnemonic('S');
		filemenu.add(save);
		save.addActionListener(new MenuListener());
		
		JMenuItem saveName = new JMenuItem("다른 이름으로 저장(A)");
		saveName.setMnemonic('A');
		filemenu.add(saveName);
		saveName.addActionListener(new MenuListener());
		
		JMenuItem newJava = new JMenuItem(".java파일 생성(J)");
		newJava.setMnemonic('J');
		filemenu.add(newJava);
		newJava.addActionListener(new MenuListener());
		
		JMenuItem close = new JMenuItem("닫기(C)");
		close.setMnemonic('C');
		filemenu.add(close);
		MenuBar.add(filemenu);
		close.addActionListener(new MenuListener());
		
		setJMenuBar(MenuBar);
		
		// 툴바구현
		JToolBar ToolBar = new JToolBar();
		ToolBar.add(new JButton("새로 만들기"));
		ToolBar.add(new JButton("열기"));
		ToolBar.add(new JButton("저장"));
		ToolBar.add(new JButton("다른 이름으로 저장"));
		ToolBar.add(new JButton(".java 파일 생성"));
		ToolBar.add(new JButton("닫기"));
		
		
		// 속성 패널구현
		JPanel PanelAttribute = new JPanel();
		PanelAttribute.setLayout(new GridLayout(7,2,0,5));
		
		PanelAttribute.add(new JLabel("시작 x 좌표 : "));
		JTextField startX = new JTextField("");
		PanelAttribute.add(startX);
		
		PanelAttribute.add(new JLabel("시작 y 좌표 : "));
		JTextField startY = new JTextField("");
		PanelAttribute.add(startY);
		
		PanelAttribute.add(new JLabel("너비 :" ));
		JTextField wide = new JTextField("");
		PanelAttribute.add(wide);
		
		PanelAttribute.add(new JLabel("높이 :" ));
		JTextField height = new JTextField("");
		PanelAttribute.add(height);
		
		PanelAttribute.add(new JLabel("텍스트 속성값 : "));
		JTextField txtAttr = new JTextField("");
		PanelAttribute.add(txtAttr);
		
		PanelAttribute.add(new JLabel("타입 : "));
		JComboBox compType = new JComboBox();
		compType.addItem("");
		PanelAttribute.add(compType);
		
		PanelAttribute.add(new JLabel("변수명 : "));
		JTextField compName = new JTextField("");
		PanelAttribute.add(compName);
		
		// editor 패널 구현
		JPanel PanelEditor = new JPanel();
		la = new JLabel("Editor Pane");
		PanelEditor.add(la);
		PanelEditor.addMouseListener(new EditorListener());
		
		//frame 전체를 BorderLayout으로 설정
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.add(ToolBar, BorderLayout.NORTH);
		contentPane.add(PanelAttribute,BorderLayout.WEST);
		contentPane.add(PanelEditor,BorderLayout.CENTER);
		pack();
	}
	
	
	private class MenuListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand() == "닫기(C)")
				System.exit(1);
		}
	}
	private class ToolbarListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			if(b.getText().equals("닫기"))
				System.exit(1);
		}
		
	}
	private class AttrListener1 implements TextListener{
		@Override
		public void textValueChanged(TextEvent arg0) {
			
		}
	}
	private class AttrListener2 implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent arg0) {

		}
		
	}
	private class EditorListener extends MouseAdapter{

		@Override
		public void mouseClicked(MouseEvent e) {
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {

		}

		@Override
		public void mouseExited(MouseEvent arg0) {

		}

		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x,y);
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {

		}
		
	}
	public static void main(String[] args){
		new base();	
	}
}
