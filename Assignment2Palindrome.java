public class Assignment2Palindrome {

    static class Node {
        int key;
        Node next;

        Node(int key) {
            this.key = key;
            this.next = null;
        }
    }

    static Node listInsert(Node head, Node x) {
        x.next = head;
        return x;
    }

    static Node populate(Node head, int... keys) {
        for (int key : keys) {
            head = listInsert(head, new Node(key));
        }
        return head;
    }

    static void printList(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.key);
            if (cur.next != null) System.out.print(" -> ");
            cur = cur.next;
        }
        System.out.println();
    }

    static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) {
            slow = slow.next;
        }

        Node secondHalf = reverseList(slow);

        Node p1 = head;
        Node p2 = secondHalf;
        boolean ok = true;

        while (p2 != null) {
            if (p1.key != p2.key) {
                ok = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        reverseList(secondHalf);

        return ok;
    }

    static Node reverseList(Node head) {
        Node prev = null;
        Node cur = head;
        while (cur != null) {
            Node nxt = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nxt;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node a = null;
        a = populate(a, 1, 2, 3, 2, 1);
        System.out.print("List: ");
        printList(a);
        System.out.println("Palindrome? " + isPalindrome(a));

        Node b = null;
        b = populate(b, 10, 20, 20, 10);
        System.out.print("List: ");
        printList(b);
        System.out.println("Palindrome? " + isPalindrome(b));

        Node c = null;
        c = populate(c, 5, 10, 17);
        System.out.print("List: ");
        printList(c);
        System.out.println("Palindrome? " + isPalindrome(c));
    }
}
