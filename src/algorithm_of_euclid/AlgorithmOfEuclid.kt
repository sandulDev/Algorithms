package algorithm_of_euclid

fun main() {
    val result = gcd(10, 15)
    println(result)
}

private fun gcd(p: Int, q: Int): Int {
    if (q == 0) return p
    val r = p % q
    return gcd(q, r)
}