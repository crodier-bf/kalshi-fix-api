@file:JvmName("TimeInForceQuickFixExtensions")

package com.fbg.api.fix.enums

import quickfix.field.TimeInForce as QuickFixTimeInForce

fun TimeInForce.toQuickfix(): QuickFixTimeInForce = QuickFixTimeInForce(fixValue)

fun TimeInForce.Companion.fromQuickfix(tif: QuickFixTimeInForce): TimeInForce? = fromFix(tif.value)