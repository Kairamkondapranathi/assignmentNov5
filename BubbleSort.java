package assignments;

public class BubbleSort {
	static void BubbleSort(int a[]) {
    	int n=a.length;
    	boolean swapped = false;
    	for(int i=0;i<n-1;i++) {
    		for(int j=0;j<n-i-1;j++) {
    			if(a[j]>a[j+1]) {
    				int temp=a[j];
    				a[j]=a[j+1];
    				a[j+1]=temp;
    				swapped=true;
    			}
    		}
    		if(swapped==false) break;
    	}
    }
    	
    	void printArray(int a[]) {
    		int n=a.length;
    		for(int i=0;i<n;++i) {
    			System.out.print(a[i] + " ");
    			System.out.println();
    		
    	}
    }


      public static void main(String[] args) {
    	  int a[]= {5,3,7,8,10};
    	  int n=a.length;
    	  BubbleSort(a);
    	  for(int i=0;i<n;i++) {
    		  System.out.print(a[i] + " ");
    	  }
    }

}
