package game;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class RockPaperSissorsGame extends JFrame {
	static final int SISSORS = 0;
	static final int ROCK = 1;
	static final int PAPER = 2;
	JButton startBtn;
	int coin =0;
	int userWin =0;
	int comWin = 0;
	JLabel coinVal;
	JLabel userWinVal;
	JLabel comWinVal;
	
	public RockPaperSissorsGame() {
		setTitle("가위 바위 보 게임");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(600,600);
		Container cont = getContentPane();
		cont.setLayout(new BorderLayout());
		
		/*프로그램 header 디자인 구현*/
		JPanel header = new JPanel();
		header.setLayout(new FlowLayout());
		startBtn = new JButton("START");
		JButton exitBtn = new JButton("EXIT");
		JLabel coinLa = new JLabel("코인 : ");
		coinVal = new JLabel(Integer.toString(coin));
		JLabel resultVal = new JLabel("COM  VS  USER =>");
		userWinVal = new JLabel(Integer.toString(userWin));
		comWinVal = new JLabel(Integer.toString(comWin));
		header.add(startBtn);
		header.add(exitBtn);
		header.add(coinLa);
		header.add(coinVal);
		header.add(resultVal);
		header.add(userWinVal);
		JLabel vs = new JLabel(":");
		header.add(vs);
		header.add(comWinVal);
		header.setBackground(Color.BLACK);
		for(int i =2; i<header.getComponentCount(); i++) {
			header.getComponent(i).setFont(new Font("Dialog",Font.BOLD,20));
			header.getComponent(i).setForeground(Color.WHITE);
		}
		//header 끝!
		
		/*프로그램 body 디자인 구현*/
		JImagePanel body = new JImagePanel();
		body.setBackground(Color.LIGHT_GRAY);
		//body 끝!
		
		/*프로그램 footer 구현*/
			JPanel footer = new JPanel();
			JLabel gameRule = new JLabel("가위 : 0 바위 : 1 보 : 2 ");
			gameRule.setFont(new Font("Dialog",Font.BOLD,30));
			footer.setBackground(Color.black);
			gameRule.setForeground(Color.WHITE);
			footer.add(gameRule);
		//footer 끝!
		
		//header startBtn Action EventListener 등록
			
		//header exitBtn ActionEventListener 등록
		 exitBtn.addActionListener(new ActionListener() {
			 @Override
			public void actionPerformed(ActionEvent e) {
				 System.exit(1);
			}
		 });
		
		
		
		cont.add(header,BorderLayout.NORTH);
		cont.add(body,BorderLayout.CENTER);
		cont.add(footer,BorderLayout.SOUTH);
	}//생성자 끝!
	
	public static void main(String[] args) {
		new RockPaperSissorsGame();
	}//main() 끝!
}//RockPaperSissorsGame class 끝!!

class JImagePanel extends JPanel{
	
}