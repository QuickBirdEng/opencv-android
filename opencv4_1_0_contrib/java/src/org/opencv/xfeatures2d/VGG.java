//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xfeatures2d;

import org.opencv.features2d.Feature2D;
import org.opencv.xfeatures2d.VGG;

// C++: class VGG
//javadoc: VGG

public class VGG extends Feature2D {

    protected VGG(long addr) { super(addr); }

    // internal usage only
    public static VGG __fromPtr__(long addr) { return new VGG(addr); }

    //
    // C++: static Ptr_VGG cv::xfeatures2d::VGG::create(int desc = VGG::VGG_120, float isigma = 1.4f, bool img_normalize = true, bool use_scale_orientation = true, float scale_factor = 6.25f, bool dsc_normalize = false)
    //

    //javadoc: VGG::create(desc, isigma, img_normalize, use_scale_orientation, scale_factor, dsc_normalize)
    public static VGG create(int desc, float isigma, boolean img_normalize, boolean use_scale_orientation, float scale_factor, boolean dsc_normalize)
    {
        
        VGG retVal = VGG.__fromPtr__(create_0(desc, isigma, img_normalize, use_scale_orientation, scale_factor, dsc_normalize));
        
        return retVal;
    }

    //javadoc: VGG::create(desc, isigma, img_normalize, use_scale_orientation, scale_factor)
    public static VGG create(int desc, float isigma, boolean img_normalize, boolean use_scale_orientation, float scale_factor)
    {
        
        VGG retVal = VGG.__fromPtr__(create_1(desc, isigma, img_normalize, use_scale_orientation, scale_factor));
        
        return retVal;
    }

    //javadoc: VGG::create(desc, isigma, img_normalize, use_scale_orientation)
    public static VGG create(int desc, float isigma, boolean img_normalize, boolean use_scale_orientation)
    {
        
        VGG retVal = VGG.__fromPtr__(create_2(desc, isigma, img_normalize, use_scale_orientation));
        
        return retVal;
    }

    //javadoc: VGG::create(desc, isigma, img_normalize)
    public static VGG create(int desc, float isigma, boolean img_normalize)
    {
        
        VGG retVal = VGG.__fromPtr__(create_3(desc, isigma, img_normalize));
        
        return retVal;
    }

    //javadoc: VGG::create(desc, isigma)
    public static VGG create(int desc, float isigma)
    {
        
        VGG retVal = VGG.__fromPtr__(create_4(desc, isigma));
        
        return retVal;
    }

    //javadoc: VGG::create(desc)
    public static VGG create(int desc)
    {
        
        VGG retVal = VGG.__fromPtr__(create_5(desc));
        
        return retVal;
    }

    //javadoc: VGG::create()
    public static VGG create()
    {
        
        VGG retVal = VGG.__fromPtr__(create_6());
        
        return retVal;
    }


    //
    // C++:  bool cv::xfeatures2d::VGG::getUseNormalizeDescriptor()
    //

