package hu.bme.mit.incquery.ecorequeries.example;

import hu.bme.mit.incquery.ecorequeries.example.EClassNameMatch;
import hu.bme.mit.incquery.ecorequeries.example.util.EClassNameQuerySpecification;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;

/**
 * Generated pattern matcher API of the hu.bme.mit.incquery.ecorequeries.example.EClassName pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link EClassNameMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern EClassName(EName) = {
 * 	EClass.name(_EClass, EName);
 * }
 * </pre></code>
 * 
 * @see EClassNameMatch
 * @see EClassNameProcessor
 * @see EClassNameQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class EClassNameMatcher extends BaseMatcher<EClassNameMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static EClassNameMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    EClassNameMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new EClassNameMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_ENAME = 0;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(EClassNameMatcher.class);
  
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
  public EClassNameMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public EClassNameMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pEName the fixed value of pattern parameter EName, or null if not bound.
   * @return matches represented as a EClassNameMatch object.
   * 
   */
  public Collection<EClassNameMatch> getAllMatches(final String pEName) {
    return rawGetAllMatches(new Object[]{pEName});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pEName the fixed value of pattern parameter EName, or null if not bound.
   * @return a match represented as a EClassNameMatch object, or null if no match is found.
   * 
   */
  public EClassNameMatch getOneArbitraryMatch(final String pEName) {
    return rawGetOneArbitraryMatch(new Object[]{pEName});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pEName the fixed value of pattern parameter EName, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pEName) {
    return rawHasMatch(new Object[]{pEName});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pEName the fixed value of pattern parameter EName, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pEName) {
    return rawCountMatches(new Object[]{pEName});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pEName the fixed value of pattern parameter EName, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pEName, final IMatchProcessor<? super EClassNameMatch> processor) {
    rawForEachMatch(new Object[]{pEName}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pEName the fixed value of pattern parameter EName, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pEName, final IMatchProcessor<? super EClassNameMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pEName}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pEName the fixed value of pattern parameter EName, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public EClassNameMatch newMatch(final String pEName) {
    return EClassNameMatch.newMatch(pEName);
  }
  
  /**
   * Retrieve the set of values that occur in matches for EName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfEName(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_ENAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for EName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfEName() {
    return rawAccumulateAllValuesOfEName(emptyArray());
  }
  
  @Override
  protected EClassNameMatch tupleToMatch(final Tuple t) {
    try {
    	return EClassNameMatch.newMatch((java.lang.String) t.get(POSITION_ENAME));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected EClassNameMatch arrayToMatch(final Object[] match) {
    try {
    	return EClassNameMatch.newMatch((java.lang.String) match[POSITION_ENAME]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected EClassNameMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return EClassNameMatch.newMutableMatch((java.lang.String) match[POSITION_ENAME]);
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
  public static IQuerySpecification<EClassNameMatcher> querySpecification() throws IncQueryException {
    return EClassNameQuerySpecification.instance();
  }
}
