package jp.tcs.expt.junit;

public class Experiment1 {
	/**
	 * 3引数a, b, cの中央値を返す．
	 * テストの実験のため，わかりにくいコードにしてある．
	 * @return a, b, cの中央値
	 */
	public int returnMidiumNum(int num1, int num2, int num3)
	{
	    if (num1 < num2) {
	        if (num2 < num3) {     
	            return num2;
	        } else if (num1 < num3) { 
	            return num3;
	        } else {           
	            return num1;
	        }
	    } else {
	        if (num1 < num3) {      
	            return num1;
	        } else if (num2 < num3){ 
	            return num3;
	        } else {           
	            return num2;
	        }
	    }
	}
}