    //javadoc: VGG::getUseNormalizeDescriptor()
    public  boolean getUseNormalizeDescriptor()
    {
        
        boolean retVal = getUseNormalizeDescriptor_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  bool cv::xfeatures2d::VGG::getUseNormalizeImage()
    //

    //javadoc: VGG::getUseNormalizeImage()
    public  boolean getUseNormalizeImage()
    {
        
        boolean retVal = getUseNormalizeImage_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  bool cv::xfeatures2d::VGG::getUseScaleOrientation()
    //

    //javadoc: VGG::getUseScaleOrientation()
    public  boolean getUseScaleOrientation()
    {
        
        boolean retVal = getUseScaleOrientation_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  float cv::xfeatures2d::VGG::getScaleFactor()
    //

    //javadoc: VGG::getScaleFactor()
    public  float getScaleFactor()
    {
        
        float retVal = getScaleFactor_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  float cv::xfeatures2d::VGG::getSigma()
    //

    //javadoc: VGG::getSigma()
    public  float getSigma()
    {
        
        float retVal = getSigma_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  void cv::xfeatures2d::VGG::setScaleFactor(float scale_factor)
    //

    //javadoc: VGG::setScaleFactor(scale_factor)
    public  void setScaleFactor(float scale_factor)
    {
        
        setScaleFactor_0(nativeObj, scale_factor);
        
        return;
    }


    //
    // C++:  void cv::xfeatures2d::VGG::setSigma(float isigma)
    //

    //javadoc: VGG::setSigma(isigma)
    public  void setSigma(float isigma)
    {
        
        setSigma_0(nativeObj, isigma);
        
        return;
    }


    //
    // C++:  void cv::xfeatures2d::VGG::setUseNormalizeDescriptor(bool dsc_normalize)
    //

    //javadoc: VGG::setUseNormalizeDescriptor(dsc_normalize)
    public  void setUseNormalizeDescriptor(boolean dsc_normalize)
    {
        
        setUseNormalizeDescriptor_0(nativeObj, dsc_normalize);
        
        return;
    }


    //
    // C++:  void cv::xfeatures2d::VGG::setUseNormalizeImage(bool img_normalize)
    //

    //javadoc: VGG::setUseNormalizeImage(img_normalize)
    public  void setUseNormalizeImage(boolean img_normalize)
    {
        
        setUseNormalizeImage_0(nativeObj, img_normalize);
        
        return;
    }


    //
    // C++:  void cv::xfeatures2d::VGG::setUseScaleOrientation(bool use_scale_orientation)
    //

    //javadoc: VGG::setUseScaleOrientation(use_scale_orientation)
    public  void setUseScaleOrientation(boolean use_scale_orientation)
    {
        
        setUseScaleOrientation_0(nativeObj, use_scale_orientation);
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_VGG cv::xfeatures2d::VGG::create(int desc = VGG::VGG_120, float isigma = 1.4f, bool img_normalize = true, bool use_scale_orientation = true, float scale_factor = 6.25f, bool dsc_normalize = false)
    private static native long create_0(int desc, float isigma, boolean img_normalize, boolean use_scale_orientation, float scale_factor, boolean dsc_normalize);
    private static native long create_1(int desc, float isigma, boolean img_normalize, boolean use_scale_orientation, float scale_factor);
    private static native long create_2(int desc, float isigma, boolean img_normalize, boolean use_scale_orientation);
    private static native long create_3(int desc, float isigma, boolean img_normalize);
    private static native long create_4(int desc, float isigma);
    private static native long create_5(int desc);
    private static native long create_6();

    // C++:  bool cv::xfeatures2d::VGG::getUseNormalizeDescriptor()
    private static native boolean getUseNormalizeDescriptor_0(long nativeObj);

    // C++:  bool cv::xfeatures2d::VGG::getUseNormalizeImage()
    private static native boolean getUseNormalizeImage_0(long nativeObj);

    // C++:  bool cv::xfeatures2d::VGG::getUseScaleOrientation()
    private static native boolean getUseScaleOrientation_0(long nativeObj);

    // C++:  float cv::xfeatures2d::VGG::getScaleFactor()
    private static native float getScaleFactor_0(long nativeObj);

    // C++:  float cv::xfeatures2d::VGG::getSigma()
    private static native float getSigma_0(long nativeObj);

    // C++:  void cv::xfeatures2d::VGG::setScaleFactor(float scale_factor)
    private static native void setScaleFactor_0(long nativeObj, float scale_factor);

    // C++:  void cv::xfeatures2d::VGG::setSigma(float isigma)
    private static native void setSigma_0(long nativeObj, float isigma);

    // C++:  void cv::xfeatures2d::VGG::setUseNormalizeDescriptor(bool dsc_normalize)
    private static native void setUseNormalizeDescriptor_0(long nativeObj, boolean dsc_normalize);

    // C++:  void cv::xfeatures2d::VGG::setUseNormalizeImage(bool img_normalize)
    private static native void setUseNormalizeImage_0(long nativeObj, boolean img_normalize);

    // C++:  void cv::xfeatures2d::VGG::setUseScaleOrientation(bool use_scale_orientation)
    private static native void setUseScaleOrientation_0(long nativeObj, boolean use_scale_orientation);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
