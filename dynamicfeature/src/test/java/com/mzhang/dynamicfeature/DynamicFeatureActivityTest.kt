package com.mzhang.dynamicfeature

import org.junit.Test
import org.junit.Assert.*

import org.junit.runner.RunWith

class DynamicFeatureActivityTest {

    @Test
    fun doMathPlus_successful() {
        assertEquals(DynamicFeatureActivity().doMathPlus(1,2), 3)
        assertEquals(DynamicFeatureActivity().doMathPlus(0,2), 2)
    }

    @Test
    fun doMathTimes_successful() {
        assertEquals(DynamicFeatureActivity().doMathTimes(1,2), 2)
        assertEquals(DynamicFeatureActivity().doMathTimes(0,2), 0)
    }
}