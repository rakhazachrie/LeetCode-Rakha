public class Palindrome {
    public boolean isPalindrome(String s) {
        if(s.equals(" ")){
            return true;
        }
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.replaceAll(" ", "");
        s = s.toLowerCase();
        char[] ch = s.toCharArray();
        int right = ch.length - 1;
        for (int i = 0; i<ch.length; i++){
            if(ch[i] != ch[right]){
                return false;
            }
            right--;
            if(i == right){
                break;
            }
        }
        return true;
    }
}
