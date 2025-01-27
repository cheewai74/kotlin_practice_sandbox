//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun printGreeting(){
    println("Hello Everyone")
}

fun getGreeting(): String{
    return "Hello Kotlin"
}

fun getMessageWithWhen(input: Int) = when (input){
    3 -> "Value is 3"
    else -> "Value is not 3, value is $input"
}

var greetingFunction: (String) -> String = {
    "Hello $it"
}

fun printCalculatedValue(value1: Int, value2: Int, calculator:(Int, Int) -> Int){
    println("The value is ${calculator(value1, value2)}")
}

fun getMessage(input: Int): String{
    return if(input > 3){
        "Greater than 3"
    }
    else{
        "Not greater than 3"
    }
}

fun getMssg(input: Int)= if(input > 3){
        "Greater than 3"
    } else{
        "Not greater than 3"
    }

fun checkType(input: Any){
    if(input is String){
        println("Input is String with length ${input.length}")
    }

    if(input !is Int){
        println("Input is not an Int")
    }
}

fun cny_greetings(greeting: String, items: Array<Any>){
    for (item in items){
        println("$greeting $item")
    }
}
interface StringProvider{

    val placeholder: String
    fun getString(id: Int): String = id.toString()
}

interface ResourceProvider: StringProvider{
    fun getDimension(id: Int): Long = id.toLong()
}

const val DEFAULT_CLICK_DELAY = 500

private fun log(error: Throwable) = println(error)


//class DefaultResourceProvider: StringProvider{
//
//    override fun getString(id: Int): String {
//        return "id: $id"
//    }
//}

class DefaultResourceProvider: ResourceProvider{

    override val placeholder: String = "<placeholder>"

    override fun getString(id: Int): String {
        return "id: $id"
    }

    override fun getDimension(id: Int): Long{
        return id.toLong()
    }
}

fun xmas_greetings(greeting: String, vararg items: Any){
    for (item in items){
        println("$greeting $item")
    }
}

val Int.isEven: Boolean
    get() = this.mod(2) == 0


class CustomThread: Thread(){
    override fun run() {
        super.run()
        println("CustomThread.run")
    }

    companion object {
        fun start() {
            println("CustomThread.start")
        }
    }
}


