import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame{
	void setTitleAndImage(String Title, String Img){
		this.setTitle(Title);
		Toolkit t = Toolkit.getDefaultToolkit();
		Image I = t.getImage(Img);
		this.setIconImage(I);
	}
}
class Blistener extends MouseAdapter{
	Button b1, b2;

	boolean t = false;
	Blistener( Button b1, Button b2){
		this.b1 = b1;
		this.b2 = b2;
	}
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == b1){
	        MyFrame f = new MyFrame();
			f.setTitleAndImage("Log In Page","./logo1.png");
			Label l = new Label("Logged in Sucessfully!");
			l.setBounds(100,80,120,20);
			f.add(l);
			f.setLocation(604,260);
			f.setSize(300,200);
			f.setLayout(null);
			f.setVisible(true);
		}
		else if(e.getSource() == b2){
			MyFrame f = new MyFrame();
			f.setTitleAndImage("Sign up form","./logo1.png");
			Label l1 = new Label("First name:");
			l1.setBounds(30,50,100,20);
			Label l2 = new Label("Last name:");
			l2.setBounds(30,80,100,20);
			Label l3 = new Label("E-mail:");
			l3.setBounds(30,110,100,20);
			Label l4 = new Label("Password:");
			l4.setBounds(30,140,100,20);
			Label l5 = new Label("Confirm password:");
			l5.setBounds(30,170,100,20);
			Label l6 = new Label("Select Country:");
			l6.setBounds(30,200,100,20);
			Button b = new Button("Submit");
			b.setBounds(115,255,70,20);
			List l = new List(8, true);
			  l.add("India");
			  l.add("Pakistan");
			  l.add("China");
			  l.add("Nepal");
			  l.add("Japan");
			  l.add("S. Korea");
			  l.add("Other");
			  l.setBounds(130,200,150,50);
			  f.add(l);
  			l.setBackground(Color.lightGray);
			 b.addMouseListener(
					new MouseAdapter(){
						public void mouseClicked(MouseEvent e){
			 				Label lx = new Label("Sign up Sucessful!");
			 				lx.setBounds(100,275,100,20);
			 				f.add(lx);
						}
					}
			);
			TextField t1 = new TextField();
			t1.setBounds(130,50,150,20);
			TextField t2 = new TextField();
			t2.setBounds(130,80,150,20);
			TextField t3 = new TextField();
			t3.setBounds(130,110,150,20);
			TextField t4 = new TextField();
			t4.setBounds(130,140,150,20);
			TextField t5 = new TextField();
			t5.setBounds(130,170,150,20);
			f.add(l1);
			f.add(l2);
			f.add(l3);
			f.add(l4);
			f.add(l5);
			f.add(l6);
			f.add(t1);
			f.add(t2);
			f.add(t3);
			f.add(t4);
			f.add(t5);
			f.add(b);
			f.setSize(320,320);
			f.setLocation(604,260);
			f.setLayout(null);
			f.setVisible(true);
		}
	}

}
class Demo{
	public static void main(String args[]){
		MyFrame f = new MyFrame();
		f.setTitleAndImage("First AWT","./logo1.png");
		Label l1 = new Label("Username:");
		l1.setBounds(30,50,100,20);
		f.add(l1);
		TextField t1 = new TextField();
		t1.setBounds(130,50,100,20);
		f.add(t1);
		Label l2 = new Label("Password:");
		l2.setBounds(30,80,100,20);
		f.add(l2);
		TextField t2 = new TextField();
		t2.setBounds(130,80,100,20);
		t2.setEchoChar('*');
		f.add(t2);
		Button b1 = new Button("LogIn");
		Button b2 = new Button("SignUp");
		Blistener bt = new Blistener(b1,b2);
		b1.addMouseListener(bt);
		b1.setBounds(40,120,70,20);
		f.add(b1);
		b2.addMouseListener(bt);
		b2.setBounds(140,120,70,20);
		f.add(b2);
		f.setLocation(604,260);
		f.setSize(300,200);
		f.setLayout(null);
		f.setVisible(true);
	}
}