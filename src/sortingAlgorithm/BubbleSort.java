package sortingAlgorithm;
//Bubble sort using method.
/*
 * Bubble sort- is a  comparison based algorithm i.e. comparing each pair of adjacent 
 * elements/items and swapping them,if they are in wrong order.(in ascending or descending) 
 */
public class BubbleSort 
{
    
	  
        	static void bubbleSorting(int[] arr) 
        	{  
            		int n = arr.length;  
	            	int temp = 0;  
        	     	for(int i=0; i < n; i++)
        	     	{  
                	     for(int j=0; j < (n-1-i); j++)
                	     	{  
                              if(arr[j] > arr[j+1])
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
                    int arr[] ={3,60,35,2,45,320,5};  
                     
                    System.out.println("Array Before Bubble Sort");                  
                    for(int i=0; i < arr.length; i++)
                    {  
                         System.out.print(arr[i] + " ");  
           		    }  
           
                    System.out.println();  
                      
                    bubbleSorting(arr);//sorting array elements using bubble sort  
                     
                    System.out.println("Array After Bubble Sort");  
                    for(int i=0; i < arr.length; i++)
                    {  
                            System.out.print(arr[i] + " ");  
                    }  
       
        		}  
     

}
