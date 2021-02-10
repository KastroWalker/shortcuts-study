package atlantico.todoapp

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("atlantico.todoapp")
		.start()
}

