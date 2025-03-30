class Solution {
    public int[] getConcatenation(int[] nums) {
        int oneTimesLength=nums.length;
        int twoTimesLength=2*(nums.length);
        int[] concatinatedArr=new int [twoTimesLength];
        for(int i=0;i<nums.length;i++){
            concatinatedArr[i]=nums[i];
            concatinatedArr[oneTimesLength]=nums[i];
            oneTimesLength++;
        }
        return concatinatedArr;
    }
}