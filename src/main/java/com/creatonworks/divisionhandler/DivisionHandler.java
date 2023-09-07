package com.creatonworks.divisionhandler;

import com.creatonworks.basehandler.BaseHandler;
import com.creatonworks.clientrequest.ClientRequest;

public class DivisionHandler implements BaseHandler {
    private BaseHandler nextInBaseHandler;

    @Override
    public void setNextChain(BaseHandler nextBaseHandler) {

        nextInBaseHandler = nextBaseHandler;

    }

    @Override
    public void calculate(ClientRequest request) {

        if(request.getCalcWanted() == "div"){
            System.out.println("The Request has been handled here");

            System.out.print(request.getNumber1() + " / " + request.getNumber2() + " = "+
                    (request.getNumber1()/request.getNumber2()));

        } else {
            System.out.println("======================================");
            System.out.println("Only works for add, sub, mult, and div");
            System.out.println("======================================");

        }
    }

}

