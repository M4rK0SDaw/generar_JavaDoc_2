/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava;

/**
 *  CÓDIGO A USAR EN LA PRÁCTICA.
 * Del código siguiente, realizar todos los comentarios necesarios para 
 * documentar correctamente este proyecto en JavaDoc de NetBeans.
 * Entregar una memoria con el código comentado y el resultado de la documentación 
 *generada con JavaDoc.
 * 
 * @author marqu
 */

public class Empleado extends Persona{

private int numeroEmpleado;

private String departamento;

private String puesto;


/**
 * Es una clase
 */
public Empleado(){

}


/**
 * En empleado damos aatrimutos, ademas de un constructor.
 * @param nombre Creación de atributo
 * @param edad Creación de atributo
 * @param sexo Creación de atributo
 * @param numeroEmpleado Creación de atributo
 * @param departamento Creación de atributo
 * @param puesto Creación de atributo
 */
public Empleado(String nombre,

int edad,

char sexo,

int numeroEmpleado,

String departamento,

String puesto){
/**
 * metodo que pide al padre la informacion de os parametros que pasamos por el 
 */
super( nombre, edad, sexo);

this.numeroEmpleado = numeroEmpleado;

this.departamento = departamento;

this.puesto = puesto;

}


/**
 * Metodo que getter, nos devuelve el número del empleado.
 * @return getNumeroEmpleado
 */
public int getNumeroEmpleado() {

return numeroEmpleado;

}


/**
 * Método setter.
 * @param numeroEmpleado  indicamos que numero es.
 */
public void setNumeroEmpleado(int numeroEmpleado) {

this.numeroEmpleado = numeroEmpleado;

}



/**
 * Método getter. 
 * @return getDepartamento nos devuelve el depasrtamento 
 */
public String getDepartamento() {

return departamento;

}


/**
 * Método setter.
 * @param departamento  indicamos que departamento.
 */
public void setDepartamento(String departamento) {

this.departamento = departamento;

}




/**
 * Método getter. 
 * @return getPuesto nos devuelve el puesto.
 */
public String getPuesto() {

return puesto;

}


/**
 * Método setter.
 * @param puesto  indicamos que puesto 
 */
public void setPuesto(String puesto) {

this.puesto = puesto;

}

}