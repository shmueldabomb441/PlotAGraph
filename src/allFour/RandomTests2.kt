package allFour

fun main() {
val x = ::printConstructionCost
}
inline fun runSimulation(playerName: String,
                         costPrinter: (Int) -> Unit,
                         greetingFunction: (String, Int) -> String) {

    val numBuildings = (1..3).shuffled().last()   // Randomly selects 1, 2, or 3
    costPrinter(numBuildings)
    println(greetingFunction(playerName, numBuildings))

}
fun printConstructionCost(numBuildings: Int) {
    val cost = 500
    println("construction cost: ${cost * numBuildings}")
}