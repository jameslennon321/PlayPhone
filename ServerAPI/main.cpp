//
//  main.cpp
//  HWConsoleServer
//
//  Created by James Lennon on 10/9/14.
//  Copyright (c) 2014 James Lennon. All rights reserved.
//

#include <stdio.h>
#include <iostream>
#include "openpad.h"
#include <cstdio>
#include <sstream>
#include <thread>
#include <unistd.h>

#include "Simulator.h"
#include "DebugGame.h"

using namespace rapidjson;

void doServer(){
    
    DebugGame game(4);
    
    openpad::Server serv(game);
    serv.start();
}

int main(){
//    thread t(doServer);
//    t.detach();
//    simulate();
    doServer();
    return 0;
}
