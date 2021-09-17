package com.demo.DroolsDemo;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.drools.compiler.compiler.DroolsParserException;
import org.kie.api.KieServices;
import org.kie.api.runtime.*;


public class DroolTest {
    public static void main(String[] args) throws DroolsParserException, IOException {
        // TODO Auto-generated method stub
        DroolTest demo = new DroolTest();
        demo.executeBussinessRule();
    }

    public void executeBussinessRule() throws DroolsParserException, IOException {

        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();

        KieSession kSession = kContainer.newKieSession();
        
        /* card details & offers.drl test */
        /*
        CardDetails cardDetails = new CardDetails();
        cardDetails.setCard("ABC Bank");
        kSession.insert(cardDetails);
        kSession.fireAllRules();
        System.out.println("The discount for the card of " + cardDetails.getCard() + " is "
                + cardDetails.getDiscount() + "%");
        */
        
        /* call details & callAssistant.drl */
        CallDetails callDetails = new CallDetails();
        callDetails.setLocation("at_work");
        callDetails.incomingCall("family", "son");
        kSession.insert(callDetails);
        kSession.fireAllRules();
        System.out.println("The decision to allow or deny a " + callDetails.getCall() + " call from " + callDetails.getcallFrom() + ", while at " +
                "Location=" + callDetails.getLocation() + " and Activity=" + callDetails.getActivity() + ", is:" + callDetails.getAllowDeny() + ".");
        
    }

}
