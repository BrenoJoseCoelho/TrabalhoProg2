/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author LRodrigues
 */
public class CnpjIgualException extends Exception{

    public CnpjIgualException() {
    super("CNPJ já cadastrado!");
    }

    public CnpjIgualException(String message) {
        super(message);
    }
    
   
}
