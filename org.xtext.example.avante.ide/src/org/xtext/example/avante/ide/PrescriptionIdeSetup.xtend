/*
 * generated by Xtext 2.16.0
 */
package org.xtext.example.avante.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.example.avante.PrescriptionRuntimeModule
import org.xtext.example.avante.PrescriptionStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class PrescriptionIdeSetup extends PrescriptionStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new PrescriptionRuntimeModule, new PrescriptionIdeModule))
	}
	
}
