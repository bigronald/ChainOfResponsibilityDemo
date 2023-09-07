package com.chainofresponsibilitydemo.vayahandler;


import com.chainofresponsibilitydemo.basehandler.BaseHandler;
import com.chainofresponsibilitydemo.clientrequest.ClientRequest;

public class VayaHandler implements BaseHandler {

    private BaseHandler nextInBaseHandler;

    @Override
    public void setNextChain(BaseHandler nextBaseHandler) {

        nextInBaseHandler = nextBaseHandler;

    }

    @Override
    public void requestHandler(ClientRequest request) {

        if(request.getInitialHandlerRequest() == "pay ride"){
            System.out.println("Vaya Transport and Logistics");

            System.out.println(" 1: Vaya Delivery Bike \n" + " 2: Vaya Bulk Water Delivery \n"  + " 3: Vaya Local Ride \n");

        } else {
            System.out.println("Moving to another Chain responsible for the request");

            nextInBaseHandler.requestHandler(request);

        }

    }



}