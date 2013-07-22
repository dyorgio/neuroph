package org.neuroph.netbeans.charts;

import org.jfree.chart.ChartPanel;
import org.netbeans.api.settings.ConvertAsProperties;
import org.neuroph.core.learning.DataSet;
import org.neuroph.core.learning.DataSetRow;
import org.nugs.graph2d.api.Attribute;
import org.neuroph.netbeans.charts.Bundle;
import org.neuroph.netbeans.charts.graphs2d.Graph2DBuilder;
import org.neuroph.netbeans.charts.graphs2d.DatasetScatter2D;
import org.neuroph.netbeans.charts.graphs2d.DatasetSeries2D;
import org.neuroph.netbeans.charts.Bundle;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(
    dtd = "-//org.nugs.neurophgraph//VizualizeDataset2D//EN",
autostore = false)
@TopComponent.Description(
    preferredID = "VizualizeDataset2DTopComponent",
//iconBase="SET/PATH/TO/ICON/HERE", 
persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(mode = "output", openAtStartup = false)
@ActionID(category = "Window", id = "org.nugs.neurophgraph.VizualizeDataset2DTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
    displayName = "#CTL_VizualizeDataset2DAction",
preferredID = "VizualizeDataset2DTopComponent")
@Messages({
    "CTL_VizualizeDataset2DAction=VizualizeDataset2D",
    "CTL_VizualizeDataset2DTopComponent=Dataset visualization in 2D",
    "HINT_VizualizeDataset2DTopComponent=This is a dataset visualization in 2D window"
})
public final class VisualizeDataset2DTopComponent extends TopComponent {

    private DataSet dataset;
    private Graph2DBuilder graphBuilder;

    public VisualizeDataset2DTopComponent() {
        initComponents();
        setName(Bundle.CTL_VizualizeDataset2DTopComponent());
        setToolTipText(Bundle.HINT_VizualizeDataset2DTopComponent());

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
        jButton1 = new javax.swing.JButton();
        graphPanel = new javax.swing.JPanel();

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(VisualizeDataset2DTopComponent.class, "VisualizeDataset2DTopComponent.jLabel1.text")); // NOI18N

        graphCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        graphCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphComboActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(VisualizeDataset2DTopComponent.class, "VisualizeDataset2DTopComponent.jLabel2.text")); // NOI18N

        xCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(VisualizeDataset2DTopComponent.class, "VisualizeDataset2DTopComponent.jLabel3.text")); // NOI18N

        yCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        org.openide.awt.Mnemonics.setLocalizedText(jButton1, org.openide.util.NbBundle.getMessage(VisualizeDataset2DTopComponent.class, "VisualizeDataset2DTopComponent.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(graphCombo, 0, 152, Short.MAX_VALUE)
                    .addComponent(xCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jButton1))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        graphPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(graphPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(graphPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void graphComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_graphComboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


        graphPanel.removeAll();
        String x = (String) xCombo.getSelectedItem();
        Attribute in1 = parseInputOrOutput(x);
        String y = (String) yCombo.getSelectedItem();
        Attribute in2 = parseInputOrOutput(y);

        graphBuilder = (Graph2DBuilder) graphCombo.getSelectedItem();
        graphBuilder.setAttribute1(in1);
        graphBuilder.setAttribute2(in2);
        ChartPanel chartPanel = graphBuilder.create();
        graphPanel.add(chartPanel);

        graphPanel.validate();


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox graphCombo;
    private javax.swing.JPanel graphPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox xCombo;
    private javax.swing.JComboBox yCombo;
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

        graphCombo.removeAllItems();

        DataSetRow row = dataset.getRowAt(0);
        for (int i = 0; i < row.getInput().length; i++) {
            xCombo.addItem("input " + (i + 1));
            yCombo.addItem("input " + (i + 1));
        }
        for (int i = 0; i < row.getDesiredOutput().length; i++) {
            yCombo.addItem("output " + (i + 1));
            xCombo.addItem("output " + (i + 1));
        }
        graphCombo.addItem(new DatasetScatter2D(dataset));
        graphCombo.addItem(new DatasetSeries2D(dataset));


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
