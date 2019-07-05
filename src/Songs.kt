class Song(val title: String, val artist: String) {
    fun play() {
        println("Playing the song $title by $artist")
    }

    fun stop() {
        println("Stopped playing $title")
    }
}

class TapeDeck {
    var hasRecorder = false
    fun playTape() {
        println("Tape playing")
    }
    fun recordTape() {
        if (hasRecorder) {
            println ("Tape recording")
        }
    }
}

class DVDPlayer(var hasRecorder: Boolean) {
    fun recordDVD() {
        if (hasRecorder) {
            println("DVD recording")
        }
    }
}

fun main(args: Array<String>) {

    var songOne = Song("The Mesopotamians", "They Might Be Giants")
    var songTwo = Song("Going Underground", "The Jam")
    var songThree = Song("Make Me Smile", "Steve Harley")
    songTwo.play()
    songTwo.stop()
    songThree.play()

    var t = TapeDeck()
    t.hasRecorder = true
    t.playTape()
    t.recordTape()

    val d = DVDPlayer(true)
    d.recordDVD()
}