public class PermutationSeq{
    public String getPermutation(int n, int k) 
    {
        StringBuilder num = new StringBuilder(); 
        ArrayList<StringBuilder> arrList = new ArrayList<StringBuilder>(); 

        for(int i=1; i<=n; i++)
        {
            num.append(i); 
        }    
        //System.out.println(num.toString()); 
        // Recursion 

        getKthPermutation(num, 0, n, arrList); 
        Collections.sort(arrList); 
        num = arrList.get(k-1); 

        /*for(int i=0; i<arrList.size(); i++)
        {
            System.out.println(arrList.get(i).toString());
        }*/
        return num.toString();
    }

    public static void getKthPermutation(StringBuilder num, int start, int end, ArrayList<StringBuilder> arrList)
    { 
        if(start>=end)
        {
            //System.out.println(num.toString());
            StringBuilder ans = new StringBuilder(num);
            arrList.add(ans);    
            return; 
        }
        else
        {
            for(int i=start; i<end; i++)
            {
                num = swap(num, start, i); 
                getKthPermutation(num, start+1, end, arrList); 
                num = swap(num, start, i);  
            }
        }    
    }

    public static StringBuilder swap(StringBuilder num, int a, int b)
    {
        char temp = num.charAt(a); 
        num.setCharAt(a,num.charAt(b));
        num.setCharAt(b,temp); 
        return num; 
    }
}
