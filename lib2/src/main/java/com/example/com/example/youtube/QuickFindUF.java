package com.example.com.example.youtube;

/**
 * Created by davidyu on 3/2/17.
 */

public class QuickFindUF {

//    private int[] id;
//
//
//    public QuickFindUF(int N)
//    {
//
//
//        id = new int[N];
//
//        for (int i = 0; i < N; i++) {
//
//            //set id of each object to itself
//            id[i] = i;
//        }
//
//
//    }
//
////    //check whether p and q are in the same component
////    public boolean connected(int p , int q)
////    {
////
////        return id[p] == id[q];
////    }
////
////
////    public void union(int p, int q)
////    {
////
////        int pid = id[p];
////        int qid = id[q];
////
////        //change all entries with id[p] to id[q]
////
////        for (int i = 0; i < id.length; i++) {
////
////            if(id[i] == pid)
////            {
////                id[i] = qid;
////            }
////        }
////
////    }
//
//
//    //version 2
//    //chase parent pointers until reach root (depth of i array accesses)
//    private int root(int i )
//    {
//
//         while(i != id[i]) {
//             i = id[i];
//         }
//
//        return i;
//
//    }
//
//    //check if p and q has same root
//    private boolean connected(int p, int q)
//    {
//
//        return root(p) == root(q);
//    }
//
//
//    public void union(int p , int q)
//    {
//        int i = root(p);
//        int j = root(q);
//
//        id[i] = j;
//
//    }



    private int[] parent;
    private int[] size;
    private int count;


    public QuickFindUF(int n)
    {
        count = n;

        parent = new int[ n];
        size = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }


    }
    public int count()
    {
        return count;
    }



    public int find(int p )
    {
        while(p !=parent[p])
        {
            p= parent[p];
        }
         return p;

    }

    public boolean connected(int p, int q)
    {

        return find(p) == find(q);
    }


    public void union(int p, int q)
    {

        int rootP = find(p);
        int rootQ = find(q);
        if(rootP == rootQ) return;

        //make smaller root point to larger one

        if(size[rootP] < size[rootQ])
        {

            parent[rootP] = rootQ;
            size[rootQ] += size[rootP];

        }else
        {
            parent[rootQ] = rootP;
            size[rootP] += size[rootQ];

        }


        count --;

    }



}
