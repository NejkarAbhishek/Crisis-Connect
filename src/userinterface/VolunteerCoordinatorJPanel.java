/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface;

import business.role.Citizen;
import business.role.VolunteerCoordinator;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author abhis
 */
public class VolunteerCoordinatorJPanel extends javax.swing.JPanel {

    VolunteerCoordinator coordinator = VolunteerCoordinator.findCoordinator(1);
    /**
     * Creates new form VolunteerCoordinatorJPanel
     */
    public VolunteerCoordinatorJPanel() {
        initComponents();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblVolunteers = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 750));

        tblVolunteers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Area", "Nationality"
            }
        ));
        jScrollPane1.setViewportView(tblVolunteers);

        jLabel8.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel8.setText("Volunteer Information:");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/volunteer.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(261, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(777, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(285, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVolunteers;
    // End of variables declaration//GEN-END:variables
    
    private void populateTable() {
    DefaultTableModel model = (javax.swing.table.DefaultTableModel) tblVolunteers.getModel();
    // Clear existing rows in the table
    model.setRowCount(0);

    if (coordinator != null) {
        // Retrieve the list of volunteers
        ArrayList<Citizen> volunteers = coordinator.getAllVolunteers();

        // Populate the table with volunteer data
        for (Citizen volunteer : volunteers) {
            Object[] row = new Object[4];
            row[0] = volunteer.getCitizenId();   // Volunteer ID
            row[1] = volunteer.getName();       // Volunteer Name
            row[2] = coordinator.getOperationArea(); // Operation Area
            row[3] = volunteer.getNationality(); // Nationality

            model.addRow(row);
        }
    } else {
        System.err.println("Coordinator not found!");
    }
}

}