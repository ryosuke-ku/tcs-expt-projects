package jp.tcs.expt.junit;

public class Experiment3 {
	/**
	 * 整数を入力し、次の条件で結果を返すプログラム
	 * ・3で割り切れる場合、"Fizz"
	 * ・5で割り切れる場合、"Buzz"
	 * ・3と5両方で割り切れる場合、"FizzBuzz"
	 * ・入力が整数でない場合、"Not Interger"
	 * ・上記以外は入力数値をString型で返す
	 * @return 入力:数値、出力:"Fizz" or "Buzz" or "FizzBuzz" or "数値"
	 */

	public String fizzBuzz(int num) {
		if(num <= 0) {
			return "Not Interger";
		}
		if(num % 15 == 0) {
			return "FuzzBuzz";
		}else if(num % 3 == 0){
			return "fizz";
		}else if(num % 5 == 0) {
			return "Buzz";
		}else {
			return Integer.toString(num);
		}

	}
}
