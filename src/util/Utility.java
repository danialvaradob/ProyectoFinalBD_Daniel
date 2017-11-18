/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author danielalvarado
 */
public class Utility {
        public static String INSERT_PROD_ORDER = "{call sp_insertar_prodOrder(?, ?, ?, ?, ?)}";
	public static String DELETE_PROD_ORDER  = "{call sp_eliminar_prodOrder(?)}";
    
}
