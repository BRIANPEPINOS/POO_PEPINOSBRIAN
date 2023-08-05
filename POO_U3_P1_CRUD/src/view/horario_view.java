
package view;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import control.Conexion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;


public class horario_view extends javax.swing.JInternalFrame {

    Conexion cc=new Conexion();
    Connection con=cc.conexion();
    public horario_view() {
        initComponents();
        mostrarDatos();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        panel_horario = new javax.swing.JPanel();
        jLabel1_horario = new javax.swing.JLabel();
        label_estado = new javax.swing.JLabel();
        buton_guardar = new javax.swing.JButton();
        buton_actualizar = new javax.swing.JButton();
        buton_eliminar = new javax.swing.JButton();
        buton_nuevo = new javax.swing.JButton();
        combobox_estado = new javax.swing.JComboBox<>();
        label_hora = new javax.swing.JLabel();
        combobox_hora = new javax.swing.JComboBox<>();
        label_asignatura = new javax.swing.JLabel();
        combobox_asignatura = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_horario = new javax.swing.JTable();

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel_horario.setBackground(new java.awt.Color(0, 255, 204));

        jLabel1_horario.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        jLabel1_horario.setText("SISTEMA HORARIO");

        label_estado.setText("ESTADO");

        buton_guardar.setText("GUARDAR");
        buton_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_guardarActionPerformed(evt);
            }
        });

        buton_actualizar.setText("ACTUALIZAR");
        buton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_actualizarActionPerformed(evt);
            }
        });

        buton_eliminar.setText("ELIMINAR");
        buton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_eliminarActionPerformed(evt);
            }
        });

        buton_nuevo.setText("NUEVO");
        buton_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_nuevoActionPerformed(evt);
            }
        });

        combobox_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OCUPADO", "LIBRE" }));
        combobox_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_estadoActionPerformed(evt);
            }
        });

        label_hora.setText("HORA");

        combobox_hora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "07:00-09:00", "09:00-11:00", "11:00-13:00", "13:30-16:30" }));
        combobox_hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_horaActionPerformed(evt);
            }
        });

        label_asignatura.setText("ASIGNATURA");

        combobox_asignatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "POO", "FISICA", "EDO", "CALCULO" }));
        combobox_asignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_asignaturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_horarioLayout = new javax.swing.GroupLayout(panel_horario);
        panel_horario.setLayout(panel_horarioLayout);
        panel_horarioLayout.setHorizontalGroup(
            panel_horarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_horarioLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panel_horarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_horarioLayout.createSequentialGroup()
                        .addComponent(label_estado)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_horarioLayout.createSequentialGroup()
                        .addGroup(panel_horarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(combobox_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_horarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(panel_horarioLayout.createSequentialGroup()
                                    .addComponent(label_hora)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combobox_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel_horarioLayout.createSequentialGroup()
                                    .addComponent(label_asignatura)
                                    .addGap(18, 18, 18)
                                    .addComponent(combobox_asignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_horarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1_horario)
                .addGap(74, 74, 74))
            .addGroup(panel_horarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buton_nuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buton_guardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buton_eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buton_actualizar)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        panel_horarioLayout.setVerticalGroup(
            panel_horarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_horarioLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1_horario)
                .addGap(18, 18, 18)
                .addGroup(panel_horarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_asignatura)
                    .addComponent(combobox_asignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_horarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_hora)
                    .addComponent(combobox_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_horarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_estado)
                    .addComponent(combobox_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(panel_horarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buton_nuevo)
                    .addComponent(buton_guardar)
                    .addComponent(buton_eliminar)
                    .addComponent(buton_actualizar))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        tabla_horario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_horario);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void mostrarDatos(){
        String titulos []= {"ORDEN","ASIGNATURA","HORA","ESTADO"};
        String registro[]=new String[4];
        DefaultTableModel modelo=new DefaultTableModel(null,titulos);
        //va a seleccionar mi tabala para la base de datos a conectar
        String SQL="select * from horario";
        try{
            Statement st= (Statement) con.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            while(rs.next()){
                registro[0]=rs.getString("hor_orden");
                registro[1]=rs.getString("hor_asignatura");
                registro[2]=rs.getString("hor_hora");
                registro[3]=rs.getString("hor_estado");
              
                modelo.addRow(registro);
            }
            tabla_horario.setModel(modelo);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "error al mostrar datos"+ e.getMessage());
            
        }
    }
    public void limpiarDatos(){
        combobox_asignatura.setSelectedItem(null);
        combobox_hora.setSelectedItem(null);
        combobox_estado.setSelectedItem(null);

        
    }
    
    public void insertarDatos(){
        try {
            String SQL="insert into horario(hor_asignatura, hor_hora, hor_estado)values(?,?,?)";
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(SQL);
            int seleccion=combobox_asignatura.getSelectedIndex();
            pst.setString(1,combobox_asignatura.getItemAt(seleccion));
            int seleccion1=combobox_hora.getSelectedIndex();
            pst.setString(2,combobox_hora.getItemAt(seleccion1));
            int seleccion2=combobox_estado.getSelectedIndex();
            pst.setString(3,combobox_estado.getItemAt(seleccion2));
            //aqui ejecutamos la consulta
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
                 
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error de insercion"+e);
        }
    }
    
    public void eliminarRegistro(){
        int filaSeleccionada=tabla_horario.getSelectedRow();
        try {
            String SQL="delete from horario where hor_orden="+tabla_horario.getValueAt(filaSeleccionada, 0);
            Statement st=(Statement) con.createStatement();
            int n=st.executeUpdate(SQL);
            if(n>=0){
                JOptionPane.showMessageDialog(null, "Registro Eliminado correctamente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error en eliminar registro"+e.getMessage());
        }
    }
        public void actualizarDatos(){
        try {
            String 
            SQL="update horario set hor_asignatura=?,hor_hora=?,hor_estado=? where hor_orden=?";
            int filaSeleccionada=tabla_horario.getSelectedRow();
            String dao=(String)tabla_horario.getValueAt(filaSeleccionada,0);
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(SQL);
            int seleccion=combobox_asignatura.getSelectedIndex();
            pst.setString(1,combobox_asignatura.getItemAt(seleccion));
            int seleccion1=combobox_hora.getSelectedIndex();
            pst.setString(2,combobox_hora.getItemAt(seleccion1));
            int seleccion2=combobox_estado.getSelectedIndex();
            pst.setString(3,combobox_estado.getItemAt(seleccion2));
            //Ejecutamos la consulta/
            pst.setString(4, dao);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Se ha actualizado correctamente su registro");
                    
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error en la actualizacion"+e.getMessage());
        }
    }
        
    
    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void combobox_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox_estadoActionPerformed

    private void buton_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_nuevoActionPerformed
        // TODO add your handling code here:
        limpiarDatos();
    }//GEN-LAST:event_buton_nuevoActionPerformed

    private void buton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_actualizarActionPerformed
        // TODO add your handling code here:
        actualizarDatos();
        mostrarDatos();
    }//GEN-LAST:event_buton_actualizarActionPerformed

    private void buton_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_guardarActionPerformed
        // TODO add your handling code here:
        insertarDatos();
        limpiarDatos();
        mostrarDatos();

    }//GEN-LAST:event_buton_guardarActionPerformed

    private void combobox_horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_horaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox_horaActionPerformed

    private void combobox_asignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_asignaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox_asignaturaActionPerformed

    private void buton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_eliminarActionPerformed
        // TODO add your handling code here:
        eliminarRegistro();
        mostrarDatos();
    }//GEN-LAST:event_buton_eliminarActionPerformed
          
    
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new horario_view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buton_actualizar;
    private javax.swing.JButton buton_eliminar;
    private javax.swing.JButton buton_guardar;
    private javax.swing.JButton buton_nuevo;
    private javax.swing.JComboBox<String> combobox_asignatura;
    private javax.swing.JComboBox<String> combobox_estado;
    private javax.swing.JComboBox<String> combobox_hora;
    private javax.swing.JLabel jLabel1_horario;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel label_asignatura;
    private javax.swing.JLabel label_estado;
    private javax.swing.JLabel label_hora;
    private javax.swing.JPanel panel_horario;
    private javax.swing.JTable tabla_horario;
    // End of variables declaration//GEN-END:variables
}
