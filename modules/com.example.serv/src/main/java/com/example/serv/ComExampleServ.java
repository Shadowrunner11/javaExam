package com.example.serv;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import template.RestTemplateImplemetation;

/**
 * @author piero
 */

public class ComExampleServ implements BundleActivator {
	private ServiceRegistration registration;


	@Override
	public void start(BundleContext context) throws Exception {
		registration = context
			.registerService(
				RestTemplateImplemetation.class.getName(), 
				new RestTemplateImplemetation(), 
				null
			);
		
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		registration.unregister();
	}

}
