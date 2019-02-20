/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.avante.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.avante.PrescriptionRuntimeModule;
import org.xtext.example.avante.PrescriptionStandaloneSetup;
import org.xtext.example.avante.ide.PrescriptionIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class PrescriptionIdeSetup extends PrescriptionStandaloneSetup {
  @Override
  public Injector createInjector() {
    PrescriptionRuntimeModule _prescriptionRuntimeModule = new PrescriptionRuntimeModule();
    PrescriptionIdeModule _prescriptionIdeModule = new PrescriptionIdeModule();
    return Guice.createInjector(Modules2.mixin(_prescriptionRuntimeModule, _prescriptionIdeModule));
  }
}
