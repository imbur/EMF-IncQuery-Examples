package school.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import school.AllVariablesNamedMatch;
import school.AllVariablesNamedMatcher;
import school.util.TeachersSchoolWithNameQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate AllVariablesNamedMatcher in a type-safe way.
 * 
 * @see AllVariablesNamedMatcher
 * @see AllVariablesNamedMatch
 * 
 */
@SuppressWarnings("all")
public final class AllVariablesNamedQuerySpecification extends BaseGeneratedEMFQuerySpecification<AllVariablesNamedMatcher> {
  private AllVariablesNamedQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static AllVariablesNamedQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected AllVariablesNamedMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return AllVariablesNamedMatcher.on(engine);
  }
  
  @Override
  public AllVariablesNamedMatch newEmptyMatch() {
    return AllVariablesNamedMatch.newEmptyMatch();
  }
  
  @Override
  public AllVariablesNamedMatch newMatch(final Object... parameters) {
    return AllVariablesNamedMatch.newMatch((school.Teacher) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static AllVariablesNamedQuerySpecification INSTANCE = make();
    
    public static AllVariablesNamedQuerySpecification make() {
      return new AllVariablesNamedQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static AllVariablesNamedQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "school.allVariablesNamed";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("teacher");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("teacher", "school.Teacher"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_teacher = body.getOrCreateVariableByName("teacher");
      	PVariable var_school = body.getOrCreateVariableByName("school");
      	PVariable var_name = body.getOrCreateVariableByName("name");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_teacher, "teacher")
      	));
      	new PositivePatternCall(body, new FlatTuple(var_teacher, var_school, var_name), TeachersSchoolWithNameQuerySpecification.instance().getInternalQueryRepresentation());
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
