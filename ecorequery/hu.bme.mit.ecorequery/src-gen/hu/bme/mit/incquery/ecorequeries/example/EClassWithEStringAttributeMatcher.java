package hu.bme.mit.incquery.ecorequeries.example;

import hu.bme.mit.incquery.ecorequeries.example.EClassWithEStringAttributeMatch;
import hu.bme.mit.incquery.ecorequeries.example.util.EClassWithEStringAttributeQuerySpecification;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;

/**
 * Generated pattern matcher API of the hu.bme.mit.incquery.ecorequeries.example.EClassWithEStringAttribute pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link EClassWithEStringAttributeMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * Problem-specific pattern: E is an EClass, which has an EAttribute Attr, having EString as its datatype
 *  
 * 
 * pattern EClassWithEStringAttribute(E,Attr) = {
 * 	EClass(E);
 * 	find EClassAttribute(E,Attr,Type);
 * 	find IsEString(Type);
 * }
 * </pre></code>
 * 
 * @see EClassWithEStringAttributeMatch
 * @see EClassWithEStringAttributeProcessor
 * @see EClassWithEStringAttributeQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class EClassWithEStringAttributeMatcher extends BaseMatcher<EClassWithEStringAttributeMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static EClassWithEStringAttributeMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    EClassWithEStringAttributeMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new EClassWithEStringAttributeMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_E = 0;
  
  private final static int POSITION_ATTR = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(EClassWithEStringAttributeMatcher.class);
  
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
  public EClassWithEStringAttributeMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public EClassWithEStringAttributeMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pE the fixed value of pattern parameter E, or null if not bound.
   * @param pAttr the fixed value of pattern parameter Attr, or null if not bound.
   * @return matches represented as a EClassWithEStringAttributeMatch object.
   * 
   */
  public Collection<EClassWithEStringAttributeMatch> getAllMatches(final EClass pE, final EAttribute pAttr) {
    return rawGetAllMatches(new Object[]{pE, pAttr});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pE the fixed value of pattern parameter E, or null if not bound.
   * @param pAttr the fixed value of pattern parameter Attr, or null if not bound.
   * @return a match represented as a EClassWithEStringAttributeMatch object, or null if no match is found.
   * 
   */
  public EClassWithEStringAttributeMatch getOneArbitraryMatch(final EClass pE, final EAttribute pAttr) {
    return rawGetOneArbitraryMatch(new Object[]{pE, pAttr});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pE the fixed value of pattern parameter E, or null if not bound.
   * @param pAttr the fixed value of pattern parameter Attr, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final EClass pE, final EAttribute pAttr) {
    return rawHasMatch(new Object[]{pE, pAttr});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pE the fixed value of pattern parameter E, or null if not bound.
   * @param pAttr the fixed value of pattern parameter Attr, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final EClass pE, final EAttribute pAttr) {
    return rawCountMatches(new Object[]{pE, pAttr});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pE the fixed value of pattern parameter E, or null if not bound.
   * @param pAttr the fixed value of pattern parameter Attr, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final EClass pE, final EAttribute pAttr, final IMatchProcessor<? super EClassWithEStringAttributeMatch> processor) {
    rawForEachMatch(new Object[]{pE, pAttr}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pE the fixed value of pattern parameter E, or null if not bound.
   * @param pAttr the fixed value of pattern parameter Attr, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final EClass pE, final EAttribute pAttr, final IMatchProcessor<? super EClassWithEStringAttributeMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pE, pAttr}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pE the fixed value of pattern parameter E, or null if not bound.
   * @param pAttr the fixed value of pattern parameter Attr, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public EClassWithEStringAttributeMatch newMatch(final EClass pE, final EAttribute pAttr) {
    return EClassWithEStringAttributeMatch.newMatch(pE, pAttr);
  }
  
  /**
   * Retrieve the set of values that occur in matches for E.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<EClass> rawAccumulateAllValuesOfE(final Object[] parameters) {
    Set<EClass> results = new HashSet<EClass>();
    rawAccumulateAllValues(POSITION_E, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for E.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClass> getAllValuesOfE() {
    return rawAccumulateAllValuesOfE(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for E.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClass> getAllValuesOfE(final EClassWithEStringAttributeMatch partialMatch) {
    return rawAccumulateAllValuesOfE(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for E.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClass> getAllValuesOfE(final EAttribute pAttr) {
    return rawAccumulateAllValuesOfE(new Object[]{
    null, 
    pAttr
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for Attr.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<EAttribute> rawAccumulateAllValuesOfAttr(final Object[] parameters) {
    Set<EAttribute> results = new HashSet<EAttribute>();
    rawAccumulateAllValues(POSITION_ATTR, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Attr.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EAttribute> getAllValuesOfAttr() {
    return rawAccumulateAllValuesOfAttr(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Attr.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EAttribute> getAllValuesOfAttr(final EClassWithEStringAttributeMatch partialMatch) {
    return rawAccumulateAllValuesOfAttr(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Attr.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EAttribute> getAllValuesOfAttr(final EClass pE) {
    return rawAccumulateAllValuesOfAttr(new Object[]{
    pE, 
    null
    });
  }
  
  @Override
  protected EClassWithEStringAttributeMatch tupleToMatch(final Tuple t) {
    try {
    	return EClassWithEStringAttributeMatch.newMatch((org.eclipse.emf.ecore.EClass) t.get(POSITION_E), (org.eclipse.emf.ecore.EAttribute) t.get(POSITION_ATTR));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected EClassWithEStringAttributeMatch arrayToMatch(final Object[] match) {
    try {
    	return EClassWithEStringAttributeMatch.newMatch((org.eclipse.emf.ecore.EClass) match[POSITION_E], (org.eclipse.emf.ecore.EAttribute) match[POSITION_ATTR]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected EClassWithEStringAttributeMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return EClassWithEStringAttributeMatch.newMutableMatch((org.eclipse.emf.ecore.EClass) match[POSITION_E], (org.eclipse.emf.ecore.EAttribute) match[POSITION_ATTR]);
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
  public static IQuerySpecification<EClassWithEStringAttributeMatcher> querySpecification() throws IncQueryException {
    return EClassWithEStringAttributeQuerySpecification.instance();
  }
}
