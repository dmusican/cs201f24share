// sum up all items in a list
fun sumup(nums: List<Int>): Int {
    if (nums.count() == 0) {
        return 0
    } else {
        return nums[0] +
            sumup(nums.subList(1,
                        nums.count()))
    }
}

fun main() {
    val list = listOf(1, 9, 3, 4)
    println(sumup(list))
}
