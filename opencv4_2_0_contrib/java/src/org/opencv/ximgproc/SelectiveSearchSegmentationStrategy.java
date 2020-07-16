//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;

// C++: class SelectiveSearchSegmentationStrategy
/**
 * Strategie for the selective search segmentation algorithm
 *                         The class implements a generic stragery for the algorithm described in CITE: uijlings2013selective.
 */
public class SelectiveSearchSegmentationStrategy extends Algorithm {

    protected SelectiveSearchSegmentationStrategy(long addr) { super(addr); }

    // internal usage only
    public static SelectiveSearchSegmentationStrategy __fromPtr__(long addr) { return new SelectiveSearchSegmentationStrategy(addr); }

    //
    // C++:  float cv::ximgproc::segmentation::SelectiveSearchSegmentationStrategy::get(int r1, int r2)
    //

    /**
     * Return the score between two regions (between 0 and 1)
     *                                 @param r1 The first region
     *                                 @param r2 The second region
     * @return automatically generated
     */
    public float get(int r1, int r2) {
        return get_0(nativeObj, r1, r2);
    }


    //
    // C++:  void cv::ximgproc::segmentation::SelectiveSearchSegmentationStrategy::merge(int r1, int r2)
    //

    /**
     * Inform the strategy that two regions will be merged
     *                                 @param r1 The first region
     *                                 @param r2 The second region
     */
    public void merge(int r1, int r2) {
        merge_0(nativeObj, r1, r2);
    }


    //
    // C++:  void cv::ximgproc::segmentation::SelectiveSearchSegmentationStrategy::setImage(Mat img, Mat regions, Mat sizes, int image_id = -1)
    //

    /**
     * Set a initial image, with a segmentation.
     *                                 @param img The input image. Any number of channel can be provided
     *                                 @param regions A segmentation of the image. The parameter must be the same size of img.
     *                                 @param sizes The sizes of different regions
     *                                 @param image_id If not set to -1, try to cache pre-computations. If the same set og (img, regions, size) is used, the image_id need to be the same.
     */
    public void setImage(Mat img, Mat regions, Mat sizes, int image_id) {
        setImage_0(nativeObj, img.nativeObj, regions.nativeObj, sizes.nativeObj, image_id);
    }

    /**
     * Set a initial image, with a segmentation.
     *                                 @param img The input image. Any number of channel can be provided
     *                                 @param regions A segmentation of the image. The parameter must be the same size of img.
     *                                 @param sizes The sizes of different regions
     */
    public void setImage(Mat img, Mat regions, Mat sizes) {
        setImage_1(nativeObj, img.nativeObj, regions.nativeObj, sizes.nativeObj);
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
