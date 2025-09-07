class Solution {

    public boolean isPalindrome(int x) {
        int num =x;
        int digit, rev=0;

        // Negative number always not a Palendrome number
        if(x < 0){
            return false;
        }


        while(x!=0){
            digit=x%10; // take last digit
            x=x/10; // remove last digit
            rev=rev*10+digit; // reverse the number
        }


        if(num == rev){
            return true;
        }else{
            return false;
        }
    
    }
}