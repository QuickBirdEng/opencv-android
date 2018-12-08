//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.text;



// C++: class ClassifierCallback
//javadoc: ClassifierCallback

public class ClassifierCallback {

    protected final long nativeObj;
    protected ClassifierCallback(long addr) { nativeObj = addr; }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static ClassifierCallback __fromPtr__(long addr) { return new ClassifierCallback(addr); }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // native support for java finalize()
    private static native void delete(long nativeObj);

}
