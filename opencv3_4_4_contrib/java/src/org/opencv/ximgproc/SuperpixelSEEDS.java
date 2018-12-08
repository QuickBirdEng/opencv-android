//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;

// C++: class SuperpixelSEEDS
//javadoc: SuperpixelSEEDS

public class SuperpixelSEEDS extends Algorithm {

    protected SuperpixelSEEDS(long addr) { super(addr); }

    // internal usage only
    public static SuperpixelSEEDS __fromPtr__(long addr) { return new SuperpixelSEEDS(addr); }

    //
    // C++:  int cv::ximgproc::SuperpixelSEEDS::getNumberOfSuperpixels()
    //

    //javadoc: SuperpixelSEEDS::getNumberOfSuperpixels()
    public  int getNumberOfSuperpixels()
    {
        
        int retVal = getNumberOfSuperpixels_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  void cv::ximgproc::SuperpixelSEEDS::getLabelContourMask(Mat& image, bool thick_line = false)
    //

    //javadoc: SuperpixelSEEDS::getLabelContourMask(image, thick_line)
    public  void getLabelContourMask(Mat image, boolean thick_line)
    {
        
        getLabelContourMask_0(nativeObj, image.nativeObj, thick_line);
        
        return;
    }

    //javadoc: SuperpixelSEEDS::getLabelContourMask(image)
    public  void getLabelContourMask(Mat image)
    {
        
        getLabelContourMask_1(nativeObj, image.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::SuperpixelSEEDS::getLabels(Mat& labels_out)
    //

    //javadoc: SuperpixelSEEDS::getLabels(labels_out)
    public  void getLabels(Mat labels_out)
    {
        
        getLabels_0(nativeObj, labels_out.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::SuperpixelSEEDS::iterate(Mat img, int num_iterations = 4)
    //

    //javadoc: SuperpixelSEEDS::iterate(img, num_iterations)
    public  void iterate(Mat img, int num_iterations)
    {
        
        iterate_0(nativeObj, img.nativeObj, num_iterations);
        
        return;
    }

    //javadoc: SuperpixelSEEDS::iterate(img)
    public  void iterate(Mat img)
    {
        
        iterate_1(nativeObj, img.nativeObj);
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  int cv::ximgproc::SuperpixelSEEDS::getNumberOfSuperpixels()
    private static native int getNumberOfSuperpixels_0(long nativeObj);

    // C++:  void cv::ximgproc::SuperpixelSEEDS::getLabelContourMask(Mat& image, bool thick_line = false)
    private static native void getLabelContourMask_0(long nativeObj, long image_nativeObj, boolean thick_line);
    private static native void getLabelContourMask_1(long nativeObj, long image_nativeObj);

    // C++:  void cv::ximgproc::SuperpixelSEEDS::getLabels(Mat& labels_out)
    private static native void getLabels_0(long nativeObj, long labels_out_nativeObj);

    // C++:  void cv::ximgproc::SuperpixelSEEDS::iterate(Mat img, int num_iterations = 4)
    private static native void iterate_0(long nativeObj, long img_nativeObj, int num_iterations);
    private static native void iterate_1(long nativeObj, long img_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
