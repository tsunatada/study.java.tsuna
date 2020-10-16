package study.java.raise2;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

class Day2Date {
	public static void main(String[] args) {
        
	    LocalDateTime date = LocalDateTime.of(2021,10,14,0,0,0,0);
	              
	    //年、月、日、曜日(英語)、曜日(数字)の取得
	    int year = date.getYear();
	    int month = date.getMonthValue();
	    int day = date.getDayOfMonth();
	    DayOfWeek  dow = date.getDayOfWeek();
	    int numDow = date.getDayOfWeek().getValue();
	              
	    //それぞれ出力
	    System.out.println("年：" + year);
	    System.out.println("月：" + month);
	    System.out.println("日：" + day);
	    System.out.println("曜日(英語)：" + dow);
	    System.out.println("曜日(数字)：" + numDow);
	  }
}
