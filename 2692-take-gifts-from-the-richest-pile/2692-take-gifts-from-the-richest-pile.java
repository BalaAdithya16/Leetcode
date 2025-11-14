class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<gifts.length;i++){
            pq.add(gifts[i]);
        }
        for(int i=0;i<k;i++){
            int a=pq.poll();
            double b= Math.sqrt(a);
            int c=(int)Math.floor(b);
            pq.add(c);
        }
        long ans=0;
        while(!pq.isEmpty()){
            ans+=pq.poll();
        }
        return ans;
    }
}