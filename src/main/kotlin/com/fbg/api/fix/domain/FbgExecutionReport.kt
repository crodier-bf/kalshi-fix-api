package com.fbg.api.fix.domain

import quickfix.field.ExecType
import quickfix.field.OrdStatus

data class FbgExecutionReport(
    val kalshiOrderId: String,
    val fixOrderId: String,
    val fixExecutionId: String,
    val execType: ExecType,
    val ordStatus: OrdStatus,
    val betStatus: BetFanaticsOrderState,
    val rejectionReason: String? = null,

    // Note:
    //  metadata can be important; if we need to add fields, without re-deploying the model everywhere
    //  Otherwise, need heavy lifting with Conflent Schema registry etc.
    val metadata: Map<String, Any> = emptyMap()
) {
//    companion object {
//        fun fromFix(fixReport: ExecutionReport): FbgExecutionReport {
//            return FbgExecutionReport(
//                fixOrderId = fixReport.getOrderID().getValue(),
//                fixExecutionId = fixReport.getExecID().getValue(),
//                execType = fixReport.execType,
//                ordStatus = fixReport.ordStatus,
//                betStatus = FbgOrderStateMapper.fromFix(fixReport.execType, fixReport.ordStatus),
//
//            )
//        }
//    }
}