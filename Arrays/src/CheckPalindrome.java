void main(){
    String word = "madame";
    System.out.println(palindromeCheck(word));
}

static boolean palindromeCheck(String str){
//    String reverseString = "";
    int n = str.length();
    for(int i = 0 ; i < n / 2 ; i++){
        if (str.charAt(i) != str.charAt(n - 1 - i)) return false;
    }
    return true;
}
