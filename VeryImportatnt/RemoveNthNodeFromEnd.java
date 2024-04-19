package VeryImportatnt;

import linkedlist.LinkedList.Node;

public class RemoveNthNodeFromEnd {

    public void RemoveNthNodeFromEnds(int n) {
        // calculate size of lonkedlist
        int s = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            s++;
        }
        if (n == s) {
            head = head.next;// remove first
            return ;
        }

        // s-n
        int i = 1;
        int iToFind = s - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return ;
    }
    public static void main(String[] args) {
        
    }   
}
