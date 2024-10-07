package com.lgs.variable

class VariableSample {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val name: String = "Flature"
            val org = "Around"
            var age = 12
//            org = "test" // Val cannot be reassigned
            age = 15

            println("my name is $name")
            println("my org is $org")
            println("my age is $age")
        }
    }
}