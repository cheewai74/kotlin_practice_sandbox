class Student(
    age:Int,
    firstName: String,
    lastName:String
): Person(age, firstName, lastName){

    override fun printName() {
        super.printName()
        println("Student: $firstName, $lastName")
    }
}