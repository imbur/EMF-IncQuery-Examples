package hu.bme.mit.incquery.ecorequeries.example.util;

import com.google.common.collect.Sets;
import hu.bme.mit.incquery.ecorequeries.example.EClassMatch;
import hu.bme.mit.incquery.ecorequeries.example.EClassMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;

/**
 * A pattern-specific query specification that can instantiate EClassMatcher in a type-safe way.
 * 
 * @see EClassMatcher
 * @see EClassMatch
 * 
 */
@SuppressWarnings("all")
public final class EClassQuerySpecification extends BaseGeneratedEMFQuerySpecification<EClassMatcher> {
  private EClassQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EClassQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected EClassMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return EClassMatcher.on(engine);
  }
  
  @Override
  public EClassMatch newEmptyMatch() {
    return EClassMatch.newEmptyMatch();
  }
  
  @Override
  public EClassMatch newMatch(final Object... parameters) {
    return EClassMatch.newMatch((org.eclipse.emf.ecore.EClass) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static EClassQuerySpecification INSTANCE = make();
    
    public static EClassQuerySpecification make() {
      return new EClassQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static EClassQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.incquery.ecorequeries.example.EClass";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("EClass");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("EClass", "org.eclipse.emf.ecore.EClass"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_EClass = body.getOrCreateVariableByName("EClass");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_EClass, "EClass")
      	));
      	new TypeUnary(body, var_EClass, getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass"), "http://www.eclipse.org/emf/2002/Ecore/EClass");
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
