package ball

class Ball(val type : Boolean = true, volumeNeeded : Int){

    var volume : Int

    init{
        println("I am in first init block")
        if (type)
            volume = volumeNeeded
        else
            volume = volumeNeeded/2
    }

    constructor(numberOfBalls : Int) : this(true, 40){
        volume = numberOfBalls * volume
    }

    init {
        println("I am in second init block")
    }

    init {
        println("I am in third init block")
    }

    constructor(ballName : String) : this(false, 50){

        if (type)
            println("my $ballName is Big")
        else
            println("my $ballName is small")
    }

    init {
        println("I am in fourth init block")
    }

}