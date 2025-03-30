class Solution {
        
    public String restoreString(String s, int[] indices) {
        int x = 0;
        char c;
        char [] strArr= new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            strArr[i] = s.charAt(i);
        }
        int[] sortedArray= new int [indices.length];
        for(int i=0;i<indices.length;i++){
            for(int j=i+1;j<indices.length;j++){
                if(indices[i]>indices[j]){
                    c=strArr[j];
                    strArr[j]=strArr[i];
                    strArr[i]=c;
                    x=indices[j];
                    indices[j]=indices[i];
                    indices[i]=x;
                }
            }
        }
        String yz="";
        for (char f : strArr) {
            yz+=f;
        }
        return yz;
    }
}