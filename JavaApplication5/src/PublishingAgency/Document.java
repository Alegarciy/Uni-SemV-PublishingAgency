/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PublishingAgency;

/**
 *
 * @author alega
 */
public class Document { 
    private String text;
    private State state;
    
    public void changeState(State state) {
        this.state = state;
    }
    
    public void print(){
        this.state.print();
    }
    
    public void publish(){
        this.state.publish();
    }  
    
    public void write(String text){
        this.text = text;
    }
    
    public String getText(){
        return text;
    }
}
