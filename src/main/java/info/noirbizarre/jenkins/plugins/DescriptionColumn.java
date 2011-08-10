package info.noirbizarre.jenkins.plugins;

import org.kohsuke.stapler.DataBoundConstructor;

import hudson.Extension;
import hudson.views.ListViewColumnDescriptor;
import hudson.views.ListViewColumn;

public class DescriptionColumn extends ListViewColumn {
	
	@DataBoundConstructor
	public DescriptionColumn() {
		super();
	}
	
	@Extension
	public static class DescriptorImpl extends ListViewColumnDescriptor {

		@Override
		public String getDisplayName() {
			return Messages.DescriptionColumn_DisplayName();
		}
	}
}
