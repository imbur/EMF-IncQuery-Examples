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
import school.CoursesOfTeacherNamesMatch;
import school.util.CoursesOfTeacherNamesQuerySpecification;

/**
 * Generated pattern matcher API of the school.coursesOfTeacherNames pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link CoursesOfTeacherNamesMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern coursesOfTeacherNames(TName, CName) {
 * 	Teacher.courses(T, C);
 * 	Teacher.name(T, TName);
 * 	Course.subject(C, CName);
 * }
 * </pre></code>
 * 
 * @see CoursesOfTeacherNamesMatch
 * @see CoursesOfTeacherNamesProcessor
 * @see CoursesOfTeacherNamesQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class CoursesOfTeacherNamesMatcher extends BaseMatcher<CoursesOfTeacherNamesMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static CoursesOfTeacherNamesMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    CoursesOfTeacherNamesMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new CoursesOfTeacherNamesMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_TNAME = 0;
  
  private final static int POSITION_CNAME = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(CoursesOfTeacherNamesMatcher.class);
  
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
  public CoursesOfTeacherNamesMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public CoursesOfTeacherNamesMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pCName the fixed value of pattern parameter CName, or null if not bound.
   * @return matches represented as a CoursesOfTeacherNamesMatch object.
   * 
   */
  public Collection<CoursesOfTeacherNamesMatch> getAllMatches(final String pTName, final String pCName) {
    return rawGetAllMatches(new Object[]{pTName, pCName});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pCName the fixed value of pattern parameter CName, or null if not bound.
   * @return a match represented as a CoursesOfTeacherNamesMatch object, or null if no match is found.
   * 
   */
  public CoursesOfTeacherNamesMatch getOneArbitraryMatch(final String pTName, final String pCName) {
    return rawGetOneArbitraryMatch(new Object[]{pTName, pCName});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pCName the fixed value of pattern parameter CName, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pTName, final String pCName) {
    return rawHasMatch(new Object[]{pTName, pCName});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pCName the fixed value of pattern parameter CName, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pTName, final String pCName) {
    return rawCountMatches(new Object[]{pTName, pCName});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pCName the fixed value of pattern parameter CName, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pTName, final String pCName, final IMatchProcessor<? super CoursesOfTeacherNamesMatch> processor) {
    rawForEachMatch(new Object[]{pTName, pCName}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pCName the fixed value of pattern parameter CName, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pTName, final String pCName, final IMatchProcessor<? super CoursesOfTeacherNamesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pTName, pCName}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pCName the fixed value of pattern parameter CName, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public CoursesOfTeacherNamesMatch newMatch(final String pTName, final String pCName) {
    return CoursesOfTeacherNamesMatch.newMatch(pTName, pCName);
  }
  
  /**
   * Retrieve the set of values that occur in matches for TName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfTName(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_TNAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for TName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfTName() {
    return rawAccumulateAllValuesOfTName(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for TName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfTName(final CoursesOfTeacherNamesMatch partialMatch) {
    return rawAccumulateAllValuesOfTName(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for TName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfTName(final String pCName) {
    return rawAccumulateAllValuesOfTName(new Object[]{
    null, 
    pCName
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for CName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfCName(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_CNAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for CName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfCName() {
    return rawAccumulateAllValuesOfCName(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for CName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfCName(final CoursesOfTeacherNamesMatch partialMatch) {
    return rawAccumulateAllValuesOfCName(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for CName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfCName(final String pTName) {
    return rawAccumulateAllValuesOfCName(new Object[]{
    pTName, 
    null
    });
  }
  
  @Override
  protected CoursesOfTeacherNamesMatch tupleToMatch(final Tuple t) {
    try {
    	return CoursesOfTeacherNamesMatch.newMatch((java.lang.String) t.get(POSITION_TNAME), (java.lang.String) t.get(POSITION_CNAME));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CoursesOfTeacherNamesMatch arrayToMatch(final Object[] match) {
    try {
    	return CoursesOfTeacherNamesMatch.newMatch((java.lang.String) match[POSITION_TNAME], (java.lang.String) match[POSITION_CNAME]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CoursesOfTeacherNamesMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return CoursesOfTeacherNamesMatch.newMutableMatch((java.lang.String) match[POSITION_TNAME], (java.lang.String) match[POSITION_CNAME]);
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
  public static IQuerySpecification<CoursesOfTeacherNamesMatcher> querySpecification() throws IncQueryException {
    return CoursesOfTeacherNamesQuerySpecification.instance();
  }
}
