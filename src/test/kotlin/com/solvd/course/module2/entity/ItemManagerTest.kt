package com.solvd.course.module2.entity

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ItemManagerTest {
    private lateinit var manager: ItemManager

    @BeforeEach
    fun setUp() {
        manager = ItemManager()
        println("Setup: new manager created")
    }

    @AfterEach
    fun tearDown() {
        manager.clear()
        println("Tear down: manager cleared")
    }

    @Test
    fun testAddItem() {
        manager.add("Apple")
        assertEquals(1, manager.count())
    }

    @Test
    fun testAddMultipleItems() {
        manager.add("Apple")
        manager.add("Banana")
        assertEquals(2, manager.count())
    }

}