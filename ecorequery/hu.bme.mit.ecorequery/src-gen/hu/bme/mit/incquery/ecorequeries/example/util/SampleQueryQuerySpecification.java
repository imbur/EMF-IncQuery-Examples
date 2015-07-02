package hu.bme.mit.incquery.ecorequeries.example.util;

import com.google.common.collect.Sets;
import hu.bme.mit.incquery.ecorequeries.example.SampleQueryMatch;
import hu.bme.mit.incquery.ecorequeries.example.SampleQueryMatcher;
import hu.bme.mit.incquery.ecorequeries.example.util.EClassWithEStringAttributeQuerySpecification;
import hu.bme.mit.incquery.ecorequeries.example.util.EReferenceWithStarMultiplicityQuerySpecification;
import hu.bme.mit.incquery.ecorequeries.example.util.IsInECoreQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate SampleQueryMatcher in a type-safe way.
 * 
 * @see SampleQueryMatcher
 * @see SampleQueryMatch
 * 
 */
@SuppressWarnings("all")
public final class SampleQueryQuerySpecification extends BaseGeneratedEMFQuerySpecification<SampleQueryMatcher> {
  private SampleQueryQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SampleQueryQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected SampleQueryMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SampleQueryMatcher.on(engine);
  }
  
  @Override
  public SampleQueryMatch newEmptyMatch() {
    return SampleQueryMatch.newEmptyMatch();
  }
  
  @Override
  public SampleQueryMatch newMatch(final Object... parameters) {
    return SampleQueryMatch.newMatch((org.eclipse.emf.ecore.EClass) parameters[0], (org.eclipse.emf.ecore.EClass) parameters[1], (org.eclipse.emf.ecore.EReference) parameters[2], (org.eclipse.emf.ecore.EAttribute) parameters[3], (org.eclipse.emf.ecore.EAttribute) parameters[4]);
  }
  
  private static class LazyHolder {
    private final static SampleQueryQuerySpecification INSTANCE = make();
    
    public static SampleQueryQuerySpecification make() {
      return new SampleQueryQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static SampleQueryQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.incquery.ecorequeries.example.SampleQuery";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("XElement","YElement","Relates","Label1","Label2");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("XElement", "org.eclipse.emf.ecore.EClass"),new PParameter("YElement", "org.eclipse.emf.ecore.EClass"),new PParameter("Relates", "org.eclipse.emf.ecore.EReference"),new PParameter("Label1", "org.eclipse.emf.ecore.EAttribute"),new PParameter("Label2", "org.eclipse.emf.ecore.EAttribute"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_XElement = body.getOrCreateVariableByName("XElement");
      	PVariable var_YElement = body.getOrCreateVariableByName("YElement");
      	PVariable var_Relates = body.getOrCreateVariableByName("Relates");
      	PVariable var_Label1 = body.getOrCreateVariableByName("Label1");
      	PVariable var_Label2 = body.getOrCreateVariableByName("Label2");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_XElement, "XElement"),
      				
      		new ExportedParameter(body, var_YElement, "YElement"),
      				
      		new ExportedParameter(body, var_Relates, "Relates"),
      				
      		new ExportedParameter(body, var_Label1, "Label1"),
      				
      		new ExportedParameter(body, var_Label2, "Label2")
      	));
      	new TypeBinary(body, CONTEXT, var_XElement, var_Relates, getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass", "eStructuralFeatures"), "http://www.eclipse.org/emf/2002/Ecore/EClass.eStructuralFeatures");
      	new TypeUnary(body, var_Relates, getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EReference"), "http://www.eclipse.org/emf/2002/Ecore/EReference");
      	new TypeUnary(body, var_YElement, getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass"), "http://www.eclipse.org/emf/2002/Ecore/EClass");
      	new TypeBinary(body, CONTEXT, var_Relates, var_YElement, getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ETypedElement", "eType"), "http://www.eclipse.org/emf/2002/Ecore/ETypedElement.eType");
      	new PositivePatternCall(body, new FlatTuple(var_Relates), EReferenceWithStarMultiplicityQuerySpecification.instance().getInternalQueryRepresentation());
      	new PositivePatternCall(body, new FlatTuple(var_XElement, var_Label1), EClassWithEStringAttributeQuerySpecification.instance().getInternalQueryRepresentation());
      	new PositivePatternCall(body, new FlatTuple(var_YElement, var_Label2), EClassWithEStringAttributeQuerySpecification.instance().getInternalQueryRepresentation());
      	new NegativePatternCall(body, new FlatTuple(var_XElement), IsInECoreQuerySpecification.instance().getInternalQueryRepresentation());
      	new NegativePatternCall(body, new FlatTuple(var_YElement), IsInECoreQuerySpecification.instance().getInternalQueryRepresentation());
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
