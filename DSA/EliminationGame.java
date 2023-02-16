class EliminationGame{
    /*public int lastRemaining(int n) 
    {
        if(n == 1)
            return 1; 

        ArrayList<Integer> al = new ArrayList<Integer>();
        char  start = 'l';  
        for(int i=1; i<=n; i++)
        {
            al.add(i); 
        }

        al = lastNumber(al,start);
        return al.get(0);      
    }

    public ArrayList<Integer> lastNumber(ArrayList<Integer> al, char start)
    {
        System.out.println(al);
        if(al.size() == 1)
            return al; 

        if(start == 'l')   
        {
            for(int i=0; i<al.size(); i=i+1)
            {
                System.out.println(al.get(i));
                al.remove(i); 
            }
            return lastNumber(al, 'r'); 
        }   
        else
        {
            for(int i=al.size()-1; i>=0; i=i-2)
            {
                System.out.println(al.get(i));
                al.remove(i); 
            }
            return lastNumber(al, 'l'); 
        }
    }*/
    public int lastRemaining(int n)
    {
        boolean left = true;
        int diff = 1;
        int head = 1;
            while (n > 1) 
            {
                if (left || n % 2 ==1) 
                {
                    head = head + diff;
                }
                n = n / 2;
                diff = diff * 2;
                left = !left;
            }
            return head;
    }        
}
