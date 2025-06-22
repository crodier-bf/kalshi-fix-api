@file:JvmName("ExecutionTypeQuickFixExtensions")

package com.fbg.api.fix.enums

import quickfix.field.ExecType

fun ExecutionType.toQuickfix(): ExecType = ExecType(fixValue)

fun ExecutionType.Companion.fromQuickfix(execType: ExecType): ExecutionType? = fromFix(execType.value)