
public class Pattern48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		for(int i=1;i<=n;i++) {
			int num =n;
			for(int j=i;j<n;j++)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print(num++ -i+1);
			for(int j=1;j<i;j++)
				System.out.print(--num -i);
			System.out.println();
		}


	}

}
