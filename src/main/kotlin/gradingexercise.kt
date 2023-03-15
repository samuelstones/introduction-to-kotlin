fun main(args: Array<String>) {


    print("Enter the score")
    var score :Int = readLine()!!.toInt()
    print(score)

    if (score in 80..100) {
        print(",Grade = A,Congratulations")
    }

    else if (score in 75..79) {
        print(",Grade = A-")
    }


    else if (score in 70..74) {
        print(",Grade = B+")
    }

    else if (score in 65..69) {
        print(",Grade = B-")
    }

    else if (score in 60..64) {
        print(",Grade = , C+")
    }

    else if (score in 55..59) {
        print(",Grade = , C")
    }

    else if (score in 50..54) {
        print(",Grade = , C-")
    }

    else if (score in 45..49) {
        print(",Grade = , D+")
    }

    else if (score in 35..44) {
        print(",Grade = , D")
    }

    else if (score in 25..34) {
        print(",Grade = , D-")
    }


    else if (score in 0..25) {
        print(",Repeat the Exam")
    }



    else {

        print("Invalid Marks")

    }



}