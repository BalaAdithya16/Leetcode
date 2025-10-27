class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue <Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        int l=0;
        while(!pq.isEmpty()){
            int Alice=pq.poll();
            int Bob=pq.poll();
            nums[l]=Bob;
            l++;
            nums[l]=Alice;
            l++;
        }
        return nums;
    }
}