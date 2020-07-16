//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;

// C++: class ContourFitting
/**
 * Class for ContourFitting algorithms.
 *     ContourFitting match two contours \( z_a \) and \( z_b \) minimizing distance
 *     \( d(z_a,z_b)=\sum (a_n - s  b_n e^{j(n \alpha +\phi )})^2 \) where \( a_n \) and \( b_n \) are Fourier descriptors of \( z_a \) and \( z_b \) and s is a scaling factor and  \( \phi \) is angle rotation and \( \alpha \) is starting point factor adjustement
 */
public class ContourFitting extends Algorithm {

    protected ContourFitting(long addr) { super(addr); }

    // internal usage only
    public static ContourFitting __fromPtr__(long addr) { return new ContourFitting(addr); }

    //
    // C++:  int cv::ximgproc::ContourFitting::getCtrSize()
    //

    /**
     * @return number of fourier descriptors
     */
    public int getCtrSize() {
        return getCtrSize_0(nativeObj);
    }


    //
    // C++:  int cv::ximgproc::ContourFitting::getFDSize()
    //

    /**
     * @return number of fourier descriptors used for optimal curve matching
     */
    public int getFDSize() {
        return getFDSize_0(nativeObj);
    }


    //
    // C++:  void cv::ximgproc::ContourFitting::estimateTransformation(Mat src, Mat dst, Mat& alphaPhiST, double& dist, bool fdContour = false)
    //

    /**
     * Fit two closed curves using fourier descriptors. More details in CITE: PersoonFu1977 and CITE: BergerRaghunathan1998
     *
     *         @param src Contour defining first shape.
     *         @param dst Contour defining second shape (Target).
     *         @param alphaPhiST : \( \alpha \)=alphaPhiST(0,0), \( \phi \)=alphaPhiST(0,1) (in radian), s=alphaPhiST(0,2), Tx=alphaPhiST(0,3), Ty=alphaPhiST(0,4) rotation center
     *         @param dist distance between src and dst after matching.
     *         @param fdContour false then src and dst are contours and true src and dst are fourier descriptors.
     */
    public void estimateTransformation(Mat src, Mat dst, Mat alphaPhiST, double[] dist, boolean fdContour) {
        double[] dist_out = new double[1];
        estimateTransformation_0(nativeObj, src.nativeObj, dst.nativeObj, alphaPhiST.nativeObj, dist_out, fdContour);
        if(dist!=null) dist[0] = (double)dist_out[0];
    }

    /**
     * Fit two closed curves using fourier descriptors. More details in CITE: PersoonFu1977 and CITE: BergerRaghunathan1998
     *
     *         @param src Contour defining first shape.
     *         @param dst Contour defining second shape (Target).
     *         @param alphaPhiST : \( \alpha \)=alphaPhiST(0,0), \( \phi \)=alphaPhiST(0,1) (in radian), s=alphaPhiST(0,2), Tx=alphaPhiST(0,3), Ty=alphaPhiST(0,4) rotation center
     *         @param dist distance between src and dst after matching.
     */
    public void estimateTransformation(Mat src, Mat dst, Mat alphaPhiST, double[] dist) {
        double[] dist_out = new double[1];
        estimateTransformation_1(nativeObj, src.nativeObj, dst.nativeObj, alphaPhiST.nativeObj, dist_out);
        if(dist!=null) dist[0] = (double)dist_out[0];
    }


    //
    // C++:  void cv::ximgproc::ContourFitting::setCtrSize(int n)
    //

    /**
     * set number of Fourier descriptors used in estimateTransformation
     *
     *         @param n number of Fourier descriptors equal to number of contour points after resampling.
     */
    public void setCtrSize(int n) {
        setCtrSize_0(nativeObj, n);
    }


    //
    // C++:  void cv::ximgproc::ContourFitting::setFDSize(int n)
    //

    /**
     * set number of Fourier descriptors when estimateTransformation used vector&lt;Point&gt;
     *
     *         @param n number of fourier descriptors used for optimal curve matching.
     */
    public void setFDSize(int n) {
        setFDSize_0(nativeObj, n);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  int cv::ximgproc::ContourFitting::getCtrSize()
    private static native int getCtrSize_0(long nativeObj);

    // C++:  int cv::ximgproc::ContourFitting::getFDSize()
    private static native int getFDSize_0(long nativeObj);

    // C++:  void cv::ximgproc::ContourFitting::estimateTransformation(Mat src, Mat dst, Mat& alphaPhiST, double& dist, bool fdContour = false)
    private static native void estimateTransformation_0(long nativeObj, long src_nativeObj, long dst_nativeObj, long alphaPhiST_nativeObj, double[] dist_out, boolean fdContour);
    private static native void estimateTransformation_1(long nativeObj, long src_nativeObj, long dst_nativeObj, long alphaPhiST_nativeObj, double[] dist_out);

    // C++:  void cv::ximgproc::ContourFitting::setCtrSize(int n)
    private static native void setCtrSize_0(long nativeObj, int n);

    // C++:  void cv::ximgproc::ContourFitting::setFDSize(int n)
    private static native void setFDSize_0(long nativeObj, int n);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
