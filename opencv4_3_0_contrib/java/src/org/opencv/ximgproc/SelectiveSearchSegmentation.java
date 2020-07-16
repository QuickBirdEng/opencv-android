//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.utils.Converters;
import org.opencv.ximgproc.GraphSegmentation;
import org.opencv.ximgproc.SelectiveSearchSegmentationStrategy;

// C++: class SelectiveSearchSegmentation
/**
 * Selective search segmentation algorithm
 *                         The class implements the algorithm described in CITE: uijlings2013selective.
 */
public class SelectiveSearchSegmentation extends Algorithm {

    protected SelectiveSearchSegmentation(long addr) { super(addr); }

    // internal usage only
    public static SelectiveSearchSegmentation __fromPtr__(long addr) { return new SelectiveSearchSegmentation(addr); }

    //
    // C++:  void cv::ximgproc::segmentation::SelectiveSearchSegmentation::addGraphSegmentation(Ptr_GraphSegmentation g)
    //

    /**
     * Add a new graph segmentation in the list of graph segementations to process.
     *                                 @param g The graph segmentation
     */
    public void addGraphSegmentation(GraphSegmentation g) {
        addGraphSegmentation_0(nativeObj, g.getNativeObjAddr());
    }


    //
    // C++:  void cv::ximgproc::segmentation::SelectiveSearchSegmentation::addImage(Mat img)
    //

    /**
     * Add a new image in the list of images to process.
     *                                 @param img The image
     */
    public void addImage(Mat img) {
        addImage_0(nativeObj, img.nativeObj);
    }


    //
    // C++:  void cv::ximgproc::segmentation::SelectiveSearchSegmentation::addStrategy(Ptr_SelectiveSearchSegmentationStrategy s)
    //

    /**
     * Add a new strategy in the list of strategy to process.
     *                                 @param s The strategy
     */
    public void addStrategy(SelectiveSearchSegmentationStrategy s) {
        addStrategy_0(nativeObj, s.getNativeObjAddr());
    }


    //
    // C++:  void cv::ximgproc::segmentation::SelectiveSearchSegmentation::clearGraphSegmentations()
    //

    /**
     * Clear the list of graph segmentations to process;
     */
    public void clearGraphSegmentations() {
        clearGraphSegmentations_0(nativeObj);
    }


    //
    // C++:  void cv::ximgproc::segmentation::SelectiveSearchSegmentation::clearImages()
    //

    /**
     * Clear the list of images to process
     */
    public void clearImages() {
        clearImages_0(nativeObj);
    }


    //
    // C++:  void cv::ximgproc::segmentation::SelectiveSearchSegmentation::clearStrategies()
    //

    /**
     * Clear the list of strategy to process;
     */
    public void clearStrategies() {
        clearStrategies_0(nativeObj);
    }


    //
    // C++:  void cv::ximgproc::segmentation::SelectiveSearchSegmentation::process(vector_Rect& rects)
    //

    /**
     * Based on all images, graph segmentations and stragies, computes all possible rects and return them
     *                                 @param rects The list of rects. The first ones are more relevents than the lasts ones.
     */
    public void process(MatOfRect rects) {
        Mat rects_mat = rects;
        process_0(nativeObj, rects_mat.nativeObj);
    }


    //
    // C++:  void cv::ximgproc::segmentation::SelectiveSearchSegmentation::setBaseImage(Mat img)
    //

    /**
     * Set a image used by switch* functions to initialize the class
     *                                 @param img The image
     */
    public void setBaseImage(Mat img) {
        setBaseImage_0(nativeObj, img.nativeObj);
    }


    //
    // C++:  void cv::ximgproc::segmentation::SelectiveSearchSegmentation::switchToSelectiveSearchFast(int base_k = 150, int inc_k = 150, float sigma = 0.8f)
    //

    /**
     * Initialize the class with the 'Selective search fast' parameters describled in CITE: uijlings2013selective.
     *                                 @param base_k The k parameter for the first graph segmentation
     *                                 @param inc_k The increment of the k parameter for all graph segmentations
     *                                 @param sigma The sigma parameter for the graph segmentation
     */
    public void switchToSelectiveSearchFast(int base_k, int inc_k, float sigma) {
        switchToSelectiveSearchFast_0(nativeObj, base_k, inc_k, sigma);
    }

    /**
     * Initialize the class with the 'Selective search fast' parameters describled in CITE: uijlings2013selective.
     *                                 @param base_k The k parameter for the first graph segmentation
     *                                 @param inc_k The increment of the k parameter for all graph segmentations
     */
    public void switchToSelectiveSearchFast(int base_k, int inc_k) {
        switchToSelectiveSearchFast_1(nativeObj, base_k, inc_k);
    }

    /**
     * Initialize the class with the 'Selective search fast' parameters describled in CITE: uijlings2013selective.
     *                                 @param base_k The k parameter for the first graph segmentation
     */
    public void switchToSelectiveSearchFast(int base_k) {
        switchToSelectiveSearchFast_2(nativeObj, base_k);
    }

    /**
     * Initialize the class with the 'Selective search fast' parameters describled in CITE: uijlings2013selective.
     */
    public void switchToSelectiveSearchFast() {
        switchToSelectiveSearchFast_3(nativeObj);
    }


    //
    // C++:  void cv::ximgproc::segmentation::SelectiveSearchSegmentation::switchToSelectiveSearchQuality(int base_k = 150, int inc_k = 150, float sigma = 0.8f)
    //

