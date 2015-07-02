package hu.bme.mit.incquery.ecorequeries.example;

import hu.bme.mit.incquery.ecorequeries.example.EReferenceWithOneMultiplicityMatch;
import hu.bme.mit.incquery.ecorequeries.example.util.EReferenceWithOneMultiplicityQuerySpecification;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;

/**
 * Generated pattern matcher API of the hu.bme.mit.incquery.ecorequeries.example.EReferenceWithOneMultiplicity pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link EReferenceWithOneMultiplicityMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * ERef is an EReference with a 1-1 multiplicity constraint
 *   
 * 
 * pattern EReferenceWithOneMultiplicity(ERef) = {
 * 	EReference(ERef);
 * 	ETypedElement.lowerBound(ERef,1);
 * 	ETypedElement.upperBound(ERef,1);
 * }
 * </pre></code>
 * 
 * @see EReferenceWithOneMultiplicityMatch
 * @see EReferenceWithOneMultiplicityProcessor
 * @see EReferenceWithOneMultiplicityQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class EReferenceWithOneMultiplicityMatcher extends BaseMatcher<EReferenceWithOneMultiplicityMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static EReferenceWithOneMultiplicityMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    EReferenceWithOneMultiplicityMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new EReferenceWithOneMultiplicityMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_EREF = 0;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(EReferenceWithOneMultiplicityMatcher.class);
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet).
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public EReferenceWithOneMultiplicityMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public EReferenceWithOneMultiplicityMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pERef the fixed value of pattern parameter ERef, or null if not bound.
   * @return matches represented as a EReferenceWithOneMultiplicityMatch object.
   * 
   */
  public Collection<EReferenceWithOneMultiplicityMatch> getAllMatches(final EReference pERef) {
    return rawGetAllMatches(new Object[]{pERef});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pERef the fixed value of pattern parameter ERef, or null if not bound.
   * @return a match represented as a EReferenceWithOneMultiplicityMatch object, or null if no match is found.
   * 
   */
  public EReferenceWithOneMultiplicityMatch getOneArbitraryMatch(final EReference pERef) {
    return rawGetOneArbitraryMatch(new Object[]{pERef});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pERef the fixed value of pattern parameter ERef, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final EReference pERef) {
    return rawHasMatch(new Object[]{pERef});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pERef the fixed value of pattern parameter ERef, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final EReference pERef) {
    return rawCountMatches(new Object[]{pERef});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pERef the fixed value of pattern parameter ERef, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final EReference pERef, final IMatchProcessor<? super EReferenceWithOneMultiplicityMatch> processor) {
    rawForEachMatch(new Object[]{pERef}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pERef the fixed value of pattern parameter ERef, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final EReference pERef, final IMatchProcessor<? super EReferenceWithOneMultiplicityMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pERef}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pERef the fixed value of pattern parameter ERef, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public EReferenceWithOneMultiplicityMatch newMatch(final EReference pERef) {
    return EReferenceWithOneMultiplicityMatch.newMatch(pERef);
  }
  
  /**
   * Retrieve the set of values that occur in matches for ERef.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<EReference> rawAccumulateAllValuesOfERef(final Object[] parameters) {
    Set<EReference> results = new HashSet<EReference>();
    rawAccumulateAllValues(POSITION_EREF, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for ERef.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EReference> getAllValuesOfERef() {
    return rawAccumulateAllValuesOfERef(emptyArray());
  }
  
  @Override
  protected EReferenceWithOneMultiplicityMatch tupleToMatch(final Tuple t) {
    try {
    	return EReferenceWithOneMultiplicityMatch.newMatch((org.eclipse.emf.ecore.EReference) t.get(POSITION_EREF));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected EReferenceWithOneMultiplicityMatch arrayToMatch(final Object[] match) {
    try {
    	return EReferenceWithOneMultiplicityMatch.newMatch((org.eclipse.emf.ecore.EReference) match[POSITION_EREF]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected EReferenceWithOneMultiplicityMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return EReferenceWithOneMultiplicityMatch.newMutableMatch((org.eclipse.emf.ecore.EReference) match[POSITION_EREF]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<EReferenceWithOneMultiplicityMatcher> querySpecification() throws IncQueryException {
    return EReferenceWithOneMultiplicityQuerySpecification.instance();
  }
}