fun main() {

    println("Hello Database")
//    Database.connect()

//    CustomThread.start()

//    val appLogger = ApplicationLogger(SimpleLogger())
//    appLogger.log("Example", appLogger)

//    val viewModel = ViewModel()
//    viewModel.search("Kotlin")
//    viewModel.search("Code")

//    val duration = hourInMills

//    millisForHours(5)
//    4.millisForHours()
//    10.millisForHours()
//
//    "[abc]+".toRegex()
//
////    println(8.isEven)
////    println(7.isEven)
//    5.log()
//    "sample string".log()
//    listOf(1,2,3).log()

//    val controller = SearchController.create("Kotlin")
//

//    SearchController.MAX_RESULTS
//    println(NetworkConfig.baseUrl)
//    println(NetworkConfig.getNetworkDetails())
//
//    val provider:NetworkInfoProvider = object: NetworkInfoProvider{
//        override fun getNetworkDetails(): String {
//            TODO("Not yet implemented")
//        }
//    }

//    val task1 = Task("Build search feature")
//    val task2 = Task("Add analytics")
//
//    println(task1.name)
//    println(task2.name)
//
//    val task2Copy = task2.copy()
//    if(task1.name == task2.name){
//        println("Task are the same")
//    }
//    else{
//        println("Task are different")
//    }
//
//    if(task2Copy == task2){
//        println("Task are the same")
//    }
//    else{
//        println("Task are different")
//    }

//    val direction: Direction = Direction.SOUTH
//
//    println(direction.name)
//    println(direction.ordinal)
//
//    val parsedDirection = Direction.valueOf("SOUTH")
//    println(direction.name)
//
//    val apiValue = Direction.values()[3]
//    println(apiValue.name)
//
//    val color = HighlightColor.BLUE
//    println(color.value)

//    val someVariable: Any?= null
//    if(someVariable is StringProvider){
//        println("The variable was a StringProvider")
//    }
//
//    var stringProvider: StringProvider = DefaultResourceProvider()
//    println(stringProvider.getString(5))
//    println(stringProvider.placeholder)

//    println("Hello World")
//    val person : Person = Student(15,"Jimmy","Tan")
//    println(person.age)
////    println(person.firstName)
////    println(person.lastName)
//    person.printName()


//    val name = "Kotlin"
//    var ourFirstVariable: Boolean = true
//    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//    // to see how IntelliJ IDEA suggests fixing it.
//    println(ourFirstVariable)
//    ourFirstVariable = false
//    println(ourFirstVariable)
//    println("Hello, " + name + "!")
//    println(10.5.toInt())
//
//    var someVariable = 5
//    val mssg = if (someVariable > 3){
//        "The value was greater than 3"
//    }
//    else{
//        "The value was not greater than 3"
//    }
//    println(mssg)
//    println(getMessage(3))
//
//    val mssg2 = when(someVariable){
//        3 -> "The value is 3"
//        else -> "The value is not 3"
//    }
//    println(mssg2)
//    println(getMessageWithWhen(4))
//
//    if (true)
//    {
//        val message = "Complex logic here"
//        println(message)
//    }
//    val raw = """ tomorrow
//      is a
//        |better worls
//    """
//    println(raw)
//
//    var aNumber = 10
//    when{
//        aNumber > 5 -> println("The value is greater than 5")
//        aNumber > 2 -> println("The value is greater than 2")
//        else -> println("Not greater")
//    }
//
//    val concatTemplate = "The number ${1 + aNumber}"
//    println(concatTemplate)
//
//    var  aNullableString: String? = null
//    println(aNullableString?.length)
//    println(aNullableString?.length ?: "the value was null")
//    aNullableString = "kotlin"
//    println(aNullableString!!.length)
//
//    for (i in 1..5) {
//        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//        println("i = $i")
//    }
//
//    printGreeting()
//    println(getGreeting())

//    greetingFunction()
//    greetingFunction = {
//        println("Hello Super Kotlin")
//    }
//    greetingFunction.invoke()

//    printCalculatedValue(2, 2, {value1, value2 -> value1 + value2 })
//    printCalculatedValue(2, 2, {value1, value2 -> value1 - value2 })


//    try{
//        val message = "The value is ${10 / 0}"
//    }
//    catch(error: Throwable){
//        println("Error was thrown")
//    }

//    val message = try {
//        "The value is ${10 / 1}"
//    } catch (error: ArithmeticException){
//        "Error was thrown"
//    }catch (error: java.lang.IllegalStateException){
//        "Error was illegalState"
//    }
//    println(message)

//    val aGenericVariable: Any = 5
//    val anIntVariable: Int = aGenericVariable as Int

//    val aGenericVariable: Any = 5
//    checkType(aGenericVariable)

//    val aGenericVariableString: Any = "A String"
//    checkType(aGenericVariableString)
//
//    var counter = 0

//    while (counter < 5){
//        println(counter)
//        if (counter == 3) break
//        counter++
//    }

//    do{
//        println(counter)
//        counter += 1
//    }while(counter < 5)

//    for ( i in 0  until  5) println(i)

//    for ( i in 10 downTo 0) println(i)
//    for ( i in 10 downTo 0 step 3) println(i)

//    val ints = arrayOf(1,2,3,4,null)
//    val nulls = arrayOfNulls<Int>(5)
//    val custom = Array(5){ index -> index}
//
//    val sizeOfArray = ints.size
//    println(sizeOfArray)
//
//    val firstValue = ints.get(0)
//    println(firstValue)
//
//    ints.set(1,88)
//    println(ints[1])
//
//    val primitiveInts = intArrayOf(1,2,3,4,5)
//    val primitiveUShorts = ushortArrayOf(1u, 2u, 3u, 4u, 5u)
//
//    for (i in 0 until ints.size){
//        println(ints[i])
//    }
//
//    for (element in ints){
//        println(element)
//    }
//
//    ints.forEach { element -> println(element) }
//
//    cny_greetings("Hello... ", arrayOf(" Gong Xi ", " Fa Cai "))
//    xmas_greetings("Hello", " Merry ", " Christmas ", " and a Happy New Year")

//    val stingList: List<String> = listOf("Kotlin","Code","Java")
//
//    val listofInt = listOf(1,2,3,null)
//
//    val doubledValues = List<Int>(5){
//        index -> 2 * index
//    }
//
//    doubledValues.forEach{println(it)}
//
//    val emptyStringList: List<String> = emptyList()


//    val languages: Set<String> = setOf("Kotlin","java","c++", "kotlin")
//    for (language in languages){
//        println(language)
//    }
//
//    languages.size
//    println(languages.contains("Kotlin"))
//
//    val prglanguages: MutableSet<String> = mutableSetOf("Kotlin","java","c++", "kotlin")
//    for (language in prglanguages){
//        println(language)
//    }
//
//    prglanguages.add("swift")
//    prglanguages.add("javascript")
//
//    for (language in prglanguages){
//        println(language)
//    }
//
//    prglanguages.remove("javascript")
//
//    for (language in prglanguages){
//        println(language)
//    }
//
//    val testScores = mapOf(Pair(123, 91.2), Pair(456, 84.5), 789 to 79.1)
//    println(testScores[123])
//
//    for(record in testScores){
//        println("score for user ${record.key} was ${record.value}")
//    }
//
//    for((id, record) in testScores){
//        println("score for user ${id} was ${record}")
//    }
//
//    println(testScores.containsKey(123))
//    println(testScores.containsValue(100.0))
//
//    testScores.keys.forEach { println(it) }
//
//    val testScoresChem = mutableMapOf(Pair(123, 91.2), Pair(456, 84.5), 789 to 79.1)
//    testScoresChem[111] = 97.8
//    testScoresChem.put(222, 72.1)
//
//    for((id, record) in testScoresChem){
//        println("score for user ${id} was ${record}")
//    }

//    val readOnlyList = listOf(1,2,3)
//    val readOnlySet = setOf(1,2,3)
//    val readOnlyMap = mapOf(1 to "a", 2 to "b")
//
//    val mutableList = mutableListOf(1,2,3)
//    val mutableSet = mutableSetOf(1,2,3)
//    val mutableMap = mutableMapOf(1 to "a", 2 to "b")
//
//    mutableList.size
//    readOnlyMap.size
//
//    mutableSet.isEmpty()
//    readOnlyList.isNotEmpty()
//
//    for (element in readOnlySet){
//        println(element)
//    }
//
//    mutableMap.forEach{key, value -> println(value)}
//
//    readOnlyList.first()
//    mutableSet.first()
//
//    mutableList.take(3)
//    readOnlySet.take(2)
//
//    mutableMap.filter { entry -> entry.key < 2 }
//    readOnlyList.filter{value -> value > 1}
//
//    val languages = mapOf(
//        "kotlin" to 5,
//        "java" to 3,
//        "javascript " to 4,
//        "c++" to 2,
//        "python" to 6
//    )
//
//    languages.filter {it.value >= 4}.map{it.key}.sorted().forEach { println(it) }

//    print("Enter a filename")
//    val filename = readLine() ?: ""
//    println("You entered: $filename")

}