@file:JvmName("TradingSideQuickFixExtensions")

package com.fbg.api.fix.enums

import quickfix.field.Side

fun TradingSide.toQuickfix(): Side = Side(fixValue)

fun TradingSide.Companion.fromQuickfix(side: Side): TradingSide? = fromFix(side.value)