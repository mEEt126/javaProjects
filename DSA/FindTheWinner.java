class FindTheWinner{
    public int findTheWinner(int n, int k) 
    {
        ArrayList<Integer> al = new ArrayList<Integer>(); 
        for(int i=1; i<=n; i++)
        {
            al.add(i); 
        }
        al = lastMember(al, k, 0); 
        return al.get(0); 
    } 

    public ArrayList<Integer> lastMember(ArrayList<Integer> al, int k, int index)
    {
        if(al.size() == 1)
            return al; 
        else
        {
            index = index + k - 1; 
            //System.out.println(al.size()); 
            while(index >= al.size())
                {
                    index = index - al.size();
                }     
            System.out.println(al.get(index));     
            al.remove(index); 
            al = lastMember(al, k, index); 
        }  
        return al;   
    }
}
