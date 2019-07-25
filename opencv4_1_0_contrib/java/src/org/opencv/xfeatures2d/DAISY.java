//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xfeatures2d;

import org.opencv.core.Mat;
import org.opencv.features2d.Feature2D;
import org.opencv.xfeatures2d.DAISY;

// C++: class DAISY
//javadoc: DAISY

public class DAISY extends Feature2D {

    protected DAISY(long addr) { super(addr); }

    // internal usage only
    public static DAISY __fromPtr__(long addr) { return new DAISY(addr); }

    // C++: enum NormalizationType
    public static final int
            NRM_NONE = 100,
            NRM_PARTIAL = 101,
            NRM_FULL = 102,
            NRM_SIFT = 103;


    //
    // C++: static Ptr_DAISY cv::xfeatures2d::DAISY::create(float radius = 15, int q_radius = 3, int q_theta = 8, int q_hist = 8, DAISY_NormalizationType norm = DAISY::NRM_NONE, Mat H = Mat(), bool interpolation = true, bool use_orientation = false)
    //

    //javadoc: DAISY::create(radius, q_radius, q_theta, q_hist, H, interpolation, use_orientation)
    public static DAISY create(float radius, int q_radius, int q_theta, int q_hist, Mat H, boolean interpolation, boolean use_orientation)
    {
        
        DAISY retVal = DAISY.__fromPtr__(create_0(radius, q_radius, q_theta, q_hist, H.nativeObj, interpolation, use_orientation));
        
        return retVal;
    }

    //javadoc: DAISY::create(radius, q_radius, q_theta, q_hist, H, interpolation)
    public static DAISY create(float radius, int q_radius, int q_theta, int q_hist, Mat H, boolean interpolation)
    {
        
        DAISY retVal = DAISY.__fromPtr__(create_1(radius, q_radius, q_theta, q_hist, H.nativeObj, interpolation));
        
        return retVal;
    }

    //javadoc: DAISY::create(radius, q_radius, q_theta, q_hist, H)
    public static DAISY create(float radius, int q_radius, int q_theta, int q_hist, Mat H)
    {
        
        DAISY retVal = DAISY.__fromPtr__(create_2(radius, q_radius, q_theta, q_hist, H.nativeObj));
        
        return retVal;
    }

    //javadoc: DAISY::create(radius, q_radius, q_theta, q_hist)
    public static DAISY create(float radius, int q_radius, int q_theta, int q_hist)
    {
        
        DAISY retVal = DAISY.__fromPtr__(create_3(radius, q_radius, q_theta, q_hist));
        
        return retVal;
    }

    //javadoc: DAISY::create(radius, q_radius, q_theta)
    public static DAISY create(float radius, int q_radius, int q_theta)
    {
        
        DAISY retVal = DAISY.__fromPtr__(create_5(radius, q_radius, q_theta));
        
        return retVal;
    }

    //javadoc: DAISY::create(radius, q_radius)
    public static DAISY create(float radius, int q_radius)
    {
        
        DAISY retVal = DAISY.__fromPtr__(create_6(radius, q_radius));
        
        return retVal;
    }

    //javadoc: DAISY::create(radius)
    public static DAISY create(float radius)
    {
        
        DAISY retVal = DAISY.__fromPtr__(create_7(radius));
        
        return retVal;
    }

    //javadoc: DAISY::create()
    public static DAISY create()
    {
        
        DAISY retVal = DAISY.__fromPtr__(create_8());
        
        return retVal;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_DAISY cv::xfeatures2d::DAISY::create(float radius = 15, int q_radius = 3, int q_theta = 8, int q_hist = 8, DAISY_NormalizationType norm = DAISY::NRM_NONE, Mat H = Mat(), bool interpolation = true, bool use_orientation = false)
    private static native long create_0(float radius, int q_radius, int q_theta, int q_hist, long H_nativeObj, boolean interpolation, boolean use_orientation);
    private static native long create_1(float radius, int q_radius, int q_theta, int q_hist, long H_nativeObj, boolean interpolation);
    private static native long create_2(float radius, int q_radius, int q_theta, int q_hist, long H_nativeObj);
    private static native long create_3(float radius, int q_radius, int q_theta, int q_hist);
    private static native long create_5(float radius, int q_radius, int q_theta);
    private static native long create_6(float radius, int q_radius);
    private static native long create_7(float radius);
    private static native long create_8();

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
