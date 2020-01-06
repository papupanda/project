
public class ArrayRemoveDuplicate {

	public static void main(String[] args) {
		int index=0;
		int[] arr= {10,2,4,5,6,6,8,7,7,10};
		int len=arr.length;
		int[] arr1=new int[len];
		for(int i=0;i<=arr.length-2;i++) {
			if(arr[i]!=arr1[i+1]) {
				arr1[index]=arr[i];
				index++;
			}
		}
		for(int i=0;i<index;i++) {
			System.out.println(arr1[i]);
                        System.out.println("done");
		}
	}

}
