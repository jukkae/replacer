package replacer;

import ro.sync.exml.plugin.PluginDescriptor;

public class Replacer extends ro.sync.exml.plugin.Plugin {

	private static Replacer instance;

	public Replacer(PluginDescriptor descriptor) {
		super(descriptor);

		if (instance != null) {
			throw new IllegalStateException("Already instantiated!");
		}
		instance = this;
	}

	public static Replacer getInstance() {
		return instance;
	}

}
