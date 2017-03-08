package nl.esciencecenter.e3dchem.knime.plants;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class WorkbenchPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	private StringFieldEditor executableField;

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Preferences for 3D-e-Chem PLANTS nodes");
	}

	@Override
	protected void createFieldEditors() {
		executableField = new ExecutableFieldEditor("EXECUTABLE", "Path of PLANTS executable", false, getFieldEditorParent());
		addField(executableField);
	}
}
