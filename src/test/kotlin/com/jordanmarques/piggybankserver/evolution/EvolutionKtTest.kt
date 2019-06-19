package com.jordanmarques.piggybankserver.evolution

import com.jordanmarques.piggybankserver.core.event.Event
import com.jordanmarques.piggybankserver.core.event.Tag
import com.jordanmarques.piggybankserver.core.evolution.evolve
import com.jordanmarques.piggybankserver.core.state.State
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class EvolutionKtTest {

    @Test
    fun `should return a new state with updated balance on debit event`() {
        val debitEvent = Event.Debit(20.0, Tag.BUISNESS)
        val initialState = State(balance = 23.0)

        val evolvedState = evolve(initialState, debitEvent)

        assertEquals(evolvedState.balance, 3.0)
    }

    @Test
    fun `should return a new state with updated balance on credit event`() {
        val creditEvent = Event.Credit(20.0, Tag.BUISNESS)
        val initialState = State(balance = 23.0)

        val evolvedState = evolve(initialState, creditEvent)

        assertEquals(evolvedState.balance, 43.0)
    }

    @Test
    fun `should return a new state with updated balance after multiple events`() {
        val creditEvent = Event.Credit(20.0, Tag.BUISNESS)
        val initialState = State(balance = 23.0)

        val evolvedState = evolve(initialState, creditEvent)

        assertEquals(evolvedState.balance, 43.0)
    }
}
