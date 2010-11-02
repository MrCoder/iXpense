package com.tw.gae.ixpense.web;

import com.google.appengine.api.xmpp.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@SuppressWarnings("serial")
public class XmppReceiverServlet extends HttpServlet {

    private static final XMPPService xmppService =
            XMPPServiceFactory.getXMPPService();

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        Message message = xmppService.parseMessage(request);
        Message reply = new MessageBuilder()
                .withRecipientJids(message.getFromJid())
                .withMessageType(MessageType.NORMAL)
                .withBody("Your request received!")
                .build();

        xmppService.sendMessage(reply);
    }

}