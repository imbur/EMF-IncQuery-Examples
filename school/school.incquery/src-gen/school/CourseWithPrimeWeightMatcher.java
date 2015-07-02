package school;

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
import school.Course;
import school.CourseWithPrimeWeightMatch;
import school.util.CourseWithPrimeWeightQuerySpecification;

/**
 * Generated pattern matcher API of the school.courseWithPrimeWeight pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link CourseWithPrimeWeightMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * A check condition with some Xbase magic:
 *     (this must be the most primitive prime tester ever :-)
 *     
 *     Course C has a weight which is a prime number
 *    
 * pattern courseWithPrimeWeight(C) {
 * 	Course.weight(C, W);
 * 	check( { // make sure the check() expression returns a boolean value on all execution paths
 * 		if(W % 2 == 0)
 * 		false else {
 * 			var Integer maxValue = Math:: round(new Float(Math:: sqrt(W)))
 * 			var Integer divisor = 3 while(divisor {@literal <}= maxValue) {
 * 				if(W % divisor == 0)
 * 				return false else divisor = divisor + 2;
 * 			}
 * 
 * 			true // we have found a prime number	
 * 		}
 * 
 * 	});
 * }
 * </pre></code>
 * 
 * @see CourseWithPrimeWeightMatch
 * @see CourseWithPrimeWeightProcessor
 * @see CourseWithPrimeWeightQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class CourseWithPrimeWeightMatcher extends BaseMatcher<CourseWithPrimeWeightMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static CourseWithPrimeWeightMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    CourseWithPrimeWeightMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new CourseWithPrimeWeightMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_C = 0;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(CourseWithPrimeWeightMatcher.class);
  
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
  public CourseWithPrimeWeightMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public CourseWithPrimeWeightMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @return matches represented as a CourseWithPrimeWeightMatch object.
   * 
   */
  public Collection<CourseWithPrimeWeightMatch> getAllMatches(final Course pC) {
    return rawGetAllMatches(new Object[]{pC});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @return a match represented as a CourseWithPrimeWeightMatch object, or null if no match is found.
   * 
   */
  public CourseWithPrimeWeightMatch getOneArbitraryMatch(final Course pC) {
    return rawGetOneArbitraryMatch(new Object[]{pC});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Course pC) {
    return rawHasMatch(new Object[]{pC});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Course pC) {
    return rawCountMatches(new Object[]{pC});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Course pC, final IMatchProcessor<? super CourseWithPrimeWeightMatch> processor) {
    rawForEachMatch(new Object[]{pC}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Course pC, final IMatchProcessor<? super CourseWithPrimeWeightMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pC}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public CourseWithPrimeWeightMatch newMatch(final Course pC) {
    return CourseWithPrimeWeightMatch.newMatch(pC);
  }
  
  /**
   * Retrieve the set of values that occur in matches for C.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Course> rawAccumulateAllValuesOfC(final Object[] parameters) {
    Set<Course> results = new HashSet<Course>();
    rawAccumulateAllValues(POSITION_C, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for C.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Course> getAllValuesOfC() {
    return rawAccumulateAllValuesOfC(emptyArray());
  }
  
  @Override
  protected CourseWithPrimeWeightMatch tupleToMatch(final Tuple t) {
    try {
    	return CourseWithPrimeWeightMatch.newMatch((school.Course) t.get(POSITION_C));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CourseWithPrimeWeightMatch arrayToMatch(final Object[] match) {
    try {
    	return CourseWithPrimeWeightMatch.newMatch((school.Course) match[POSITION_C]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CourseWithPrimeWeightMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return CourseWithPrimeWeightMatch.newMutableMatch((school.Course) match[POSITION_C]);
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
  public static IQuerySpecification<CourseWithPrimeWeightMatcher> querySpecification() throws IncQueryException {
    return CourseWithPrimeWeightQuerySpecification.instance();
  }
}
