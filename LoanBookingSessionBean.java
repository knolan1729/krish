import java.util.Scanner;  
import java.lang.Math;  
import java.io.printer; 

//calculates and prints the values for pattern  
System.out.print(Math.max(Math.abs(i - n), Math.abs(j - n)) + 1 + " ");  
}  
System.out.println();  
}  
}  
//driver code  
public static void main(String args[])  
{  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the value of n: ");  
int n = sc.nextInt();  
System.out.println();  
//function calling  
printPattern(n);  
}  
}  
