package genericsdemo

fun main(args: Array<String>) {

    val catFuzz = Cat("Fuzzik")
    val catKatsu = Cat("Katsu")
    val fishFinny = Fish("Finny Flosk")

    val catVet = Vet<Cat>()
    val fishVet = Vet<Fish>()
    val petVet = Vet<Pet>()

    val catCont = Contest<Cat>(catVet)
    catCont.addScore(catFuzz, 50)
    catCont.addScore(catKatsu, 45)
    val topCat = catCont.getWinners().first()
    println("Cat Const winner is: ${topCat.name}")

    val petCont = Contest<Pet>(petVet)
    petCont.addScore(catFuzz, 50)
    petCont.addScore(fishFinny, 56)
    val topPet = petCont.getWinners().first()
    println("Pet Const winner is: ${topPet.name}")

    val fishCont = Contest<Fish>(petVet)

    val dogRetailer : Retailer<Dog> = DogRetailer()
    val catRetailer : Retailer<Cat> = CatRetailer()
    val petRetailer : Retailer<Pet> = CatRetailer()
    petRetailer.sell()

    catVet.treat(catFuzz)
    fishVet.treat(fishFinny)
    petVet.treat(Dog("Wapik"))




}