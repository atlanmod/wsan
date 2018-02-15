/*
 * generated by Xtext 2.13.0
 */
package lang.scoping

import lang.iotlang.IotlangPackage
import java.util.ArrayList
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.IScope
import lang.util.Helpers

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class IotlangScopeProvider extends AbstractIotlangScopeProvider {
	private val iotlangInstance = IotlangPackage.eINSTANCE;
	protected ArrayList EMPTY = new ArrayList();
	
	override getScope(EObject context, EReference reference) {
		
		if (reference==iotlangInstance.rule_Things) {
			return Scopes.scopeFor( Helpers.allThings(Helpers.findContainingModel(context)) );
		}else if (reference == iotlangInstance.rule_Res) {
			return Scopes.scopeFor( Helpers.allThings(Helpers.findContainingModel(context)) );
		}else if (reference == iotlangInstance.instanceThing_Type) {
			return Scopes.scopeFor( Helpers.allThings(Helpers.findContainingModel(context)) );
		}else if (reference == iotlangInstance.instancePolicy_TypePolicy) {
			return Scopes.scopeFor( Helpers.allPolicies(Helpers.findContainingModel(context)) );
		}else if (reference == iotlangInstance.enforce_InstPolicy) {
			return Scopes.scopeFor( Helpers.allConfigs(Helpers.findContainingModel(context)).get(0).instPolicies );
		}else if (reference == iotlangInstance.instanceBus_TypeBus) {
			return Scopes.scopeFor( Helpers.allBuses(Helpers.findContainingModel(context)) );
		}else if (reference == iotlangInstance.bind_Thinginst) {
			return Scopes.scopeFor( Helpers.allConfigs(Helpers.findContainingModel(context)).get(0).instances );
		}else if (reference == iotlangInstance.bind_BusInst) {
			return Scopes.scopeFor( Helpers.allConfigs(Helpers.findContainingModel(context)).get(0).instancesBus );
		}else if (reference == iotlangInstance.bind_Channels) {
			return Scopes.scopeFor( Helpers.allTopics(Helpers.findContainingModel(context)) );
		}else {
			System.err.println("INFO: Resolving reference : " + reference.name + " in Class " + (reference.eContainer as ENamedElement).getName);
		}
		return Scopes.scopeFor( EMPTY );
	}
	
	
}
