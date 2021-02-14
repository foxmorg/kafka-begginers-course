package com.github.foxmorg

fun main(args: Array<String>){
    val a : ArrayList<String> = ArrayList()
    val b : ArrayList<String>? = ArrayList()

    a.add("1")
    a.add("2")

    val map1 = a.map { convert(it) }
    val map2 = b?.map { convert(it) }

    println(map1)
    println(map2)

}

private fun convert(it: String) : Int {
    return it.toInt()
}
