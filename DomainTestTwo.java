package practice;

import java.util.Scanner;

public class DomainTestTwo {

	public static void main(String[] args) {

		int a, b, c;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		int[] array = { a, b, c };
		boolean first = true;
		int k;
		   for (int p = 0; p < 3; p++) {
			  int q = array[p];
			   int r = q + 1;
			   for (int i = 1; i<=q; i++) 
				{
					if(!first)
						{
						   System.out.println();	
					      }
					first = false;
					System.out.format("%" + r + "s", " ");
					for (int j = 1; j <= i; j++) {
						k = i;
						System.out.format("%" + 1 + "s", " ");
						System.out.print(k);
					}
					r--;
				}
			}
		}

	}