    /**
     * Initialize the class with the 'Selective search fast' parameters describled in CITE: uijlings2013selective.
     *                                 @param base_k The k parameter for the first graph segmentation
     *                                 @param inc_k The increment of the k parameter for all graph segmentations
     *                                 @param sigma The sigma parameter for the graph segmentation
     */
    public void switchToSelectiveSearchQuality(int base_k, int inc_k, float sigma) {
        switchToSelectiveSearchQuality_0(nativeObj, base_k, inc_k, sigma);
    }

    /**
     * Initialize the class with the 'Selective search fast' parameters describled in CITE: uijlings2013selective.
     *                                 @param base_k The k parameter for the first graph segmentation
     *                                 @param inc_k The increment of the k parameter for all graph segmentations
     */
    public void switchToSelectiveSearchQuality(int base_k, int inc_k) {
        switchToSelectiveSearchQuality_1(nativeObj, base_k, inc_k);
    }

    /**
     * Initialize the class with the 'Selective search fast' parameters describled in CITE: uijlings2013selective.
     *                                 @param base_k The k parameter for the first graph segmentation
     */
    public void switchToSelectiveSearchQuality(int base_k) {
        switchToSelectiveSearchQuality_2(nativeObj, base_k);
    }

    /**
     * Initialize the class with the 'Selective search fast' parameters describled in CITE: uijlings2013selective.
     */
    public void switchToSelectiveSearchQuality() {
        switchToSelectiveSearchQuality_3(nativeObj);
    }


    //
    // C++:  void cv::ximgproc::segmentation::SelectiveSearchSegmentation::switchToSingleStrategy(int k = 200, float sigma = 0.8f)
    //

    /**
     * Initialize the class with the 'Single stragegy' parameters describled in CITE: uijlings2013selective.
     *                                 @param k The k parameter for the graph segmentation
     *                                 @param sigma The sigma parameter for the graph segmentation
     */
    public void switchToSingleStrategy(int k, float sigma) {
        switchToSingleStrategy_0(nativeObj, k, sigma);
    }

    /**
     * Initialize the class with the 'Single stragegy' parameters describled in CITE: uijlings2013selective.
     *                                 @param k The k parameter for the graph segmentation
     */
    public void switchToSingleStrategy(int k) {
        switchToSingleStrategy_1(nativeObj, k);
    }

    /**
     * Initialize the class with the 'Single stragegy' parameters describled in CITE: uijlings2013selective.
     */
    public void switchToSingleStrategy() {
        switchToSingleStrategy_2(nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  void cv::ximgproc::segmentation::SelectiveSearchSegmentation::addGraphSegmentation(Ptr_GraphSegmentation g)
    private static native void addGraphSegmentation_0(long nativeObj, long g_nativeObj);

    // C++:  void cv::ximgproc::segmentation::SelectiveSearchSegmentation::addImage(Mat img)
    private static native void addImage_0(long nativeObj, long img_nativeObj);

    // C++:  void cv::ximgproc::segmentation::SelectiveSearchSegmentation::addStrategy(Ptr_SelectiveSearchSegmentationStrategy s)
    private static native void addStrategy_0(long nativeObj, long s_nativeObj);

    // C++:  void cv::ximgproc::segmentation::SelectiveSearchSegmentation::clearGraphSegmentations()
    private static native void clearGraphSegmentations_0(long nativeObj);

    // C++:  void cv::ximgproc::segmentation::SelectiveSearchSegmentation::clearImages()
    private static native void clearImages_0(long nativeObj);

    // C++:  void cv::ximgproc::segmentation::SelectiveSearchSegmentation::clearStrategies()
    private static native void clearStrategies_0(long nativeObj);

    // C++:  void cv::ximgproc::segmentation::SelectiveSearchSegmentation::process(vector_Rect& rects)
    private static native void process_0(long nativeObj, long rects_mat_nativeObj);

    // C++:  void cv::ximgproc::segmentation::SelectiveSearchSegmentation::setBaseImage(Mat img)
    private static native void setBaseImage_0(long nativeObj, long img_nativeObj);

    // C++:  void cv::ximgproc::segmentation::SelectiveSearchSegmentation::switchToSelectiveSearchFast(int base_k = 150, int inc_k = 150, float sigma = 0.8f)
    private static native void switchToSelectiveSearchFast_0(long nativeObj, int base_k, int inc_k, float sigma);
    private static native void switchToSelectiveSearchFast_1(long nativeObj, int base_k, int inc_k);
    private static native void switchToSelectiveSearchFast_2(long nativeObj, int base_k);
    private static native void switchToSelectiveSearchFast_3(long nativeObj);

    // C++:  void cv::ximgproc::segmentation::SelectiveSearchSegmentation::switchToSelectiveSearchQuality(int base_k = 150, int inc_k = 150, float sigma = 0.8f)
    private static native void switchToSelectiveSearchQuality_0(long nativeObj, int base_k, int inc_k, float sigma);
    private static native void switchToSelectiveSearchQuality_1(long nativeObj, int base_k, int inc_k);
    private static native void switchToSelectiveSearchQuality_2(long nativeObj, int base_k);
    private static native void switchToSelectiveSearchQuality_3(long nativeObj);

    // C++:  void cv::ximgproc::segmentation::SelectiveSearchSegmentation::switchToSingleStrategy(int k = 200, float sigma = 0.8f)
    private static native void switchToSingleStrategy_0(long nativeObj, int k, float sigma);
    private static native void switchToSingleStrategy_1(long nativeObj, int k);
    private static native void switchToSingleStrategy_2(long nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
