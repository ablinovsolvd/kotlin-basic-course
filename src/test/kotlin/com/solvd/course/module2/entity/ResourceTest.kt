package com.solvd.course.module2.entity

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class ResourceTest {
    companion object {
        @BeforeAll
        @JvmStatic
        fun globalSetup() {
            println("Global setup: before all tests")
        }

        @AfterAll
        @JvmStatic
        fun globalTearDown() {
            println("Global tear down: after all test")
        }
    }

    @Test
    fun testSomething() {
        //logic
        println("test 1")
        assertTrue(true)
    }

    @Test
    fun testSomething2() {
        //logic
        println("test 2")
        assertTrue(true)
    }
}