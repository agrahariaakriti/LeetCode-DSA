class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        HashMap<Integer,ArrayList<Integer>> al=new HashMap<>();
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                if(al.containsKey(i+j))
                al.get(i+j).add(mat[i][j]);
                else
                {
                    ArrayList<Integer> al1=new ArrayList<>();
                    al1.add(mat[i][j]);
                    al.put(i+j,al1);
                }
            }
        }

        for(Map.Entry<Integer,ArrayList<Integer>> e : al.entrySet())
        {
            if(e.getKey()%2==0)
            Collections.reverse(e.getValue());
        }
        int k=0;
        int arr[]=new int[mat.length*mat[0].length];
        for(Map.Entry<Integer,ArrayList<Integer>> e:al.entrySet())
        {
            ArrayList<Integer> al1=e.getValue();
            for(int i=0;i<al1.size();i++)
            {
                arr[k++]=al1.get(i);
            }
        }
    return arr;

    }
}