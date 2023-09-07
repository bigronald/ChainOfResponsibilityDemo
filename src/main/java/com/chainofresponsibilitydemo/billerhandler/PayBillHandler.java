package com.chainofresponsibilitydemo.billerhandler;

import com.chainofresponsibilitydemo.basehandler.BaseHandler;
import com.chainofresponsibilitydemo.clientrequest.ClientRequest;

public class PayBillHandler implements BaseHandler {
    private BaseHandler nextInBaseHandler;

    @Override
    public void setNextChain(BaseHandler nextBaseHandler) {

        nextInBaseHandler = nextBaseHandler;

    }

    @Override
    public void requestHandler(ClientRequest request) {

        if(request.getInitialHandlerRequest() == "pay bill"){
            System.out.println("Online Biller payments");

            System.out.println(" 1: Pay School Fees \n" + " 2: Pay Utility Bills \n"  + " 3: Pay Medical Aid Society \n"+ "\n");

        } else {
            System.out.println("===============================================================");
            System.out.println("Only works for pay bill, pay claim , usd wallet , and pay ride");
            System.out.println("================================================================");

        }
    }

}

