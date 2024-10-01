package com.doyeinc.cloudwatchman

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CloudwatchmanApplication

fun main(args: Array<String>) {
    runApplication<CloudwatchmanApplication>(*args)
}
