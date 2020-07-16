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

// C++: class EdgeBoxes
/**
 * Class implementing EdgeBoxes algorithm from CITE: ZitnickECCV14edgeBoxes :
 */
public class EdgeBoxes extends Algorithm {

    protected EdgeBoxes(long addr) { super(addr); }

    // internal usage only
    public static EdgeBoxes __fromPtr__(long addr) { return new EdgeBoxes(addr); }

    //
    // C++:  float cv::ximgproc::EdgeBoxes::getAlpha()
    //

    /**
     * Returns the step size of sliding window search.
     * @return automatically generated
     */
    public float getAlpha() {
        return getAlpha_0(nativeObj);
    }


    //
    // C++:  float cv::ximgproc::EdgeBoxes::getBeta()
    //

    /**
     * Returns the nms threshold for object proposals.
     * @return automatically generated
     */
    public float getBeta() {
        return getBeta_0(nativeObj);
    }


    //
    // C++:  float cv::ximgproc::EdgeBoxes::getClusterMinMag()
    //

    /**
     * Returns the cluster min magnitude.
     * @return automatically generated
     */
    public float getClusterMinMag() {
        return getClusterMinMag_0(nativeObj);
    }


    //
    // C++:  float cv::ximgproc::EdgeBoxes::getEdgeMergeThr()
    //

    /**
     * Returns the edge merge threshold.
     * @return automatically generated
     */
    public float getEdgeMergeThr() {
        return getEdgeMergeThr_0(nativeObj);
    }


    //
    // C++:  float cv::ximgproc::EdgeBoxes::getEdgeMinMag()
    //

    /**
     * Returns the edge min magnitude.
     * @return automatically generated
     */
    public float getEdgeMinMag() {
        return getEdgeMinMag_0(nativeObj);
    }


    //
    // C++:  float cv::ximgproc::EdgeBoxes::getEta()
    //

    /**
     * Returns adaptation rate for nms threshold.
     * @return automatically generated
     */
    public float getEta() {
        return getEta_0(nativeObj);
    }


    //
    // C++:  float cv::ximgproc::EdgeBoxes::getGamma()
    //

    /**
     * Returns the affinity sensitivity.
     * @return automatically generated
     */
    public float getGamma() {
        return getGamma_0(nativeObj);
    }


    //
    // C++:  float cv::ximgproc::EdgeBoxes::getKappa()
    //

    /**
     * Returns the scale sensitivity.
     * @return automatically generated
     */
    public float getKappa() {
        return getKappa_0(nativeObj);
    }


    //
    // C++:  float cv::ximgproc::EdgeBoxes::getMaxAspectRatio()
    //

    /**
     * Returns the max aspect ratio of boxes.
     * @return automatically generated
     */
    public float getMaxAspectRatio() {
        return getMaxAspectRatio_0(nativeObj);
    }


    //
    // C++:  float cv::ximgproc::EdgeBoxes::getMinBoxArea()
    //

    /**
     * Returns the minimum area of boxes.
     * @return automatically generated
     */
    public float getMinBoxArea() {
        return getMinBoxArea_0(nativeObj);
    }


    //
    // C++:  float cv::ximgproc::EdgeBoxes::getMinScore()
    //

    /**
     * Returns the min score of boxes to detect.
     * @return automatically generated
     */
    public float getMinScore() {
        return getMinScore_0(nativeObj);
    }


    //
    // C++:  int cv::ximgproc::EdgeBoxes::getMaxBoxes()
    //

    /**
     * Returns the max number of boxes to detect.
     * @return automatically generated
     */
    public int getMaxBoxes() {
        return getMaxBoxes_0(nativeObj);
    }


    //
    // C++:  void cv::ximgproc::EdgeBoxes::getBoundingBoxes(Mat edge_map, Mat orientation_map, vector_Rect& boxes, Mat& scores = Mat())
    //

    /**
     * Returns array containing proposal boxes.
     *
     *     @param edge_map edge image.
     *     @param orientation_map orientation map.
     *     @param boxes proposal boxes.
     *     @param scores of the proposal boxes, provided a vector of float types.
     */
    public void getBoundingBoxes(Mat edge_map, Mat orientation_map, MatOfRect boxes, Mat scores) {
        Mat boxes_mat = boxes;
        getBoundingBoxes_0(nativeObj, edge_map.nativeObj, orientation_map.nativeObj, boxes_mat.nativeObj, scores.nativeObj);
    }

