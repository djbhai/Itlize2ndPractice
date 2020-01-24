 
import java.util.*;
/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
    return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String word:array){
            if(word == value){
                return true;
        }
       
    }
    return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reverse=new String[array.length];
        for(int i=0; i< array.length; i++){
            reverse[(array.length)-(i+1)]=array[i];
            }
        return reverse;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean condition = true;
        int length = 0;
        if(array.length%2 ==0) length = array.length/2;
        else length= (array.length-1)/2;
        for(int i=0; i<length;i++){
            if(array[(array.length)-(i+1)] == array[i]){
                continue;
            }
            condition = false;
        }
        return condition;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
      
        ArrayList lettersFound= new ArrayList<Integer>();
        for(var i=0; i<array.length; i++){
            for(var j=0; j< array[i].length();j++){
                char letter = array[i].charAt(j);
                boolean upperCase = false;
                int value;
                upperCase = Character.isUpperCase(letter);
                if(!Character.isLetter(letter)) continue;
                if(upperCase){
                    value = (letter - 'A')%26;
                    
                    
                }
                else value = (letter - 'a')%26;
                if(!lettersFound.contains(value))
                lettersFound.add(value);
            }
          
        }
        var allnumbersFound =true;
        if(lettersFound.size()==26) {
            for(var k=0;k<26;k++){
                if(!lettersFound.contains(k)){
                   allnumbersFound= false;
                   return allnumbersFound;
                }
            }
            return allnumbersFound;
        };
       
            return false;
        
        
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int occurences=0;
        for(var i=0;i<array.length;i++){
            if(array[i] == value){
            occurences+=1;
        }
        }
        return occurences;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List removedValues = new ArrayList<String>();
        for(int i=0;i<array.length;i++){
            if(!(array[i]== valueToRemove)){
              removedValues.add(array[i]);  
            }
            
    }
    Iterator<String> it = removedValues.iterator();

    String[] removed = new String[removedValues.size()];
    var j=0;
    while(it.hasNext()){
        removed[j] = it.next();
        j=j+1;
    }
    return removed;
}

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList indices = new ArrayList<String>();
     
        int length=0;
        String last="";
        /*if(array.length%2 ==0) length = array.length/2;
        else length = (array.length-1)/2;*/
        for(var i=0;i<array.length-1; i=i+1){
            if(last == array[i]) continue;
            if(array[i] == array[i+1]) 
            {
            last = array[i+1];
            indices.add(array[i]);
        }
         else{
             indices.add(array[i]);
             last="";
            }
          
        }
        if(!(array[array.length-1] ==last)) {
            indices.add(array[array.length-1]);
        }
        String[] removed = new String[indices.size()];
        Iterator<String> it = indices.iterator();
       int k=0;
       while(it.hasNext()){
           removed[k] = it.next();
           k++;
        }
        return removed;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String concat =array[0];
        String last = array[0];
        ArrayList indices = new ArrayList<Integer>();
        for(var i=0;i<array.length-1; i=i+1){
            if(last == array[i+1]) concat = concat+array[i];
            else{
                indices.add(concat);
                concat = array[i+1];
                last = array[i+1];
            }
            
        }
       indices.add(concat);
        Iterator<String> it = indices.iterator();
        String[] packed = new String[indices.size()];
        int k=0;
        while(it.hasNext()){
            packed[k] = it.next();
            k++;
        }
        return packed;
    }


}
