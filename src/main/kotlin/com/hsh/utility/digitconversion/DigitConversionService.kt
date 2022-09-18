package com.hsh.utility.digitconversion

import org.springframework.stereotype.Service

@Service
class DigitConversionService {
	fun convert(from: DigitType, to: DigitType, number: String): String {
		val decimalValue = number.toInt(from.value)
		return decimalValue.toString(to.value)
	}
}