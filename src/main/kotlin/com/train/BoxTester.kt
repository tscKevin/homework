package com.train

import java.util.*


fun main() {
    val box3 = Box3()
    val box5 = Box5()
    val scanner = Scanner(System.`in`)
    var length:Float?=0f
    var width:Float?=0f
    var height:Int?=0
    while (length!=-1f && width!=-1f && height!=-1) {
        print("Please enter object's length:\t")
        length = scanner.nextFloat()
        if (length<=0) continue
        print("Please enter object's width:\t")
        width = scanner.nextFloat()
        if (width<=0) continue
        print("Please enter object's height:\t")
        height = scanner.nextInt()
        if (height<=0) continue
        if (box3.validate(length,width,height)){
            println("Box3")
        }else if(box5.validate(length,width,height)){
            println("Box5")
        }else{
            println("Too big, sorry no size")
        }
    }
}

open class Box(val length: Float, val width: Float, val height: Int) {
    fun validate(length: Float, width: Float, height: Int) =
        length <= this.length!! && width <= this.width!! && height <= this.height!!
}

class Box3() : Box(23f, 14f, 13)

class Box5() : Box(39.5f, 27.5f, 23)
