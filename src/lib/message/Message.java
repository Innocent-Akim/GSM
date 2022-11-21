/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.message;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import lib.model.Personne;
import org.smslib.AGateway;
import org.smslib.IOutboundMessageNotification;
import org.smslib.Library;
import org.smslib.OutboundMessage;
import org.smslib.SMSLibException;
import org.smslib.Service;
import org.smslib.modem.SerialModemGateway;

/**
 *
 * @author PC
 */
public class Message {

    public void send(String modem, List<Message> message, List<Personne> personnes) {
        try {
            personnes = new ArrayList();
            OutboundNotification outboundNotification = new OutboundNotification();
            SerialModemGateway gateway = new SerialModemGateway(modem, "COM4", 9600, "", "");
            gateway.setInbound(true);
            gateway.setOutbound(true);
            Service.getInstance().setOutboundMessageNotification(outboundNotification);
            Service.getInstance().addGateway(gateway);
            Service.getInstance().startService();
            for (int x = 0; x < personnes.size(); x++) {
                OutboundMessage msg = new OutboundMessage(personnes.get(x).getTel(), "Hello from SMSLib!");
                Service.getInstance().sendMessage(msg);
            }
            System.in.read();
            Service.getInstance().stopService();
        } catch (IOException | InterruptedException | SMSLibException ex) {
            ex.printStackTrace();
        }

    }

    public class OutboundNotification implements IOutboundMessageNotification {

        public void process(AGateway gateway, OutboundMessage msg) {
            System.out.println("Outbound handler called from Gateway: " + gateway.getGatewayId());
            System.out.println(msg);
        }
    }
}
