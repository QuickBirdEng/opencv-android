//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.core.Mat;
import org.opencv.ximgproc.SparseMatchInterpolator;

// C++: class RICInterpolator
/**
 * Sparse match interpolation algorithm based on modified piecewise locally-weighted affine
 * estimator called Robust Interpolation method of Correspondences or RIC from CITE: Hu2017 and Variational
 * and Fast Global Smoother as post-processing filter. The RICInterpolator is a extension of the EdgeAwareInterpolator.
 * Main concept of this extension is an piece-wise affine model based on over-segmentation via SLIC superpixel estimation.
 * The method contains an efficient propagation mechanism to estimate among the pieces-wise models.
 */
public class RICInterpolator extends SparseMatchInterpolator {

    protected RICInterpolator(long addr) { super(addr); }

    // internal usage only
    public static RICInterpolator __fromPtr__(long addr) { return new RICInterpolator(addr); }

    //
    // C++:  bool cv::ximgproc::RICInterpolator::getRefineModels()
    //

    /**
     *  setRefineModels
     * SEE: setRefineModels
     * @return automatically generated
     */
    public boolean getRefineModels() {
        return getRefineModels_0(nativeObj);
    }


    //
    // C++:  bool cv::ximgproc::RICInterpolator::getUseGlobalSmootherFilter()
    //

    /**
     *  setUseGlobalSmootherFilter
     * SEE: setUseGlobalSmootherFilter
     * @return automatically generated
     */
    public boolean getUseGlobalSmootherFilter() {
        return getUseGlobalSmootherFilter_0(nativeObj);
    }


    //
    // C++:  bool cv::ximgproc::RICInterpolator::getUseVariationalRefinement()
    //

    /**
     *  setUseVariationalRefinement
     * SEE: setUseVariationalRefinement
     * @return automatically generated
     */
    public boolean getUseVariationalRefinement() {
        return getUseVariationalRefinement_0(nativeObj);
    }


    //
    // C++:  float cv::ximgproc::RICInterpolator::getAlpha()
    //

    /**
     *  setAlpha
     * SEE: setAlpha
     * @return automatically generated
     */
    public float getAlpha() {
        return getAlpha_0(nativeObj);
    }


    //
    // C++:  float cv::ximgproc::RICInterpolator::getFGSLambda()
    //

    /**
     *  setFGSLambda
     * SEE: setFGSLambda
     * @return automatically generated
     */
    public float getFGSLambda() {
        return getFGSLambda_0(nativeObj);
    }


    //
    // C++:  float cv::ximgproc::RICInterpolator::getFGSSigma()
    //

    /**
     *  setFGSSigma
     * SEE: setFGSSigma
     * @return automatically generated
     */
    public float getFGSSigma() {
        return getFGSSigma_0(nativeObj);
    }


    //
    // C++:  float cv::ximgproc::RICInterpolator::getMaxFlow()
    //

    /**
     *  setMaxFlow
     * SEE: setMaxFlow
     * @return automatically generated
     */
    public float getMaxFlow() {
        return getMaxFlow_0(nativeObj);
    }


    //
    // C++:  float cv::ximgproc::RICInterpolator::getSuperpixelRuler()
    //

    /**
     *  setSuperpixelRuler
     * SEE: setSuperpixelRuler
     * @return automatically generated
     */
    public float getSuperpixelRuler() {
        return getSuperpixelRuler_0(nativeObj);
    }


    //
    // C++:  int cv::ximgproc::RICInterpolator::getK()
    //

    /**
     *  setK
     * SEE: setK
     * @return automatically generated
     */
    public int getK() {
        return getK_0(nativeObj);
    }


    //
    // C++:  int cv::ximgproc::RICInterpolator::getModelIter()
    //

    /**
     *  setModelIter
     * SEE: setModelIter
     * @return automatically generated
     */
    public int getModelIter() {
        return getModelIter_0(nativeObj);
    }


