
package binary;


public class Binary {
public static void binarySearch(int array[],int f,int l,int k){
    int mid=(f+l)/2;
    while(f<=l){
        if(array[mid]<k){
            f=mid+1;
        }else if(array[mid]==k){
            System.out.println("Found at index: "+mid);
            break;
        }else{
            l=mid-1;
        }
        mid=(f+l)/2;
    }
    if(f>l){
        System.out.println("not found");
        
    }
}
    public static void main(String[] args) {
        int array[]={80,6,98,78,3,5};
        int k=8;
        int l=array.length-1;
        binarySearch(array,0,l,k);
    }
    
}
