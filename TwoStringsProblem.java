// Solution-:

import java.util.Scanner;
class Main {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        if(str1.contains(str2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        sc.close();
    }
}



// Two Strings Problem 

// Description
// A substring is a contiguous sequence of characters within a string.

// You are given two strings: S1 and S2.

// Print "Yes" if S2 is a substring of S1, else print "No"

// You are not allowed to use any inbuilt function.

// Input
// Input Format:

// First line contains S1

// Second line contains S2

// Constraints:
// Length of both strings < 100

// Output
// Output string based on S1 and S2


// Sample Input 1    Sample Output 1
// masai             Yes
// sai