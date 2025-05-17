import java.awt.*;
import java.applet.*;



public class Library extends Applet
{
	public void init( )
	{
		Label lblName = new Label("Enter your name");
		Label lblbook = new Label("Enter the book you want to borrow");
		Label lblPasswd = new Label("Enter password");
		Label lblbookr = new Label("Enter the book you want to return");
		TextField txtName = new TextField(20);
		TextField txtPasswd = new TextField(20);
		TextField txtbook = new TextField(12);
		TextField txtbookr = new TextField(12);
		add(lblName);                
		add(txtName); 
		add(lblPasswd);                
		txtPasswd.setEchoChar('*');
		add(txtPasswd);
		add(lblbook);
		add(txtbook);           
		add(lblbookr);
		add(txtbookr);                        
   		Button b=new Button("Login");  
    		b.setBounds(100,100,80,30);  
    		add(b);               
	}
}

