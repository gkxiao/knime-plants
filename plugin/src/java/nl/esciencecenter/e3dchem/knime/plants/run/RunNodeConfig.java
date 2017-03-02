package nl.esciencecenter.e3dchem.knime.plants.run;

import org.knime.core.node.InvalidSettingsException;
import org.knime.core.node.NodeSettingsRO;
import org.knime.core.node.NodeSettingsWO;
import org.knime.core.node.defaultnodesettings.SettingsModelString;

public class RunNodeConfig {
	public SettingsModelString modeColumn = new SettingsModelString("mode", null);
	public SettingsModelString argumentsColumn = new SettingsModelString("arguments", null);
	public SettingsModelString workingDirectoryColumn = new SettingsModelString("workingDirectory", null);
	public void saveSettingsTo(NodeSettingsWO settings) {
		modeColumn.saveSettingsTo(settings);
		argumentsColumn.saveSettingsTo(settings);
		workingDirectoryColumn.saveSettingsTo(settings);
		
	}
	public void validateSettings(NodeSettingsRO settings) throws InvalidSettingsException {
		modeColumn.validateSettings(settings);
		argumentsColumn.validateSettings(settings);
		workingDirectoryColumn.validateSettings(settings);
		
	}
	public void loadValidatedSettingsFrom(NodeSettingsRO settings) throws InvalidSettingsException {
		modeColumn.loadSettingsFrom(settings);
		argumentsColumn.loadSettingsFrom(settings);
		workingDirectoryColumn.loadSettingsFrom(settings);
	}
	
}
