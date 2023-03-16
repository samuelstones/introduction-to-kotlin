fun main(args: Array<String>) {

    print("Enter your weight")
    var weight :Int = readLine()!!.toInt()
    println(weight)

    print("Enter your height")
    var height :Float = readLine()!!.toFloat()
    println(height)



    var bmi = weight / (height * height)
    if (bmi <= 40){
        println("underweight")
    }
    else if (bmi <=55){
        println("Normal Weight")
    }
    else if (bmi <= 83){
        println("overweight")
    }
    else{
        println("Obese")
    }






}