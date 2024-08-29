package `2_linked-lists`


fun deleteDuplicates(head: Node?) {
    val seen = HashSet<Int>()
    var current = head
    var previous: Node? = null

    while (current != null) {
        if (seen.contains(current.value)) {
            // Skip the current node since it's a duplicate
            previous?.next = current.next
        } else {
            // Add the current value to the set and update previous
            seen.add(current.value)
            previous = current
        }
        current = current.next
    }
}

fun printList(head: Node?) {
    var current = head
    val sb = StringBuilder()
    while (current != null) {
        sb.append("${current.value} ")
        current = current.next
    }
    println(sb.toString().trim())
}

fun main() {
    val node5 = Node(1)
    val node4 = Node(2, node5)
    val node3 = Node(3, node4)
    val node2 = Node(2, node3)
    val head = Node(1, node2)

    println("Original list:")
    printList(head)

    deleteDuplicates(head)

    println("List after removing duplicates:")
    printList(head)
}
