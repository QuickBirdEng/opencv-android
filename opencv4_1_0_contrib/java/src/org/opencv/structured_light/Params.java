//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.structured_light;



// C++: class Params
//javadoc: Params

public class Params {

    protected final long nativeObj;
    protected Params(long addr) { nativeObj = addr; }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static Params __fromPtr__(long addr) { return new Params(addr); }

    //
    // C++:   cv::structured_light::SinusoidalPattern::Params::Params()
    //

    //javadoc: Params::Params()
    public   Params()
    {
        
        nativeObj = Params_0();
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:   cv::structured_light::SinusoidalPattern::Params::Params()
    private static native long Params_0();

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
