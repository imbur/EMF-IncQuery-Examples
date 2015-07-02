package hu.bme.mit.incquery.ecorequeries.example.util;

import com.google.common.collect.Sets;
import hu.bme.mit.incquery.ecorequeries.example.SuperTypeOfNameMatch;
import hu.bme.mit.incquery.ecorequeries.example.SuperTypeOfNameMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;

/**
 * A pattern-specific query specification that can instantiate SuperTypeOfNameMatcher in a type-safe way.
 * 
 * @see SuperTypeOfNameMatcher
 * @see SuperTypeOfNameMatch
 * 
 */
@SuppressWarnings("all")
public final class SuperTypeOfNameQuerySpecification extends BaseGeneratedEMFQuerySpecification<SuperTypeOfNameMatcher> {
  private SuperTypeOfNameQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SuperTypeOfNameQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected SuperTypeOfNameMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SuperTypeOfNameMatcher.on(engine);
  }
  
  @Override
  public SuperTypeOfNameMatch newEmptyMatch() {
    return SuperTypeOfNameMatch.newEmptyMatch();
  }
  
  @Override
  public SuperTypeOfNameMatch newMatch(final Object... parameters) {
    return SuperTypeOfNameMatch.newMatch((java.lang.String) parameters[0], (java.lang.String) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static SuperTypeOfNameQuerySpecification INSTANCE = make();
    
    public static SuperTypeOfNameQuerySpecification make() {
      return new SuperTypeOfNameQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static SuperTypeOfNameQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.incquery.ecorequeries.example.SuperTypeOfName";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("SuperName","SubName");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("SuperName", "java.lang.String"),new PParameter("SubName", "java.lang.String"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_SuperName = body.getOrCreateVariableByName("SuperName");
      	PVariable var_SubName = body.getOrCreateVariableByName("SubName");
      	PVariable var_Sub = body.getOrCreateVariableByName("Sub");
      	PVariable var_Super = body.getOrCreateVariableByName("Super");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_SuperName, "SuperName"),
      				
      		new ExportedParameter(body, var_SubName, "SubName")
      	));
      	new TypeBinary(body, CONTEXT, var_Sub, var_Super, getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass", "eSuperTypes"), "http://www.eclipse.org/emf/2002/Ecore/EClass.eSuperTypes");
      	new TypeBinary(body, CONTEXT, var_Super, var_SuperName, getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name"), "http://www.eclipse.org/emf/2002/Ecore/ENamedElement.name");
      	new TypeBinary(body, CONTEXT, var_Sub, var_SubName, getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name"), "http://www.eclipse.org/emf/2002/Ecore/ENamedElement.name");
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
