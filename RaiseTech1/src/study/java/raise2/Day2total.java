package study.java.raise2;

class Day2total {
	public static void main(String[] args) {
        //1から10までを足した値を出力
		int[] number = {1,2,3,4,5,6,7,8,9,10};
		  int sum = 0;
		  for (int i = 0; i < number.length; i++) {
			sum = sum + number[i];
		  }
		  System.out.println(sum);
	}
}
