import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TicTacToe{

	public static void main(String args[]){
		JPanel p = create();
		JPanel p2 = create();

		JFrame jf = new JFrame("TicTacToe");
		ImageIcon I = new ImageIcon("./ttt.png");
		jf.setIconImage(I.getImage());
		jf.setBounds(200,200,400,400);
		jf.setVisible(true);
		jf.add(p2);
		jf.add(p);



	}
	public static JPanel create(){
			boolean o[] = new boolean[9];
			boolean x[] = new boolean[9];
			for(int k=0; k<9; ++k){
				 o[k] = false;
				 x[k] = false;
		 }
			JPanel f = new JPanel();
					GridLayout grid = new GridLayout(3,3);
					Font font = new Font ("San Serif",Font.PLAIN,100);

					JButton b[] = new JButton[9];
					String s[] = {"O","X"};
					f.setLayout(grid);
					listener l = new listener(s,b,f,o,x);
					for(int i = 0; i<b.length; ++i)
						{
							b[i] = new JButton();
							b[i].setBackground(Color.lightGray);
							b[i].setFont(font);
							f.add(b[i]);
							b[i].addMouseListener(l);
						}
					return f;
				}
	 static void checkWin(JPanel F,boolean o[], boolean x[]){

		JFrame f2 = new JFrame();
		JPanel p = new JPanel();
		JLabel l = new JLabel();
		f2.setBounds(200,200,400,400);
		p.add(l);

		if((o[0]== true && o[1]== true && o[2]== true) || (o[3]== true && o[4]== true && o[5]== true) || (o[6]== true && o[7]== true && o[8]== true)
		|| (o[1]== true && o[4]== true && o[7]== true) || (o[0]== true && o[3]== true && o[6]== true) || (o[2]== true && o[5]== true && o[8]== true)
		|| (o[0]== true && o[4]== true && o[8]== true) || (o[2]== true && o[4]== true && o[6]== true)){
			System.out.print(" O Wins!");
			l.setText("O WIns!");
			f2.add(p,BorderLayout.CENTER);
			f2.setVisible(true);

		}
		if((x[0]== true && x[1]== true && x[2]== true) || (x[3]== true && x[4]== true && x[5]== true) || (x[6]== true && x[7]== true && x[8]== true)
		|| (x[1]== true && x[4]== true && x[7]== true) || (x[0]== true && x[3]== true && x[6]== true) || (x[2]== true && x[5]== true && x[8]== true)
		|| (x[0]== true && x[4]== true && x[8]== true) || (x[2]== true && x[4]== true && x[6]== true)){
					System.out.print("X Wins!");
					//F.dispose();
					l.setText("X WIns!");
					f2.add(p,BorderLayout.CENTER);
					f2.setVisible(true);
		}

	}

}

class listener extends MouseAdapter{
	String st[];
	boolean x[];
	boolean o[];
	static int l=0,xcount=0,ocount=0;
	JButton B[];
	JPanel f;
	listener(String s[], JButton B[], JPanel f,boolean o[],boolean x[]){
		this.st = s;
		this.o = o;
		this.x = x;
		this.B = B;
		f = this.f;
	}
	public void mouseClicked(MouseEvent e){
		JButton b =(JButton)e.getSource();
		b.setText(st[l%2]);
		for(int i = 0; i<9; ++i){
			if(B[i]==(JButton)e.getSource()){
				if(l%2 == 0)
					o[i] = true;
				if(l%2 == 1)
					x[i] = true;
			}
		}
		l++;
		//System.out.print(l);
		TicTacToe.checkWin(f,o,x);
	}

}