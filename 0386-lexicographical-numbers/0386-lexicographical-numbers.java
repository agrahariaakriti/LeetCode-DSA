class Solution {
    public List<Integer> lexicalOrder(int n) {
      ArrayList<Integer> al=new ArrayList<>();
      ArrayList<String> al1=new ArrayList<>();
      for(int i=1;i<=n;i++)
      {
        al.add(i);
      }
      for(Integer x: al)
      {
        al1.add(x.toString());
      }
      al.clear();
      Collections.sort(al1);
      for(String x: al1)
      {
        al.add(Integer.parseInt(x));
      }
      return al;
      
    }

}