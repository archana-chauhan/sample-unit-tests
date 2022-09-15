package com.example.sampleunittests.tests

object ProfileUtil {

    fun validateForm(
        name: String
    ) : Boolean {
        return !name.isEmpty()
    }
}