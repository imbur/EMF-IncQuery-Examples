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
import school.AllVariablesNamedMatch;
import school.Teacher;
import school.util.AllVariablesNamedQuerySpecification;

/**
 * Generated pattern matcher API of the school.allVariablesNamed pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link AllVariablesNamedMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern allVariablesNamed(teacher) =
 * {
 *     find TeachersSchoolWithName(teacher,school,name);
 * }
 * </pre></code>
 * 
 * @see AllVariablesNamedMatch
 * @see AllVariablesNamedProcessor
 * @see AllVariablesNamedQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class AllVariablesNamedMatcher extends BaseMatcher<AllVariablesNamedMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static AllVariablesNamedMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    AllVariablesNamedMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new AllVariablesNamedMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_TEACHER = 0;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(AllVariablesNamedMatcher.class);
  
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
  public AllVariablesNamedMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public AllVariablesNamedMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTeacher the fixed value of pattern parameter teacher, or null if not bound.
   * @return matches represented as a AllVariablesNamedMatch object.
   * 
   */
  public Collection<AllVariablesNamedMatch> getAllMatches(final Teacher pTeacher) {
    return rawGetAllMatches(new Object[]{pTeacher});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTeacher the fixed value of pattern parameter teacher, or null if not bound.
   * @return a match represented as a AllVariablesNamedMatch object, or null if no match is found.
   * 
   */
  public AllVariablesNamedMatch getOneArbitraryMatch(final Teacher pTeacher) {
    return rawGetOneArbitraryMatch(new Object[]{pTeacher});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pTeacher the fixed value of pattern parameter teacher, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Teacher pTeacher) {
    return rawHasMatch(new Object[]{pTeacher});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTeacher the fixed value of pattern parameter teacher, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Teacher pTeacher) {
    return rawCountMatches(new Object[]{pTeacher});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pTeacher the fixed value of pattern parameter teacher, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Teacher pTeacher, final IMatchProcessor<? super AllVariablesNamedMatch> processor) {
    rawForEachMatch(new Object[]{pTeacher}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTeacher the fixed value of pattern parameter teacher, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Teacher pTeacher, final IMatchProcessor<? super AllVariablesNamedMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pTeacher}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTeacher the fixed value of pattern parameter teacher, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public AllVariablesNamedMatch newMatch(final Teacher pTeacher) {
    return AllVariablesNamedMatch.newMatch(pTeacher);
  }
  
  /**
   * Retrieve the set of values that occur in matches for teacher.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Teacher> rawAccumulateAllValuesOfteacher(final Object[] parameters) {
    Set<Teacher> results = new HashSet<Teacher>();
    rawAccumulateAllValues(POSITION_TEACHER, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for teacher.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Teacher> getAllValuesOfteacher() {
    return rawAccumulateAllValuesOfteacher(emptyArray());
  }
  
  @Override
  protected AllVariablesNamedMatch tupleToMatch(final Tuple t) {
    try {
    	return AllVariablesNamedMatch.newMatch((school.Teacher) t.get(POSITION_TEACHER));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected AllVariablesNamedMatch arrayToMatch(final Object[] match) {
    try {
    	return AllVariablesNamedMatch.newMatch((school.Teacher) match[POSITION_TEACHER]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected AllVariablesNamedMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return AllVariablesNamedMatch.newMutableMatch((school.Teacher) match[POSITION_TEACHER]);
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
  public static IQuerySpecification<AllVariablesNamedMatcher> querySpecification() throws IncQueryException {
    return AllVariablesNamedQuerySpecification.instance();
  }
}
