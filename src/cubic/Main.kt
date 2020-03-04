package cubic

fun main(){
    createCubic()
}

fun createCubic(){
    val myCubic = Cubic(200, 10, 50)

    val myCubic2 = Cubic(height = 50, length = 20)

    val myCubic3 = Cubic(width = 50)

    println("the volume is : ${myCubic.volume()}")

    val myCubic4 = Cubic(numberOfBalls = 20)

    println("the ball volume is : ${myCubic4.ballVolume}")
}