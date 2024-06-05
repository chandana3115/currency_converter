package currency;
import java.util.*;
public class cc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s=0;
		while(s==0) {
			System.out.println("\n1.USD\n2.EUR\n3.AUD\n4.INR");
			System.out.println("Enter choice :");
			int a=sc.nextInt();
			if(a==1) {
				System.out.println("Enter Amount :");
				double e=sc.nextDouble();
				double c=0;
				System.out.println("1.USD\n2.EUR\n3.AUD\n4.INR");
				System.out.println("Enter a choice to change currency :");
				int b=sc.nextInt();
				for(int i=0;i<40;i++) {
					System.out.print("-");
				}System.out.println();
				if(b==2) {
					System.out.println(e+" USD changes to "+Math.round((e/0.92)*100.0)/100.0+" EUR");
				}else if(b==3) {
					System.out.println(e+" USD changes to "+Math.round((e/1.46)*100.0)/100.0+" AUD");
				}else if(b==4) {
					System.out.println(e+" USD changes to "+Math.round((e/0.82)*100.0)/100.0+" INR");
				}else {
					System.out.println("Enter Valid choice");
				}
				for(int i=0;i<40;i++) {
					System.out.print("-");
				}System.out.println();
			}
			else if(a==2) {
				System.out.println("Enter Amount :");
				double e=sc.nextDouble();
				double c=0;
				System.out.println("1.USD\n2.EUR\n3.AUD\n4.INR");
				System.out.println("Enter a choice to change currency :");
				int b=sc.nextInt();
				for(int i=0;i<40;i++) {
					System.out.print("-");
				}System.out.println();
				if(b==1) {
					System.out.println(e+" EUR changes to "+Math.round((e/1.09)*100.0)/100.0+" USD");
				}else if(b==3) {
					System.out.println(e+" EUR changes to "+Math.round((e/1.58)*100.0)/100.0+" AUD");
				}else if(b==4) {
					System.out.println(e+" EUR changes to "+Math.round((e/0.89)*100.0)/100.0+" INR");
				}else {
					System.out.println("Enter Valid choice");
				}
				for(int i=0;i<40;i++) {
					System.out.print("-");
				}System.out.println();
			}
			else if(a==3) {
				System.out.println("Enter Amount :");
				double e=sc.nextDouble();
				double c=0;
				System.out.println("1.USD\n2.EUR\n3.AUD\n4.INR");
				System.out.println("Enter a choice to change currency :");
				int b=sc.nextInt();
				for(int i=0;i<40;i++) {
					System.out.print("-");
				}System.out.println();
				if(b==1) {
					System.out.println(e+" AUD changes to "+Math.round((e/0.68)*100.0)/100.0+" USD");
				}else if(b==2) {
					System.out.println(e+" AUD changes to "+Math.round((e/0.63)*100.0)/100.0+" EUR");
				}else if(b==4) {
					System.out.println(e+" AUD changes to "+Math.round((e/0.54)*100.0)/100.0+" INR");
				}else {
					System.out.println("Enter Valid choice");
				}
				for(int i=0;i<40;i++) {
					System.out.print("-");
				}System.out.println();
			}else if(a==4) {
				System.out.println("Enter Amount :");
				double e=sc.nextDouble();
				double c=0;
				System.out.println("1.USD\n2.EUR\n3.AUD\n4.INR");
				System.out.println("Enter a choice to change currency :");
				int b=sc.nextInt();
				for(int i=0;i<40;i++) {
					System.out.print("-");
				}System.out.println();
				if(b==1) {
					System.out.println(e+" INR changes to "+Math.round((e*0.82)*100.0)/100.0+" USD");
				}else if(b==3) {
					System.out.println(e+" INR changes to "+Math.round((e*0.54)*100.0)/100.0+" AUD");
				}else if(b==2) {
					System.out.println(e+" INR changes to "+Math.round((e*0.89)*100.0)/100.0+" EUR");
				}else {
					System.out.println("Enter Valid choice");
				}
				for(int i=0;i<40;i++) {
					System.out.print("-");
				}System.out.println();
			}else {
				a=1;
				for(int i=0;i<40;i++) {
					System.out.print("-");
				}System.out.println();
				System.out.println("Enter valid choice");
			}
		}
	}

}
