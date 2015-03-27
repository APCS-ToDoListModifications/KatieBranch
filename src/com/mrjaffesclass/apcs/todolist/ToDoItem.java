
package com.mrjaffesclass.apcs.todolist;
import java.util.Date;
/**
 * To do item
 * 
 * @author Roger Jaffe
 * @version 1.0
 */
public class ToDoItem {

  /**
   * id:          ID number of to do item. Assigned when added to list
   * description: Description of to do item
   * done:        True if to do item is completed
   * date:        The due date f the item 
   */
  private int id;               
  private String description;
  private boolean done;
  private Date date;
  
  /**
   * Constructor with done set to false in constructor
   * @param _id           ID number of to do item
   * @param _description  Description of to do item
   * @param _date         Due date of the item
   */
  public ToDoItem(int _id, String _description, Date _date) {
    description = _description;
    id = _id;
    done = false;     // Default to not completed
   // date = _date;
  }
  
  /**
   * Constructor with a date parameter
   * @param _id     ID number
   * @param _descprition    Description of item
   * @param _date       Due date
   */
//  public ToDoItem(int _id, String _description, Date _date)
//  {
//      description = _description;
//     id = _id;
//      done = false;
//      date = _date;
//  }

  /**
   * Constructor
   * @param _id           ID number of to do item
   * @param _description  Description of to do item
   * @param _done         Done flag
   * @param _date         Due date
   */
  public ToDoItem(int _id, String _description, boolean _done, Date _date) {
    description = _description;
    id = _id;
    done = _done;     // Default to not completed
   // date = _date;
  }

  /**
   * Get the to do item description
   * @return The description of to do item
   */
  public String getDescription() {
    return description;
  }

  /**
   * Set the to do item description
   * @param description The value to be set
   */
  public void setDescription(String description) {
    this.description = description;
  }
  
  /**
   * Get the to do item date
   * @return the to do item date
   */
  public Date getDate()
  {
      return date;
   }
  
  /**
   * Set the to do item date
   * @param date is the due date
   */
  public void setDate (Date date){
      this.date = date;
  }

  /**
   * Get the done flag
   * @return The done flag
   */
  public boolean isDone() {
    return done;
  }

  /**
   * Set the done flag
   * @param done The value to be set
   */
  public void setDone(boolean done) {
    this.done = done;
  }
  
  /**
   * Toggles the done flag
   */
  public void toggleDone() {
    this.done = !this.done;
  }

  /**
   * Get the to do item ID
   * @return ID of the to do item
   */
  public int getId() {
    return id;
  }
  
  /**
   * Sets the ID of the to do item. Can only be called from inside this class
   * @param id ID value to set
   */
  public void setId(int id) {
    this.id = id;
  }
  
  /**
   * Transfer the description and done flag of another to do item into this one
   * @param anotherItem Item whose data values we are copying
   */
  public void merge(ToDoItem anotherItem) {
    this.setDescription(anotherItem.getDescription());
    this.setDone(anotherItem.isDone());    
    this.setDate(anotherItem.getDate());
  }

}
