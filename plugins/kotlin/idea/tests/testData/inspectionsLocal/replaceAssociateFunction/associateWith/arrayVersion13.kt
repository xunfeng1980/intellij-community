// LANGUAGE_VERSION: 1.3
// PROBLEM: none
// WITH_STDLIB
fun getValue(i: Int): String = ""

fun test() {
    arrayOf(1).<caret>associate { it to getValue(it) }
}