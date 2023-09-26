//dsa

import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();

        while(tc-->0){
            int n=sc.nextInt();
            sc.nextLine(); 
            String str=sc.nextLine();
            ds(n,str);
        }
        sc.close();
    }
    public static void ds(int n,String str){
        StringBuilder bag=new StringBuilder();
        int i=0;
        while(i<str.length()){
            if(i%2==1){
                int count=Character.getNumericValue(str.charAt(i));
                for(int j=0;j<count;j++){
                    bag.append(str.charAt(i-1));
                }
            }
            i++;
        }
        System.out.println(bag.toString());
    }
}


// Decipher String 
// Description

// You are given a ciphered string, you have to decipher the string.

// For example, if the given string is "a2b1c2", then the deciphered string will be "aabcc".

// Note: The string contains only lower-case letters and numbers.


// Input
// The first line of the input contains T, the number of test cases.

// The first line of each test case contains N, the length of the string.

// The next line contains the string, for which the decipher string is to be generated.

// Constraints

// 1 <= T <= 10

// 1 <= N <= 200


// Output
// For each test case, print the deciphered string for the given string, on a new line.


// Sample Input 1 

// 2
// 6
// a2b1c2
// 6
// a2z1a2
// Sample Output 1

// aabcc
// aazaa
// Hint

// For the first sample test case, the deciphered string will be aabcc.

// For the second sample test case, the deciphered string will be aazaa.
