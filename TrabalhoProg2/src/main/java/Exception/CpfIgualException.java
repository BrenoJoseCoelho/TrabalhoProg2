/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author LRodrigues
 */
public class CpfIgualException extends Exception{

    public CpfIgualException() {
    super("CPF já cadastrado!");
    }

    public CpfIgualException(String message) {
        super(message);
    }
    
   
}
