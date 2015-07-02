package hu.bme.mit.incquery.ecorequeries.example.util;

import com.google.common.collect.Sets;
import hu.bme.mit.incquery.ecorequeries.example.SampleQuery2Match;
import hu.bme.mit.incquery.ecorequeries.example.SampleQuery2Matcher;
import hu.bme.mit.incquery.ecorequeries.example.util.EClassWithEStringAttributeQuerySpecification;
import hu.bme.mit.incquery.ecorequeries.example.util.EReferenceWithOneMultiplicityQuerySpecification;
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
 * A pattern-specific query specification that can instantiate SampleQuery2Matcher in a type-safe way.
 * 
 * @see SampleQuery2Matcher
 * @see SampleQuery2Match
 * 
 */
@SuppressWarnings("all")
public final class SampleQuery2QuerySpecification extends BaseGeneratedEMFQuerySpecification<SampleQuery2Matcher> {
  private SampleQuery2QuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SampleQuery2QuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected SampleQuery2Matcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SampleQuery2Matcher.on(engine);
  }
  
  @Override
  public SampleQuery2Match newEmptyMatch() {
    return SampleQuery2Match.newEmptyMatch();
  }
  
  @Override
  public SampleQuery2Match newMatch(final Object... parameters) {
    return SampleQuery2Match.newMatch((org.eclipse.emf.ecore.EClass) parameters[0], (org.eclipse.emf.ecore.EClass) parameters[1], (org.eclipse.emf.ecore.EReference) parameters[2], (org.eclipse.emf.ecore.EReference) parameters[3], (org.eclipse.emf.ecore.EAttribute) parameters[4], (org.eclipse.emf.ecore.EAttribute) parameters[5]);
  }
  
  private static class LazyHolder {
    private final static SampleQuery2QuerySpecification INSTANCE = make();
    
    public static SampleQuery2QuerySpecification make() {
      return new SampleQuery2QuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static SampleQuery2QuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.incquery.ecorequeries.example.SampleQuery2";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("XElement","YElement","Relates1","Relates2","Label1","Label2");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("XElement", "org.eclipse.emf.ecore.EClass"),new PParameter("YElement", "org.eclipse.emf.ecore.EClass"),new PParameter("Relates1", "org.eclipse.emf.ecore.EReference"),new PParameter("Relates2", "org.eclipse.emf.ecore.EReference"),new PParameter("Label1", "org.eclipse.emf.ecore.EAttribute"),new PParameter("Label2", "org.eclipse.emf.ecore.EAttribute"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_XElement = body.getOrCreateVariableByName("XElement");
      	PVariable var_YElement = body.getOrCreateVariableByName("YElement");
      	PVariable var_Relates1 = body.getOrCreateVariableByName("Relates1");
      	PVariable var_Relates2 = body.getOrCreateVariableByName("Relates2");
      	PVariable var_Label1 = body.getOrCreateVariableByName("Label1");
      	PVariable var_Label2 = body.getOrCreateVariableByName("Label2");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_XElement, "XElement"),
      				
      		new ExportedParameter(body, var_YElement, "YElement"),
      				
      		new ExportedParameter(body, var_Relates1, "Relates1"),
      				
      		new ExportedParameter(body, var_Relates2, "Relates2"),
      				
      		new ExportedParameter(body, var_Label1, "Label1"),
      				
      		new ExportedParameter(body, var_Label2, "Label2")
      	));
      	new TypeBinary(body, CONTEXT, var_XElement, var_Relates1, getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass", "eStructuralFeatures"), "http://www.eclipse.org/emf/2002/Ecore/EClass.eStructuralFeatures");
      	new TypeBinary(body, CONTEXT, var_Relates1, var_Relates2, getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EReference", "eOpposite"), "http://www.eclipse.org/emf/2002/Ecore/EReference.eOpposite");
      	new TypeUnary(body, var_YElement, getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass"), "http://www.eclipse.org/emf/2002/Ecore/EClass");
      	new TypeBinary(body, CONTEXT, var_Relates1, var_YElement, getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ETypedElement", "eType"), "http://www.eclipse.org/emf/2002/Ecore/ETypedElement.eType");
      	new PositivePatternCall(body, new FlatTuple(var_Relates1), EReferenceWithStarMultiplicityQuerySpecification.instance().getInternalQueryRepresentation());
      	new PositivePatternCall(body, new FlatTuple(var_Relates2), EReferenceWithOneMultiplicityQuerySpecification.instance().getInternalQueryRepresentation());
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
