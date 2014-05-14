package replacer;

import ro.sync.exml.plugin.document.DocumentPluginContext;
import ro.sync.exml.plugin.document.DocumentPluginResult;
import ro.sync.exml.plugin.document.DocumentPluginResultImpl;

public class ReplacerExtension implements ro.sync.exml.plugin.document.DocumentPluginExtension {

	public DocumentPluginResult process(DocumentPluginContext context) {
		// TODO Auto-generated method stub
		return new DocumentPluginResultImpl(context.getDocument());
	}
	
}
