package com.chainofresponsibilitydemo;

import com.chainofresponsibilitydemo.claimshandler.PayClaimsHandler;
import com.chainofresponsibilitydemo.basehandler.BaseHandler;
import com.chainofresponsibilitydemo.billerhandler.PayBillHandler;
import com.chainofresponsibilitydemo.dmthandler.UsdWalletHandler;
import com.chainofresponsibilitydemo.clientrequest.ClientRequest;
import com.chainofresponsibilitydemo.vayahandler.VayaHandler;

public class Main {

    public static void main(String[] args) {

        BaseHandler baseHandler1 = new PayClaimsHandler();
        BaseHandler baseHandler2 = new VayaHandler();
        BaseHandler baseHandler3 = new UsdWalletHandler();
        BaseHandler baseHandler4 = new PayBillHandler();

        baseHandler1.setNextChain(baseHandler2);
        baseHandler2.setNextChain(baseHandler3);
        baseHandler3.setNextChain(baseHandler4);

        //Example requests for the various handlers - pay ride , pay claim , pay bill & usd wallet

        ClientRequest request = new ClientRequest("pay claim");

        baseHandler1.requestHandler(request);


    }



}