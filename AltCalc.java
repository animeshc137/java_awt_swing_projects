import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
//import javax.swing.plaf.metal.*;
class MyFrame extends JFrame{
	void setTitleAndImage(String title, String img){
		this.setTitle(title);
		Toolkit t = Toolkit.getDefaultToolkit();
		Image I = t.getImage(img);
		this.setIconImage(I);
	}

}
class listener extends MouseAdapter{
	JButton b[];
	JTextField t;
	double a,c;
	static int x;
	listener(JButton b[], JTextField t){
		this.b= b;
		this.t = t;
	}
	public void mouseClicked(MouseEvent e){
		JButton bt = (JButton)e.getSource();
		if(b[0]== bt){
			a = Double.parseDouble(t.getText());
			t.setText("");
			t.grabFocus();
			x=0;
		}

		if(b[1]== bt){
			a = Double.parseDouble(t.getText());
			t.setText("");
			t.grabFocus();
			x=1;
		}
		if(b[2]== bt){
			a = Double.parseDouble(t.getText());
			t.setText("");
			t.grabFocus();
			x=2;
		}
		if(b[3]== bt){
			a = Double.parseDouble(t.getText());
			t.setText("");
			t.grabFocus();
			x=3;
		}
		if(b[4]== bt){
			t.grabFocus();
			c = Double.parseDouble(t.getText());
			switch(x){
				case 0: t.setText(Double.toString(a+c));
						break;
				case 1: t.setText(Double.toString(a-c));
						break;
				case 2: t.setText(Double.toString(a*c));
						break;
				case 3:
						if(c!=0)
						t.setText(Double.toString(a/c));
						else
						t.setText("N.D.");
						break;
			}
		}
		if(b[5]==bt)
		{
			t.setText(t.getText()+"0");
		}
		if(b[6]==bt)
		{
			t.setText(t.getText()+"1");
		}
		if(b[7]==bt)
		{
			t.setText(t.getText()+"2");
		}
		if(b[8]==bt)
		{
			t.setText(t.getText()+"3");
		}
		if(b[9]==bt)
		{
			t.setText(t.getText()+"4");
		}
		if(b[10]==bt)
		{
			t.setText(t.getText()+"5");
		}
		if(b[11]==bt)
		{
			t.setText(t.getText()+"6");
		}
		if(b[12]==bt)
		{
			t.setText(t.getText()+"7");
		}
		if(b[13]==bt)
		{
			t.setText(t.getText()+"8");
		}
		if(b[14]==bt)
		{
			t.setText(t.getText()+"9");
		}

	}
}
class AltCalc{
	public static void main(String args[]){
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception e){}
		MyFrame f = new MyFrame();
		f.setTitleAndImage("Simple Calculator","./logo2.jpg");
		JPanel p = new JPanel(new GridLayout(3,4));
		JTextField t1 = new JTextField();
		t1.setBounds(50,40,200,40);
		t1.setFont(new Font("Serif",Font.PLAIN,35));
		JLabel temp = new JLabel();
		JButton b[] = new JButton[15];
		b[0] = new JButton("+");
		b[1] = new JButton("-");
		b[2] = new JButton("×");
		b[3] = new JButton("/");
		b[4] = new JButton("=");
		for(int i =5; i<15;++i)
			b[i] = new JButton(Integer.toString(i-5));
		Font font = new Font("Cambria Math",Font.PLAIN,40);

		listener l = new listener(b,t1);
		for( int i=0; i<15; ++i){
			b[i].setFont(font);
			b[i].addMouseListener(l);
			p.add(b[i]);
		}

	//	GridLayout layout = new GridLayout(2,1);
	//	layout.setVgap(45);
		f.add(t1,BorderLayout.PAGE_START);
		f.add(p,BorderLayout.CENTER);
		f.setLocation(574,230);
		f.setSize(450,400);
		//f.setLayout(BorderLayout);
		f.setVisible(true);

	}

}

