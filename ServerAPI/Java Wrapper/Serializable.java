/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class Serializable {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Serializable(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Serializable obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        openpadJNI.delete_Serializable(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SWIGTYPE_p_Value serializeJSON(SWIGTYPE_p_Document__AllocatorType a) {
    return new SWIGTYPE_p_Value(openpadJNI.Serializable_serializeJSON(swigCPtr, this, SWIGTYPE_p_Document__AllocatorType.getCPtr(a)), false);
  }

  public String getJSONString() {
    return openpadJNI.Serializable_getJSONString(swigCPtr, this);
  }

  public void setJSONvalue(SWIGTYPE_p_Value value) {
    openpadJNI.Serializable_JSONvalue_set(swigCPtr, this, SWIGTYPE_p_Value.getCPtr(value));
  }

  public SWIGTYPE_p_Value getJSONvalue() {
    return new SWIGTYPE_p_Value(openpadJNI.Serializable_JSONvalue_get(swigCPtr, this), true);
  }

  public void setHasSerialized(boolean value) {
    openpadJNI.Serializable_hasSerialized_set(swigCPtr, this, value);
  }

  public boolean getHasSerialized() {
    return openpadJNI.Serializable_hasSerialized_get(swigCPtr, this);
  }

}