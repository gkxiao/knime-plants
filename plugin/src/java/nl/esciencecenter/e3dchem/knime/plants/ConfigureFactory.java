package nl.esciencecenter.e3dchem.knime.plants;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

/**
 * <code>NodeFactory</code> for the "Configure" Node.
 *
 */
public class ConfigureFactory
        extends NodeFactory<ConfigureModel> {

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigureModel createNodeModel() {
        return new ConfigureModel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getNrNodeViews() {
        return 1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NodeView<ConfigureModel> createNodeView(final int viewIndex,
            final ConfigureModel nodeModel) {
        return new ConfigureView(nodeModel);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasDialog() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NodeDialogPane createNodeDialogPane() {
        return new ConfigureDialog();
    }

}
