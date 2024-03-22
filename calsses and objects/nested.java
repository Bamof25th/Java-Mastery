public class nested {
    public static void main(String[] args) {
         //*  link

         Node n1 = new Node(10);
         Node n2 = new Node(6);
         Node n3 = new Node(-8);
         System.out.println(n2.next.val);

    }
    /**
     * node
     */
     public static class Node {
    
        int val;
        Node next;
        
        Node(int v1){
            val = v1 ;
        }
    }
}
