package `2_linked-lists`

fun main(args: Array<String>) {
    var my_list = SLL()
    my_list.addBack(10)
    my_list.addBack(20)
    my_list.addBack(30)
    my_list.addBack(50)
    my_list.addFront(42)

    println(my_list.getLength())
    my_list.deleteNode(42)

    my_list.printSLL()
}

class Node(var value:Int, var next:Node? = null)

class SLL {

    // we first kreate a head
    var head: Node? = null

//    fun getHead

    fun addFront(value: Int) {
        val newNode = Node(value)

        if (head == null) {
            head = newNode
        } else {
            newNode.next = head
            head = newNode
        }
    }

    fun deleteNode(value: Int) {

        /* burada 'runner technique' kullanılmıstır. yani iki tane
        * pointerla (slower, faster) liste itere edilmiştir. LL'lerde çok kullanılır. */

        var current = head
        var previous: Node? = null

        // Check if the head node itself needs to be removed
        if (current != null && current.value == value) {
            head = current.next
            return
        }

        // Traverse the list to find the node to be deleted
        while (current != null && current.value != value) {
            previous = current
            current = current.next
        }

        // If the node was found, update the previous node's next reference
        if (current != null) {
            previous?.next = current.next
        }
    }


    fun getLength(): Int {
        var kounter = 0

        var current = head

        while (current != null) {
            kounter++
            current = current.next
        }

        return kounter

    }

    fun addBack(value:Int) {
        val newNode = Node(value)

        if (head == null) {
            head = newNode
        } else {
            var current = head
            while (current?.next != null) {
                current = current.next
            }
            current?.next = newNode
        }
    }

    fun printSLL() {
        var current = head

        while (current != null) {
            print("${current.value} -> ")
            current = current.next
        }
        print("NULL")
        println()
    }

}