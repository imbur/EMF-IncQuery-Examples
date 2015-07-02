package school.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.incquery.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import school.TeachersOfSchoolMatch;
import school.TeachersOfSchoolMatcher;

/**
 * A pattern-specific query specification that can instantiate TeachersOfSchoolMatcher in a type-safe way.
 * 
 * @see TeachersOfSchoolMatcher
 * @see TeachersOfSchoolMatch
 * 
 */
@SuppressWarnings("all")
public final class TeachersOfSchoolQuerySpecification extends BaseGeneratedEMFQuerySpecification<TeachersOfSchoolMatcher> {
  private TeachersOfSchoolQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TeachersOfSchoolQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected TeachersOfSchoolMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TeachersOfSchoolMatcher.on(engine);
  }
  
  @Override
  public TeachersOfSchoolMatch newEmptyMatch() {
    return TeachersOfSchoolMatch.newEmptyMatch();
  }
  
  @Override
  public TeachersOfSchoolMatch newMatch(final Object... parameters) {
    return TeachersOfSchoolMatch.newMatch((school.Teacher) parameters[0], (school.School) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static TeachersOfSchoolQuerySpecification INSTANCE = make();
    
    public static TeachersOfSchoolQuerySpecification make() {
      return new TeachersOfSchoolQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static TeachersOfSchoolQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "school.teachersOfSchool";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("T","Sch");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("T", "school.Teacher"),new PParameter("Sch", "school.School"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_T = body.getOrCreateVariableByName("T");
      	PVariable var_Sch = body.getOrCreateVariableByName("Sch");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_T, "T"),
      				
      		new ExportedParameter(body, var_Sch, "Sch")
      	));
      	new TypeConstraint(body, new FlatTuple(var_T), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Teacher")));
      	new TypeConstraint(body, new FlatTuple(var_Sch), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "School")));
      	new TypeConstraint(body, new FlatTuple(var_Sch), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "School")));
      	new TypeConstraint(body, new FlatTuple(var_Sch, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "School", "teachers")));
      	new Equality(body, var__virtual_0_, var_T);
      	bodies.add(body);
      }
      	// to silence compiler error
      	if (false) throw new IncQueryException("Never", "happens");
      } catch (IncQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
