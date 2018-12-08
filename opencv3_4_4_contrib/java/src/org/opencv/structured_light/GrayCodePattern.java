//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.structured_light;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.structured_light.GrayCodePattern;
import org.opencv.utils.Converters;

// C++: class GrayCodePattern
//javadoc: GrayCodePattern

public class GrayCodePattern extends StructuredLightPattern {

    protected GrayCodePattern(long addr) { super(addr); }

    // internal usage only
    public static GrayCodePattern __fromPtr__(long addr) { return new GrayCodePattern(addr); }

    //
    // C++: static Ptr_GrayCodePattern cv::structured_light::GrayCodePattern::create(int width, int height)
    //

    //javadoc: GrayCodePattern::create(width, height)
    public static GrayCodePattern create(int width, int height)
    {
        
        GrayCodePattern retVal = GrayCodePattern.__fromPtr__(create_0(width, height));
        
        return retVal;
    }


    //
    // C++:  bool cv::structured_light::GrayCodePattern::getProjPixel(vector_Mat patternImages, int x, int y, Point& projPix)
    //

    //javadoc: GrayCodePattern::getProjPixel(patternImages, x, y, projPix)
    public  boolean getProjPixel(List<Mat> patternImages, int x, int y, Point projPix)
    {
        Mat patternImages_mat = Converters.vector_Mat_to_Mat(patternImages);
        double[] projPix_out = new double[2];
        boolean retVal = getProjPixel_0(nativeObj, patternImages_mat.nativeObj, x, y, projPix_out);
        if(projPix!=null){ projPix.x = projPix_out[0]; projPix.y = projPix_out[1]; } 
        return retVal;
    }


    //
    // C++:  size_t cv::structured_light::GrayCodePattern::getNumberOfPatternImages()
    //

    //javadoc: GrayCodePattern::getNumberOfPatternImages()
    public  long getNumberOfPatternImages()
    {
        
        long retVal = getNumberOfPatternImages_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  void cv::structured_light::GrayCodePattern::getImagesForShadowMasks(Mat& blackImage, Mat& whiteImage)
    //

    //javadoc: GrayCodePattern::getImagesForShadowMasks(blackImage, whiteImage)
    public  void getImagesForShadowMasks(Mat blackImage, Mat whiteImage)
    {
        
        getImagesForShadowMasks_0(nativeObj, blackImage.nativeObj, whiteImage.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::structured_light::GrayCodePattern::setBlackThreshold(size_t value)
    //

    //javadoc: GrayCodePattern::setBlackThreshold(value)
    public  void setBlackThreshold(long value)
    {
        
        setBlackThreshold_0(nativeObj, value);
        
        return;
    }


    //
    // C++:  void cv::structured_light::GrayCodePattern::setWhiteThreshold(size_t value)
    //

    //javadoc: GrayCodePattern::setWhiteThreshold(value)
    public  void setWhiteThreshold(long value)
    {
        
        setWhiteThreshold_0(nativeObj, value);
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_GrayCodePattern cv::structured_light::GrayCodePattern::create(int width, int height)
    private static native long create_0(int width, int height);

    // C++:  bool cv::structured_light::GrayCodePattern::getProjPixel(vector_Mat patternImages, int x, int y, Point& projPix)
    private static native boolean getProjPixel_0(long nativeObj, long patternImages_mat_nativeObj, int x, int y, double[] projPix_out);

    // C++:  size_t cv::structured_light::GrayCodePattern::getNumberOfPatternImages()
    private static native long getNumberOfPatternImages_0(long nativeObj);

    // C++:  void cv::structured_light::GrayCodePattern::getImagesForShadowMasks(Mat& blackImage, Mat& whiteImage)
    private static native void getImagesForShadowMasks_0(long nativeObj, long blackImage_nativeObj, long whiteImage_nativeObj);

    // C++:  void cv::structured_light::GrayCodePattern::setBlackThreshold(size_t value)
    private static native void setBlackThreshold_0(long nativeObj, long value);

    // C++:  void cv::structured_light::GrayCodePattern::setWhiteThreshold(size_t value)
    private static native void setWhiteThreshold_0(long nativeObj, long value);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
