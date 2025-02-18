fun main () {
    println("---------------------------------------------------")
    println("Story teller infinite")
    println("---------------------------------------------------")
    println()
    println()
    println()
    var name = getString("Before we start, who are you? ")
    println("What a lovely name, $name")
    println()
    println()
    println("Thank you for playing this game, lets start!")
    var person = getString("Enter a person's name ")
    var genderpro = getString("Enter $person 's gender in pronoun form. eg: he ")
    var gender = getString("Enter $person 's gender. eg: boy ")
    var genderpss = getString("Enter $person 's gender in possessive form. eg: his ")
    var person2 = getString("Enter another person's name ")
    var genderpss2 = getString("Enter $person2 's gender in possessive form eg: his ")
    var ingVerb = getString("Enter a verb ending with ~ing ")
    var edVerb = getString("Enter a verb ending with ~ed ")
    var baseVerb = getString("Enter a base verb eg: sleep ")
    var adverb = getString("Enter a adverb eg: sweetly ")
    var thing = getString("Enter an object ")
    var animal = getString("Enter a animal ")

    println("Thank you for doing that")
    println("The following is your sentence")
    println(" Once, a $gender named $person was minding $genderpss business when $genderpro found a $thing and started $ingVerb it up," +
            " $person2 watched this with $genderpss2 $animal as they $edVerb themselves to $baseVerb $adverb . ")




}

















fun getString(prompt: String) : String {
    var userInput: String
    while(true) {
        print(prompt)

        userInput = readln()
        if (userInput.isNotBlank()) break
    }
    return userInput
}