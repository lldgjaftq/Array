package shuzu;
import java.util.Scanner;
import java.util.Arrays;//引用排序方法
public class MergeTwoOrderedTables {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);		
		int[] a =new int[100];
		int[] b =new int[100];
		
		System.out.print("Enter list1 size and contents: ");
		a[0]=input.nextInt();
		for(int i=1;i<=a[0];i++) {
			a[i]=input.nextInt();	
		}
		System.out.print("Enter list2 size and contents: ");
		b[0]=input.nextInt();
		for(int i=1;i<=b[0];i++) {
			b[i]=input.nextInt();	
		}
		Arrays.sort(a,1,a[0]+1);//Arrays.sort(数组,a,b）对下标为a到b-1的数进行排序
		System.out.print("list1 is ");
		for(int i=1;i<=a[0];i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		Arrays.sort(b,1,b[0]+1);
		System.out.print("list2 is ");
		for(int i=1;i<=b[0];i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		System.out.print("The merged list is ");
		int[] c=merge(a,b);
		for(int i=1;i<=a[0]+b[0];i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println();
	}
	//合并列表的方法
	public static int[] merge(int[] a,int[] b) {
		int[] s=new int[200];
		for(int i=1;i<=a[0]+b[0];i++) {
			if(i<=a[0]) {
				s[i]=a[i];
			}else {
				s[i]=b[i-a[0]];
			}
		}
		Arrays.sort(s,1,a[0]+b[0]+1);
		return s;
	}

}
