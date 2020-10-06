package cse360assignment02;
/**
 * 
 * @author Juan Romero
 * @version 1.0
 *
 */

public class AddingMachine {
	  private int total;
	  private String operations;
	  /**
	   * This is a constructor for the AddingMachine that instantiates the instance variables
	   */
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	    operations = "0";
	  }
	  
	  /**
	   * This method returns the total value of this AddingMachine
	   * @return this adding machine's total
	   */
	  public int getTotal () {
	    return total;
	  }
	  
	  /**
	   * This method adds parameter value to this machine's total, and updates the operations string
	   * for it to be printed in the toString method
	   * @param value Value to add to this AddingMachine's total
	   */
	  public void add (int value) {
		  total += value;
		  operations += " + " + value;
	  }
	  
	  /**
	   * This method subtracts parameter value from this machine's total, and updates the operations string
	   * for it to be printed in the toString method
	   * @param value Value to subtract from this AddingMachine's total
	   */
	  public void subtract (int value) {
		  total -= value;
		  operations += " - " + value;
	  }
	  
	  /**
	   * This function returns the operations string that contains all operations performed by the adding machine
	   */
	  public String toString () {
	    return operations;
	  }
	  
	  /**
	   * This method clears this AddingMachine's total and operations string
	   */
	  public void clear() {
		  operations = "0";
		  total = 0;
	  }
	}