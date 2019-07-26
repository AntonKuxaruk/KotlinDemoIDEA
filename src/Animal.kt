
fun main(args: Array<String>)
{
    val animals = arrayOf(Hippo(), Wolf())
    animals.forEach { println("${it.image}"); it.roam(); it.eat() }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)
    println("--------------------------------------------------------")

    val roamables =  arrayOf(Hippo(), Wolf(), Vehicle())
    for (rmb in roamables){
        rmb.roam()
        if (rmb is Animal) rmb.eat()
    }

    val sd1 = SampleDataClass("sd1", 11)
    val sd2 = SampleDataClass("sd1", 11)
    val sd3 = sd2.copy(p2=13)
    val( p1, p2) = sd3

    print(sd1.equals(sd2)); print(" ${sd2 === sd1} "); print(sd2 === sd3); println( " " + sd2.equals(sd3))
    println("${sd1.hashCode()} ${sd2.hashCode()}")
    println("$sd3 $p1 $p2")



}

interface Roamable {
    fun roam()
}
class Vehicle : Roamable {
    override fun roam() = println("The vehicle is roaming")
}

abstract class Animal : Roamable {

    abstract val image : String
    abstract val food : String
    abstract val habitat : String
    open val hunger = 10
            
    abstract fun makeNoise()
    abstract fun eat()
    override fun roam(){
        println("The animal is roaming")
    }
    open fun sleep(){
        println("The animal is sleeping")
    }
}

class Hippo : Animal() {
    override val image = "hippo.jpeg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() = println("Grunt ! Grunt!")
    override fun eat() = println("The Hippo is eating $food...")
}

abstract class Canine : Animal() {
    override fun roam() = println("The Canine is roaming...!")
}

class Wolf : Canine() {
    override val image = "wolf.jpeg"
    override val food = "Meat of the animals"
    override val habitat = "Forests and Steps"

    override fun makeNoise() = println("HoooooWow! HoooooWow!")
    override fun eat() = println("The Wolf is eating $food...")
}

class Vet {
    fun giveShot(animal: Animal) = animal.makeNoise()
}

data class SampleDataClass (val p1 : String, val p2 : Int)