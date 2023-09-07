package com.creatonworks.multiplicationhandler;

import com.creatonworks.basehandler.BaseHandler;
import com.creatonworks.clientrequest.ClientRequest;

public class MultiplicationHandler implements BaseHandler {

    private BaseHandler nextInBaseHandler;

    @Override
    public void setNextChain(BaseHandler nextBaseHandler) {

        nextInBaseHandler = nextBaseHandler;

    }

    @Override
    public void calculate(ClientRequest request) {

        if(request.getCalcWanted() == "mult"){
            System.out.println("The Request has been handled here");

            System.out.print(request.getNumber1() + " * " + request.getNumber2() + " = "+
                    (request.getNumber1()*request.getNumber2()));

        } else {
            System.out.println("Moving to another Chain responsible for the request");
            nextInBaseHandler.calculate(request);

        }

    }
}