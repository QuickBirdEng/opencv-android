//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xfeatures2d;

import org.opencv.features2d.Feature2D;
import org.opencv.xfeatures2d.LUCID;

// C++: class LUCID
//javadoc: LUCID

public class LUCID extends Feature2D {

    protected LUCID(long addr) { super(addr); }

    // internal usage only
    public static LUCID __fromPtr__(long addr) { return new LUCID(addr); }

    //
    // C++: static Ptr_LUCID cv::xfeatures2d::LUCID::create(int lucid_kernel = 1, int blur_kernel = 2)
    //

    //javadoc: LUCID::create(lucid_kernel, blur_kernel)
    public static LUCID create(int lucid_kernel, int blur_kernel)
    {
        
        LUCID retVal = LUCID.__fromPtr__(create_0(lucid_kernel, blur_kernel));
        
        return retVal;
    }

    //javadoc: LUCID::create(lucid_kernel)
    public static LUCID create(int lucid_kernel)
    {
        
        LUCID retVal = LUCID.__fromPtr__(create_1(lucid_kernel));
        
        return retVal;
    }

    //javadoc: LUCID::create()
    public static LUCID create()
    {
        
        LUCID retVal = LUCID.__fromPtr__(create_2());
        
        return retVal;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_LUCID cv::xfeatures2d::LUCID::create(int lucid_kernel = 1, int blur_kernel = 2)
    private static native long create_0(int lucid_kernel, int blur_kernel);
    private static native long create_1(int lucid_kernel);
    private static native long create_2();

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
