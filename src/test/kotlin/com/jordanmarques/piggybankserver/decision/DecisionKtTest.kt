package com.jordanmarques.piggybankserver.decision

import com.jordanmarques.piggybankserver.core.event.Event
import com.jordanmarques.piggybankserver.core.command.Command
import com.jordanmarques.piggybankserver.core.event.Tag.BUISNESS
import com.jordanmarques.piggybankserver.core.decision.decide
import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals


internal class DecisionKtTest {

    @Test
    fun `should emit an debit event when receive a debit command`() {
        val debitCommand = Command.Debit(10.0)

        val returnedEvent = decide(debitCommand)

        assertEquals(returnedEvent, Event.Debit(10.0, BUISNESS))
    }
}
