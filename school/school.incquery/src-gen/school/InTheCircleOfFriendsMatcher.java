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
import school.InTheCircleOfFriendsMatch;
import school.Student;
import school.util.InTheCircleOfFriendsQuerySpecification;

/**
 * Generated pattern matcher API of the school.inTheCircleOfFriends pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link InTheCircleOfFriendsMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * Student Someone is in the circle of student S1's friends:
 *       - they are either friendly directly
 *       - or there is a common friend who is in both student's circle of friends
 *      
 *      Student S1 is transitively friendly to student Someone
 *     
 * 	pattern inTheCircleOfFriends(S1 : Student, Someone : Student) {
 * 		find friendlyTo +(S1, Someone);
 * 		S1 != Someone; // we do not allow self loops
 * 		// this is not only a short-hand notation, but also much more efficient!
 * 		// use it whenever possible
 * 	}
 * </pre></code>
 * 
 * @see InTheCircleOfFriendsMatch
 * @see InTheCircleOfFriendsProcessor
 * @see InTheCircleOfFriendsQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class InTheCircleOfFriendsMatcher extends BaseMatcher<InTheCircleOfFriendsMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static InTheCircleOfFriendsMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    InTheCircleOfFriendsMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new InTheCircleOfFriendsMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_S1 = 0;
  
  private final static int POSITION_SOMEONE = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(InTheCircleOfFriendsMatcher.class);
  
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
  public InTheCircleOfFriendsMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public InTheCircleOfFriendsMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pS1 the fixed value of pattern parameter S1, or null if not bound.
   * @param pSomeone the fixed value of pattern parameter Someone, or null if not bound.
   * @return matches represented as a InTheCircleOfFriendsMatch object.
   * 
   */
  public Collection<InTheCircleOfFriendsMatch> getAllMatches(final Student pS1, final Student pSomeone) {
    return rawGetAllMatches(new Object[]{pS1, pSomeone});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pS1 the fixed value of pattern parameter S1, or null if not bound.
   * @param pSomeone the fixed value of pattern parameter Someone, or null if not bound.
   * @return a match represented as a InTheCircleOfFriendsMatch object, or null if no match is found.
   * 
   */
  public InTheCircleOfFriendsMatch getOneArbitraryMatch(final Student pS1, final Student pSomeone) {
    return rawGetOneArbitraryMatch(new Object[]{pS1, pSomeone});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pS1 the fixed value of pattern parameter S1, or null if not bound.
   * @param pSomeone the fixed value of pattern parameter Someone, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Student pS1, final Student pSomeone) {
    return rawHasMatch(new Object[]{pS1, pSomeone});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pS1 the fixed value of pattern parameter S1, or null if not bound.
   * @param pSomeone the fixed value of pattern parameter Someone, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Student pS1, final Student pSomeone) {
    return rawCountMatches(new Object[]{pS1, pSomeone});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pS1 the fixed value of pattern parameter S1, or null if not bound.
   * @param pSomeone the fixed value of pattern parameter Someone, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Student pS1, final Student pSomeone, final IMatchProcessor<? super InTheCircleOfFriendsMatch> processor) {
    rawForEachMatch(new Object[]{pS1, pSomeone}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pS1 the fixed value of pattern parameter S1, or null if not bound.
   * @param pSomeone the fixed value of pattern parameter Someone, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Student pS1, final Student pSomeone, final IMatchProcessor<? super InTheCircleOfFriendsMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pS1, pSomeone}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pS1 the fixed value of pattern parameter S1, or null if not bound.
   * @param pSomeone the fixed value of pattern parameter Someone, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public InTheCircleOfFriendsMatch newMatch(final Student pS1, final Student pSomeone) {
    return InTheCircleOfFriendsMatch.newMatch(pS1, pSomeone);
  }
  
  /**
   * Retrieve the set of values that occur in matches for S1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Student> rawAccumulateAllValuesOfS1(final Object[] parameters) {
    Set<Student> results = new HashSet<Student>();
    rawAccumulateAllValues(POSITION_S1, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for S1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> getAllValuesOfS1() {
    return rawAccumulateAllValuesOfS1(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for S1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> getAllValuesOfS1(final InTheCircleOfFriendsMatch partialMatch) {
    return rawAccumulateAllValuesOfS1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for S1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> getAllValuesOfS1(final Student pSomeone) {
    return rawAccumulateAllValuesOfS1(new Object[]{
    null, 
    pSomeone
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for Someone.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Student> rawAccumulateAllValuesOfSomeone(final Object[] parameters) {
    Set<Student> results = new HashSet<Student>();
    rawAccumulateAllValues(POSITION_SOMEONE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Someone.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> getAllValuesOfSomeone() {
    return rawAccumulateAllValuesOfSomeone(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Someone.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> getAllValuesOfSomeone(final InTheCircleOfFriendsMatch partialMatch) {
    return rawAccumulateAllValuesOfSomeone(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Someone.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> getAllValuesOfSomeone(final Student pS1) {
    return rawAccumulateAllValuesOfSomeone(new Object[]{
    pS1, 
    null
    });
  }
  
  @Override
  protected InTheCircleOfFriendsMatch tupleToMatch(final Tuple t) {
    try {
    	return InTheCircleOfFriendsMatch.newMatch((school.Student) t.get(POSITION_S1), (school.Student) t.get(POSITION_SOMEONE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected InTheCircleOfFriendsMatch arrayToMatch(final Object[] match) {
    try {
    	return InTheCircleOfFriendsMatch.newMatch((school.Student) match[POSITION_S1], (school.Student) match[POSITION_SOMEONE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected InTheCircleOfFriendsMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return InTheCircleOfFriendsMatch.newMutableMatch((school.Student) match[POSITION_S1], (school.Student) match[POSITION_SOMEONE]);
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
  public static IQuerySpecification<InTheCircleOfFriendsMatcher> querySpecification() throws IncQueryException {
    return InTheCircleOfFriendsQuerySpecification.instance();
  }
}
