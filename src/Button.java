import javax.swing.JButton;


public class Button extends JButton{

		public int identificador;
	public Button(int x) {
		// TODO Auto-generated constructor stub
		identificador=x;
		
	}
	
	public int getId()
	{
		return identificador;
	}

}
