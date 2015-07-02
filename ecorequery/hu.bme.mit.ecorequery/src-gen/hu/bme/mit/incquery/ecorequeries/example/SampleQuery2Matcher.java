package hu.bme.mit.incquery.ecorequeries.example;

import hu.bme.mit.incquery.ecorequeries.example.SampleQuery2Match;
import hu.bme.mit.incquery.ecorequeries.example.util.SampleQuery2QuerySpecification;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;

/**
 * Generated pattern matcher API of the hu.bme.mit.incquery.ecorequeries.example.SampleQuery2 pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link SampleQuery2Match}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern SampleQuery2(XElement, YElement, Relates1, Relates2, Label1, Label2) = {
 * 	// structural block, defining the basic pattern body
 * 	EClass(XElement);
 * 	EClass.eStructuralFeatures(XElement,Relates1);
 * 	EReference(Relates1);
 * 	
 * 	EReference.eOpposite(Relates1,Relates2);
 * 	EReference(Relates2);
 * 	
 * 	EClass(YElement);
 * 	ETypedElement.eType(Relates1,YElement);
 * 	
 * 	// express the multiplicity of the ERef between X and Y
 * 	find EReferenceWithStarMultiplicity(Relates1);
 * 	find EReferenceWithOneMultiplicity(Relates2);
 * 	
 * 	// express that both X and Y have got an attribute of type EString
 * 	find EClassWithEStringAttribute(XElement, Label1);
 * 	find EClassWithEStringAttribute(YElement, Label2);
 * 	
 * 	// filter out matching to Ecore.ecore (as the pattern would also have matches there)
 * 	neg find IsInECore(XElement);
 * 	neg find IsInECore(YElement);
 * }
 * </pre></code>
 * 
 * @see SampleQuery2Match
 * @see SampleQuery2Processor
 * @see SampleQuery2QuerySpecification
 * 
 */
