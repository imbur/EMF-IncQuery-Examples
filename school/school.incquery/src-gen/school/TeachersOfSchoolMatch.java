package school;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.School;
import school.Teacher;
import school.util.TeachersOfSchoolQuerySpecification;

/**
 * Pattern-specific match representation of the school.teachersOfSchool pattern,
 * to be used in conjunction with {@link TeachersOfSchoolMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see TeachersOfSchoolMatcher
 * @see TeachersOfSchoolProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class TeachersOfSchoolMatch extends BasePatternMatch {
  private Teacher fT;
  
  private School fSch;
  
  private static List<String> parameterNames = makeImmutableList("T", "Sch");
  
  private TeachersOfSchoolMatch(final Teacher pT, final School pSch) {
    this.fT = pT;
    this.fSch = pSch;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("T".equals(parameterName)) return this.fT;
    if ("Sch".equals(parameterName)) return this.fSch;
    return null;
  }
  
  public Teacher getT() {
    return this.fT;
  }
  
  public School getSch() {
    return this.fSch;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("T".equals(parameterName) ) {
    	this.fT = (school.Teacher) newValue;
    	return true;
    }
    if ("Sch".equals(parameterName) ) {
    	this.fSch = (school.School) newValue;
    	return true;
    }
    return false;
  }
  
  public void setT(final Teacher pT) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fT = pT;
  }
  
  public void setSch(final School pSch) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSch = pSch;
  }
  
  @Override
  public String patternName() {
    return "school.teachersOfSchool";
  }
  
  @Override
  public List<String> parameterNames() {
    return TeachersOfSchoolMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fT, fSch};
  }
  
  @Override
  public TeachersOfSchoolMatch toImmutable() {
    return isMutable() ? newMatch(fT, fSch) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"T\"=" + prettyPrintValue(fT) + ", ");
    
    result.append("\"Sch\"=" + prettyPrintValue(fSch)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fT == null) ? 0 : fT.hashCode());
    result = prime * result + ((fSch == null) ? 0 : fSch.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof TeachersOfSchoolMatch)) { // this should be infrequent
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
    TeachersOfSchoolMatch other = (TeachersOfSchoolMatch) obj;
    if (fT == null) {if (other.fT != null) return false;}
    else if (!fT.equals(other.fT)) return false;
    if (fSch == null) {if (other.fSch != null) return false;}
    else if (!fSch.equals(other.fSch)) return false;
    return true;
  }
  
  @Override
  public TeachersOfSchoolQuerySpecification specification() {
    try {
    	return TeachersOfSchoolQuerySpecification.instance();
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
  public static TeachersOfSchoolMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pSch the fixed value of pattern parameter Sch, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static TeachersOfSchoolMatch newMutableMatch(final Teacher pT, final School pSch) {
    return new Mutable(pT, pSch);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pSch the fixed value of pattern parameter Sch, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static TeachersOfSchoolMatch newMatch(final Teacher pT, final School pSch) {
    return new Immutable(pT, pSch);
  }
  
  private static final class Mutable extends TeachersOfSchoolMatch {
    Mutable(final Teacher pT, final School pSch) {
      super(pT, pSch);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends TeachersOfSchoolMatch {
    Immutable(final Teacher pT, final School pSch) {
      super(pT, pSch);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
