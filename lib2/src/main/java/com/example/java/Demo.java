package com.example.java;

/**
 * Created by davidyu on 3/4/17.
 */

public class Demo {



    public static void main(String[] args) {

        CyclerLink cyclerLink = new CyclerLink();


        cyclerLink.setLen(4);
        cyclerLink.createLink();
//        cyclerLink.print();

        cyclerLink.setStartCountPerson(2);
        cyclerLink.setM(2);
        cyclerLink.play();


    }

}

class Node {
    int number;
    Node next;

    public Node(int n) {
        this.number = n;
        next = null;
    }


}

    class CyclerLink {

        Node firstChild;
        int len;
        Node temp;
        int startCountIndex;
        int m ;

        public void setLen(int len) {

            this.len = len;
        }


        public void setStartCountPerson(int index)
        {
            startCountIndex = index;


        }

        public void setM(int m)
        {
            this.m = m;
        }





        public void play()
        {

            Node temp = firstChild;
            //1 . first the first person for start to cout
            for(int i =1 ; i <startCountIndex; i++ )
            {
                temp = temp.next;

            }


            //repeat this



            while(len != 1) {
                // 2. cout m
                //found this person in temp

                for (int i = 1; i < m; i++) {

                    temp = temp.next;

                }

                //now  this temp should be get rid of it

                Node temp2 = temp;

                while (temp2.next != temp) {
                    temp2 = temp2.next;
                }

                // 3.  remove the m child  to the recyle.

                temp2.next = temp.next;
                temp = temp.next;

                len--;

            }

            System.out.println("last person is "+ temp.number);




        }


        public void createLink() {

            //i want to create 5 child and link them together

            for (int i = 1; i <= len; i++) {


                if (i == 1) {
                    Node ch = new Node(i);
                    this.firstChild = ch;
                    temp = ch;
                } else {


                    // link the last one to the firstchild.
                    if (i == len) {
                        Node ch = new Node(i);
                        temp.next = ch;
                        temp = ch;
                        temp.next = firstChild;

                    } else {

                        Node ch = new Node(i);
                        temp.next = ch;
                        temp = ch;
                    }

                }


            }


        }


        public void print() {

            Node temp = firstChild;
            do {
                System.out.printf(" " + temp.number);
                temp = temp.next;


            } while (temp != firstChild);
        }


    }


