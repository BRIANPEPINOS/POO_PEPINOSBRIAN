
package view;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import control.Conexion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;


public class prof_wiew extends javax.swing.JInternalFrame {

    Conexion cc=new Conexion();
    Connection con=cc.conexion();
    public prof_wiew() {
        initComponents();
        mostrarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        panel_profesor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label_apellido = new javax.swing.JLabel();
        label_nombre = new javax.swing.JLabel();
        label_mail = new javax.swing.JLabel();
        label_estado = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        buton_guardar = new javax.swing.JButton();
        buton_actualizar = new javax.swing.JButton();
        buton_eliminar = new javax.swing.JButton();
        buton_nuevo = new javax.swing.JButton();
        combobox_estado = new javax.swing.JComboBox<>();
        label_cedula = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        label_celular = new javax.swing.JLabel();
        txt_celular = new javax.swing.JTextField();
        label_titulo = new javax.swing.JLabel();
        txt_titulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_profesor = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel_profesor.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        jLabel1.setText("SISTEMA PROFESOR");

        label_apellido.setText("APELLIDO:");

        label_nombre.setText("NOMBRE:");

        label_mail.setText("MAIL:");

        label_estado.setText("ESTADO");

        txt_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cedulaActionPerformed(evt);
            }
        });

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });

        txt_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mailActionPerformed(evt);
            }
        });

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

        combobox_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DE PLANTA", "CONTRATO" }));
        combobox_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_estadoActionPerformed(evt);
            }
        });

        label_cedula.setText("CEDULA");

        txt_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidoActionPerformed(evt);
            }
        });

        label_celular.setText("CELULAR:");

        txt_celular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_celularActionPerformed(evt);
            }
        });

        label_titulo.setText("TITULO:");

        txt_titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tituloActionPerformed(evt);
            }
        });

        tabla_profesor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_profesor);

        javax.swing.GroupLayout panel_profesorLayout = new javax.swing.GroupLayout(panel_profesor);
        panel_profesor.setLayout(panel_profesorLayout);
        panel_profesorLayout.setHorizontalGroup(
            panel_profesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_profesorLayout.createSequentialGroup()
                .addGroup(panel_profesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_profesorLayout.createSequentialGroup()
                        .addComponent(buton_nuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buton_guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buton_eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buton_actualizar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_profesorLayout.createSequentialGroup()
                        .addGroup(panel_profesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_profesorLayout.createSequentialGroup()
                                .addGroup(panel_profesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_profesorLayout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addGroup(panel_profesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label_cedula)
                                            .addComponent(label_celular)
                                            .addGroup(panel_profesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(label_estado)
                                                .addGroup(panel_profesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(label_mail)
                                                    .addComponent(label_titulo))))
                                        .addGap(23, 23, 23))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_profesorLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(panel_profesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label_nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(label_apellido, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)))
                                .addGroup(panel_profesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel_profesorLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(panel_profesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(combobox_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel_profesorLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1)))
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_profesorLayout.setVerticalGroup(
            panel_profesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_profesorLayout.createSequentialGroup()
                .addGroup(panel_profesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_profesorLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_profesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_cedula)
                            .addGroup(panel_profesorLayout.createSequentialGroup()
                                .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_profesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_apellido))
                                .addGap(18, 18, 18)
                                .addGroup(panel_profesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_nombre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_profesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_celular))
                                .addGap(15, 15, 15)
                                .addGroup(panel_profesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_profesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(17, 17, 17)
                        .addGroup(panel_profesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_estado)
                            .addComponent(combobox_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_profesorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panel_profesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buton_guardar)
                    .addComponent(buton_eliminar)
                    .addComponent(buton_actualizar)
                    .addComponent(buton_nuevo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_profesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel_profesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//En este metodo creamos el formato de la tabla donde podremos ir visualizando los atos que vamos ingresando del profesor
    public void mostrarDatos(){
        //Instanciamos un arreglo con los datos que se van a mostar en nuestra tabla
        String titulos []= {"id","cedula","nombre","apellido","celular","mail","titulo","estado"};
        String registro[]=new String[8];
        //con este comando se va a crer una tabla con los nombres de las columnas  del arreglo titulos
        DefaultTableModel modelo=new DefaultTableModel(null,titulos);
        //va a seleccionar mi tabala para la base de datos a conectar
        String SQL="select * from profesor";
        try{
            Statement st= (Statement) con.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            while(rs.next()){
                registro[0]=rs.getString("prof_id");
                registro[1]=rs.getString("prof_cedula");
                registro[2]=rs.getString("prof_nombre");
                registro[3]=rs.getString("prof_apellido");
                registro[4]=rs.getString("prof_celular");
                registro[5]=rs.getString("prof_mail");
                registro[6]=rs.getString("prof_titulo");
                registro[7]=rs.getString("prof_estado");
                modelo.addRow(registro);
            }
            tabla_profesor.setModel(modelo);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "error al mostrar datos"+ e.getMessage());
            
        }
    }
    //Creamos el metodo limpiar datos
    public void limpiarDatos(){
        txt_cedula.setText("");
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_celular.setText("");
        txt_mail.setText("");
        txt_titulo.setText("");
        combobox_estado.setSelectedItem(null);

        
    }
    
    public void insertarDatos(){
        try {
            String SQL="insert into profesor(prof_cedula,prof_nombre,prof_apellido,prof_celular,prof_mail,prof_titulo,prof_estado)values(?,?,?,?,?,?,?)";
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(SQL);
            pst.setString(1, txt_cedula.getText());
            pst.setString(2, txt_nombre.getText());
            pst.setString(3, txt_apellido.getText());
            pst.setString(4, txt_celular.getText());
            pst.setString(5, txt_mail.getText());
            pst.setString(6, txt_titulo.getText());                       
            int seleccion=combobox_estado.getSelectedIndex();
            pst.setString(7,combobox_estado.getItemAt(seleccion));
            //aqui ejecutamos la consulta
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
                 
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error de insercion"+e);
        }
    }
    
    public void eliminarRegistro(){
        int filaSeleccionada=tabla_profesor.getSelectedRow();
        try {
            String SQL="delete from profesor where prof_id="+tabla_profesor.getValueAt(filaSeleccionada, 0);
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
            SQL="update profesor set prof_cedula=?,prof_nombre=?,prof_apellido=?,prof_celular=?,prof_mail=?,prof_titulo=?,prof_estado=? where prof_id=?";
            int filaSeleccionada=tabla_profesor.getSelectedRow();
            String dao=(String)tabla_profesor.getValueAt(filaSeleccionada,0);
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(SQL);
            pst.setString(1, txt_cedula.getText());
            pst.setString(2, txt_nombre.getText());
            pst.setString(3, txt_apellido.getText());
            pst.setString(4, txt_celular.getText());
            pst.setString(5, txt_mail.getText());
            pst.setString(6, txt_titulo.getText());        
            int seleccion=combobox_estado.getSelectedIndex();
            pst.setString(7,combobox_estado.getItemAt(seleccion));
            //Ejecutamos la consulta/
            pst.setString(8, dao);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Se ha actualizado correctamente su registro");
                    
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error en la actualizacion"+e);
        }
    }
    
    
    
    private void txt_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedulaActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void txt_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mailActionPerformed

    private void buton_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_guardarActionPerformed
        // TODO add your handling code here:
        insertarDatos();
        limpiarDatos();
        mostrarDatos();
        
    }//GEN-LAST:event_buton_guardarActionPerformed

    private void buton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_actualizarActionPerformed
        // TODO add your handling code here:
        actualizarDatos();
        mostrarDatos();
    }//GEN-LAST:event_buton_actualizarActionPerformed

    private void buton_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_nuevoActionPerformed
        // TODO add your handling code here:
        limpiarDatos();
    }//GEN-LAST:event_buton_nuevoActionPerformed

    private void txt_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoActionPerformed

    private void txt_celularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_celularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_celularActionPerformed

    private void txt_tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tituloActionPerformed

    private void combobox_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox_estadoActionPerformed

    private void buton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_eliminarActionPerformed
        // TODO add your handling code here:
        eliminarRegistro();
        mostrarDatos();
      
    }//GEN-LAST:event_buton_eliminarActionPerformed
             
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prof_wiew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buton_actualizar;
    private javax.swing.JButton buton_eliminar;
    private javax.swing.JButton buton_guardar;
    private javax.swing.JButton buton_nuevo;
    private javax.swing.JComboBox<String> combobox_estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel label_apellido;
    private javax.swing.JLabel label_cedula;
    private javax.swing.JLabel label_celular;
    private javax.swing.JLabel label_estado;
    private javax.swing.JLabel label_mail;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JPanel panel_profesor;
    private javax.swing.JTable tabla_profesor;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_celular;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_titulo;
    // End of variables declaration//GEN-END:variables
}