    //
    // C++:  int cv::ximgproc::RICInterpolator::getSuperpixelMode()
    //

    /**
     *  setSuperpixelMode
     * SEE: setSuperpixelMode
     * @return automatically generated
     */
    public int getSuperpixelMode() {
        return getSuperpixelMode_0(nativeObj);
    }


    //
    // C++:  int cv::ximgproc::RICInterpolator::getSuperpixelNNCnt()
    //

    /**
     *  setSuperpixelNNCnt
     * SEE: setSuperpixelNNCnt
     * @return automatically generated
     */
    public int getSuperpixelNNCnt() {
        return getSuperpixelNNCnt_0(nativeObj);
    }


    //
    // C++:  int cv::ximgproc::RICInterpolator::getSuperpixelSize()
    //

    /**
     *  setSuperpixelSize
     * SEE: setSuperpixelSize
     * @return automatically generated
     */
    public int getSuperpixelSize() {
        return getSuperpixelSize_0(nativeObj);
    }


    //
    // C++:  void cv::ximgproc::RICInterpolator::setAlpha(float alpha = 0.7f)
    //

    /**
     * Alpha is a parameter defining a global weight for transforming geodesic distance into weight.
     * @param alpha automatically generated
     */
    public void setAlpha(float alpha) {
        setAlpha_0(nativeObj, alpha);
    }

    /**
     * Alpha is a parameter defining a global weight for transforming geodesic distance into weight.
     */
    public void setAlpha() {
        setAlpha_1(nativeObj);
    }


    //
    // C++:  void cv::ximgproc::RICInterpolator::setCostMap(Mat costMap)
    //

    /**
     * Interface to provide a more elaborated cost map, i.e. edge map, for the edge-aware term.
     * This implementation is based on a rather simple gradient-based edge map estimation.
     * To used more complex edge map estimator (e.g. StructuredEdgeDetection that has been
     * used in the original publication) that may lead to improved accuracies, the internal
     * edge map estimation can be bypassed here.
     * @param costMap a type CV_32FC1 Mat is required.
     * SEE: cv::ximgproc::createSuperpixelSLIC
     */
    public void setCostMap(Mat costMap) {
        setCostMap_0(nativeObj, costMap.nativeObj);
    }


    //
    // C++:  void cv::ximgproc::RICInterpolator::setFGSLambda(float lambda = 500.f)
    //

    /**
     * Sets the respective fastGlobalSmootherFilter() parameter.
     * @param lambda automatically generated
     */
    public void setFGSLambda(float lambda) {
        setFGSLambda_0(nativeObj, lambda);
    }

    /**
     * Sets the respective fastGlobalSmootherFilter() parameter.
     */
    public void setFGSLambda() {
        setFGSLambda_1(nativeObj);
    }


    //
    // C++:  void cv::ximgproc::RICInterpolator::setFGSSigma(float sigma = 1.5f)
    //

    /**
     * Sets the respective fastGlobalSmootherFilter() parameter.
     * @param sigma automatically generated
     */
    public void setFGSSigma(float sigma) {
        setFGSSigma_0(nativeObj, sigma);
    }

    /**
     * Sets the respective fastGlobalSmootherFilter() parameter.
     */
    public void setFGSSigma() {
        setFGSSigma_1(nativeObj);
    }


    //
    // C++:  void cv::ximgproc::RICInterpolator::setK(int k = 32)
    //

    /**
     * K is a number of nearest-neighbor matches considered, when fitting a locally affine
     * model for a superpixel segment. However, lower values would make the interpolation
     * noticeably faster. The original implementation of CITE: Hu2017 uses 32.
     * @param k automatically generated
     */
    public void setK(int k) {
        setK_0(nativeObj, k);
    }

    /**
     * K is a number of nearest-neighbor matches considered, when fitting a locally affine
     * model for a superpixel segment. However, lower values would make the interpolation
     * noticeably faster. The original implementation of CITE: Hu2017 uses 32.
     */
    public void setK() {
        setK_1(nativeObj);
    }


