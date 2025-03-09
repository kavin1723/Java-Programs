
public class Find_maximum_of_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10, num2=20, num3=25, max;
		max = (num1 > num2)? (num1 > num3 ? num1 : num3): (num2 > num3 ? num2 : num3);
		System.out.println("Max of "+num1+", "+num2+", and "+num3+"is: "+max);
	}

}
