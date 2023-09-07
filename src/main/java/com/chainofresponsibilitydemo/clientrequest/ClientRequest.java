package com.chainofresponsibilitydemo.clientrequest;

public class ClientRequest {

    private int number1;
    private int number2;

    private String initialHandlerRequest;

    public ClientRequest(String intialHandlerReq){


        initialHandlerRequest = intialHandlerReq;

    }
      public String getInitialHandlerRequest(){ return initialHandlerRequest; }

}