    /**
     * Returns array containing proposal boxes.
     *
     *     @param edge_map edge image.
     *     @param orientation_map orientation map.
     *     @param boxes proposal boxes.
     */
    public void getBoundingBoxes(Mat edge_map, Mat orientation_map, MatOfRect boxes) {
        Mat boxes_mat = boxes;
        getBoundingBoxes_1(nativeObj, edge_map.nativeObj, orientation_map.nativeObj, boxes_mat.nativeObj);
    }


    //
    // C++:  void cv::ximgproc::EdgeBoxes::setAlpha(float value)
    //

    /**
     * Sets the step size of sliding window search.
     * @param value automatically generated
     */
    public void setAlpha(float value) {
        setAlpha_0(nativeObj, value);
    }


    //
    // C++:  void cv::ximgproc::EdgeBoxes::setBeta(float value)
    //

    /**
     * Sets the nms threshold for object proposals.
     * @param value automatically generated
     */
    public void setBeta(float value) {
        setBeta_0(nativeObj, value);
    }


    //
    // C++:  void cv::ximgproc::EdgeBoxes::setClusterMinMag(float value)
    //

    /**
     * Sets the cluster min magnitude.
     * @param value automatically generated
     */
    public void setClusterMinMag(float value) {
        setClusterMinMag_0(nativeObj, value);
    }


    //
    // C++:  void cv::ximgproc::EdgeBoxes::setEdgeMergeThr(float value)
    //

    /**
     * Sets the edge merge threshold.
     * @param value automatically generated
     */
    public void setEdgeMergeThr(float value) {
        setEdgeMergeThr_0(nativeObj, value);
    }


    //
    // C++:  void cv::ximgproc::EdgeBoxes::setEdgeMinMag(float value)
    //

    /**
     * Sets the edge min magnitude.
     * @param value automatically generated
     */
    public void setEdgeMinMag(float value) {
        setEdgeMinMag_0(nativeObj, value);
    }


    //
    // C++:  void cv::ximgproc::EdgeBoxes::setEta(float value)
    //

    /**
     * Sets the adaptation rate for nms threshold.
     * @param value automatically generated
     */
    public void setEta(float value) {
        setEta_0(nativeObj, value);
    }


    //
    // C++:  void cv::ximgproc::EdgeBoxes::setGamma(float value)
    //

    /**
     * Sets the affinity sensitivity
     * @param value automatically generated
     */
    public void setGamma(float value) {
        setGamma_0(nativeObj, value);
    }


    //
    // C++:  void cv::ximgproc::EdgeBoxes::setKappa(float value)
    //

    /**
     * Sets the scale sensitivity.
     * @param value automatically generated
     */
    public void setKappa(float value) {
        setKappa_0(nativeObj, value);
    }


    //
    // C++:  void cv::ximgproc::EdgeBoxes::setMaxAspectRatio(float value)
    //

    /**
     * Sets the max aspect ratio of boxes.
     * @param value automatically generated
     */
    public void setMaxAspectRatio(float value) {
        setMaxAspectRatio_0(nativeObj, value);
    }


    //
    // C++:  void cv::ximgproc::EdgeBoxes::setMaxBoxes(int value)
    //

    /**
     * Sets max number of boxes to detect.
     * @param value automatically generated
     */
    public void setMaxBoxes(int value) {
        setMaxBoxes_0(nativeObj, value);
    }


    //
    // C++:  void cv::ximgproc::EdgeBoxes::setMinBoxArea(float value)
    //

    /**
     * Sets the minimum area of boxes.
     * @param value automatically generated
     */
    public void setMinBoxArea(float value) {
        setMinBoxArea_0(nativeObj, value);
    }


    //
    // C++:  void cv::ximgproc::EdgeBoxes::setMinScore(float value)
    //

