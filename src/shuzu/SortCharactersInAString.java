package shuzu;
import java.util.Scanner;
public class SortCharactersInAString {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s=input.next();
		System.out.println(sort(s));	

	}
	public static String sort(String s) {
		int t=s.length();
		char[] a=s.toCharArray();//将字符串转变成字符数组
		for(int i=0;i<t-1;i++) {
			for(int j=0;j<t-i-1;j++) {
				if(a[j]>a[j+1]) {
					char tmp=a[j];
					a[j]=a[j+1];
					a[j+1]=tmp;
				}		
			}
		}
		String s1=String.valueOf(a);//返回数组的字符串表现形式
		return s1;
		
	}

}
