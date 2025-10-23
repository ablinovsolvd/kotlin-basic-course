package com.solvd.course.module2.entity

class ItemManager {
    val items = mutableListOf<String>()

    fun add(item: String) {
        items.add(item)
    }

    fun clear() {
        items.clear()
    }

    fun count(): Int {
        return items.size
    }
}