package day15arraysforeachloop;

public class Arrays03 {
    public static void main(String[] args) {
        //How to check an element if it exist in array or not
        //1.way
        int arr[]={32,14,2,11};
        for(int w: arr){
            if(w==2){
                System.out.println(w+"exists..");
                break;
            }
        }//note 1: binarysearch() method returns the index of existing element
        // note 2: binarysearch() method returns the order number with negative sign for non-existing elements
        // note 3: to use binarysearch() method you have to use sort() method otherwise the output will not be meaningful
        // note 4: do not use binarysearch() method for repeated elements, it does not give correct answer everytime
    }
}
