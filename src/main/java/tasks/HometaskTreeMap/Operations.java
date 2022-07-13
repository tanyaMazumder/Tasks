package tasks.HometaskTreeMap;

import java.util.Scanner;
import java.util.*;
class Operations
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            TreeMap<Integer, Integer> hm = new TreeMap<Integer, Integer>();
            int q = sc.nextInt();
            while(q>0)
            {
                GfG g = new GfG();
                char c = sc.next().charAt(0);
                if(c=='a')
                {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    g.add_Value(hm,x,y);
                }
                if(c=='b')
                {
                    int y = sc.nextInt();
                    System.out.print(g.find_value(hm,y)+" ");
                }
                if(c=='c')
                    System.out.print(g.getSize(hm)+" ");
                if(c=='d')
                {
                    int x = sc.nextInt();
                    g.removeKey(hm,x);
                }
                if(c=='e')
                    g.sorted_By_Key(hm);
                q--;
            }
            System.out.println();
            t--;
        }
    }

}

class GfG
{
    void add_Value(TreeMap<Integer,Integer> hm, int x, int y)
    {
        hm.put(x,y);
    }

    int find_value(TreeMap<Integer, Integer> hm, int x)
    {
        if (hm.containsKey(x))
            return hm.get(x);
        else
            return -1;
    }

    int getSize(TreeMap<Integer, Integer> hm)
    {

        return hm.size();
    }


    void removeKey(TreeMap<Integer, Integer> hm, int x)
    {
        hm.remove(x);
    }

    void sorted_By_Key(TreeMap<Integer, Integer> hm)
    {
        for (Integer treeKey : hm.keySet()){
            System.out.print(treeKey+" ");
        }
    }
}