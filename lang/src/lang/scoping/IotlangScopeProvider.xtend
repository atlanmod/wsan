/*
 * generated by Xtext 2.13.0
 */
package lang.scoping

import java.util.ArrayList
import lang.iotlang.IotlangPackage
import lang.iotlang.PubSub
import lang.util.Helpers
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.Scopes

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class IotlangScopeProvider extends AbstractIotlangScopeProvider {
	val iotlangInstance = IotlangPackage.eINSTANCE;
	protected ArrayList<EObject> EMPTY = new ArrayList();

	override getScope(EObject context, EReference reference) {
		
		if (reference==iotlangInstance.user_AssignedRoles || reference==iotlangInstance.thing_AssignedRoles) {
			return Scopes.scopeFor( Helpers.allRoles(Helpers.findContainingModel(context)) );
		} else if (reference==iotlangInstance.abstractInstance_TypeInstances) {
			return Scopes.scopeFor( Helpers.allThings(Helpers.findContainingModel(context)) );
		} else if (reference==iotlangInstance.instanceThing_TypeThing) {
			return Scopes.scopeFor( Helpers.allThings(Helpers.findContainingModel(context)) );
		} else if (reference==iotlangInstance.instancePubSub_TypePubSub) {
			return Scopes.scopeFor( Helpers.allPusSub(Helpers.findContainingModel(context)) );
		} else if (reference==iotlangInstance.instanceReqRep_TypeReqRep) {
			return Scopes.scopeFor( Helpers.allReqRep(Helpers.findContainingModel(context)) );
		} else if (reference==iotlangInstance.instanceThing_Owner) {
			return Scopes.scopeFor( Helpers.allUsers(Helpers.findContainingModel(context)) );
		} else if (reference==iotlangInstance.topic_SubtopicOf) {
			return Scopes.scopeFor( Helpers.allTopics(context.eContainer as PubSub));
		} else {
			System.err.println("INFO: Resolving reference : " + reference.name + " in Class " + (reference.eContainer as ENamedElement).getName);
		}
		return Scopes.scopeFor( EMPTY );
	}
}