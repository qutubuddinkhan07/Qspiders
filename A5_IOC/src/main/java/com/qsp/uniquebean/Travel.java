package com.qsp.uniquebean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Travel {
	@Autowired
	private Car ev;

	public void visit() {
		ev.run();
	}
}
