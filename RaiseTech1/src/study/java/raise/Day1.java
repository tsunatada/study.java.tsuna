package study.java.raise;

class Day1 {
	public static void main(String[] args) {
		greet("Hello", "World");
	}
	public static void greet(String h, String w) {
		System.out.println(h + w);
	for (int i = 1; i <= 10; i ++) {
	    System.out.println(i + "回目");
	    if (i == 1) {
	    	System.out.println(h);
	 } else if (i > 8) {
		 System.out.println(w);
	 } else {
		 System.out.println(h + w);
	 }
	}
  }
}