    //
    // C++:  void cv::ximgproc::RICInterpolator::setMaxFlow(float maxFlow = 250.f)
    //

    /**
     * MaxFlow is a threshold to validate the predictions using a certain piece-wise affine model.
     * If the prediction exceeds the treshold the translational model will be applied instead.
     * @param maxFlow automatically generated
     */
    public void setMaxFlow(float maxFlow) {
        setMaxFlow_0(nativeObj, maxFlow);
    }

    /**
     * MaxFlow is a threshold to validate the predictions using a certain piece-wise affine model.
     * If the prediction exceeds the treshold the translational model will be applied instead.
     */
    public void setMaxFlow() {
        setMaxFlow_1(nativeObj);
    }


    //
    // C++:  void cv::ximgproc::RICInterpolator::setModelIter(int modelIter = 4)
    //

    /**
     * Parameter defining the number of iterations for piece-wise affine model estimation.
     * @param modelIter automatically generated
     */
    public void setModelIter(int modelIter) {
        setModelIter_0(nativeObj, modelIter);
    }

    /**
     * Parameter defining the number of iterations for piece-wise affine model estimation.
     */
    public void setModelIter() {
        setModelIter_1(nativeObj);
    }


    //
    // C++:  void cv::ximgproc::RICInterpolator::setRefineModels(bool refineModles = true)
    //

    /**
     * Parameter to choose wether additional refinement of the piece-wise affine models is employed.
     * @param refineModles automatically generated
     */
    public void setRefineModels(boolean refineModles) {
        setRefineModels_0(nativeObj, refineModles);
    }

    /**
     * Parameter to choose wether additional refinement of the piece-wise affine models is employed.
     */
    public void setRefineModels() {
        setRefineModels_1(nativeObj);
    }


    //
    // C++:  void cv::ximgproc::RICInterpolator::setSuperpixelMode(int mode = 100)
    //

    /**
     * Parameter to choose superpixel algorithm variant to use:
     * - cv::ximgproc::SLICType SLIC segments image using a desired region_size (value: 100)
     * - cv::ximgproc::SLICType SLICO will optimize using adaptive compactness factor (value: 101)
     * - cv::ximgproc::SLICType MSLIC will optimize using manifold methods resulting in more content-sensitive superpixels (value: 102).
     * SEE: cv::ximgproc::createSuperpixelSLIC
     * @param mode automatically generated
     */
    public void setSuperpixelMode(int mode) {
        setSuperpixelMode_0(nativeObj, mode);
    }

    /**
     * Parameter to choose superpixel algorithm variant to use:
     * - cv::ximgproc::SLICType SLIC segments image using a desired region_size (value: 100)
     * - cv::ximgproc::SLICType SLICO will optimize using adaptive compactness factor (value: 101)
     * - cv::ximgproc::SLICType MSLIC will optimize using manifold methods resulting in more content-sensitive superpixels (value: 102).
     * SEE: cv::ximgproc::createSuperpixelSLIC
     */
    public void setSuperpixelMode() {
        setSuperpixelMode_1(nativeObj);
    }


    //
    // C++:  void cv::ximgproc::RICInterpolator::setSuperpixelNNCnt(int spNN = 150)
    //

    /**
     * Parameter defines the number of nearest-neighbor matches for each superpixel considered, when fitting a locally affine
     * model.
     * @param spNN automatically generated
     */
    public void setSuperpixelNNCnt(int spNN) {
        setSuperpixelNNCnt_0(nativeObj, spNN);
    }

    /**
     * Parameter defines the number of nearest-neighbor matches for each superpixel considered, when fitting a locally affine
     * model.
     */
    public void setSuperpixelNNCnt() {
        setSuperpixelNNCnt_1(nativeObj);
    }


    //
    // C++:  void cv::ximgproc::RICInterpolator::setSuperpixelRuler(float ruler = 15.f)
    //

