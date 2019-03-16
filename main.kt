fun main() {

    val fizz = 3
    val buzz = 5

    for (i in 1..100) {
        var output = ""

        output += condition(i, fizz, "Fizz")
        output += condition(i, buzz, "Buzz")

        if (output == "") {
            output += i
        }

        print("$output\n")
    }
}

fun condition(count: Int, number: Int, output: String): String {
    return if (count % number == 0) {
        output
    } else {
        ""
    }
}
