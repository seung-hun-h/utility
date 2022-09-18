package com.hsh.utility.digitconversion

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class DigitConversionServiceTest {
	@Autowired
	private val sut: DigitConversionService? = null

	@Test
	@DisplayName("2진수를 8진수로 변환한다")
	fun convert2To8() {
		// given
		val binaryValue = "101101111101"

		// when
		val result = sut!!.convert(DigitType.BINARY, DigitType.OCTAL, binaryValue)

		// then
		Assertions.assertThat(result).isEqualTo("5575")
	}

	@Test
	@DisplayName("8진수를 2진수로 변환한다")
	fun convert8To2() {
		// given
		val binaryValue = "5575"

		// when
		val result = sut!!.convert(DigitType.OCTAL, DigitType.BINARY, binaryValue)

		// then
		Assertions.assertThat(result).isEqualTo("101101111101")
	}

	@Test
	@DisplayName("2진수를 16진수로 변환한다")
	fun convert2To16() {
		// given
		val binaryValue = "101101111101"

		// when
		val result = sut!!.convert(DigitType.BINARY, DigitType.HEXADECIMAL, binaryValue)

		// then
		Assertions.assertThat(result).isEqualTo("b7d")
	}

	@Test
	@DisplayName("16진수를 2진수로 변환한다")
	fun convert16To2() {
		// given
		val binaryValue = "b7d"

		// when
		val result = sut!!.convert(DigitType.HEXADECIMAL, DigitType.BINARY, binaryValue)

		// then
		Assertions.assertThat(result).isEqualTo("101101111101")
	}

	@Test
	@DisplayName("8진수를 16진수로 변환한다")
	fun convert8To16() {
		// given
		val binaryValue = "5575"

		// when
		val result = sut!!.convert(DigitType.OCTAL, DigitType.HEXADECIMAL, binaryValue)

		// then
		Assertions.assertThat(result).isEqualTo("b7d")
	}

	@Test
	@DisplayName("16진수를 8진수로 변환한다")
	fun convert16To8() {
		// given
		val binaryValue = "b7d"

		// when
		val result = sut!!.convert(DigitType.HEXADECIMAL, DigitType.OCTAL, binaryValue)

		// then
		Assertions.assertThat(result).isEqualTo("5575")
	}
}