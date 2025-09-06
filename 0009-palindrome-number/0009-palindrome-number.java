class Solution {

    public boolean isPalindrome(int x) {
        int num =x;
        int digit, rev=0;
        if(x < 0){
            return false;
        }


        while(x!=0){
            digit=x%10;
            x=x/10;
            rev=rev*10+digit;
        }



        // boolean result;

        if(num == rev){
            return true;
        }else{
            return false;
        }
        // return result;
    
    }
}