	import java.util.Scanner;
	
	
	public class IntToEng {
		// メインメソッド
	
	    public static void main
	    (String[] args) {
	    	for(;;){
	    	System.out.print("入力：");
	        Scanner sc = new Scanner(System.in);
	
	        int input = sc.nextInt();
	       
	        System.out.print("出力：");
	        System.out.println(translateEng(input));
	    	}
	    }
	
	    // 数値を英訳する変換するメソッド
	
	    static String translateEng(int n) {

	    	String[] a={"zero","one","two","three","four","five","six","seven","eight","night","ten",
	    			"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	    	String[] b={"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
	    	
	    	if(n<=19){
	    	return a[n];
	}
	if(n>=20&&n<=99){
		String n1=String.valueOf(n);
		n1.substring(1,2);
	        return b[n-2];
	}
	 return " ";   
	    }
	}
