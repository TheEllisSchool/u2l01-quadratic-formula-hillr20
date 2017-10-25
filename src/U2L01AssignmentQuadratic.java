import javax.swing.JOptionPane;

//Ricarda Hill
//October 25, 2017
//U2L01 Assignemnt: Quadratic

//Write a method called quadratic 
public class U2L01AssignmentQuadratic {

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog(null, "Please enter a value for a");
		String num2 = JOptionPane.showInputDialog(null, "Please enter a value for b");
		String num3 = JOptionPane.showInputDialog(null, "Please enter a value for c");
		double a = Double.parseDouble(num1);
		double b = Double.parseDouble(num2);
		double c = Double.parseDouble(num3);
				
		//System.out.println(quadraticPos(1, -7, 12));
		//System.out.println(quadraticNeg(1, -7, 12));
		System.out.println(quadraticPos(a, b, c));
		System.out.println(quadraticNeg(a, b, c));

	}
	public static double quadraticPos(double a, double b, double c) {
		//check if real solutions?
		double root1 = ((b*-1) + Math.sqrt(b*b-4*a*c))/(2*a);
		return root1;
		
	}
	public static double quadraticNeg(double a, double b, double c) {
		Double root2 = ((b*-1) - Math.sqrt(b*b-4*a*c))/(2*a);
		return root2;	
	}
	
	//double a = JOptionPane.showConfirmDialog(null, "Please enter a value for a");
	//double b = JOptionPane.showConfirmDialog(null, "Please enter a value for b");
	//double c = JOptionPane.showConfirmDialog(null, "Please enter a value for c");
	//double d = JOptionPane.show

}
