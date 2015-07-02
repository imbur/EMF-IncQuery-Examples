package hu.bme.mit.incquery.ecorequeries.example.util;

import com.google.common.collect.Sets;
import hu.bme.mit.incquery.ecorequeries.example.IsInECoreMatch;
import hu.bme.mit.incquery.ecorequeries.example.IsInECoreMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;

/**
 * A pattern-specific query specification that can instantiate IsInECoreMatcher in a type-safe way.
 * 
 * @see IsInECoreMatcher
 * @see IsInECoreMatch
 * 
 */
@SuppressWarnings("all")
public final class IsInECoreQuerySpecification extends BaseGeneratedEMFQuerySpecification<IsInECoreMatcher> {
  private IsInECoreQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IsInECoreQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected IsInECoreMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return IsInECoreMatcher.on(engine);
  }
  
  @Override
  public IsInECoreMatch newEmptyMatch() {
    return IsInECoreMatch.newEmptyMatch();
  }
  
  @Override
  public IsInECoreMatch newMatch(final Object... parameters) {
    return IsInECoreMatch.newMatch((org.eclipse.emf.ecore.EClassifier) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static IsInECoreQuerySpecification INSTANCE = make();
    
    public static IsInECoreQuerySpecification make() {
      return new IsInECoreQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static IsInECoreQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.incquery.ecorequeries.example.IsInECore";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Element");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("Element", "org.eclipse.emf.ecore.EClassifier"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_Element = body.getOrCreateVariableByName("Element");
      	PVariable var_EP = body.getOrCreateVariableByName("EP");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_Element, "Element")
      	));
      	new TypeBinary(body, CONTEXT, var_Element, var_EP, getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClassifier", "ePackage"), "http://www.eclipse.org/emf/2002/Ecore/EClassifier.ePackage");
      	new ConstantValue(body, var__virtual_1_, "http://www.eclipse.org/emf/2002/Ecore");
      	new TypeBinary(body, CONTEXT, var_EP, var__virtual_1_, getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage", "nsURI"), "http://www.eclipse.org/emf/2002/Ecore/EPackage.nsURI");
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
