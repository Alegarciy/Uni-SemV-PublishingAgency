/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PublishingAgency.DocumentStates;

import PublishingAgency.Document;
import PublishingAgency.State;

/**
 *
 * @author alega
 */
public class Moderation implements State{
    private Document document;
    
    public Moderation(Document document) {
        this.document = document;
    }
    
    @Override
    public void print() {
        System.out.println("Document state: Moderation");
        System.out.println(this.document.getText());
    }

    @Override
    public void publish() {
        document.changeState(new Published(this.document));
    }
    
}
