class Rabbit {
    var hanger = 10
    val food = "carrot"

    fun eat() = println("The rabbit is eating $food")
}

class MeRabbit {
    var rabbit: Rabbit? = Rabbit()

    fun meFunc() = rabbit?.eat()
}

fun getAlfRabbit() : Rabbit? { return Rabbit() }

fun main(args: Array<String>) {
    var r: Rabbit? = Rabbit()

    if (r != null) r.eat()

    var x = r?.hanger
    println("The value of x is $x")

    var y = r?.hanger ?: -1
    println("The value of y is $y")

    var meRbt = MeRabbit()
    meRbt?.rabbit?.hanger = 8
    println("The value of meRbt?.rabbit?.hanger is ${meRbt?.rabbit?.hanger}")

    var meArr = arrayOf("La", "Da", "Za", null)
    for (item in meArr) {item?.let{ println(it)}}

    getAlfRabbit()?.let { it.eat() }

    r = null

    //var z = r!!.hunger

    exDemoFun("WqYes")  ;   println()
    exDemoFun("Yes")  ;   println()

    val mL = mutableListOf("Aa","Bb","Cc")
       println(mL)
    mL.add(1, "Zz")
       println(mL)

    val toRetain = listOf("Milk", "Sugar", "Zz")
    mL.retainAll(toRetain)
       println(mL)

    val friendSet = setOf("Jim","Sue","Sue","Nick","Nick")
    println(friendSet)

    val dm = mutableListOf("dm")
    dm.addAll(friendSet)
    dm.addAll(toRetain)
    println(dm)

    val mutMap = mutableMapOf(1 to "Q", 2 to "W", 3 to "R")
    println(mutMap)
    val mpToAdd = mapOf(4 to "F", 5 to "V")
    mutMap.putAll(mpToAdd)
    println(mutMap)
    mutMap.forEach { t, u ->  println("$t $u")}
    for ((k,v) in mutMap){
        print("$k = $v | ")
    }




}

class BadException :  Exception()

fun exDemoFun(test: String){
    try {
        print("t ")
        riskyCode(test)
        print("o ")
    } catch (e: BadException){ print("a ")}
    finally { print("w ") }
    print("s ")
}

fun riskyCode(test: String){
    print("h ")
    if (test == "Yes") { throw BadException() }
    print("r ")
}
