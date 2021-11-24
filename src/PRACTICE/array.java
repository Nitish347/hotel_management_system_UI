package PRACTICE;

public class array {
static  int [] num ={2,3,4,5,1,3,7,9};

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

    static  void find(int []arr,int x){
    for(int i=0;i<arr.length;i++)
    {
    if(arr[i]==x){
        System.out.println("element is found at position: "+ (i+1));
    }
    else if ((i+1)==arr.length){
        System.out.println("element is not in the list.");
    }
    }
}
static void swap(int a,int b){
    int temp;
    temp = a;
    a=b;
    b= temp;
}
static  void sort(int []arr){

    for(int i=0;i< arr.length-1;i++){
        for(int j=i;j<arr.length-(i+1);j++){
            if(arr[i]>=arr[j]){
                swap(arr[i],arr[j]);

            }
        }
    }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
}
    public static void main(String[] args) {
    find(num,9);
    sort(num);
    bubbleSort(num);
    }
}
