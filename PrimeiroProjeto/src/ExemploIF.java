import javax.swing.JOptionPane;

public class ExemploIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		int y = 5;
		
		if( x > y ) {
			JOptionPane.showMessageDialog(null,
					x + " � a maior que " + y);
		} else if ( x < y ) {
			JOptionPane.showMessageDialog(null,
					x + "� menor que " + y);
		} else {
			JOptionPane.showMessageDialog(null,
					x + "� igual a " + y);
		}

	}

}
