/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package turnoseps;
public class TurnosEPS {
    public static void main(String[] args) {
       MenuPrincipal menuPrincipal= new MenuPrincipal();
       General general=new General();
       Preferencial preferencial=new Preferencial();
       SolicitudTurnos ssoliSolicitudTurnos=new SolicitudTurnos();
       TurnosEnVivo turnosEnVivo=new TurnosEnVivo();
       Caja1 caja1=new Caja1();
       Caja2 caja2=new Caja2();
       VerificadorUsuario verificadorUsuario=new VerificadorUsuario();
       menuPrincipal.setVisible(true);
       
    }
    
}
