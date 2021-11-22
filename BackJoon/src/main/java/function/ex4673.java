package function;

public class ex4673 {
	//셀프넘버
	/*
	예를 들어, 33으로 시작한다면 다음 수는 33 + 3 + 3 = 39이고, 그 다음 수는 39 + 3 + 9 = 51, 다음 수는 51 + 5 + 1 = 57이다. 이런식으로 다음과 같은 수열을 만들 수 있다.
	33, 39, 51, 57, 69, 84, 96, 111, 114, 120, 123, 129, 141, ...
	n을 d(n)의 생성자라고 한다. 위의 수열에서 33은 39의 생성자이고, 39는 51의 생성자, 51은 57의 생성자이다. 생성자가 한 개보다 많은 경우도 있다. 예를 들어, 101은 생성자가 2개(91과 100) 있다. 
	생성자가 없는 숫자를 셀프 넘버라고 한다. 100보다 작은 셀프 넘버는 총 13개가 있다. 1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97
	10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
	 */
	public static void main(String[] args) {
		boolean[] arr = new boolean[10001];
		
		for(int i = 1; i <= 10000; i++) {
			int value = d(i);
			
			if(value <= 10000) {
				arr[value] = true;
			}
		}
		
		for(int i = 1; i < arr.length; i++) {
			if(!arr[i]) {
				System.out.println(i);
			}
		}
		
		
	}
	
	private static int d(int n) {
		int result = n;

		while(n != 0) {
			result += n % 10;
			n /= 10;
		}
		return result;
	}
}
