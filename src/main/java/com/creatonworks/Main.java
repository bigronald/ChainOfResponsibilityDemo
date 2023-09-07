package com.creatonworks;

import com.creatonworks.additionhandler.AdditionHandler;
import com.creatonworks.basehandler.BaseHandler;
import com.creatonworks.divisionhandler.DivisionHandler;
import com.creatonworks.multiplicationhandler.MultiplicationHandler;
import com.creatonworks.clientrequest.ClientRequest;
import com.creatonworks.subtractionhandler.SubtractionHandler;

public class Main {

    public static void main(String[] args) {

        BaseHandler baseHandlerCalc1 = new AdditionHandler();
        BaseHandler baseHandlerCalc2 = new SubtractionHandler();
        BaseHandler baseHandlerCalc3 = new MultiplicationHandler();
        BaseHandler baseHandlerCalc4 = new DivisionHandler();


        baseHandlerCalc1.setNextChain(baseHandlerCalc2);
        baseHandlerCalc2.setNextChain(baseHandlerCalc3);
        baseHandlerCalc3.setNextChain(baseHandlerCalc4);


        ClientRequest request = new ClientRequest(4,2,"sadza");

        baseHandlerCalc1.calculate(request);


    }



}