class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer ,Integer> al=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        al.put(arr[i],al.getOrDefault(arr[i],0)+1);
        int max=0;
        for(Map.Entry<Integer,Integer> e: al.entrySet())
            if(e.getValue()==e.getKey())
            max=Math.max(e.getValue(),max);

          if(max==0)  
          return -1;
          else
           return max;  
    }
}