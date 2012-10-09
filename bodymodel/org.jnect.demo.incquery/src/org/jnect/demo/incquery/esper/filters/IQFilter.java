package org.jnect.demo.incquery.esper.filters;

import org.jnect.demo.incquery.esper.IEventFilter;

import com.espertech.esper.client.EPAdministrator;
import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.UpdateListener;

public class IQFilter implements IEventFilter {

	private EPStatement statement;

	public IQFilter(EPAdministrator admin) {
		String stmt = "SELECT * FROM pattern[" +
				"PatternMatchEvent(patternName='I') -> " +
				"PatternMatchEvent(patternName='Q')]";
		statement = admin.createEPL(stmt);
	}

	@Override
	public void addListener(Object listener) {
		statement.addListener((UpdateListener)listener);
	}
}
