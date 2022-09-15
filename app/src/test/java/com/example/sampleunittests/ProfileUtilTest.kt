package com.example.sampleunittests

import com.example.sampleunittests.tests.ProfileUtil
import com.google.common.truth.Truth.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class ProfileUtilTest {

    @Test
    fun `empty input returns false`() {
        val result = ProfileUtil.validateForm(
            ""
        )
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `valid input returns true`() {
        val result = ProfileUtil.validateForm(
            "Archana"
        )
        assertThat(result).isEqualTo(true)
    }
}