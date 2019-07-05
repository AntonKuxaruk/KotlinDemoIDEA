import java.util.*

fun main(args: Array<String>) {

    val wordArray1 = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
    val wordArray2 = arrayOf("empowered", "leveraged", "aligned", "targeted")
    val wordArray3 = arrayOf("process", "paradigm", "solution", "portal", "vision")

    val arraySize1 = wordArray1.size
    val arraySize2 = wordArray2.size
    val arraySize3 = wordArray3.size

    val rand1 = (Math.random() * arraySize1).toInt()
    val rand2 = (Math.random() * arraySize2).toInt()
    val rand3 = (Math.random() * arraySize3).toInt()

    val phrase0 = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"
    val phrase1 = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"
    val phrase2 = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"

    val phAr = arrayOf(phrase0, phrase1, phrase2)

    phAr.forEach (System.out::print)
    for (i in phAr){
        println(i)
    }
    
}