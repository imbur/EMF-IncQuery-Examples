package school;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.SchoolClass;
import school.Teacher;
import school.util.ClassesOfTeacherQuerySpecification;

/**
 * Pattern-specific match representation of the school.classesOfTeacher pattern,
 * to be used in conjunction with {@link ClassesOfTeacherMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ClassesOfTeacherMatcher
 * @see ClassesOfTeacherProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ClassesOfTeacherMatch extends BasePatternMatch {
  private Teacher fT;
  
  private SchoolClass fSC;
  
  private static List<String> parameterNames = makeImmutableList("T", "SC");
  
  private ClassesOfTeacherMatch(final Teacher pT, final SchoolClass pSC) {
    this.fT = pT;
    this.fSC = pSC;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("T".equals(parameterName)) return this.fT;
    if ("SC".equals(parameterName)) return this.fSC;
    return null;
  }
  
  public Teacher getT() {
    return this.fT;
  }
  
  public SchoolClass getSC() {
    return this.fSC;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("T".equals(parameterName) ) {
    	this.fT = (school.Teacher) newValue;
    	return true;
    }
    if ("SC".equals(parameterName) ) {
    	this.fSC = (school.SchoolClass) newValue;
    	return true;
    }
    return false;
  }
  
  public void setT(final Teacher pT) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fT = pT;
  }
  
  public void setSC(final SchoolClass pSC) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSC = pSC;
  }
  
  @Override
  public String patternName() {
    return "school.classesOfTeacher";
  }
  
  @Override
  public List<String> parameterNames() {
    return ClassesOfTeacherMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fT, fSC};
  }
  
  @Override
  public ClassesOfTeacherMatch toImmutable() {
    return isMutable() ? newMatch(fT, fSC) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"T\"=" + prettyPrintValue(fT) + ", ");
    
    result.append("\"SC\"=" + prettyPrintValue(fSC)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fT == null) ? 0 : fT.hashCode());
    result = prime * result + ((fSC == null) ? 0 : fSC.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof ClassesOfTeacherMatch)) { // this should be infrequent
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
    ClassesOfTeacherMatch other = (ClassesOfTeacherMatch) obj;
    if (fT == null) {if (other.fT != null) return false;}
    else if (!fT.equals(other.fT)) return false;
    if (fSC == null) {if (other.fSC != null) return false;}
    else if (!fSC.equals(other.fSC)) return false;
    return true;
  }
  
  @Override
  public ClassesOfTeacherQuerySpecification specification() {
    try {
    	return ClassesOfTeacherQuerySpecification.instance();
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
  public static ClassesOfTeacherMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pSC the fixed value of pattern parameter SC, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ClassesOfTeacherMatch newMutableMatch(final Teacher pT, final SchoolClass pSC) {
    return new Mutable(pT, pSC);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pSC the fixed value of pattern parameter SC, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ClassesOfTeacherMatch newMatch(final Teacher pT, final SchoolClass pSC) {
    return new Immutable(pT, pSC);
  }
  
  private static final class Mutable extends ClassesOfTeacherMatch {
    Mutable(final Teacher pT, final SchoolClass pSC) {
      super(pT, pSC);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ClassesOfTeacherMatch {
    Immutable(final Teacher pT, final SchoolClass pSC) {
      super(pT, pSC);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
