package sortingAlgorithm;
public class BubbleSortingOfString 
{
	static void bubbleSorting(String[] arr) 
	{  
    		int n = arr.length;  
        	String temp;  
	     	for(int i=0; i < n; i++)
	     	{  
        	     for(int j=0; j < (n-1-i); j++)
        	     	{  
                      if(arr[j].compareTo(arr[j+1])>0)	//use compareTo() method of String class
                      {  
                             //swap elements  
                             temp = arr[j];  
                             arr[j] = arr[j+1];  
                             arr[j+1] = temp;  
                      }  
                      
        	     	}  
     		}  

  	 }  
	public static void main(String[] args)
		{  
            String arr[] ={"sachin","smita","janvhi","bharat","baby","rajendra"};  
             
            System.out.println("String Array Before Bubble Sort");                  
            for(int i=0; i < arr.length; i++)
            {  
                 System.out.print(arr[i] + " ");  
   		    }  
   
            System.out.println();  
              
            bubbleSorting(arr);//sorting array elements using bubble sort  
             
            System.out.println("String Array After Bubble Sort");  
            for(int i=0; i < arr.length; i++)
            {  
                    System.out.print(arr[i] + " ");  
            }  

		}  

}
