package org.neuroph.netbeans.charts;

import org.netbeans.api.settings.ConvertAsProperties;
import org.neuroph.core.learning.DataSet;
import org.neuroph.core.learning.DataSetRow;
import org.nugs.graph2d.api.Attribute;
import org.nugs.graph3d.Chart3DUtils;
import org.nugs.graph3d.api.Point3D;
import org.neuroph.netbeans.charts.Bundle;
import org.neuroph.netbeans.charts.graphs3d.DatasetHistogram3D;
import org.neuroph.netbeans.charts.graphs3d.Graph3DBuilder;
import org.neuroph.netbeans.charts.graphs3d.DatasetScatter3D;
import org.neuroph.netbeans.charts.graphs3d.DatasetSurface3D;
import org.neuroph.netbeans.charts.Bundle;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(
    dtd = "-//org.nugs.neurophgraph//VisualizeDataset//EN",
autostore = false)
@TopComponent.Description(
    preferredID = "VisualizeDatasetTopComponent",
//iconBase="SET/PATH/TO/ICON/HERE", 
persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(mode = "output", openAtStartup = false)
@ActionID(category = "Window", id = "org.nugs.neurophgraph.VisualizeDatasetTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
    displayName = "#CTL_VisualizeDatasetAction",
preferredID = "VisualizeDatasetTopComponent")
@Messages({
    "CTL_VisualizeDatasetAction=VisualizeDataset",
    "CTL_VisualizeDatasetTopComponent=Dataset visualization in 3D",
    "HINT_VisualizeDatasetTopComponent=This is a dataset visualization in 3D window"
})
public final class VisualizeDataset3DTopComponent extends TopComponent {

    private Graph3DBuilder graphBuilder;
    private Point3D[] data;
    private DataSet dataset;

    public VisualizeDataset3DTopComponent() {
        initComponents();
        setName(Bundle.CTL_VisualizeDatasetTopComponent());
        setToolTipText(Bundle.HINT_VisualizeDatasetTopComponent());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        graphCombo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        xCombo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        yCombo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        zCombo = new javax.swing.JComboBox();
        vizualizeButton = new javax.swing.JButton();
        graphPanel = new javax.swing.JPanel();
        openInLauncherButton = new javax.swing.JButton();

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(VisualizeDataset3DTopComponent.class, "VisualizeDataset3DTopComponent.jLabel1.text")); // NOI18N

        graphCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(VisualizeDataset3DTopComponent.class, "VisualizeDataset3DTopComponent.jLabel2.text")); // NOI18N

        xCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(VisualizeDataset3DTopComponent.class, "VisualizeDataset3DTopComponent.jLabel3.text")); // NOI18N

        yCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(VisualizeDataset3DTopComponent.class, "VisualizeDataset3DTopComponent.jLabel4.text")); // NOI18N

        zCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        org.openide.awt.Mnemonics.setLocalizedText(vizualizeButton, org.openide.util.NbBundle.getMessage(VisualizeDataset3DTopComponent.class, "VisualizeDataset3DTopComponent.vizualizeButton.text")); // NOI18N
        vizualizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vizualizeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(graphCombo, 0, 159, Short.MAX_VALUE)
                    .addComponent(xCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(vizualizeButton))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(graphCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                .addComponent(vizualizeButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout graphPanelLayout = new javax.swing.GroupLayout(graphPanel);
        graphPanel.setLayout(graphPanelLayout);
        graphPanelLayout.setHorizontalGroup(
            graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        graphPanelLayout.setVerticalGroup(
            graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        org.openide.awt.Mnemonics.setLocalizedText(openInLauncherButton, org.openide.util.NbBundle.getMessage(VisualizeDataset3DTopComponent.class, "VisualizeDataset3DTopComponent.openInLauncherButton.text")); // NOI18N
        openInLauncherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openInLauncherButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(graphPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 425, Short.MAX_VALUE)
                        .addComponent(openInLauncherButton)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(graphPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(openInLauncherButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void vizualizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vizualizeButtonActionPerformed
        // TODO add your handling code here:


        String x = (String) xCombo.getSelectedItem();
        Attribute in1 = parseInputOrOutput(x);
        String y = (String) yCombo.getSelectedItem();
        Attribute in2 = parseInputOrOutput(y);
        String z = (String) zCombo.getSelectedItem();
        Attribute in3 = parseInputOrOutput(z);

        graphBuilder = (Graph3DBuilder) graphCombo.getSelectedItem();

        graphBuilder.setAttribute1(in1);
        graphBuilder.setAttribute2(in2);
        graphBuilder.setAttribute3(in3);
        Chart3DUtils.addChartToPanel(graphBuilder.createGraph(), graphPanel);

        graphPanel.validate();
        openInLauncherButton.setEnabled(true);


    }//GEN-LAST:event_vizualizeButtonActionPerformed

    private void openInLauncherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openInLauncherButtonActionPerformed

        graphBuilder = (Graph3DBuilder) graphCombo.getSelectedItem();
        Chart3DUtils.openInChartLauncher(graphBuilder.createGraph());



    }//GEN-LAST:event_openInLauncherButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox graphCombo;
    private javax.swing.JPanel graphPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton openInLauncherButton;
    private javax.swing.JButton vizualizeButton;
    private javax.swing.JComboBox xCombo;
    private javax.swing.JComboBox yCombo;
    private javax.swing.JComboBox zCombo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }

    public void openChart(DataSet dataset) {
        this.dataset = dataset;


        xCombo.removeAllItems();
        yCombo.removeAllItems();
        zCombo.removeAllItems();
        graphCombo.removeAllItems();
        openInLauncherButton.setEnabled(false);

        DataSetRow row = dataset.getRowAt(0);
        for (int i = 0; i < row.getInput().length; i++) {
            xCombo.addItem("input " + (i + 1));
            yCombo.addItem("input " + (i + 1));
            zCombo.addItem("input " + (i + 1));
        }
        for (int i = 0; i < row.getDesiredOutput().length; i++) {
            xCombo.addItem("output " + (i + 1));
            yCombo.addItem("output " + (i + 1));
            zCombo.addItem("output " + (i + 1));
        }
        graphCombo.addItem(new DatasetScatter3D(dataset));
        graphCombo.addItem(new DatasetSurface3D(dataset));
        graphCombo.addItem(new DatasetHistogram3D(dataset));


    }

    private Attribute parseInputOrOutput(String string) {
        Attribute attr;
        if (string.startsWith("input")) {
            int index = Integer.parseInt(string.substring(6)) - 1;
            attr = new Attribute(index, false, "Input");
        } else {
            int index = Integer.parseInt(string.substring(7)) - 1;
            attr = new Attribute(index, true, "Output");
        }
        return attr;
    }
}
