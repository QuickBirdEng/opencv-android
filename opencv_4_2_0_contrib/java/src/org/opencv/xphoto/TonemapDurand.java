//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xphoto;

import org.opencv.photo.Tonemap;

// C++: class TonemapDurand
/**
 * This algorithm decomposes image into two layers: base layer and detail layer using bilateral filter
 * and compresses contrast of the base layer thus preserving all the details.
 *
 * This implementation uses regular bilateral filter from OpenCV.
 *
 * Saturation enhancement is possible as in cv::TonemapDrago.
 *
 * For more information see CITE: DD02 .
 */
public class TonemapDurand extends Tonemap {

    protected TonemapDurand(long addr) { super(addr); }

    // internal usage only
    public static TonemapDurand __fromPtr__(long addr) { return new TonemapDurand(addr); }

    //
    // C++:  float cv::xphoto::TonemapDurand::getContrast()
    //

    public float getContrast() {
        return getContrast_0(nativeObj);
    }


    //
    // C++:  float cv::xphoto::TonemapDurand::getSaturation()
    //

    public float getSaturation() {
        return getSaturation_0(nativeObj);
    }


    //
    // C++:  float cv::xphoto::TonemapDurand::getSigmaColor()
    //

    public float getSigmaColor() {
        return getSigmaColor_0(nativeObj);
    }


    //
    // C++:  float cv::xphoto::TonemapDurand::getSigmaSpace()
    //

    public float getSigmaSpace() {
        return getSigmaSpace_0(nativeObj);
    }


    //
    // C++:  void cv::xphoto::TonemapDurand::setContrast(float contrast)
    //

    public void setContrast(float contrast) {
        setContrast_0(nativeObj, contrast);
    }


    //
    // C++:  void cv::xphoto::TonemapDurand::setSaturation(float saturation)
    //

    public void setSaturation(float saturation) {
        setSaturation_0(nativeObj, saturation);
    }


    //
    // C++:  void cv::xphoto::TonemapDurand::setSigmaColor(float sigma_color)
    //

    public void setSigmaColor(float sigma_color) {
        setSigmaColor_0(nativeObj, sigma_color);
    }


    //
    // C++:  void cv::xphoto::TonemapDurand::setSigmaSpace(float sigma_space)
    //

    public void setSigmaSpace(float sigma_space) {
        setSigmaSpace_0(nativeObj, sigma_space);
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
