
package ca.sait.lab6.models;

import java.io.Serializable;

/**
 * Represents a role
 * @author Saksham
 */
public class Role implements Serializable {
    private int id;
    private String name;
    
    public Role(){
        
    }
    
    public Role(int id, String name){
        this.id= id;
        this.name =  name;
    }
    public Role(int id){
        this.id= id;
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
