package com.chainofresponsibilitydemo.claimshandler;

import com.chainofresponsibilitydemo.basehandler.BaseHandler;
import com.chainofresponsibilitydemo.clientrequest.ClientRequest;

public class PayClaimsHandler implements BaseHandler {

    private BaseHandler nextInBaseHandler;


    public void setNextChain(BaseHandler nextBaseHandler) {

        nextInBaseHandler = nextBaseHandler;

    }


    public void requestHandler(ClientRequest request) {

        if(request.getInitialHandlerRequest() == "pay claim"){

            System.out.println("Claim Payments Handled");

            System.out.println(" 1: Pay Moovah Vehicle \n" + " 2: Pay Moovah Home \n"  + " 3: Pay Moovah Personal Devices \n");

        } else {
            System.out.println("Moving to another Chain responsible for the request");
            nextInBaseHandler.requestHandler(request);

        }

    }
}