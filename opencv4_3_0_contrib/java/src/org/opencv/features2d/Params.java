//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.features2d;



// C++: class Params

public class Params {

    protected final long nativeObj;
    protected Params(long addr) { nativeObj = addr; }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static Params __fromPtr__(long addr) { return new Params(addr); }

    //
    // C++:   cv::SimpleBlobDetector::Params::Params()
    //

    public Params() {
        nativeObj = Params_0();
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:   cv::SimpleBlobDetector::Params::Params()
    private static native long Params_0();

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
