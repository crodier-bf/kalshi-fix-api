@file:JvmName("OrderTypeQuickFixExtensions")

package com.fbg.api.fix.enums

import quickfix.field.OrdType

fun OrderType.toQuickfix(): OrdType = OrdType(fixValue)

fun OrderType.Companion.fromQuickfix(ordType: OrdType): OrderType? = fromFix(ordType.value)