    /**
     * Sets the min score of boxes to detect.
     * @param value automatically generated
     */
    public void setMinScore(float value) {
        setMinScore_0(nativeObj, value);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  float cv::ximgproc::EdgeBoxes::getAlpha()
    private static native float getAlpha_0(long nativeObj);

    // C++:  float cv::ximgproc::EdgeBoxes::getBeta()
    private static native float getBeta_0(long nativeObj);

    // C++:  float cv::ximgproc::EdgeBoxes::getClusterMinMag()
    private static native float getClusterMinMag_0(long nativeObj);

    // C++:  float cv::ximgproc::EdgeBoxes::getEdgeMergeThr()
    private static native float getEdgeMergeThr_0(long nativeObj);

    // C++:  float cv::ximgproc::EdgeBoxes::getEdgeMinMag()
    private static native float getEdgeMinMag_0(long nativeObj);

    // C++:  float cv::ximgproc::EdgeBoxes::getEta()
    private static native float getEta_0(long nativeObj);

    // C++:  float cv::ximgproc::EdgeBoxes::getGamma()
    private static native float getGamma_0(long nativeObj);

    // C++:  float cv::ximgproc::EdgeBoxes::getKappa()
    private static native float getKappa_0(long nativeObj);

    // C++:  float cv::ximgproc::EdgeBoxes::getMaxAspectRatio()
    private static native float getMaxAspectRatio_0(long nativeObj);

    // C++:  float cv::ximgproc::EdgeBoxes::getMinBoxArea()
    private static native float getMinBoxArea_0(long nativeObj);

    // C++:  float cv::ximgproc::EdgeBoxes::getMinScore()
    private static native float getMinScore_0(long nativeObj);

    // C++:  int cv::ximgproc::EdgeBoxes::getMaxBoxes()
    private static native int getMaxBoxes_0(long nativeObj);

    // C++:  void cv::ximgproc::EdgeBoxes::getBoundingBoxes(Mat edge_map, Mat orientation_map, vector_Rect& boxes, Mat& scores = Mat())
    private static native void getBoundingBoxes_0(long nativeObj, long edge_map_nativeObj, long orientation_map_nativeObj, long boxes_mat_nativeObj, long scores_nativeObj);
    private static native void getBoundingBoxes_1(long nativeObj, long edge_map_nativeObj, long orientation_map_nativeObj, long boxes_mat_nativeObj);

    // C++:  void cv::ximgproc::EdgeBoxes::setAlpha(float value)
    private static native void setAlpha_0(long nativeObj, float value);

    // C++:  void cv::ximgproc::EdgeBoxes::setBeta(float value)
    private static native void setBeta_0(long nativeObj, float value);

    // C++:  void cv::ximgproc::EdgeBoxes::setClusterMinMag(float value)
    private static native void setClusterMinMag_0(long nativeObj, float value);

    // C++:  void cv::ximgproc::EdgeBoxes::setEdgeMergeThr(float value)
    private static native void setEdgeMergeThr_0(long nativeObj, float value);

    // C++:  void cv::ximgproc::EdgeBoxes::setEdgeMinMag(float value)
    private static native void setEdgeMinMag_0(long nativeObj, float value);

    // C++:  void cv::ximgproc::EdgeBoxes::setEta(float value)
    private static native void setEta_0(long nativeObj, float value);

    // C++:  void cv::ximgproc::EdgeBoxes::setGamma(float value)
    private static native void setGamma_0(long nativeObj, float value);

    // C++:  void cv::ximgproc::EdgeBoxes::setKappa(float value)
    private static native void setKappa_0(long nativeObj, float value);

    // C++:  void cv::ximgproc::EdgeBoxes::setMaxAspectRatio(float value)
    private static native void setMaxAspectRatio_0(long nativeObj, float value);

    // C++:  void cv::ximgproc::EdgeBoxes::setMaxBoxes(int value)
    private static native void setMaxBoxes_0(long nativeObj, int value);

    // C++:  void cv::ximgproc::EdgeBoxes::setMinBoxArea(float value)
    private static native void setMinBoxArea_0(long nativeObj, float value);

    // C++:  void cv::ximgproc::EdgeBoxes::setMinScore(float value)
    private static native void setMinScore_0(long nativeObj, float value);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
