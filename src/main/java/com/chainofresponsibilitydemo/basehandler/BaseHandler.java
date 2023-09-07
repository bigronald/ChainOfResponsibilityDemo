package com.chainofresponsibilitydemo.basehandler;

import com.chainofresponsibilitydemo.clientrequest.ClientRequest;

public interface BaseHandler {


     void setNextChain(BaseHandler nextBaseHandler);


     void requestHandler(ClientRequest request);



}




