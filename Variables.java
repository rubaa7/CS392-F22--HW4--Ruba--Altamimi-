package variables;

public class Variables {

    public static void main(String[] args) {
        
		int x;
		int y;
	    int add;
        
        x = 10;
        y = 5;
        
        //2147483647
        //-2147483648
        add= x+y;
        System.out.println(add);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
    }
}
