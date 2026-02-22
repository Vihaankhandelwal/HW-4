public class Assignment1LinkedListOps {

    static class Node {
        int key;
        Node next;

        Node(int key) {
            this.key = key;
            this.next = null;
        }
    }

    static Node listInsert(Node head, Node x) {
        if (x == null) return head;
        x.next = head;
        return x;
    }

    static Node listSearch(Node head, int key) {
        Node cur = head;
        while (cur != null) {
            if (cur.key == key) return cur;
            cur = cur.next;
        }
        return null;
    }

    static Node listDelete(Node head, Node x) {
        if (head == null || x == null) return head;

        if (head == x) {
            return head.next;
        }

        Node prev = head;
        while (prev.next != null && prev.next != x) {
            prev = prev.next;
        }

        if (prev.next == x) {
            prev.next = x.next;
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

    static Node populate(Node head, int... keys) {
        for (int key : keys) {
            head = listInsert(head, new Node(key));
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = null;

        head = populate(head, 10, 20, 30);
        System.out.print("List after inserts: ");
        printList(head);

        int searchKey = 20;
        Node found = listSearch(head, searchKey);
        System.out.println("Search for " + searchKey + ": " + (found != null ? "Found" : "Not found"));

        head = listDelete(head, found);
        System.out.print("List after deleting " + searchKey + ": ");
        printList(head);
    }
}
