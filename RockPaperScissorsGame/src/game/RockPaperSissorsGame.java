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
		setTitle("���� ���� �� ����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(600,600);
		Container cont = getContentPane();
		cont.setLayout(new BorderLayout());
		
		/*���α׷� header ������ ����*/
		JPanel header = new JPanel();
		header.setLayout(new FlowLayout());
		startBtn = new JButton("START");
		JButton exitBtn = new JButton("EXIT");
		JLabel coinLa = new JLabel("���� : ");
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
		//header ��!
		
		/*���α׷� body ������ ����*/
		JImagePanel body = new JImagePanel();
		body.setBackground(Color.LIGHT_GRAY);
		//body ��!
		
		/*���α׷� footer ����*/
			JPanel footer = new JPanel();
			JLabel gameRule = new JLabel("���� : 0 ���� : 1 �� : 2 ");
			gameRule.setFont(new Font("Dialog",Font.BOLD,30));
			footer.setBackground(Color.black);
			gameRule.setForeground(Color.WHITE);
			footer.add(gameRule);
		//footer ��!
		
		//header startBtn Action EventListener ���
			
		//header exitBtn ActionEventListener ���
		 exitBtn.addActionListener(new ActionListener() {
			 @Override
			public void actionPerformed(ActionEvent e) {
				 System.exit(1);
			}
		 });
		
		
		
		cont.add(header,BorderLayout.NORTH);
		cont.add(body,BorderLayout.CENTER);
		cont.add(footer,BorderLayout.SOUTH);
	}//������ ��!
	
	public static void main(String[] args) {
		new RockPaperSissorsGame();
	}//main() ��!
}//RockPaperSissorsGame class ��!!

class JImagePanel extends JPanel{
	
}