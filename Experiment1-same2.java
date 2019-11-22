package jp.tcs.expt.junit;

public class Experiment1 {
	/**
	 * 3引数a, b, cの中央値を返す．
	 * テストの実験のため，わかりにくいコードにしてある．
	 * @return a, b, cの中央値
	 */
	public int calcMidiumNum(int x, int y, int z)
	{
	    if (x < y) {
	        if (y < z) {      
	            return y;
	        } else if (x < y) { 
	            return z;
	        } else {            
	            return x;
	        }
	    } else {
	        if (x < z) {      
	            return x;
	        } else if (y < z){ 
	            return z;
	        } else {           
	            return y;
	        }
	    }
	}
}
