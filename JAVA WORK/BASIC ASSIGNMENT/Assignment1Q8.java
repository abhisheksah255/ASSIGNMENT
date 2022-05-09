/*
Q8-  Using the below table write method apply sorting using Bubble Sort.

              Example:

              5 12 14 6 78 19 1 23 26 35 37 7 52 86 47         
 */

class BubbleSort{

    public void bubbleSort(int arr[]) {
    	int n=arr.length;
    	for (int i=0;i<n-1;i++)
    		for (int j=0;j<n-i-1;j++)
    			if(arr[j]>arr[j+1])
    			{
    				int temp=arr[j];
    				arr[j]=arr[j+1];
    				arr[j+1]=temp;
    				
    			}
	}
    void printArray(int arr[]) {
    	int n=arr.length;
    	for(int i=0;i<n;++i)
    		System.out.print(arr[i]+" ");
    
    }
}

public class Assignment1Q8 {

	public static void main(String[] args) {

int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
System.out.println("This is unshorted array:-");
for(int i=0;i<arr.length;i++)
System.out.print(" "+arr[i]);
BubbleSort ab=new BubbleSort();
ab.bubbleSort(arr);

System.out.print(" \n This is the sorted array:-\n");
ab.printArray(arr);
	}

}
