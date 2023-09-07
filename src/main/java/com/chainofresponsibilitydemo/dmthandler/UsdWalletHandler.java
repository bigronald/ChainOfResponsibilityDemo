package com.chainofresponsibilitydemo.dmthandler;

import com.chainofresponsibilitydemo.basehandler.BaseHandler;
import com.chainofresponsibilitydemo.clientrequest.ClientRequest;

public class UsdWalletHandler implements BaseHandler {

    private BaseHandler nextInBaseHandler;

    @Override
    public void setNextChain(BaseHandler nextBaseHandler) {

        nextInBaseHandler = nextBaseHandler;

    }

    @Override
    public void requestHandler(ClientRequest request) {

        if(request.getInitialHandlerRequest() == "usd wallet"){

            System.out.println("Domestic Usd Money Tranfers");

            System.out.println(" 1: Send Usd  \n" + " 2: Withdraw Usd \n"  + " 3: Online Payments (MasterCard) \n");

        } else {
            System.out.println("Moving to another Chain responsible for the request");
            nextInBaseHandler.requestHandler(request);

        }

    }
}
