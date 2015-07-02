package hu.bme.mit.incquery.ecorequeries.example;

import hu.bme.mit.incquery.ecorequeries.example.util.SampleQueryQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.incquery.ecorequeries.example.SampleQuery pattern,
 * to be used in conjunction with {@link SampleQueryMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SampleQueryMatcher
 * @see SampleQueryProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class SampleQueryMatch extends BasePatternMatch {
  private EClass fXElement;
  
  private EClass fYElement;
  
  private EReference fRelates;
  
  private EAttribute fLabel1;
  
  private EAttribute fLabel2;
  
  private static List<String> parameterNames = makeImmutableList("XElement", "YElement", "Relates", "Label1", "Label2");
  
  private SampleQueryMatch(final EClass pXElement, final EClass pYElement, final EReference pRelates, final EAttribute pLabel1, final EAttribute pLabel2) {
    this.fXElement = pXElement;
    this.fYElement = pYElement;
    this.fRelates = pRelates;
    this.fLabel1 = pLabel1;
    this.fLabel2 = pLabel2;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("XElement".equals(parameterName)) return this.fXElement;
    if ("YElement".equals(parameterName)) return this.fYElement;
    if ("Relates".equals(parameterName)) return this.fRelates;
    if ("Label1".equals(parameterName)) return this.fLabel1;
    if ("Label2".equals(parameterName)) return this.fLabel2;
    return null;
  }
  
  public EClass getXElement() {
    return this.fXElement;
  }
  
  public EClass getYElement() {
    return this.fYElement;
  }
  
  public EReference getRelates() {
    return this.fRelates;
  }
  
  public EAttribute getLabel1() {
    return this.fLabel1;
  }
  
  public EAttribute getLabel2() {
    return this.fLabel2;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("XElement".equals(parameterName) ) {
    	this.fXElement = (org.eclipse.emf.ecore.EClass) newValue;
    	return true;
    }
    if ("YElement".equals(parameterName) ) {
    	this.fYElement = (org.eclipse.emf.ecore.EClass) newValue;
    	return true;
    }
    if ("Relates".equals(parameterName) ) {
    	this.fRelates = (org.eclipse.emf.ecore.EReference) newValue;
    	return true;
    }
    if ("Label1".equals(parameterName) ) {
    	this.fLabel1 = (org.eclipse.emf.ecore.EAttribute) newValue;
    	return true;
    }
    if ("Label2".equals(parameterName) ) {
    	this.fLabel2 = (org.eclipse.emf.ecore.EAttribute) newValue;
    	return true;
    }
    return false;
  }
  
  public void setXElement(final EClass pXElement) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fXElement = pXElement;
  }
  
  public void setYElement(final EClass pYElement) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fYElement = pYElement;
  }
  
  public void setRelates(final EReference pRelates) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRelates = pRelates;
  }
  
  public void setLabel1(final EAttribute pLabel1) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fLabel1 = pLabel1;
  }
  
  public void setLabel2(final EAttribute pLabel2) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fLabel2 = pLabel2;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.SampleQuery";
  }
  
  @Override
  public List<String> parameterNames() {
    return SampleQueryMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fXElement, fYElement, fRelates, fLabel1, fLabel2};
  }
  
  @Override
  public SampleQueryMatch toImmutable() {
    return isMutable() ? newMatch(fXElement, fYElement, fRelates, fLabel1, fLabel2) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"XElement\"=" + prettyPrintValue(fXElement) + ", ");
    
    result.append("\"YElement\"=" + prettyPrintValue(fYElement) + ", ");
    
    result.append("\"Relates\"=" + prettyPrintValue(fRelates) + ", ");
    
    result.append("\"Label1\"=" + prettyPrintValue(fLabel1) + ", ");
    
    result.append("\"Label2\"=" + prettyPrintValue(fLabel2)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fXElement == null) ? 0 : fXElement.hashCode());
    result = prime * result + ((fYElement == null) ? 0 : fYElement.hashCode());
    result = prime * result + ((fRelates == null) ? 0 : fRelates.hashCode());
    result = prime * result + ((fLabel1 == null) ? 0 : fLabel1.hashCode());
    result = prime * result + ((fLabel2 == null) ? 0 : fLabel2.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof SampleQueryMatch)) { // this should be infrequent
    	if (obj == null) {
    		return false;
    	}
    	if (!(obj instanceof IPatternMatch)) {
    		return false;
    	}
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    SampleQueryMatch other = (SampleQueryMatch) obj;
    if (fXElement == null) {if (other.fXElement != null) return false;}
    else if (!fXElement.equals(other.fXElement)) return false;
    if (fYElement == null) {if (other.fYElement != null) return false;}
    else if (!fYElement.equals(other.fYElement)) return false;
    if (fRelates == null) {if (other.fRelates != null) return false;}
    else if (!fRelates.equals(other.fRelates)) return false;
    if (fLabel1 == null) {if (other.fLabel1 != null) return false;}
    else if (!fLabel1.equals(other.fLabel1)) return false;
    if (fLabel2 == null) {if (other.fLabel2 != null) return false;}
    else if (!fLabel2.equals(other.fLabel2)) return false;
    return true;
  }
  
  @Override
  public SampleQueryQuerySpecification specification() {
    try {
    	return SampleQueryQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static SampleQueryMatch newEmptyMatch() {
    return new Mutable(null, null, null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pXElement the fixed value of pattern parameter XElement, or null if not bound.
   * @param pYElement the fixed value of pattern parameter YElement, or null if not bound.
   * @param pRelates the fixed value of pattern parameter Relates, or null if not bound.
   * @param pLabel1 the fixed value of pattern parameter Label1, or null if not bound.
   * @param pLabel2 the fixed value of pattern parameter Label2, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static SampleQueryMatch newMutableMatch(final EClass pXElement, final EClass pYElement, final EReference pRelates, final EAttribute pLabel1, final EAttribute pLabel2) {
    return new Mutable(pXElement, pYElement, pRelates, pLabel1, pLabel2);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pXElement the fixed value of pattern parameter XElement, or null if not bound.
   * @param pYElement the fixed value of pattern parameter YElement, or null if not bound.
   * @param pRelates the fixed value of pattern parameter Relates, or null if not bound.
   * @param pLabel1 the fixed value of pattern parameter Label1, or null if not bound.
   * @param pLabel2 the fixed value of pattern parameter Label2, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static SampleQueryMatch newMatch(final EClass pXElement, final EClass pYElement, final EReference pRelates, final EAttribute pLabel1, final EAttribute pLabel2) {
    return new Immutable(pXElement, pYElement, pRelates, pLabel1, pLabel2);
  }
  
  private static final class Mutable extends SampleQueryMatch {
    Mutable(final EClass pXElement, final EClass pYElement, final EReference pRelates, final EAttribute pLabel1, final EAttribute pLabel2) {
      super(pXElement, pYElement, pRelates, pLabel1, pLabel2);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends SampleQueryMatch {
    Immutable(final EClass pXElement, final EClass pYElement, final EReference pRelates, final EAttribute pLabel1, final EAttribute pLabel2) {
      super(pXElement, pYElement, pRelates, pLabel1, pLabel2);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
