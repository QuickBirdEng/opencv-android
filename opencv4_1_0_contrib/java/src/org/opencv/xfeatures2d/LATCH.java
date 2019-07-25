//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xfeatures2d;

import org.opencv.features2d.Feature2D;
import org.opencv.xfeatures2d.LATCH;

// C++: class LATCH
//javadoc: LATCH

public class LATCH extends Feature2D {

    protected LATCH(long addr) { super(addr); }

    // internal usage only
    public static LATCH __fromPtr__(long addr) { return new LATCH(addr); }

    //
    // C++: static Ptr_LATCH cv::xfeatures2d::LATCH::create(int bytes = 32, bool rotationInvariance = true, int half_ssd_size = 3, double sigma = 2.0)
    //

    //javadoc: LATCH::create(bytes, rotationInvariance, half_ssd_size, sigma)
    public static LATCH create(int bytes, boolean rotationInvariance, int half_ssd_size, double sigma)
    {
        
        LATCH retVal = LATCH.__fromPtr__(create_0(bytes, rotationInvariance, half_ssd_size, sigma));
        
        return retVal;
    }

    //javadoc: LATCH::create(bytes, rotationInvariance, half_ssd_size)
    public static LATCH create(int bytes, boolean rotationInvariance, int half_ssd_size)
    {
        
        LATCH retVal = LATCH.__fromPtr__(create_1(bytes, rotationInvariance, half_ssd_size));
        
        return retVal;
    }

    //javadoc: LATCH::create(bytes, rotationInvariance)
    public static LATCH create(int bytes, boolean rotationInvariance)
    {
        
        LATCH retVal = LATCH.__fromPtr__(create_2(bytes, rotationInvariance));
        
        return retVal;
    }

    //javadoc: LATCH::create(bytes)
    public static LATCH create(int bytes)
    {
        
        LATCH retVal = LATCH.__fromPtr__(create_3(bytes));
        
        return retVal;
    }

    //javadoc: LATCH::create()
    public static LATCH create()
    {
        
        LATCH retVal = LATCH.__fromPtr__(create_4());
        
        return retVal;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_LATCH cv::xfeatures2d::LATCH::create(int bytes = 32, bool rotationInvariance = true, int half_ssd_size = 3, double sigma = 2.0)
    private static native long create_0(int bytes, boolean rotationInvariance, int half_ssd_size, double sigma);
    private static native long create_1(int bytes, boolean rotationInvariance, int half_ssd_size);
    private static native long create_2(int bytes, boolean rotationInvariance);
    private static native long create_3(int bytes);
    private static native long create_4();

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