    /**
     * Parameter to tune enforcement of superpixel smoothness factor used for oversegmentation.
     * SEE: cv::ximgproc::createSuperpixelSLIC
     * @param ruler automatically generated
     */
    public void setSuperpixelRuler(float ruler) {
        setSuperpixelRuler_0(nativeObj, ruler);
    }

    /**
     * Parameter to tune enforcement of superpixel smoothness factor used for oversegmentation.
     * SEE: cv::ximgproc::createSuperpixelSLIC
     */
    public void setSuperpixelRuler() {
        setSuperpixelRuler_1(nativeObj);
    }


    //
    // C++:  void cv::ximgproc::RICInterpolator::setSuperpixelSize(int spSize = 15)
    //

    /**
     * Get the internal cost, i.e. edge map, used for estimating the edge-aware term.
     * SEE: setCostMap
     * @param spSize automatically generated
     */
    public void setSuperpixelSize(int spSize) {
        setSuperpixelSize_0(nativeObj, spSize);
    }

    /**
     * Get the internal cost, i.e. edge map, used for estimating the edge-aware term.
     * SEE: setCostMap
     */
    public void setSuperpixelSize() {
        setSuperpixelSize_1(nativeObj);
    }


    //
    // C++:  void cv::ximgproc::RICInterpolator::setUseGlobalSmootherFilter(bool use_FGS = true)
    //

    /**
     * Sets whether the fastGlobalSmootherFilter() post-processing is employed.
     * @param use_FGS automatically generated
     */
    public void setUseGlobalSmootherFilter(boolean use_FGS) {
        setUseGlobalSmootherFilter_0(nativeObj, use_FGS);
    }

    /**
     * Sets whether the fastGlobalSmootherFilter() post-processing is employed.
     */
    public void setUseGlobalSmootherFilter() {
        setUseGlobalSmootherFilter_1(nativeObj);
    }


    //
    // C++:  void cv::ximgproc::RICInterpolator::setUseVariationalRefinement(bool use_variational_refinement = false)
    //

    /**
     * Parameter to choose wether the VariationalRefinement post-processing  is employed.
     * @param use_variational_refinement automatically generated
     */
    public void setUseVariationalRefinement(boolean use_variational_refinement) {
        setUseVariationalRefinement_0(nativeObj, use_variational_refinement);
    }

