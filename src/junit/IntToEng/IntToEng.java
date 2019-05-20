	package junit.IntToEng;
    import java.util.Scanner;
	
	public class IntToEng {
		// メインメソッド
	
	  /* public static void main
	    (String[] args) {
	    	for(;;){
	    	System.out.print("入力：");
	        Scanner sc = new Scanner(System.in);
	
	        int input = sc.nextInt();
	       
	        System.out.print("出力：");
	        System.out.println(translateEng(input));
	    	}
	    }*/
	
	    // 数値を英訳する変換するメソッド
	
	    static String translateEng(int n) {

	    	String[] a={"zero","one","two","three","four","five","six","seven","eight","nine","ten",
	    			"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	    	String[] b={"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
	    	String c="hundred";
	    	
	if(n<=19){
	    	return a[n];
	}
	if(n>=20&&n<=99){
		String n1=String.valueOf(n);
		int x1 = Integer.parseInt(n1.substring(0, 1));
		int x2 = Integer.parseInt(n1.substring(1, 2));
		if(x2==0){
			return b[x1-2];
		}
	        return b[x1-2]+" "+a[x2];
	}if(100<=n&&n<=999){
		String n1=String.valueOf(n);
		int x1 = Integer.parseInt(n1.substring(0, 1));
		int x2 = Integer.parseInt(n1.substring(1, 2));
		int x3 = Integer.parseInt(n1.substring(2, 3));
		if(x2==0&&x3==0){
			return a[x1]+" " +c;
		}
		if(x2==0){
			return a[x1]+" "+c+" "+a[x3];
		}
		if(x2==1){
			if(x3==0){
				return a[x1]+" "+c+" "+a[10];
			}
			int n2 = Integer.parseInt(n1.substring(1, 3));
			return a[x1]+" "+c+" "+a[n2];
		}
		if(x3==0){
			return a[x1]+" "+c+" "+b[x2-2];
		}
		return a[x1]+" "+c+" "+b[x2-2]+" "+a[x3];
	}
	 return " ";   
	    }
	}