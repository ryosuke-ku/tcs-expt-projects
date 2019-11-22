package jp.tcs.expt.junit;

public class Experiment2 {
	/**
	 * 2つのスコア(0～100点)を入力し、次の条件に従って合格、不合格を判定するプログラム
	 * ・両方とも60点以上の場合、合格
	 * ・合計が130点以上の場合、合格
	 * ・合計が100点以上で、どちらかのスコアが90点以上であれば合格
	 * ・上記以外は不合格
	 * @return 入力:２つのスコア、出力:"pass" or "failure"
	 */

	public String testResult(int test1, int test2){
		if( test1 >= 60 && test2 >= 60 ){
		    return "pass";
		}else if( ( test1 + test2 ) >= 130 ) {
			return "pass";
		}else if( ( test1 + test2 ) >= 100 && ( test1 >= 90 || test2 >= 90 ) ) {
			return "pass";
		}else {
			return "failure";
		}
	}
}