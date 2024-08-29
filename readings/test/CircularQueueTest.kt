import kotlin.test.*

class CircularQueueTest {
    @Test
    fun testOperations() {
        val q = CircularQueue<Int>()
        q.enqueue(10)
        q.enqueue(20)
        q.enqueue(30)
        assertEquals("10 20 30", q.toString())
        assertEquals(10, q.dequeue())
        assertFalse(q.isEmpty())
        assertEquals(20, q.dequeue())
        assertFalse(q.isEmpty())
        q.enqueue(40)
        assertEquals("30 40", q.toString())
        assertEquals(30, q.dequeue())
        assertFalse(q.isEmpty())
        assertEquals(40, q.dequeue())
        assertTrue(q.isEmpty())
    }

    @Test
    fun testLoopedOperations() {
        val q = CircularQueue<Int>()
        for (i in 0..1000) {
            q.enqueue(2*i)
            q.enqueue(2*i+1)
            println("---" + q + "---")
            assertEquals(i,q.dequeue())
            println("!--" + q + "---")
        }
    }
}
