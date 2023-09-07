package com.creatonworks.additionhandler;

import com.creatonworks.basehandler.BaseHandler;
import com.creatonworks.clientrequest.ClientRequest;

public class AdditionHandler implements BaseHandler {

    private BaseHandler nextInBaseHandler;


    public void setNextChain(BaseHandler nextBaseHandler) {

        nextInBaseHandler = nextBaseHandler;

    }


    public void calculate(ClientRequest request) {

        if(request.getCalcWanted() == "add"){

            System.out.println("The Request has been handled here");

            System.out.print(request.getNumber1() + " + " + request.getNumber2() + " = "+
                    (request.getNumber1()+request.getNumber2()));

        } else {
            System.out.println("Moving to another Chain responsible for the request");
            nextInBaseHandler.calculate(request);

        }

    }
}