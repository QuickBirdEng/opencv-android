//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;

// C++: class GraphSegmentation
/**
 * Graph Based Segmentation Algorithm.
 *                         The class implements the algorithm described in CITE: PFF2004 .
 */
public class GraphSegmentation extends Algorithm {

    protected GraphSegmentation(long addr) { super(addr); }

    // internal usage only
    public static GraphSegmentation __fromPtr__(long addr) { return new GraphSegmentation(addr); }

    //
    // C++:  double cv::ximgproc::segmentation::GraphSegmentation::getSigma()
    //

    public double getSigma() {
        return getSigma_0(nativeObj);
    }


    //
    // C++:  float cv::ximgproc::segmentation::GraphSegmentation::getK()
    //

    public float getK() {
        return getK_0(nativeObj);
    }


    //
    // C++:  int cv::ximgproc::segmentation::GraphSegmentation::getMinSize()
    //

    public int getMinSize() {
        return getMinSize_0(nativeObj);
    }


    //
    // C++:  void cv::ximgproc::segmentation::GraphSegmentation::processImage(Mat src, Mat& dst)
    //

    /**
     * Segment an image and store output in dst
     *                                 @param src The input image. Any number of channel (1 (Eg: Gray), 3 (Eg: RGB), 4 (Eg: RGB-D)) can be provided
     *                                 @param dst The output segmentation. It's a CV_32SC1 Mat with the same number of cols and rows as input image, with an unique, sequential, id for each pixel.
     */
    public void processImage(Mat src, Mat dst) {
        processImage_0(nativeObj, src.nativeObj, dst.nativeObj);
    }


    //
    // C++:  void cv::ximgproc::segmentation::GraphSegmentation::setK(float k)
    //

    public void setK(float k) {
        setK_0(nativeObj, k);
    }


    //
    // C++:  void cv::ximgproc::segmentation::GraphSegmentation::setMinSize(int min_size)
    //

    public void setMinSize(int min_size) {
        setMinSize_0(nativeObj, min_size);
    }


    //
    // C++:  void cv::ximgproc::segmentation::GraphSegmentation::setSigma(double sigma)
    //

    public void setSigma(double sigma) {
        setSigma_0(nativeObj, sigma);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  double cv::ximgproc::segmentation::GraphSegmentation::getSigma()
    private static native double getSigma_0(long nativeObj);

    // C++:  float cv::ximgproc::segmentation::GraphSegmentation::getK()
    private static native float getK_0(long nativeObj);

    // C++:  int cv::ximgproc::segmentation::GraphSegmentation::getMinSize()
    private static native int getMinSize_0(long nativeObj);

    // C++:  void cv::ximgproc::segmentation::GraphSegmentation::processImage(Mat src, Mat& dst)
    private static native void processImage_0(long nativeObj, long src_nativeObj, long dst_nativeObj);

    // C++:  void cv::ximgproc::segmentation::GraphSegmentation::setK(float k)
    private static native void setK_0(long nativeObj, float k);

    // C++:  void cv::ximgproc::segmentation::GraphSegmentation::setMinSize(int min_size)
    private static native void setMinSize_0(long nativeObj, int min_size);

    // C++:  void cv::ximgproc::segmentation::GraphSegmentation::setSigma(double sigma)
    private static native void setSigma_0(long nativeObj, double sigma);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
