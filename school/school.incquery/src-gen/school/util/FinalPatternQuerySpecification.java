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
import org.eclipse.incquery.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import school.FinalPatternMatch;
import school.FinalPatternMatcher;
import school.util.TeachesTheMostCoursesQuerySpecification;
import school.util.TheOnesWithTheBiggestCircleQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate FinalPatternMatcher in a type-safe way.
 * 
 * @see FinalPatternMatcher
 * @see FinalPatternMatch
 * 
 */
@SuppressWarnings("all")
public final class FinalPatternQuerySpecification extends BaseGeneratedEMFQuerySpecification<FinalPatternMatcher> {
  private FinalPatternQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static FinalPatternQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected FinalPatternMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return FinalPatternMatcher.on(engine);
  }
  
  @Override
  public FinalPatternMatch newEmptyMatch() {
    return FinalPatternMatch.newEmptyMatch();
  }
  
  @Override
  public FinalPatternMatch newMatch(final Object... parameters) {
    return FinalPatternMatch.newMatch((school.Year) parameters[0], (school.Course) parameters[1], (school.Teacher) parameters[2], (school.Student) parameters[3]);
  }
  
  private static class LazyHolder {
    private final static FinalPatternQuerySpecification INSTANCE = make();
    
    public static FinalPatternQuerySpecification make() {
      return new FinalPatternQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static FinalPatternQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "school.finalPattern";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Y","C","T","S");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("Y", "school.Year"),new PParameter("C", "school.Course"),new PParameter("T", "school.Teacher"),new PParameter("S", "school.Student"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_Y = body.getOrCreateVariableByName("Y");
      	PVariable var_C = body.getOrCreateVariableByName("C");
      	PVariable var_T = body.getOrCreateVariableByName("T");
      	PVariable var_S = body.getOrCreateVariableByName("S");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      	PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      	PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_Y, "Y"),
      				
      		new ExportedParameter(body, var_C, "C"),
      				
      		new ExportedParameter(body, var_T, "T"),
      				
      		new ExportedParameter(body, var_S, "S")
      	));
      	new TypeConstraint(body, new FlatTuple(var_Y), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Year")));
      	new TypeConstraint(body, new FlatTuple(var_C), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Course")));
      	new TypeConstraint(body, new FlatTuple(var_T), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Teacher")));
      	new TypeConstraint(body, new FlatTuple(var_S), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Student")));
      	new TypeConstraint(body, new FlatTuple(var_Y), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Year")));
      	new TypeConstraint(body, new FlatTuple(var_Y, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "Year", "schoolClasses")));
      	new TypeConstraint(body, new FlatTuple(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "SchoolClass", "courses")));
      	new Equality(body, var__virtual_1_, var_C);
      	new TypeConstraint(body, new FlatTuple(var_C), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Course")));
      	new TypeConstraint(body, new FlatTuple(var_C, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "Course", "teacher")));
      	new Equality(body, var__virtual_2_, var_T);
      	new TypeConstraint(body, new FlatTuple(var_S), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Student")));
      	new TypeConstraint(body, new FlatTuple(var_S, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "Student", "schoolClass")));
      	new TypeConstraint(body, new FlatTuple(var__virtual_3_, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "SchoolClass", "courses")));
      	new Equality(body, var__virtual_4_, var_C);
      	new PositivePatternCall(body, new FlatTuple(var_S), TheOnesWithTheBiggestCircleQuerySpecification.instance().getInternalQueryRepresentation());
      	new PositivePatternCall(body, new FlatTuple(var_T), TeachesTheMostCoursesQuerySpecification.instance().getInternalQueryRepresentation());
      	bodies.add(body);
      }
      	{
      	PAnnotation annotation = new PAnnotation("QueryExplorer");
      	annotation.addAttribute("message", "The busiest teacher $T.name$ taught the most sociable student $S.name$ in $Y.startingDate$");
      	addAnnotation(annotation);
      }
      {
      	PAnnotation annotation = new PAnnotation("ObservableValue");
      	annotation.addAttribute("expression", "Y.startingDate");
      	annotation.addAttribute("name", "Year");
      	addAnnotation(annotation);
      }
      {
      	PAnnotation annotation = new PAnnotation("ObservableValue");
      	annotation.addAttribute("expression", "T.name");
      	annotation.addAttribute("name", "Teacher");
      	addAnnotation(annotation);
      }
      {
      	PAnnotation annotation = new PAnnotation("ObservableValue");
      	annotation.addAttribute("expression", "S.name");
      	annotation.addAttribute("name", "Student");
      	addAnnotation(annotation);
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
