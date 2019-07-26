package genericsdemo

abstract class Pet(var name: String )

class Cat(name: String) : Pet(name)
class Dog(name: String) : Pet(name)
class Fish(name: String) : Pet(name)

class Vet<T : Pet>{
    fun treat(t : T){ println("Treat Pet ${t.name}") }
}

