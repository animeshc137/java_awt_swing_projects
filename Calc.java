import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame{
	void setTitleAndImage(String title, String img){
		this.setTitle(title);
		Toolkit t = Toolkit.getDefaultToolkit();
		Image I = t.getImage(img);
		this.setIconImage(I);
	}
}
class Calc{
	public static void main(String args[]){
		MyFrame f = new MyFrame();
		f.setTitleAndImage("Simple Calculator","./logo2.jpg");
		f.setLocation(604,260);
		f.setSize(300,250);
		f.setLayout(null);
		f.setVisible(true);
		TextField t1 = new TextField();
		t1.setBounds(50,40,200,20);
		TextField t2 = new TextField();
		t2.setBounds(50,80,200,20);
		TextField t3 = new TextField();
		t3.setBounds(50,120,200,20);
		Label equal = new Label("=");
		equal.setBounds(140,100,200,20);
		Label op = new Label(" ");
		op.setBounds(140,60,200,20);
		Button b1 = new Button("+");
		Button b2 = new Button("-");
		Button b3 = new Button("*");
		Button b4 = new Button("/");
		b1.addMouseListener(
			new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					double a=0,b=0;
					op.setText("+");
					a= Double.parseDouble(t1.getText());
					b= Double.parseDouble(t2.getText());
					t3.setText(String.valueOf((a+b)));
				}
			}
		);
		b1.setBounds(53,160,40,40);
		b2.addMouseListener(
					new MouseAdapter(){
						public void mouseClicked(MouseEvent e){
							double a=0,b=0;
							op.setText("-");
							a= Double.parseDouble(t1.getText());
							b= Double.parseDouble(t2.getText());
							t3.setText(String.valueOf((a-b)));
						}
					}
				);
		b2.setBounds(103,160,40,40);
		b3.addMouseListener(
					new MouseAdapter(){
						public void mouseClicked(MouseEvent e){
							double a=0,b=0;
							op.setText("*");
							a= Double.parseDouble(t1.getText());
							b= Double.parseDouble(t2.getText());
							t3.setText(String.valueOf((a*b)));
						}
					}
				);
		b3.setBounds(153,160,40,40);
		b4.addMouseListener(
					new MouseAdapter(){
						public void mouseClicked(MouseEvent e){
							double a=0,b=0;
							op.setText("/");
							a= Double.parseDouble(t1.getText());
							b= Double.parseDouble(t2.getText());
							if(b==0)
								t3.setText("Undefined");
							else
								t3.setText(String.valueOf((a/b)));
						}
					}
				);
		b4.setBounds(203,160,40,40);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(op);
		f.add(equal);
		f.add(t1);
		f.add(t2);
		f.add(t3);
	}
}

