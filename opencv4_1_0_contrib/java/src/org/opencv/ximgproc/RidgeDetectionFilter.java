//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.ximgproc.RidgeDetectionFilter;

// C++: class RidgeDetectionFilter
//javadoc: RidgeDetectionFilter

public class RidgeDetectionFilter extends Algorithm {

    protected RidgeDetectionFilter(long addr) { super(addr); }

    // internal usage only
    public static RidgeDetectionFilter __fromPtr__(long addr) { return new RidgeDetectionFilter(addr); }

    //
    // C++: static Ptr_RidgeDetectionFilter cv::ximgproc::RidgeDetectionFilter::create(int ddepth = CV_32FC1, int dx = 1, int dy = 1, int ksize = 3, int out_dtype = CV_8UC1, double scale = 1, double delta = 0, int borderType = BORDER_DEFAULT)
    //

    //javadoc: RidgeDetectionFilter::create(ddepth, dx, dy, ksize, out_dtype, scale, delta, borderType)
    public static RidgeDetectionFilter create(int ddepth, int dx, int dy, int ksize, int out_dtype, double scale, double delta, int borderType)
    {
        
        RidgeDetectionFilter retVal = RidgeDetectionFilter.__fromPtr__(create_0(ddepth, dx, dy, ksize, out_dtype, scale, delta, borderType));
        
        return retVal;
    }

    //javadoc: RidgeDetectionFilter::create(ddepth, dx, dy, ksize, out_dtype, scale, delta)
    public static RidgeDetectionFilter create(int ddepth, int dx, int dy, int ksize, int out_dtype, double scale, double delta)
    {
        
        RidgeDetectionFilter retVal = RidgeDetectionFilter.__fromPtr__(create_1(ddepth, dx, dy, ksize, out_dtype, scale, delta));
        
        return retVal;
    }

    //javadoc: RidgeDetectionFilter::create(ddepth, dx, dy, ksize, out_dtype, scale)
    public static RidgeDetectionFilter create(int ddepth, int dx, int dy, int ksize, int out_dtype, double scale)
    {
        
        RidgeDetectionFilter retVal = RidgeDetectionFilter.__fromPtr__(create_2(ddepth, dx, dy, ksize, out_dtype, scale));
        
        return retVal;
    }

    //javadoc: RidgeDetectionFilter::create(ddepth, dx, dy, ksize, out_dtype)
    public static RidgeDetectionFilter create(int ddepth, int dx, int dy, int ksize, int out_dtype)
    {
        
        RidgeDetectionFilter retVal = RidgeDetectionFilter.__fromPtr__(create_3(ddepth, dx, dy, ksize, out_dtype));
        
        return retVal;
    }

    //javadoc: RidgeDetectionFilter::create(ddepth, dx, dy, ksize)
    public static RidgeDetectionFilter create(int ddepth, int dx, int dy, int ksize)
    {
        
        RidgeDetectionFilter retVal = RidgeDetectionFilter.__fromPtr__(create_4(ddepth, dx, dy, ksize));
        
        return retVal;
    }

    //javadoc: RidgeDetectionFilter::create(ddepth, dx, dy)
    public static RidgeDetectionFilter create(int ddepth, int dx, int dy)
    {
        
        RidgeDetectionFilter retVal = RidgeDetectionFilter.__fromPtr__(create_5(ddepth, dx, dy));
        
        return retVal;
    }

    //javadoc: RidgeDetectionFilter::create(ddepth, dx)
    public static RidgeDetectionFilter create(int ddepth, int dx)
    {
        
        RidgeDetectionFilter retVal = RidgeDetectionFilter.__fromPtr__(create_6(ddepth, dx));
        
        return retVal;
    }

    //javadoc: RidgeDetectionFilter::create(ddepth)
    public static RidgeDetectionFilter create(int ddepth)
    {
        
        RidgeDetectionFilter retVal = RidgeDetectionFilter.__fromPtr__(create_7(ddepth));
        
        return retVal;
    }

    //javadoc: RidgeDetectionFilter::create()
    public static RidgeDetectionFilter create()
    {
        
        RidgeDetectionFilter retVal = RidgeDetectionFilter.__fromPtr__(create_8());
        
        return retVal;
    }


    //
    // C++:  void cv::ximgproc::RidgeDetectionFilter::getRidgeFilteredImage(Mat _img, Mat& out)
    //

    //javadoc: RidgeDetectionFilter::getRidgeFilteredImage(_img, out)
    public  void getRidgeFilteredImage(Mat _img, Mat out)
    {
        
        getRidgeFilteredImage_0(nativeObj, _img.nativeObj, out.nativeObj);
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_RidgeDetectionFilter cv::ximgproc::RidgeDetectionFilter::create(int ddepth = CV_32FC1, int dx = 1, int dy = 1, int ksize = 3, int out_dtype = CV_8UC1, double scale = 1, double delta = 0, int borderType = BORDER_DEFAULT)
    private static native long create_0(int ddepth, int dx, int dy, int ksize, int out_dtype, double scale, double delta, int borderType);
    private static native long create_1(int ddepth, int dx, int dy, int ksize, int out_dtype, double scale, double delta);
    private static native long create_2(int ddepth, int dx, int dy, int ksize, int out_dtype, double scale);
    private static native long create_3(int ddepth, int dx, int dy, int ksize, int out_dtype);
    private static native long create_4(int ddepth, int dx, int dy, int ksize);
    private static native long create_5(int ddepth, int dx, int dy);
    private static native long create_6(int ddepth, int dx);
    private static native long create_7(int ddepth);
    private static native long create_8();

    // C++:  void cv::ximgproc::RidgeDetectionFilter::getRidgeFilteredImage(Mat _img, Mat& out)
    private static native void getRidgeFilteredImage_0(long nativeObj, long _img_nativeObj, long out_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
