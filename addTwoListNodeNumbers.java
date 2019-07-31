import java.math.BigInteger;

public class Solution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args){

        System.out.print("result=");
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p=l1;
        ListNode q=l2;
        ListNode pre=new ListNode(0);
        ListNode l3=pre;
        int sum=0;
        while (p!=null || q!=null){
            if(p!=null){
                sum+=p.val;
                p=p.next;
            }
            if(q!=null){
                sum+=q.val;
                q=q.next;
            }
            l3.next =new ListNode(sum%10);
            l3=l3.next;
            sum=sum/10;
        }
        if (sum==1) {
            l3.next=new ListNode(1);
        }
       return pre.next;
    }



}
