/* Structure of class Node is
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        // Your code here
        Stack<Integer>st=new Stack<>();
        Node curr=head;
        while(curr!=null){
            st.push(curr.data);
            curr=curr.next;
        }
        curr=head;
        while(curr!=null){
            int v=st.pop();
            if(curr.data!=v){
                return false;
            }
            curr=curr.next;
        }
        return true;
    }
}
