import java.awt.*;
class MyFrame extends Frame{
	void setTitleAndImage(String Title, String Img){
		this.setTitle(Title);
		Toolkit t = Toolkit.getDefaultToolkit();
		Image I = getImage(Img);
		this.setIconImage(I);
	}
}
class Demo{
	public static void main(){
		MyFrame f = new MyFrame();
		f.setTitleAndImage("First AWT","./logo.png");
		f.setSize(600,400);
		f.setVisible(true);
	}
}