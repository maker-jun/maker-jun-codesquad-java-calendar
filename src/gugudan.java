import java.util.Scanner;
public class gugudan {

	public static void main(String[] args) {

		gugudan g = new gugudan();
		g.gugu1(19);
		Scanner scan = new Scanner(System.in);
		String str= scan.nextLine();
		//int num=scan.nextInt();
	
		g.gugu2(str);
	}
	
	public void gugu1(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.println(i+" X "+j+" = "+i*j);
			}
		}
	}
	public void gugu2(String s) {
		String[] splitValue=s.split(",");
		int first = Integer.parseInt(splitValue[0]);
		int second = Integer.parseInt(splitValue[1]);
		for(int i=1;i<=first;i++) {
			for(int j=1;j<=second;j++) {
				System.out.println(i+" X "+j+" = "+i*j);
			}
		}
		
	}

}
