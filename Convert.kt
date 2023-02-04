
// Bikash Chhantyal
// A00265470
// JAV 1001 App Development for Android


fun main(args: Array<String>) {
    println("Enter value: ")
    val value = readLine()!!.toDouble()
//    !! operator is used to assert that value is not null
    println("Please enter the unit of measurement (e.g. km, mi, cm, in, kg, lb, g, oz): ")

    val unit = readLine()!!
//    read unit to which user want to convert

    var result:Double = 0.0
    // the value is stored in result

    if (unit == "km") {
        result = value * 0.62
        println("$value km =  $result mi")
    } else if (unit == "mi") {
        result = value * 1.61
        println("$value mi = $result km")
    } else if (unit == "cm") {
        result = value * 0.39
        println("$value cm = $result in")
    } else if (unit == "in") {
        result = value * 2.54
        println("$value in = to $result cm")
    } else if (unit == "kg") {
        result = value * 2.2
        println("$value kg is = to $result lb")
    } else if (unit == "lb") {
        result = value * 0.45
        println("$value lb i= $result kg")
    } else if (unit == "g") {
        result = value * 0.04
        println("$value g = $result oz")
    } else if (unit == "oz") {
        result = value * 28.35
        println("$value oz = to $result g")
    }else {
        println("Enter a valid Unit.")
    }
}

