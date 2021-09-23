package com.demo.DroolsDemo;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.drools.compiler.compiler.DroolsParserException;
import org.kie.api.KieServices;
import org.kie.api.runtime.*;
import org.kie.api.runtime.rule.*;

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
                
        /*	call assistant */
        CallAssistant assistant = new CallAssistant();
        /*	Scenarion#1: at_family_outing && call from work	*/
        System.out.println("Scenario 1: at_family_outing, call from_work");
        assistant.setLocation("at_family_outing");
        assistant.newCall_fromWork("");
        FactHandle fh = kSession.insert(assistant);
        kSession.fireAllRules();
        System.out.println("DECISION: " + assistant.getAllowDenyCall() + " call= " + assistant.getCall() + ", from=" + assistant.getCallFrom() + ", while at " +
                "Location=" + assistant.getLocation() + " and Activity=" + assistant.getActivity() + ", is:" + assistant.getAllowDenyCall() + ".");

        /*	Scenarion#2: at_family_outing && call from boss	*/
        System.out.println("Scenario 2: at_family_outing, call from_boss");
        assistant.newCall_fromWork("boss");
        kSession.update(fh, assistant);
        kSession.fireAllRules();
        System.out.println("DECISION: " + assistant.getAllowDenyCall() + " call= " + assistant.getCall() + ", from=" + assistant.getCallFrom() + ", while at " +
                "Location=" + assistant.getLocation() + " and Activity=" + assistant.getActivity() + ", is:" + assistant.getAllowDenyCall() + ".");


        System.out.println("Done");
        
    }

}