    /**
     * Parameter to choose wether the VariationalRefinement post-processing  is employed.
     */
    public void setUseVariationalRefinement() {
        setUseVariationalRefinement_1(nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  bool cv::ximgproc::RICInterpolator::getRefineModels()
    private static native boolean getRefineModels_0(long nativeObj);

    // C++:  bool cv::ximgproc::RICInterpolator::getUseGlobalSmootherFilter()
    private static native boolean getUseGlobalSmootherFilter_0(long nativeObj);

    // C++:  bool cv::ximgproc::RICInterpolator::getUseVariationalRefinement()
    private static native boolean getUseVariationalRefinement_0(long nativeObj);

    // C++:  float cv::ximgproc::RICInterpolator::getAlpha()
    private static native float getAlpha_0(long nativeObj);

    // C++:  float cv::ximgproc::RICInterpolator::getFGSLambda()
    private static native float getFGSLambda_0(long nativeObj);

    // C++:  float cv::ximgproc::RICInterpolator::getFGSSigma()
    private static native float getFGSSigma_0(long nativeObj);

    // C++:  float cv::ximgproc::RICInterpolator::getMaxFlow()
    private static native float getMaxFlow_0(long nativeObj);

    // C++:  float cv::ximgproc::RICInterpolator::getSuperpixelRuler()
    private static native float getSuperpixelRuler_0(long nativeObj);

    // C++:  int cv::ximgproc::RICInterpolator::getK()
    private static native int getK_0(long nativeObj);

    // C++:  int cv::ximgproc::RICInterpolator::getModelIter()
    private static native int getModelIter_0(long nativeObj);

    // C++:  int cv::ximgproc::RICInterpolator::getSuperpixelMode()
    private static native int getSuperpixelMode_0(long nativeObj);

    // C++:  int cv::ximgproc::RICInterpolator::getSuperpixelNNCnt()
    private static native int getSuperpixelNNCnt_0(long nativeObj);

    // C++:  int cv::ximgproc::RICInterpolator::getSuperpixelSize()
    private static native int getSuperpixelSize_0(long nativeObj);

    // C++:  void cv::ximgproc::RICInterpolator::setAlpha(float alpha = 0.7f)
    private static native void setAlpha_0(long nativeObj, float alpha);
    private static native void setAlpha_1(long nativeObj);

    // C++:  void cv::ximgproc::RICInterpolator::setCostMap(Mat costMap)
    private static native void setCostMap_0(long nativeObj, long costMap_nativeObj);

    // C++:  void cv::ximgproc::RICInterpolator::setFGSLambda(float lambda = 500.f)
    private static native void setFGSLambda_0(long nativeObj, float lambda);
    private static native void setFGSLambda_1(long nativeObj);

    // C++:  void cv::ximgproc::RICInterpolator::setFGSSigma(float sigma = 1.5f)
    private static native void setFGSSigma_0(long nativeObj, float sigma);
    private static native void setFGSSigma_1(long nativeObj);

    // C++:  void cv::ximgproc::RICInterpolator::setK(int k = 32)
    private static native void setK_0(long nativeObj, int k);
    private static native void setK_1(long nativeObj);

    // C++:  void cv::ximgproc::RICInterpolator::setMaxFlow(float maxFlow = 250.f)
    private static native void setMaxFlow_0(long nativeObj, float maxFlow);
    private static native void setMaxFlow_1(long nativeObj);

    // C++:  void cv::ximgproc::RICInterpolator::setModelIter(int modelIter = 4)
    private static native void setModelIter_0(long nativeObj, int modelIter);
    private static native void setModelIter_1(long nativeObj);

    // C++:  void cv::ximgproc::RICInterpolator::setRefineModels(bool refineModles = true)
    private static native void setRefineModels_0(long nativeObj, boolean refineModles);
    private static native void setRefineModels_1(long nativeObj);

    // C++:  void cv::ximgproc::RICInterpolator::setSuperpixelMode(int mode = 100)
    private static native void setSuperpixelMode_0(long nativeObj, int mode);
    private static native void setSuperpixelMode_1(long nativeObj);

    // C++:  void cv::ximgproc::RICInterpolator::setSuperpixelNNCnt(int spNN = 150)
    private static native void setSuperpixelNNCnt_0(long nativeObj, int spNN);
    private static native void setSuperpixelNNCnt_1(long nativeObj);

    // C++:  void cv::ximgproc::RICInterpolator::setSuperpixelRuler(float ruler = 15.f)
    private static native void setSuperpixelRuler_0(long nativeObj, float ruler);
    private static native void setSuperpixelRuler_1(long nativeObj);

    // C++:  void cv::ximgproc::RICInterpolator::setSuperpixelSize(int spSize = 15)
    private static native void setSuperpixelSize_0(long nativeObj, int spSize);
    private static native void setSuperpixelSize_1(long nativeObj);

    // C++:  void cv::ximgproc::RICInterpolator::setUseGlobalSmootherFilter(bool use_FGS = true)
    private static native void setUseGlobalSmootherFilter_0(long nativeObj, boolean use_FGS);
    private static native void setUseGlobalSmootherFilter_1(long nativeObj);

    // C++:  void cv::ximgproc::RICInterpolator::setUseVariationalRefinement(bool use_variational_refinement = false)
    private static native void setUseVariationalRefinement_0(long nativeObj, boolean use_variational_refinement);
    private static native void setUseVariationalRefinement_1(long nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
