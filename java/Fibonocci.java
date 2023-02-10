



public class Fibonocci { //class name

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int num = 0,num2 = 1,sum = 0, count=11; //initialize the values

System.out.println(num + ""); //print first number
System.out.println(num2 + ""); //print second number

for (int i=1;i<=count;i++) { //iterating the values
	
sum= num + num2; //assigning values to sum

num = num2; //assigning values to num

num2= sum;  //assigning values to num2
System.out.println("The fibonocci series are");
System.out.println(sum); //print the final values

	}

}
}