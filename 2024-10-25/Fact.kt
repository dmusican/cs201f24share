// factorial
// 5!  = 5 * 4 * 3 * 2 * 1

fun fact(n: Int): Int {
    // Base case
    if (n == 1) {
        return 1
    } else {
        // Recursive case
        // wrong code, but deep belief
        return n * fact(n-1)
    }
}
