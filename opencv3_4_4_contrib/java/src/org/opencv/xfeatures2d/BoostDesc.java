//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xfeatures2d;

import org.opencv.features2d.Feature2D;
import org.opencv.xfeatures2d.BoostDesc;

// C++: class BoostDesc
//javadoc: BoostDesc

public class BoostDesc extends Feature2D {

    protected BoostDesc(long addr) { super(addr); }

    // internal usage only
    public static BoostDesc __fromPtr__(long addr) { return new BoostDesc(addr); }

    //
    // C++: static Ptr_BoostDesc cv::xfeatures2d::BoostDesc::create(int desc = BoostDesc::BINBOOST_256, bool use_scale_orientation = true, float scale_factor = 6.25f)
    //

    //javadoc: BoostDesc::create(desc, use_scale_orientation, scale_factor)
    public static BoostDesc create(int desc, boolean use_scale_orientation, float scale_factor)
    {
        
        BoostDesc retVal = BoostDesc.__fromPtr__(create_0(desc, use_scale_orientation, scale_factor));
        
        return retVal;
    }

    //javadoc: BoostDesc::create(desc, use_scale_orientation)
    public static BoostDesc create(int desc, boolean use_scale_orientation)
    {
        
        BoostDesc retVal = BoostDesc.__fromPtr__(create_1(desc, use_scale_orientation));
        
        return retVal;
    }

    //javadoc: BoostDesc::create(desc)
    public static BoostDesc create(int desc)
    {
        
        BoostDesc retVal = BoostDesc.__fromPtr__(create_2(desc));
        
        return retVal;
    }

    //javadoc: BoostDesc::create()
    public static BoostDesc create()
    {
        
        BoostDesc retVal = BoostDesc.__fromPtr__(create_3());
        
        return retVal;
    }


    //
    // C++:  bool cv::xfeatures2d::BoostDesc::getUseScaleOrientation()
    //

    //javadoc: BoostDesc::getUseScaleOrientation()
    public  boolean getUseScaleOrientation()
    {
        
        boolean retVal = getUseScaleOrientation_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  float cv::xfeatures2d::BoostDesc::getScaleFactor()
    //

    //javadoc: BoostDesc::getScaleFactor()
    public  float getScaleFactor()
    {
        
        float retVal = getScaleFactor_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  void cv::xfeatures2d::BoostDesc::setScaleFactor(float scale_factor)
    //

    //javadoc: BoostDesc::setScaleFactor(scale_factor)
    public  void setScaleFactor(float scale_factor)
    {
        
        setScaleFactor_0(nativeObj, scale_factor);
        
        return;
    }


    //
    // C++:  void cv::xfeatures2d::BoostDesc::setUseScaleOrientation(bool use_scale_orientation)
    //

    //javadoc: BoostDesc::setUseScaleOrientation(use_scale_orientation)
    public  void setUseScaleOrientation(boolean use_scale_orientation)
    {
        
        setUseScaleOrientation_0(nativeObj, use_scale_orientation);
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_BoostDesc cv::xfeatures2d::BoostDesc::create(int desc = BoostDesc::BINBOOST_256, bool use_scale_orientation = true, float scale_factor = 6.25f)
    private static native long create_0(int desc, boolean use_scale_orientation, float scale_factor);
    private static native long create_1(int desc, boolean use_scale_orientation);
    private static native long create_2(int desc);
    private static native long create_3();

    // C++:  bool cv::xfeatures2d::BoostDesc::getUseScaleOrientation()
    private static native boolean getUseScaleOrientation_0(long nativeObj);

    // C++:  float cv::xfeatures2d::BoostDesc::getScaleFactor()
    private static native float getScaleFactor_0(long nativeObj);

    // C++:  void cv::xfeatures2d::BoostDesc::setScaleFactor(float scale_factor)
    private static native void setScaleFactor_0(long nativeObj, float scale_factor);

    // C++:  void cv::xfeatures2d::BoostDesc::setUseScaleOrientation(bool use_scale_orientation)
    private static native void setUseScaleOrientation_0(long nativeObj, boolean use_scale_orientation);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
