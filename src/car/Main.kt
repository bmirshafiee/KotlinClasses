package car

fun main(){
    buildCar()
}

fun buildCar(){
    val myCar = Car()

    myCar.speed = 10
    myCar.gear = 6
    myCar.seat = 2

    println("the new speed is :" + myCar.speedUp())

    println("The speed is : ${myCar.speed}\n" +
            "The gear is : ${myCar.gear}\n"+
            "The seat is : ${myCar.seat}")


}