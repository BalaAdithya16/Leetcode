class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        for(int i=0;i<words.length;i++){
            char[] ch=words[i].toCharArray();
            Arrays.sort(ch);
            words[i]=new String(ch);
        }
        int c=0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[i].equals(words[j])){
                    c++;
                }
            }
        }
        return c;
    }
}