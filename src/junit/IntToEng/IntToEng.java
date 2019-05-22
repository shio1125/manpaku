	package junit.IntToEng;

public class IntToEng {
	static String[] a={"  ","one","two","three","four","five","six","seven","eight","nine","ten",
			"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	static String[] b={"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};

	
	    // 数値を英訳する変換するメソッド
	
	    static String translateEng(int n) {
	    	if(n==0) return "zero";
	    	if(n>0&&n<=99){
	    		return doubleDigit(n);
	    	}
	    	if(n>=100 && n<=999){
	    		return threeDigit(n);
	    	}
	    	if(n>=1000&&10000>n){
	    		return fourDigit(n);
	    	}
	    	return " ";

	    	 }
	    
	 static String doubleDigit(int n){//２桁のとき
	
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
	     }
	   return " ";
        }
	    
	    static String threeDigit(int n){//３桁のとき
	  
	    	String n1=String.valueOf(n);
		    int x1 = Integer.parseInt(n1.substring(0, 1));
		    
		    return a[x1]+" hundred "+doubleDigit(Integer.parseInt(n1.substring(1, 3)));
		
			    }
	    static String fourDigit(int n){
	    	String n1=String.valueOf(n);
		    int x1 = Integer.parseInt(n1.substring(0, 1));
		    int x2 = Integer.parseInt(n1.substring(1, 2));
		    if(x2==0){
				return a[x1]+" thousand "+doubleDigit(Integer.parseInt(n1.substring(2, 4))); 
			   }
		    
		    return a[x1]+" thousand "+threeDigit(Integer.parseInt(n1.substring(1, 4)));
	    }
	}


