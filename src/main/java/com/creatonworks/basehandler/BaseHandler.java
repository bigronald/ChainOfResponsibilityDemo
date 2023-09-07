package com.creatonworks.basehandler;

import com.creatonworks.clientrequest.ClientRequest;

public interface BaseHandler {


     void setNextChain(BaseHandler nextBaseHandler);


     void calculate(ClientRequest request);



}




