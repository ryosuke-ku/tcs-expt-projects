public class FizzBuzz implements features.FizzBuzz {

	@Override
	public String fizzBuzz(int num) {
		if(num < 1){
			throw new RuntimeException();
		}
		if(num % 15 == 0){
			return "FizzBuzz";
		} else if(num % 3 == 0){
			return "Fizz";
		} else if(num % 5 == 0){
			return "Buzz";
		} else {
			return new Integer(num).toString();
		}
	}

}