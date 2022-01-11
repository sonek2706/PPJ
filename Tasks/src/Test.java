public class Test {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);

        ListNode tmp1 = l1;
        ListNode tmp2 = l2;
        ListNode tmp3 = l3;
        while (tmp1.next != null && tmp2.next != null) {
            if (tmp1.val + tmp2.val + tmp3.val < 10) {
                tmp3.val += tmp1.val + tmp2.val;
                tmp3.next = new ListNode(0);
            } else if (tmp1.val + tmp2.val + tmp3.val > 9) {
                tmp3.val += tmp1.val + tmp2.val - 10;
                tmp3.next = new ListNode(1);
            }

            tmp1 = tmp1.next;
            tmp2 = tmp2.next;
            tmp3 = tmp3.next;
        }

        if(tmp1.next == null && tmp2.next == null) {
            if (tmp1.val + tmp2.val + tmp3.val > 9) {
                tmp3.val += tmp1.val + tmp2.val - 10;
                tmp3.next = new ListNode(1);
            } else tmp3.val += tmp1.val + tmp2.val;
        }

        tmp1 = tmp1.next;
        tmp2 = tmp2.next;

        if (tmp1 != null) {
            while (tmp1.next != null) {
                if (tmp1.val + tmp3.val > 9) {
                    tmp3.val = 0;
                    tmp3.next = new ListNode(1);
                }
                else {
                    tmp3.val += tmp1.val;
                    tmp3.next = new ListNode(0);
                }

                tmp1 = tmp1.next;
                tmp3 = tmp3.next;
            }
        }

        if (tmp2 != null) {
            while (tmp2.next != null) {
                if (tmp2.val + tmp3.val > 9) {
                    tmp3.val = 0;
                    tmp3.next = new ListNode(1);
                }
                else {
                    tmp3.val += tmp2.val;
                    tmp3.next = new ListNode(0);
                }

                tmp2 = tmp2.next;
                tmp3 = tmp3.next;
            }
        }

        return l3;
    }

    


    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);

        ListNode l3 = addTwoNumbers(l1, l2);
        while (l3.next != null) {
            System.out.print(l3.val + " ");
            l3 = l3.next;
        }

        System.out.print(l3.val);
    }
}
