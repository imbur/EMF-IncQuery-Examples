package school;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.SchoolClass;
import school.util.ClassesOfSchoolQuerySpecification;

/**
 * Pattern-specific match representation of the school.classesOfSchool pattern,
 * to be used in conjunction with {@link ClassesOfSchoolMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ClassesOfSchoolMatcher
 * @see ClassesOfSchoolProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ClassesOfSchoolMatch extends BasePatternMatch {
  private SchoolClass fSC;
  
  private static List<String> parameterNames = makeImmutableList("SC");
  
  private ClassesOfSchoolMatch(final SchoolClass pSC) {
    this.fSC = pSC;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("SC".equals(parameterName)) return this.fSC;
    return null;
  }
  
  public SchoolClass getSC() {
    return this.fSC;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("SC".equals(parameterName) ) {
    	this.fSC = (school.SchoolClass) newValue;
    	return true;
    }
    return false;
  }
  
  public void setSC(final SchoolClass pSC) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSC = pSC;
  }
  
  @Override
  public String patternName() {
    return "school.classesOfSchool";
  }
  
  @Override
  public List<String> parameterNames() {
    return ClassesOfSchoolMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSC};
  }
  
  @Override
  public ClassesOfSchoolMatch toImmutable() {
    return isMutable() ? newMatch(fSC) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"SC\"=" + prettyPrintValue(fSC)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSC == null) ? 0 : fSC.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof ClassesOfSchoolMatch)) { // this should be infrequent
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
    ClassesOfSchoolMatch other = (ClassesOfSchoolMatch) obj;
    if (fSC == null) {if (other.fSC != null) return false;}
    else if (!fSC.equals(other.fSC)) return false;
    return true;
  }
  
  @Override
  public ClassesOfSchoolQuerySpecification specification() {
    try {
    	return ClassesOfSchoolQuerySpecification.instance();
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
  public static ClassesOfSchoolMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSC the fixed value of pattern parameter SC, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ClassesOfSchoolMatch newMutableMatch(final SchoolClass pSC) {
    return new Mutable(pSC);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSC the fixed value of pattern parameter SC, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ClassesOfSchoolMatch newMatch(final SchoolClass pSC) {
    return new Immutable(pSC);
  }
  
  private static final class Mutable extends ClassesOfSchoolMatch {
    Mutable(final SchoolClass pSC) {
      super(pSC);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ClassesOfSchoolMatch {
    Immutable(final SchoolClass pSC) {
      super(pSC);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
