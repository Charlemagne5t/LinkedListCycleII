import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void detectCycleTest1(){
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;

        ListNode expected = head.next;
        ListNode actual = new Solution().detectCycle(head);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void detectCycleTest2(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;

        ListNode expected = head;
        ListNode actual = new Solution().detectCycle(head);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void detectCycleTest3(){
        ListNode head = new ListNode(1);
        ListNode actual = new Solution().detectCycle(head);

        Assert.assertNull(actual);
    }
}
