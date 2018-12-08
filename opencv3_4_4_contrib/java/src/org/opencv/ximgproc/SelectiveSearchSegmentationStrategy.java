//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;

// C++: class SelectiveSearchSegmentationStrategy
//javadoc: SelectiveSearchSegmentationStrategy

public class SelectiveSearchSegmentationStrategy extends Algorithm {

    protected SelectiveSearchSegmentationStrategy(long addr) { super(addr); }

    // internal usage only
    public static SelectiveSearchSegmentationStrategy __fromPtr__(long addr) { return new SelectiveSearchSegmentationStrategy(addr); }

    //
    // C++:  float cv::ximgproc::segmentation::SelectiveSearchSegmentationStrategy::get(int r1, int r2)
    //

    //javadoc: SelectiveSearchSegmentationStrategy::get(r1, r2)
    public  float get(int r1, int r2)
    {
        
        float retVal = get_0(nativeObj, r1, r2);
        
        return retVal;
    }


    //
    // C++:  void cv::ximgproc::segmentation::SelectiveSearchSegmentationStrategy::merge(int r1, int r2)
    //

    //javadoc: SelectiveSearchSegmentationStrategy::merge(r1, r2)
    public  void merge(int r1, int r2)
    {
        
        merge_0(nativeObj, r1, r2);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::segmentation::SelectiveSearchSegmentationStrategy::setImage(Mat img, Mat regions, Mat sizes, int image_id = -1)
    //

    //javadoc: SelectiveSearchSegmentationStrategy::setImage(img, regions, sizes, image_id)
    public  void setImage(Mat img, Mat regions, Mat sizes, int image_id)
    {
        
        setImage_0(nativeObj, img.nativeObj, regions.nativeObj, sizes.nativeObj, image_id);
        
        return;
    }

    //javadoc: SelectiveSearchSegmentationStrategy::setImage(img, regions, sizes)
    public  void setImage(Mat img, Mat regions, Mat sizes)
    {
        
        setImage_1(nativeObj, img.nativeObj, regions.nativeObj, sizes.nativeObj);
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  float cv::ximgproc::segmentation::SelectiveSearchSegmentationStrategy::get(int r1, int r2)
    private static native float get_0(long nativeObj, int r1, int r2);

    // C++:  void cv::ximgproc::segmentation::SelectiveSearchSegmentationStrategy::merge(int r1, int r2)
    private static native void merge_0(long nativeObj, int r1, int r2);

    // C++:  void cv::ximgproc::segmentation::SelectiveSearchSegmentationStrategy::setImage(Mat img, Mat regions, Mat sizes, int image_id = -1)
    private static native void setImage_0(long nativeObj, long img_nativeObj, long regions_nativeObj, long sizes_nativeObj, int image_id);
    private static native void setImage_1(long nativeObj, long img_nativeObj, long regions_nativeObj, long sizes_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
