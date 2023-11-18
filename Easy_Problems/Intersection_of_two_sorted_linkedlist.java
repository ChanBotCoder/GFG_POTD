class solution{
  public static Node(Node head1, Node head2){
    Node temp = new Node(0);
    Node p = temp;
    while(head1 != null && head2 != null){
      if(head1.data == head2.data){
        p.next = head1;
        p = p.next;
        head1 = head1.next;
        head2 = head2.next;
      }
      else if (head1.data < head2.data) head1 = head1.next;
      else head2 = head2.next;
    }
    p.next = null;
    return temp.next;
  }
}

https://www.geeksforgeeks.org/problems/intersection-of-two-sorted-linked-lists/1
