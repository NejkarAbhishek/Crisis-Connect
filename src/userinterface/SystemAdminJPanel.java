/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface;

import business.Network;
import business.enterprise.Enterprise;
import business.enterprise.EnterpriseDirectory;
import business.organization.Organization;
import business.organization.OrganizationDirectory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author abhis
 */
public class SystemAdminJPanel extends javax.swing.JPanel {
    
    Network network = Network.findNetwork("International Disaster Response Network");
    EnterpriseDirectory directory =network.getEnterprisedirectory();
    private DefaultTableModel enterpriseTableModel;
    private DefaultTableModel organizationTableModel;

    /**
     * Creates new form SystemAdminJPanel
     */
    public SystemAdminJPanel() {
        initComponents();
        initializeTables();
        initializeComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddEnterprise = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEnterprise = new javax.swing.JTable();
        btnDeleteEnterprise = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrganizations = new javax.swing.JTable();
        cmbEnterprises = new javax.swing.JComboBox<>();
        btnAddOrg = new javax.swing.JButton();
        btnDeleteOrg = new javax.swing.JButton();
        txtEnterprise = new javax.swing.JTextField();
        txtOrganizations = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));

        btnAddEnterprise.setBackground(new java.awt.Color(0, 0, 156));
        btnAddEnterprise.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        btnAddEnterprise.setForeground(new java.awt.Color(255, 255, 255));
        btnAddEnterprise.setText("Add");
        btnAddEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEnterpriseActionPerformed(evt);
            }
        });

        tblEnterprise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Table"
            }
        ));
        jScrollPane1.setViewportView(tblEnterprise);

        btnDeleteEnterprise.setBackground(new java.awt.Color(0, 0, 156));
        btnDeleteEnterprise.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        btnDeleteEnterprise.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteEnterprise.setText("Delete");
        btnDeleteEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEnterpriseActionPerformed(evt);
            }
        });

        tblOrganizations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organizations Table"
            }
        ));
        jScrollPane2.setViewportView(tblOrganizations);

        cmbEnterprises.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        cmbEnterprises.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEnterprises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEnterprisesActionPerformed(evt);
            }
        });

        btnAddOrg.setBackground(new java.awt.Color(0, 0, 156));
        btnAddOrg.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        btnAddOrg.setForeground(new java.awt.Color(255, 255, 255));
        btnAddOrg.setText("Add");
        btnAddOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrgActionPerformed(evt);
            }
        });

        btnDeleteOrg.setBackground(new java.awt.Color(0, 0, 156));
        btnDeleteOrg.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        btnDeleteOrg.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteOrg.setText("Delete");
        btnDeleteOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteOrgActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/engineer.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbEnterprises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnAddOrg)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtOrganizations, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDeleteOrg))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(284, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddEnterprise)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDeleteEnterprise))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(73, 73, 73))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddEnterprise)
                            .addComponent(btnDeleteEnterprise)
                            .addComponent(txtEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4))
                .addGap(36, 36, 36)
                .addComponent(cmbEnterprises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddOrg)
                    .addComponent(btnDeleteOrg)
                    .addComponent(txtOrganizations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEnterpriseActionPerformed
        // TODO add your handling code here:
        String enterpriseName = txtEnterprise.getText().trim();
        if (!enterpriseName.isEmpty()) {
            directory.newEnterprise(enterpriseName); 
            updateEnterpriseTable();
            initializeComboBox();
            txtEnterprise.setText(""); // Clear input field
        } else {
            JOptionPane.showMessageDialog(this, "Enterprise name cannot be empty.");
        }
    }//GEN-LAST:event_btnAddEnterpriseActionPerformed

    private void btnDeleteEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEnterpriseActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEnterprise.getSelectedRow();
        if (selectedRow >= 0) {
            String enterpriseType = (String) enterpriseTableModel.getValueAt(selectedRow, 0);
            Enterprise enterprise = directory.findEnterprise(enterpriseType);
            if (enterprise != null) {
                directory.getAllEnter().remove(enterprise); // Remove from directory
                updateEnterpriseTable();
                initializeComboBox();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select an enterprise to delete.");
        }
    }//GEN-LAST:event_btnDeleteEnterpriseActionPerformed

    private void cmbEnterprisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEnterprisesActionPerformed
        // TODO add your handling code here:
        int selectedIndex = cmbEnterprises.getSelectedIndex();
    if (selectedIndex >= 0) {
        String enterpriseType = (String) cmbEnterprises.getSelectedItem();
        Enterprise selectedEnterprise = directory.findEnterprise(enterpriseType);
 
        if (selectedEnterprise != null) {
            updateOrganizationTable(selectedEnterprise);
        } else {
            JOptionPane.showMessageDialog(this, "Enterprise not found: " + enterpriseType);
            organizationTableModel.setRowCount(0); // Clear table if no enterprise
        }
    } else {
        organizationTableModel.setRowCount(0); // Clear table if no selection
    }
    }//GEN-LAST:event_cmbEnterprisesActionPerformed

    private void btnAddOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrgActionPerformed
        // TODO add your handling code here:
        int selectedIndex = cmbEnterprises.getSelectedIndex();
    if (selectedIndex >= 0) {
        // Get the selected enterprise
        String enterpriseType = (String) cmbEnterprises.getSelectedItem();
        Enterprise selectedEnterprise = directory.findEnterprise(enterpriseType);
 
        if (selectedEnterprise != null) {
            String orgName = txtOrganizations.getText().trim();
 
            // Validate organization name input
            if (orgName.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Organization name cannot be empty.");
                return;
            }
 
            // Add the organization to the selected enterprise's directory
            OrganizationDirectory orgDirectory = selectedEnterprise.getOrgDirectory();
            if (orgDirectory != null) {
                orgDirectory.newOrganization(0, orgName, "Address", "City", "State", "Country");
                JOptionPane.showMessageDialog(this, "Organization added successfully!");
                updateOrganizationTable(selectedEnterprise);
                txtOrganizations.setText(""); // Clear the input field
            } else {
                JOptionPane.showMessageDialog(this, "Failed to add organization: Organization Directory is missing.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add organization: Enterprise not found.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select an enterprise.");
    }
    }//GEN-LAST:event_btnAddOrgActionPerformed

    private void btnDeleteOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteOrgActionPerformed
        // TODO add your handling code here:
        int selectedIndex = cmbEnterprises.getSelectedIndex();
        int selectedRow = tblOrganizations.getSelectedRow();
        if (selectedIndex >= 0 && selectedRow >= 0) {
            String enterpriseType = (String) cmbEnterprises.getSelectedItem();
            Enterprise selectedEnterprise = directory.findEnterprise(enterpriseType);
            if (selectedEnterprise != null) {
                selectedEnterprise.getOrgDirectory().getAllOrg().remove(selectedRow);
                updateOrganizationTable(selectedEnterprise);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select an enterprise and an organization.");
        }
    }//GEN-LAST:event_btnDeleteOrgActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEnterprise;
    private javax.swing.JButton btnAddOrg;
    private javax.swing.JButton btnDeleteEnterprise;
    private javax.swing.JButton btnDeleteOrg;
    private javax.swing.JComboBox<String> cmbEnterprises;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblEnterprise;
    private javax.swing.JTable tblOrganizations;
    private javax.swing.JTextField txtEnterprise;
    private javax.swing.JTextField txtOrganizations;
    // End of variables declaration//GEN-END:variables

    private void initializeTables() {
        enterpriseTableModel = (DefaultTableModel) tblEnterprise.getModel();
        organizationTableModel = (DefaultTableModel) tblOrganizations.getModel();
        updateEnterpriseTable();
 
    }
 
    private void initializeComboBox() {
        cmbEnterprises.removeAllItems();
        for (Enterprise enterprise : directory.getAllEnter()) {
            cmbEnterprises.addItem(enterprise.getType());
        }
    }
 
    private void updateEnterpriseTable() {
        enterpriseTableModel.setRowCount(0); 
        for (Enterprise enterprise : directory.getAllEnter()) {
            enterpriseTableModel.addRow(new Object[]{enterprise.getType()});
        }
    }
 
    
    private void updateOrganizationTable(Enterprise selectedEnterprise) {
    organizationTableModel.setRowCount(0); // Clear the table
    if (selectedEnterprise != null) {
        OrganizationDirectory orgDirectory = selectedEnterprise.getOrgDirectory();
        if (orgDirectory != null) {
            for (Organization org : orgDirectory.getAllOrg()) {
                organizationTableModel.addRow(new Object[]{org.getName()});
            }
        } else {
            JOptionPane.showMessageDialog(this, "No organizations found for this enterprise.");
        }
    }
}

}
