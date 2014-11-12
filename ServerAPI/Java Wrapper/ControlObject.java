/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.openpad.server;

public class ControlObject extends Serializable {
  private long swigCPtr;

  protected ControlObject(long cPtr, boolean cMemoryOwn) {
    super(openpadJNI.ControlObject_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ControlObject obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        openpadJNI.delete_ControlObject(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SWIGTYPE_p_Value serializeJSON(SWIGTYPE_p_Document__AllocatorType a) {
    return new SWIGTYPE_p_Value(openpadJNI.ControlObject_serializeJSON(swigCPtr, this, SWIGTYPE_p_Document__AllocatorType.getCPtr(a)), false);
  }

  public boolean parseJSON(SWIGTYPE_p_Value v) {
    return openpadJNI.ControlObject_parseJSON(swigCPtr, this, SWIGTYPE_p_Value.getCPtr(v));
  }

  public void setType(int value) {
    openpadJNI.ControlObject_type_set(swigCPtr, this, value);
  }

  public int getType() {
    return openpadJNI.ControlObject_type_get(swigCPtr, this);
  }

  public void setFrame(FrameObject value) {
    openpadJNI.ControlObject_frame_set(swigCPtr, this, FrameObject.getCPtr(value), value);
  }

  public FrameObject getFrame() {
    long cPtr = openpadJNI.ControlObject_frame_get(swigCPtr, this);
    return (cPtr == 0) ? null : new FrameObject(cPtr, false);
  }

  public void setControlID(int value) {
    openpadJNI.ControlObject_controlID_set(swigCPtr, this, value);
  }

  public int getControlID() {
    return openpadJNI.ControlObject_controlID_get(swigCPtr, this);
  }

  public void setImg(String value) {
    openpadJNI.ControlObject_img_set(swigCPtr, this, value);
  }

  public String getImg() {
    return openpadJNI.ControlObject_img_get(swigCPtr, this);
  }

  public ControlObject() {
    this(openpadJNI.new_ControlObject(), true);
  }

}
