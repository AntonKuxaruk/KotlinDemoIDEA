fun main (args: Array<String>){
    var x = 3
    val y = 1
    println("Before the loop. x = $x")
    while (x < 4){
        println("In the loop. x = $x")
        x += 1
    }
    println("After the loop. x = $x")

    println(if (x > y) "x is greater than y" else "x is not greater than y")

    for (x in 1..20) print("$x "); println()
    for (x in 1 until 20) print("$x "); println()
    for (x in 1 until 30 step 2) print("$x "); println()
    for (x in 23 downTo 0) print("$x "); println()
}