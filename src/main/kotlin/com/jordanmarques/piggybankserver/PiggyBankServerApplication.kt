package com.jordanmarques.piggybankserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PiggyBankServerApplication

fun main(args: Array<String>) {
	runApplication<PiggyBankServerApplication>(*args)
}
