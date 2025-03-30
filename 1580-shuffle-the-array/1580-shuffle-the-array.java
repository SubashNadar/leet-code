class Solution {
    public int[] shuffle(int[] nums, int n) {
        int finalArrLength=nums.length;
        int pointerOne=0;
        int pointerTwo=n;
        int[] finalArr=new int[finalArrLength];
        int index=n;
        for(int i=0;i<nums.length;i+=2){
            finalArr[i]=nums[pointerOne];
            pointerOne++;
            finalArr[i+1]=nums[pointerTwo];
            pointerTwo++;
            index++;
        }
        return finalArr;
    }
}