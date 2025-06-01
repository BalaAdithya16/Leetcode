class Solution {
    public int removeDuplicates(int[] nums) {
       ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
           if (!li.contains(nums[i])){
            li.add(nums[i]);
        }
    }
    for(int i=0;i<nums.length;i++){
        if(i<li.size()){
        nums[i]=li.get(i);
        }
        else{
            nums[i]=0;
        }
    }
    return li.size();
}
}