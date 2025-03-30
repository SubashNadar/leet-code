class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies=0;
        List<Boolean> myList=new ArrayList<>();
        for(int x : candies){
            if(maxCandies<x){
                maxCandies=x;
            }
        }
        for(int y : candies){
           if(y+extraCandies >= maxCandies) {
               myList.add(true);
           }else{
               myList.add(false);
           }
        }
        return myList;
    }
}