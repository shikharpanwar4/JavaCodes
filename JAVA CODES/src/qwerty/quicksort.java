package qwerty;

public class quicksort 
{ 
    int partition(detective arr[], int low, int high) 
    { 
        float pivot = arr[high].r;  
        int i = (low-1); 
        for (int j=low; j<high; j++) 
        { 
             
            if (arr[j].r < pivot) 
            { 
                i++; 
                detective temp = new detective();
                temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        
        detective temp = new detective();
        temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
  
  
    
    void sort(detective arr[], int low, int high) 
    { 
        if (low < high) 
        { 
           
            int pi = partition(arr, low, high); 
  
           
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        }  
      }
    
}