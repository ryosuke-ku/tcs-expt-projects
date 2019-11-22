package jp.tcs.expt.junit;

public class Experiment1 {
	/**
	 * 3引数a, b, cの中央値を返す．
	 * テストの実験のため，わかりにくいコードにしてある．
	 * @return a, b, cの中央値
	 */
	public int calcMidium(int a, int b, int c)
	{
	    if (a < b) {
	        if (b < c) {      // a < b < c
	            return b;
	        } else if (a < c) {  // a < c <= b
	            return c;
	        } else {             // c <= a < b
	            return a;
	        }
	    } else {
	        if (a < c) {       // b <= a < c
	            return a;
	        } else if (b < c){ // b < c <= a
	            return c;
	        } else {            // c <= b < a
	            return b;
	        }
	    }
	}
}
