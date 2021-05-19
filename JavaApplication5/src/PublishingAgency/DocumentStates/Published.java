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
public class Published implements State{
    private Document document;
    
    public Published(Document document) {
        this.document = document;
    }
    
    @Override
    public void print() {
        System.out.println("Document state: Published");
        System.out.println(this.document.getText());
    }

    @Override
    public void publish() {
        System.out.println("I'm finally enough, it finally came true. I can stop this endless search.");
    }
    
}
