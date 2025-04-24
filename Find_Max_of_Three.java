public class Find_Max_of_Three {
    public static void main(String args[]){
        int num1=10, num2 = 37, num3 = 4, max;
        max = (num1 > num2)? (num1 > num3 ? num1 : num3): (num2 > num3 ? num2 : num3);
        System.out.println("Max is:"+max);
    }
    
}
