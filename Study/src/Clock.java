
public class Clock {

	public static void main(String[] args) {
		int H = 0;
		int M = 30;
		
		if(M < 45) {
			H = H-1;
			M = 60 - (45 - M);
			if(H==0);{
				H = 23;
			}
			System.out.println(H +" "+ M); 
		}
		else {
			M = M - 45;
			System.out.println(H +" "+ M); 
		}
		
	}
}
