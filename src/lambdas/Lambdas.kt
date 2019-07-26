package lambdas

fun main(args: Array<String>) {

    val plusFun = { x: Int, y: Int -> x + y }
    println(plusFun.invoke(1,1))

    val meLb: () -> Unit = { println("Unit return type here.")}
    meLb.invoke()
    println( meLb::class.qualifiedName)
    println( meLb::class.simpleName)

    val x = {"Pow!"}
    val y = { println("Pow!")}
    println(x.invoke() )
    y.invoke()

    val lbd = {c: Double -> c * 1.8 + 32}
    convert( 20.0, {c: Double -> c * 1.8 + 32} )
    convert( 30.0) {c: Double -> c * 1.8 + 32}
    convert( 40.0, lbd)
    convert(100.0,lbd)

    convertFive { it * 1.8 + 32 }

    println( "2.5 кило это ${getConvertLambda("KgsToPnds")(2.5)} фунтов." )

}

fun getConvertLambda(str: String): (Double) -> Double {
    when(str){
        "CentToFahr" -> return { it * 1.8 + 32 }
        "KgsToPnds" ->  return { it * 2.204623 }
        "PndsToTons" -> return { it / 2000 }
        else -> return { it }
    }
}

fun convert(x : Double, converter: (Double )-> Double) : Double {
    val res = converter(x)
    println("$x is converted to $res")
    return res
}

fun convertFive(cnvr: (Int) -> Double) : Double {
    val res =cnvr(5)
    println("5 is converted to $res")
    return res
}