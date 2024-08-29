import kotlin.test.*

class StackTest {
    @Test
    fun test1() {
        val s = Stack<Int>()
        s.push(10)
        s.push(20)
        s.push(30)
        assertEquals(30, s.peek())
        assertEquals(30, s.pop())
        assertFalse(s.isEmpty())
        assertEquals(20, s.peek())
        assertEquals(20, s.pop())
        assertFalse(s.isEmpty())
        assertEquals(10, s.peek())
        assertEquals(10, s.pop())
        assertTrue(s.isEmpty())
        assertFailsWith<Exception> {s.pop()}
        s.push(10)
        s.push(20)
        s.push(30)
        assertEquals(30, s.peek())
        assertEquals(30, s.pop())
        assertEquals(20, s.peek())
        assertEquals(20, s.pop())
        assertEquals(10, s.peek())
        assertEquals(10, s.pop())
    }
}
