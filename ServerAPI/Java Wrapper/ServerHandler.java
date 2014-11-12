/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.openpad.server;

public class ServerHandler {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ServerHandler(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ServerHandler obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        openpadJNI.delete_ServerHandler(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    openpadJNI.ServerHandler_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    openpadJNI.ServerHandler_change_ownership(this, swigCPtr, true);
  }

  public void setServ(Server value) {
    openpadJNI.ServerHandler_serv_set(swigCPtr, this, Server.getCPtr(value), value);
  }

  public Server getServ() {
    long cPtr = openpadJNI.ServerHandler_serv_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Server(cPtr, false);
  }

  public void onStart() {
    if (getClass() == ServerHandler.class) openpadJNI.ServerHandler_onStart(swigCPtr, this); else openpadJNI.ServerHandler_onStartSwigExplicitServerHandler(swigCPtr, this);
  }

  public boolean canJoin(Client cli, java.lang.String[] why) {
    return (getClass() == ServerHandler.class) ? openpadJNI.ServerHandler_canJoin(swigCPtr, this, Client.getCPtr(cli), cli, why) : openpadJNI.ServerHandler_canJoinSwigExplicitServerHandler(swigCPtr, this, Client.getCPtr(cli), cli, why);
  }

  public String getName() {
    return (getClass() == ServerHandler.class) ? openpadJNI.ServerHandler_getName(swigCPtr, this) : openpadJNI.ServerHandler_getNameSwigExplicitServerHandler(swigCPtr, this);
  }

  public String getDesc() {
    return (getClass() == ServerHandler.class) ? openpadJNI.ServerHandler_getDesc(swigCPtr, this) : openpadJNI.ServerHandler_getDescSwigExplicitServerHandler(swigCPtr, this);
  }

  public String getIconFilePath() {
    return (getClass() == ServerHandler.class) ? openpadJNI.ServerHandler_getIconFilePath(swigCPtr, this) : openpadJNI.ServerHandler_getIconFilePathSwigExplicitServerHandler(swigCPtr, this);
  }

  public int getFilledSlots() {
    return (getClass() == ServerHandler.class) ? openpadJNI.ServerHandler_getFilledSlots(swigCPtr, this) : openpadJNI.ServerHandler_getFilledSlotsSwigExplicitServerHandler(swigCPtr, this);
  }

  public int getOpenSlots() {
    return (getClass() == ServerHandler.class) ? openpadJNI.ServerHandler_getOpenSlots(swigCPtr, this) : openpadJNI.ServerHandler_getOpenSlotsSwigExplicitServerHandler(swigCPtr, this);
  }

  public void onJoin(Client cli) {
    if (getClass() == ServerHandler.class) openpadJNI.ServerHandler_onJoin(swigCPtr, this, Client.getCPtr(cli), cli); else openpadJNI.ServerHandler_onJoinSwigExplicitServerHandler(swigCPtr, this, Client.getCPtr(cli), cli);
  }

  public PadConfig getDefaultControls() {
    return new PadConfig((getClass() == ServerHandler.class) ? openpadJNI.ServerHandler_getDefaultControls(swigCPtr, this) : openpadJNI.ServerHandler_getDefaultControlsSwigExplicitServerHandler(swigCPtr, this), true);
  }

  public void onDisconnect(Client cli) {
    if (getClass() == ServerHandler.class) openpadJNI.ServerHandler_onDisconnect(swigCPtr, this, Client.getCPtr(cli), cli); else openpadJNI.ServerHandler_onDisconnectSwigExplicitServerHandler(swigCPtr, this, Client.getCPtr(cli), cli);
  }

  public void onPadUpdate(Client cli, PadUpdateObject update) {
    if (getClass() == ServerHandler.class) openpadJNI.ServerHandler_onPadUpdate(swigCPtr, this, Client.getCPtr(cli), cli, PadUpdateObject.getCPtr(update), update); else openpadJNI.ServerHandler_onPadUpdateSwigExplicitServerHandler(swigCPtr, this, Client.getCPtr(cli), cli, PadUpdateObject.getCPtr(update), update);
  }

  public ServerHandler() {
    this(openpadJNI.new_ServerHandler(), true);
    openpadJNI.ServerHandler_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
