package santhi.java;

public class Santhinew {
public static void main (String args[]){
int x=90,y=30,z=100;
	

if(x>y && x>z)//* Here it is checking the condition 
	          //*we have given x value ,x is greater than y  but not z so it goes to else if statement
{
   System.out.println("the highest numberis:"+x);
} 
else if(y>x && y>z)//* it checks here and y value is is less than x and z so it comes to the next condition   
{
    System.out.println("the highest numberis:"+y);
    
}
else if(z>x && z>y)//*and this condition is true and it prints the z value
{
	System.out.println("the highest numberis:"+z);
}
else
{
	System.out.println("the are not distict");//* if we initialize the same values it gives this output//
	//*the output will be the z value
}

}
}
