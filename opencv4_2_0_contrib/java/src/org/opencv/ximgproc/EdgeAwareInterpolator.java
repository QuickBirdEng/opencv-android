//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.core.Mat;
import org.opencv.ximgproc.SparseMatchInterpolator;

// C++: class EdgeAwareInterpolator
/**
 * Sparse match interpolation algorithm based on modified locally-weighted affine
 * estimator from CITE: Revaud2015 and Fast Global Smoother as post-processing filter.
 */
public class EdgeAwareInterpolator extends SparseMatchInterpolator {

    protected EdgeAwareInterpolator(long addr) { super(addr); }

    // internal usage only
    public static EdgeAwareInterpolator __fromPtr__(long addr) { return new EdgeAwareInterpolator(addr); }

    //
    // C++:  bool cv::ximgproc::EdgeAwareInterpolator::getUsePostProcessing()
    //

    /**
     * SEE: setUsePostProcessing
     * @return automatically generated
     */
    public boolean getUsePostProcessing() {
        return getUsePostProcessing_0(nativeObj);
    }


    //
    // C++:  float cv::ximgproc::EdgeAwareInterpolator::getFGSLambda()
    //

    /**
     * SEE: setFGSLambda
     * @return automatically generated
     */
    public float getFGSLambda() {
        return getFGSLambda_0(nativeObj);
    }


    //
    // C++:  float cv::ximgproc::EdgeAwareInterpolator::getFGSSigma()
    //

    /**
     * SEE: setFGSLambda
     * @return automatically generated
     */
    public float getFGSSigma() {
        return getFGSSigma_0(nativeObj);
    }


    //
    // C++:  float cv::ximgproc::EdgeAwareInterpolator::getLambda()
    //

    /**
     * SEE: setLambda
     * @return automatically generated
     */
    public float getLambda() {
        return getLambda_0(nativeObj);
    }


    //
    // C++:  float cv::ximgproc::EdgeAwareInterpolator::getSigma()
    //

    /**
     * SEE: setSigma
     * @return automatically generated
     */
    public float getSigma() {
        return getSigma_0(nativeObj);
    }


    //
    // C++:  int cv::ximgproc::EdgeAwareInterpolator::getK()
    //

    /**
     * SEE: setK
     * @return automatically generated
     */
    public int getK() {
        return getK_0(nativeObj);
    }


    //
    // C++:  void cv::ximgproc::EdgeAwareInterpolator::setCostMap(Mat _costMap)
    //

    /**
     * Interface to provide a more elaborated cost map, i.e. edge map, for the edge-aware term.
     * This implementation is based on a rather simple gradient-based edge map estimation.
     * To used more complex edge map estimator (e.g. StructuredEdgeDetection that has been
     * used in the original publication) that may lead to improved accuracies, the internal
     * edge map estimation can be bypassed here.
     * @param _costMap a type CV_32FC1 Mat is required.
     * SEE: cv::ximgproc::createSuperpixelSLIC
     */
    public void setCostMap(Mat _costMap) {
        setCostMap_0(nativeObj, _costMap.nativeObj);
    }


    //
    // C++:  void cv::ximgproc::EdgeAwareInterpolator::setFGSLambda(float _lambda)
    //

    /**
     * Sets the respective fastGlobalSmootherFilter() parameter.
     * @param _lambda automatically generated
     */
    public void setFGSLambda(float _lambda) {
        setFGSLambda_0(nativeObj, _lambda);
    }


    //
    // C++:  void cv::ximgproc::EdgeAwareInterpolator::setFGSSigma(float _sigma)
    //

    /**
     * SEE: setFGSLambda
     * @param _sigma automatically generated
     */
    public void setFGSSigma(float _sigma) {
        setFGSSigma_0(nativeObj, _sigma);
    }


    //
    // C++:  void cv::ximgproc::EdgeAwareInterpolator::setK(int _k)
    //

    /**
     * K is a number of nearest-neighbor matches considered, when fitting a locally affine
     *     model. Usually it should be around 128. However, lower values would make the interpolation
     *     noticeably faster.
     * @param _k automatically generated
     */
    public void setK(int _k) {
        setK_0(nativeObj, _k);
    }


    //
    // C++:  void cv::ximgproc::EdgeAwareInterpolator::setLambda(float _lambda)
    //

    /**
     * Lambda is a parameter defining the weight of the edge-aware term in geodesic distance,
     *     should be in the range of 0 to 1000.
     * @param _lambda automatically generated
     */
    public void setLambda(float _lambda) {
        setLambda_0(nativeObj, _lambda);
    }


    //
    // C++:  void cv::ximgproc::EdgeAwareInterpolator::setSigma(float _sigma)
    //

    /**
     * Sigma is a parameter defining how fast the weights decrease in the locally-weighted affine
     *     fitting. Higher values can help preserve fine details, lower values can help to get rid of noise in the
     *     output flow.
     * @param _sigma automatically generated
     */
    public void setSigma(float _sigma) {
        setSigma_0(nativeObj, _sigma);
    }


    //
    // C++:  void cv::ximgproc::EdgeAwareInterpolator::setUsePostProcessing(bool _use_post_proc)
    //

    /**
     * Sets whether the fastGlobalSmootherFilter() post-processing is employed. It is turned on by
     *     default.
     * @param _use_post_proc automatically generated
     */
    public void setUsePostProcessing(boolean _use_post_proc) {
        setUsePostProcessing_0(nativeObj, _use_post_proc);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  bool cv::ximgproc::EdgeAwareInterpolator::getUsePostProcessing()
    private static native boolean getUsePostProcessing_0(long nativeObj);

    // C++:  float cv::ximgproc::EdgeAwareInterpolator::getFGSLambda()
    private static native float getFGSLambda_0(long nativeObj);

    // C++:  float cv::ximgproc::EdgeAwareInterpolator::getFGSSigma()
    private static native float getFGSSigma_0(long nativeObj);

    // C++:  float cv::ximgproc::EdgeAwareInterpolator::getLambda()
    private static native float getLambda_0(long nativeObj);

    // C++:  float cv::ximgproc::EdgeAwareInterpolator::getSigma()
    private static native float getSigma_0(long nativeObj);

    // C++:  int cv::ximgproc::EdgeAwareInterpolator::getK()
    private static native int getK_0(long nativeObj);

    // C++:  void cv::ximgproc::EdgeAwareInterpolator::setCostMap(Mat _costMap)
    private static native void setCostMap_0(long nativeObj, long _costMap_nativeObj);

    // C++:  void cv::ximgproc::EdgeAwareInterpolator::setFGSLambda(float _lambda)
    private static native void setFGSLambda_0(long nativeObj, float _lambda);

    // C++:  void cv::ximgproc::EdgeAwareInterpolator::setFGSSigma(float _sigma)
    private static native void setFGSSigma_0(long nativeObj, float _sigma);

    // C++:  void cv::ximgproc::EdgeAwareInterpolator::setK(int _k)
    private static native void setK_0(long nativeObj, int _k);

    // C++:  void cv::ximgproc::EdgeAwareInterpolator::setLambda(float _lambda)
    private static native void setLambda_0(long nativeObj, float _lambda);

    // C++:  void cv::ximgproc::EdgeAwareInterpolator::setSigma(float _sigma)
    private static native void setSigma_0(long nativeObj, float _sigma);

    // C++:  void cv::ximgproc::EdgeAwareInterpolator::setUsePostProcessing(bool _use_post_proc)
    private static native void setUsePostProcessing_0(long nativeObj, boolean _use_post_proc);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
