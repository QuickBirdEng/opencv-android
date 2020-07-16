//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.bgsegm;



// C++: class BackgroundSubtractorLSBPDesc
/**
 * This is for calculation of the LSBP descriptors.
 */
public class BackgroundSubtractorLSBPDesc {

    protected final long nativeObj;
    protected BackgroundSubtractorLSBPDesc(long addr) { nativeObj = addr; }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static BackgroundSubtractorLSBPDesc __fromPtr__(long addr) { return new BackgroundSubtractorLSBPDesc(addr); }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // native support for java finalize()
    private static native void delete(long nativeObj);

}
