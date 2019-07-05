
fun main(args: Array<String>)
{
    val animals = arrayOf(Animal(),Hippo(), Wolf())
    animals.forEach { println("${it.image}"); it.makeNoise() }

    val canine = Canine()
    val vet = Vet()
    vet.giveShot(canine)
}

open class Animal {

    open val image = "An Animal..."
    open val food = ""
    open val habitat = ""
    open val hunger = 10

    open fun makeNoise(){
        println("The animal is making noise")
    }
    open fun eat(){
        println("The animal is eating")
    }
    open fun roam(){
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

open class Canine : Animal() {
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
    fun giveShot(animal: Animal) = animal.roam()
}