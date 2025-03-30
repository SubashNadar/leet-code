class Solution {
    public String mergeAlternately(String word1, String word2) {
        String finalString="";
        int i=0;
        int j=0;
        while(i < word1.length() || j < word2.length()){
            if(i < word1.length()){
                finalString+=word1.charAt(i);
                i++;
            }
            if(j < word2.length()){
                finalString+=word2.charAt(j);
                j++;
            }
        }
        return finalString;
    }
}