package breakpointtest;

public class test {

	static int use(int y){
		y++;
		System.out.println(y);
		return y;
	}
	
	public static void main(String[] args) {
		
     int y=1;
    for (int i = 0; i < 5; i++) {
    	use(y);
	}
	
	}

}
