package `2_linked-lists`

fun main(args: Array<String>) {

    var myList = SLL()
    myList.addBack(1)
    myList.addBack(2)
    myList.addBack(3)
    myList.addBack(4)
    myList.addBack(5)
    myList.addBack(6)
    myList.addBack(7)
    myList.addBack(8)
    myList.addBack(9)
    myList.addBack(10)

    var head: Node? = myList.head

    println(KthLast().kthLast1(head, 4))
    println(KthLast().kthLast2(head, 4))

}

class KthLast {


    fun listSize(head: Node?): Int {

        var current = head
        var kounter = 0

        while (current != null) {
            kounter++
            current = current.next
        }

        return kounter

    }


    // o(n)
    fun kthLast1(head: Node?, k: Int): Int {

        var tmp = head

        var size = listSize(head)

        if (k > size) return -1

        var limit = size - k

        if (head != null) {
            for (i in 0 until limit) {
                tmp = tmp?.next
            }

            return tmp!!.value
        } else {
            return -1
        }
    }

    fun kthLast2(head: Node?, k: Int): Int {

        if (head == null || k <= 0) {
            return -1
        }

        var slow = head
        var fast = head

        // tam olarak k kadar ilerlesin istiyoruz fast
        // 0 deseydik k+1 ilerlerdi
        for (i in 1..k) {
            fast = fast?.next
            if (fast == null || i < k) {
                return -1
            }
        }

        while (fast != null) {
            slow = slow?.next
            fast = fast.next
        }

        return slow?.value ?: -1
    }

}