
import java.util.*;

class collection_in_java{
  public TreeMap<Character,Integer> solve(int n, String str){
    
    TreeMap<Character,Integer> bag =new TreeMap<>();
    
    for(int i=0;i<n;i++){
        char c=str.charAt(i);
        if(bag.containsKey(c)){
            bag.put(c,bag.get(c)+1);
        }else{
            bag.put(c,1);
        }
    }
    return bag;
  }
}



// HashMaps in Java 

// You are given a function with the namesolvewhich takes the following parameters
// int n;
// String str;
// This function returns a TreeMap, containing the characters and their frequency

// You have to importTreeMapfrom relevant library to use it

// You don't have to take the input or the output. Just complete the function, as explained in the problem statement


// Input
// You don't have to take the input or the output. Just complete the function, as explained in the problem statement

// Output
// You don't have to take the input or the output. Just complete the function, as explained in the problem statement

// Sample Input 

// 4
// abcd
// Sample Output 

// a->1
// b->1
// c->1
// d->1