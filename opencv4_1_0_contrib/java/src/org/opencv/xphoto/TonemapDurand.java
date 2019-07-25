//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xphoto;

import org.opencv.photo.Tonemap;

// C++: class TonemapDurand
//javadoc: TonemapDurand

public class TonemapDurand extends Tonemap {

    protected TonemapDurand(long addr) { super(addr); }

    // internal usage only
    public static TonemapDurand __fromPtr__(long addr) { return new TonemapDurand(addr); }

    //
    // C++:  float cv::xphoto::TonemapDurand::getContrast()
    //

    //javadoc: TonemapDurand::getContrast()
    public  float getContrast()
    {
        
        float retVal = getContrast_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  float cv::xphoto::TonemapDurand::getSaturation()
    //

    //javadoc: TonemapDurand::getSaturation()
    public  float getSaturation()
    {
        
        float retVal = getSaturation_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  float cv::xphoto::TonemapDurand::getSigmaColor()
    //

    //javadoc: TonemapDurand::getSigmaColor()
    public  float getSigmaColor()
    {
        
        float retVal = getSigmaColor_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  float cv::xphoto::TonemapDurand::getSigmaSpace()
    //

    //javadoc: TonemapDurand::getSigmaSpace()
    public  float getSigmaSpace()
    {
        
        float retVal = getSigmaSpace_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  void cv::xphoto::TonemapDurand::setContrast(float contrast)
    //

    //javadoc: TonemapDurand::setContrast(contrast)
    public  void setContrast(float contrast)
    {
        
        setContrast_0(nativeObj, contrast);
        
        return;
    }


    //
    // C++:  void cv::xphoto::TonemapDurand::setSaturation(float saturation)
    //

    //javadoc: TonemapDurand::setSaturation(saturation)
    public  void setSaturation(float saturation)
    {
        
        setSaturation_0(nativeObj, saturation);
        
        return;
    }


    //
    // C++:  void cv::xphoto::TonemapDurand::setSigmaColor(float sigma_color)
    //

    //javadoc: TonemapDurand::setSigmaColor(sigma_color)
    public  void setSigmaColor(float sigma_color)
    {
        
        setSigmaColor_0(nativeObj, sigma_color);
        
        return;
    }


    //
    // C++:  void cv::xphoto::TonemapDurand::setSigmaSpace(float sigma_space)
    //

    //javadoc: TonemapDurand::setSigmaSpace(sigma_space)
    public  void setSigmaSpace(float sigma_space)
    {
        
        setSigmaSpace_0(nativeObj, sigma_space);
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  float cv::xphoto::TonemapDurand::getContrast()
    private static native float getContrast_0(long nativeObj);

    // C++:  float cv::xphoto::TonemapDurand::getSaturation()
    private static native float getSaturation_0(long nativeObj);

    // C++:  float cv::xphoto::TonemapDurand::getSigmaColor()
    private static native float getSigmaColor_0(long nativeObj);

    // C++:  float cv::xphoto::TonemapDurand::getSigmaSpace()
    private static native float getSigmaSpace_0(long nativeObj);

    // C++:  void cv::xphoto::TonemapDurand::setContrast(float contrast)
    private static native void setContrast_0(long nativeObj, float contrast);

    // C++:  void cv::xphoto::TonemapDurand::setSaturation(float saturation)
    private static native void setSaturation_0(long nativeObj, float saturation);

    // C++:  void cv::xphoto::TonemapDurand::setSigmaColor(float sigma_color)
    private static native void setSigmaColor_0(long nativeObj, float sigma_color);

    // C++:  void cv::xphoto::TonemapDurand::setSigmaSpace(float sigma_space)
    private static native void setSigmaSpace_0(long nativeObj, float sigma_space);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
