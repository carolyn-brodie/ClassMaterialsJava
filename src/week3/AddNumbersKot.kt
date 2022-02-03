package week3

class AddNumbersKot(var name:String) {

    fun aFunction(newName : String) {
        name = newName
    }

    fun printName() {
        println("name is " + name)
    }

    fun main(args: Array<String>) {
        val x = AddNumbersKot("suzy")
        x.printName()
    }
}