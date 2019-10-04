package øº ‘œµÕ≥;

public class main {

	public static void main(String[] args) {
		int i,j;
		math a = new math();
		for(i=0;i<50;i++){
			while(a.g<0){
				a.number();
			}
			System.out.print(a.a);
			System.out.print(a.symbol[a.d]);
			System.out.print(a.b);
			System.out.print(a.symbol[a.e]);
			System.out.println(a.c);
			a.key[i] = a.g;
			a.g=-1;
		}
		for(j=0;j<50;j++){
			System.out.println(a.key[j]);
		}
		time.countdown();

	}

}
