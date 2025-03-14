package io.muun.apollo.presentation.ui.new_operation

import io.muun.apollo.presentation.analytics.AnalyticsEvent

enum class NewOperationOrigin {
    SEND_CLIPBOARD_PASTE,
    SEND_MANUAL_INPUT,
    SEND_CONTACT,
    SCAN_QR,
    EXTERNAL_LINK;

    fun toAnalyticsEvent(): AnalyticsEvent.S_NEW_OP_ORIGIN  =
        AnalyticsEvent.S_NEW_OP_ORIGIN.fromModel(this)
}