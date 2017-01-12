package Testing;

/**
 * Created by xy on 2017/1/8.
 * Deep structural equality:  two objects are "equals" if all their fields are "equals".  For example, two SLists that represent the same sequence of
 items (though the SListNodes may be different).
 Note that this implementation may fail if the SList invariants have been
 corrupted.  (A wrong "size" field or a loop in an SList can make it fail.)
 */


public class equal {
    /*
    public boolean equals(Object other) {
        // Reject non-SLists.
        if (!(other instanceof SList)) {
            return false;
        }
        SList o = (SList) other;
        if (size != o.size) {
            return false;
        }
        SListNode n1 = head;
        SListNode n2 = o.head;
        while (n1 != null) {
            // Deep equality of the items.
            if (!n1.item.equals(n2.item)) {
                return false;
            }
            n1 = n1.next;
            n2 = n2.next;
        }

        return true;
    }
    */
}
