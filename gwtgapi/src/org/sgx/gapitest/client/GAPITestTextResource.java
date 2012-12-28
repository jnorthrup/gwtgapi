package org.sgx.gapitest.client;

import com.google.gwt.resources.client.ExternalTextResource;
import com.google.gwt.resources.client.ResourceCallback;
import com.google.gwt.resources.client.ResourceException;
import com.google.gwt.resources.client.TextResource;

/**
 * a helper class for easily specify both external and normal TextResources with same API
 * 
 * @author sg
 * 
 */
public class GAPITestTextResource {
	TextResource textResource;
	ExternalTextResource externalTextResource;

	public GAPITestTextResource(TextResource textResource) {
		super();
		this.textResource = textResource;
	}

	public GAPITestTextResource(ExternalTextResource externalTextResource) {
		super();
		this.externalTextResource = externalTextResource;
	}

	public void getText(final GAPITestTextResourceCallback c) {

		if (externalTextResource != null) {
			try {
				externalTextResource.getText(new ResourceCallback<TextResource>() {

					@Override
					public void onSuccess(TextResource resource) {
						c.call(resource.getText());
					}

					@Override
					public void onError(ResourceException e) {
						c.call(null);
					}
				});
			} catch (ResourceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
