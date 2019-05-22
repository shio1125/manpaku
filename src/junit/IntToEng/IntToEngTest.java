package junit.IntToEng;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;


public class IntToEngTest {

	@Test
	public void 数値を英語で出力する() {
		for(;;){
	    	System.out.print("入力：");
	        Scanner sc = new Scanner(System.in);
	
	        int input = sc.nextInt();
	       
	        System.out.print("出力：");
	        System.out.println(IntToEng.translateEng(input));
	    	}
	}
}
