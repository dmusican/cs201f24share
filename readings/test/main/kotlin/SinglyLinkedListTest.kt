import kotlin.test.*

class SinglyLinkedListTest {
    @Test
    fun testListOperations() {
        val list = SinglyLinkedList<Int>()
        list.insertAtBeginning(1)
        list.insertAtBeginning(2)
        list.insertAtBeginning(3)
        assertTrue(list.search(1))
        assertTrue(list.search(2))
        assertTrue(list.search(3))
        assertFalse(list.search(4))
        assertEquals(3, list.length())
        list.insertAtEnd(8)
        assertEquals("3 2 1 8", list.toString())
        list.insertAtPosition(0, 10)
        list.insertAtPosition(1, 11)
        list.insertAtPosition(2, 12)
        list.insertAtPosition(4, 13)
        list.insertAtPosition(8, 14)
        assertEquals("10 11 12 3 13 2 1 8 14", list.toString())
        list.removeFirstNode()
        assertEquals("11 12 3 13 2 1 8 14", list.toString())
        list.removeLastNode()
        assertEquals("11 12 3 13 2 1 8", list.toString())
        list.deleteAtPosition(0)
        assertEquals("12 3 13 2 1 8", list.toString())
        list.deleteAtPosition(4)
        assertEquals("12 3 13 2 8", list.toString())
        list.deleteAtPosition(4)
        assertEquals("12 3 13 2", list.toString())
    }
}