@SuppressWarnings("all")
public class SampleQuery2Matcher extends BaseMatcher<SampleQuery2Match> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static SampleQuery2Matcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    SampleQuery2Matcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new SampleQuery2Matcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_XELEMENT = 0;
  
  private final static int POSITION_YELEMENT = 1;
  
  private final static int POSITION_RELATES1 = 2;
  
  private final static int POSITION_RELATES2 = 3;
  
  private final static int POSITION_LABEL1 = 4;
  
  private final static int POSITION_LABEL2 = 5;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(SampleQuery2Matcher.class);
  
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
  public SampleQuery2Matcher(final Notifier emfRoot) throws IncQueryException {
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
  public SampleQuery2Matcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pXElement the fixed value of pattern parameter XElement, or null if not bound.
   * @param pYElement the fixed value of pattern parameter YElement, or null if not bound.
   * @param pRelates1 the fixed value of pattern parameter Relates1, or null if not bound.
   * @param pRelates2 the fixed value of pattern parameter Relates2, or null if not bound.
   * @param pLabel1 the fixed value of pattern parameter Label1, or null if not bound.
   * @param pLabel2 the fixed value of pattern parameter Label2, or null if not bound.
   * @return matches represented as a SampleQuery2Match object.
   * 
   */
  public Collection<SampleQuery2Match> getAllMatches(final EClass pXElement, final EClass pYElement, final EReference pRelates1, final EReference pRelates2, final EAttribute pLabel1, final EAttribute pLabel2) {
    return rawGetAllMatches(new Object[]{pXElement, pYElement, pRelates1, pRelates2, pLabel1, pLabel2});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pXElement the fixed value of pattern parameter XElement, or null if not bound.
   * @param pYElement the fixed value of pattern parameter YElement, or null if not bound.
   * @param pRelates1 the fixed value of pattern parameter Relates1, or null if not bound.
   * @param pRelates2 the fixed value of pattern parameter Relates2, or null if not bound.
   * @param pLabel1 the fixed value of pattern parameter Label1, or null if not bound.
   * @param pLabel2 the fixed value of pattern parameter Label2, or null if not bound.
   * @return a match represented as a SampleQuery2Match object, or null if no match is found.
   * 
   */
  public SampleQuery2Match getOneArbitraryMatch(final EClass pXElement, final EClass pYElement, final EReference pRelates1, final EReference pRelates2, final EAttribute pLabel1, final EAttribute pLabel2) {
    return rawGetOneArbitraryMatch(new Object[]{pXElement, pYElement, pRelates1, pRelates2, pLabel1, pLabel2});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pXElement the fixed value of pattern parameter XElement, or null if not bound.
   * @param pYElement the fixed value of pattern parameter YElement, or null if not bound.
   * @param pRelates1 the fixed value of pattern parameter Relates1, or null if not bound.
   * @param pRelates2 the fixed value of pattern parameter Relates2, or null if not bound.
   * @param pLabel1 the fixed value of pattern parameter Label1, or null if not bound.
   * @param pLabel2 the fixed value of pattern parameter Label2, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final EClass pXElement, final EClass pYElement, final EReference pRelates1, final EReference pRelates2, final EAttribute pLabel1, final EAttribute pLabel2) {
    return rawHasMatch(new Object[]{pXElement, pYElement, pRelates1, pRelates2, pLabel1, pLabel2});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pXElement the fixed value of pattern parameter XElement, or null if not bound.
   * @param pYElement the fixed value of pattern parameter YElement, or null if not bound.
   * @param pRelates1 the fixed value of pattern parameter Relates1, or null if not bound.
   * @param pRelates2 the fixed value of pattern parameter Relates2, or null if not bound.
   * @param pLabel1 the fixed value of pattern parameter Label1, or null if not bound.
   * @param pLabel2 the fixed value of pattern parameter Label2, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final EClass pXElement, final EClass pYElement, final EReference pRelates1, final EReference pRelates2, final EAttribute pLabel1, final EAttribute pLabel2) {
    return rawCountMatches(new Object[]{pXElement, pYElement, pRelates1, pRelates2, pLabel1, pLabel2});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pXElement the fixed value of pattern parameter XElement, or null if not bound.
   * @param pYElement the fixed value of pattern parameter YElement, or null if not bound.
   * @param pRelates1 the fixed value of pattern parameter Relates1, or null if not bound.
   * @param pRelates2 the fixed value of pattern parameter Relates2, or null if not bound.
   * @param pLabel1 the fixed value of pattern parameter Label1, or null if not bound.
   * @param pLabel2 the fixed value of pattern parameter Label2, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final EClass pXElement, final EClass pYElement, final EReference pRelates1, final EReference pRelates2, final EAttribute pLabel1, final EAttribute pLabel2, final IMatchProcessor<? super SampleQuery2Match> processor) {
    rawForEachMatch(new Object[]{pXElement, pYElement, pRelates1, pRelates2, pLabel1, pLabel2}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pXElement the fixed value of pattern parameter XElement, or null if not bound.
   * @param pYElement the fixed value of pattern parameter YElement, or null if not bound.
   * @param pRelates1 the fixed value of pattern parameter Relates1, or null if not bound.
   * @param pRelates2 the fixed value of pattern parameter Relates2, or null if not bound.
   * @param pLabel1 the fixed value of pattern parameter Label1, or null if not bound.
   * @param pLabel2 the fixed value of pattern parameter Label2, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final EClass pXElement, final EClass pYElement, final EReference pRelates1, final EReference pRelates2, final EAttribute pLabel1, final EAttribute pLabel2, final IMatchProcessor<? super SampleQuery2Match> processor) {
    return rawForOneArbitraryMatch(new Object[]{pXElement, pYElement, pRelates1, pRelates2, pLabel1, pLabel2}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pXElement the fixed value of pattern parameter XElement, or null if not bound.
   * @param pYElement the fixed value of pattern parameter YElement, or null if not bound.
   * @param pRelates1 the fixed value of pattern parameter Relates1, or null if not bound.
   * @param pRelates2 the fixed value of pattern parameter Relates2, or null if not bound.
   * @param pLabel1 the fixed value of pattern parameter Label1, or null if not bound.
   * @param pLabel2 the fixed value of pattern parameter Label2, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public SampleQuery2Match newMatch(final EClass pXElement, final EClass pYElement, final EReference pRelates1, final EReference pRelates2, final EAttribute pLabel1, final EAttribute pLabel2) {
    return SampleQuery2Match.newMatch(pXElement, pYElement, pRelates1, pRelates2, pLabel1, pLabel2);
  }
  
  /**
   * Retrieve the set of values that occur in matches for XElement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<EClass> rawAccumulateAllValuesOfXElement(final Object[] parameters) {
    Set<EClass> results = new HashSet<EClass>();
    rawAccumulateAllValues(POSITION_XELEMENT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for XElement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClass> getAllValuesOfXElement() {
    return rawAccumulateAllValuesOfXElement(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for XElement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClass> getAllValuesOfXElement(final SampleQuery2Match partialMatch) {
    return rawAccumulateAllValuesOfXElement(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for XElement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClass> getAllValuesOfXElement(final EClass pYElement, final EReference pRelates1, final EReference pRelates2, final EAttribute pLabel1, final EAttribute pLabel2) {
    return rawAccumulateAllValuesOfXElement(new Object[]{
    null, 
    pYElement, 
    pRelates1, 
    pRelates2, 
    pLabel1, 
    pLabel2
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for YElement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<EClass> rawAccumulateAllValuesOfYElement(final Object[] parameters) {
    Set<EClass> results = new HashSet<EClass>();
    rawAccumulateAllValues(POSITION_YELEMENT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for YElement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClass> getAllValuesOfYElement() {
    return rawAccumulateAllValuesOfYElement(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for YElement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClass> getAllValuesOfYElement(final SampleQuery2Match partialMatch) {
    return rawAccumulateAllValuesOfYElement(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for YElement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClass> getAllValuesOfYElement(final EClass pXElement, final EReference pRelates1, final EReference pRelates2, final EAttribute pLabel1, final EAttribute pLabel2) {
    return rawAccumulateAllValuesOfYElement(new Object[]{
    pXElement, 
    null, 
    pRelates1, 
    pRelates2, 
    pLabel1, 
    pLabel2
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for Relates1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<EReference> rawAccumulateAllValuesOfRelates1(final Object[] parameters) {
    Set<EReference> results = new HashSet<EReference>();
    rawAccumulateAllValues(POSITION_RELATES1, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Relates1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EReference> getAllValuesOfRelates1() {
    return rawAccumulateAllValuesOfRelates1(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Relates1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EReference> getAllValuesOfRelates1(final SampleQuery2Match partialMatch) {
    return rawAccumulateAllValuesOfRelates1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Relates1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EReference> getAllValuesOfRelates1(final EClass pXElement, final EClass pYElement, final EReference pRelates2, final EAttribute pLabel1, final EAttribute pLabel2) {
    return rawAccumulateAllValuesOfRelates1(new Object[]{
    pXElement, 
    pYElement, 
    null, 
    pRelates2, 
    pLabel1, 
    pLabel2
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for Relates2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<EReference> rawAccumulateAllValuesOfRelates2(final Object[] parameters) {
    Set<EReference> results = new HashSet<EReference>();
    rawAccumulateAllValues(POSITION_RELATES2, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Relates2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EReference> getAllValuesOfRelates2() {
    return rawAccumulateAllValuesOfRelates2(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Relates2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EReference> getAllValuesOfRelates2(final SampleQuery2Match partialMatch) {
    return rawAccumulateAllValuesOfRelates2(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Relates2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EReference> getAllValuesOfRelates2(final EClass pXElement, final EClass pYElement, final EReference pRelates1, final EAttribute pLabel1, final EAttribute pLabel2) {
    return rawAccumulateAllValuesOfRelates2(new Object[]{
    pXElement, 
    pYElement, 
    pRelates1, 
    null, 
    pLabel1, 
    pLabel2
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for Label1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<EAttribute> rawAccumulateAllValuesOfLabel1(final Object[] parameters) {
    Set<EAttribute> results = new HashSet<EAttribute>();
    rawAccumulateAllValues(POSITION_LABEL1, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Label1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EAttribute> getAllValuesOfLabel1() {
    return rawAccumulateAllValuesOfLabel1(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Label1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EAttribute> getAllValuesOfLabel1(final SampleQuery2Match partialMatch) {
    return rawAccumulateAllValuesOfLabel1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Label1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EAttribute> getAllValuesOfLabel1(final EClass pXElement, final EClass pYElement, final EReference pRelates1, final EReference pRelates2, final EAttribute pLabel2) {
    return rawAccumulateAllValuesOfLabel1(new Object[]{
    pXElement, 
    pYElement, 
    pRelates1, 
    pRelates2, 
    null, 
    pLabel2
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for Label2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<EAttribute> rawAccumulateAllValuesOfLabel2(final Object[] parameters) {
    Set<EAttribute> results = new HashSet<EAttribute>();
    rawAccumulateAllValues(POSITION_LABEL2, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Label2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EAttribute> getAllValuesOfLabel2() {
    return rawAccumulateAllValuesOfLabel2(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Label2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EAttribute> getAllValuesOfLabel2(final SampleQuery2Match partialMatch) {
    return rawAccumulateAllValuesOfLabel2(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Label2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EAttribute> getAllValuesOfLabel2(final EClass pXElement, final EClass pYElement, final EReference pRelates1, final EReference pRelates2, final EAttribute pLabel1) {
    return rawAccumulateAllValuesOfLabel2(new Object[]{
    pXElement, 
    pYElement, 
    pRelates1, 
    pRelates2, 
    pLabel1, 
    null
    });
  }
  
  @Override
  protected SampleQuery2Match tupleToMatch(final Tuple t) {
    try {
    	return SampleQuery2Match.newMatch((org.eclipse.emf.ecore.EClass) t.get(POSITION_XELEMENT), (org.eclipse.emf.ecore.EClass) t.get(POSITION_YELEMENT), (org.eclipse.emf.ecore.EReference) t.get(POSITION_RELATES1), (org.eclipse.emf.ecore.EReference) t.get(POSITION_RELATES2), (org.eclipse.emf.ecore.EAttribute) t.get(POSITION_LABEL1), (org.eclipse.emf.ecore.EAttribute) t.get(POSITION_LABEL2));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SampleQuery2Match arrayToMatch(final Object[] match) {
    try {
    	return SampleQuery2Match.newMatch((org.eclipse.emf.ecore.EClass) match[POSITION_XELEMENT], (org.eclipse.emf.ecore.EClass) match[POSITION_YELEMENT], (org.eclipse.emf.ecore.EReference) match[POSITION_RELATES1], (org.eclipse.emf.ecore.EReference) match[POSITION_RELATES2], (org.eclipse.emf.ecore.EAttribute) match[POSITION_LABEL1], (org.eclipse.emf.ecore.EAttribute) match[POSITION_LABEL2]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SampleQuery2Match arrayToMatchMutable(final Object[] match) {
    try {
    	return SampleQuery2Match.newMutableMatch((org.eclipse.emf.ecore.EClass) match[POSITION_XELEMENT], (org.eclipse.emf.ecore.EClass) match[POSITION_YELEMENT], (org.eclipse.emf.ecore.EReference) match[POSITION_RELATES1], (org.eclipse.emf.ecore.EReference) match[POSITION_RELATES2], (org.eclipse.emf.ecore.EAttribute) match[POSITION_LABEL1], (org.eclipse.emf.ecore.EAttribute) match[POSITION_LABEL2]);
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
  public static IQuerySpecification<SampleQuery2Matcher> querySpecification() throws IncQueryException {
    return SampleQuery2QuerySpecification.instance();
  }
}
