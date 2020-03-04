package cubic

class Cubic(var width : Int = 100, var height : Int = 50, var length : Int = 45) {

    var ballVolume : Int = 20
    fun volume() = width * height * length

    constructor(numberOfBalls : Int) : this(){
        ballVolume = numberOfBalls * 20
    }

}