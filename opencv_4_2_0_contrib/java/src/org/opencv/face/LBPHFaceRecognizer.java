//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.face;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.face.FaceRecognizer;
import org.opencv.face.LBPHFaceRecognizer;
import org.opencv.utils.Converters;

// C++: class LBPHFaceRecognizer

public class LBPHFaceRecognizer extends FaceRecognizer {

    protected LBPHFaceRecognizer(long addr) { super(addr); }

    // internal usage only
    public static LBPHFaceRecognizer __fromPtr__(long addr) { return new LBPHFaceRecognizer(addr); }

    //
    // C++:  Mat cv::face::LBPHFaceRecognizer::getLabels()
    //

    public Mat getLabels() {
        return new Mat(getLabels_0(nativeObj));
    }


    //
    // C++: static Ptr_LBPHFaceRecognizer cv::face::LBPHFaceRecognizer::create(int radius = 1, int neighbors = 8, int grid_x = 8, int grid_y = 8, double threshold = DBL_MAX)
    //

    /**
     * @param radius The radius used for building the Circular Local Binary Pattern. The greater the
     *     radius, the smoother the image but more spatial information you can get.
     *     @param neighbors The number of sample points to build a Circular Local Binary Pattern from. An
     *     appropriate value is to use {@code 8} sample points. Keep in mind: the more sample points you include,
     *     the higher the computational cost.
     *     @param grid_x The number of cells in the horizontal direction, 8 is a common value used in
     *     publications. The more cells, the finer the grid, the higher the dimensionality of the resulting
     *     feature vector.
     *     @param grid_y The number of cells in the vertical direction, 8 is a common value used in
     *     publications. The more cells, the finer the grid, the higher the dimensionality of the resulting
     *     feature vector.
     *     @param threshold The threshold applied in the prediction. If the distance to the nearest neighbor
     *     is larger than the threshold, this method returns -1.
     *
     *     ### Notes:
     *
     * <ul>
     *   <li>
     *        The Circular Local Binary Patterns (used in training and prediction) expect the data given as
     *         grayscale images, use cvtColor to convert between the color spaces.
     *   </li>
     *   <li>
     *        This model supports updating.
     *   </li>
     * </ul>
     *
     *     ### Model internal data:
     *
     * <ul>
     *   <li>
     *        radius see LBPHFaceRecognizer::create.
     *   </li>
     *   <li>
     *        neighbors see LBPHFaceRecognizer::create.
     *   </li>
     *   <li>
     *        grid_x see LLBPHFaceRecognizer::create.
     *   </li>
     *   <li>
     *        grid_y see LBPHFaceRecognizer::create.
     *   </li>
     *   <li>
     *        threshold see LBPHFaceRecognizer::create.
     *   </li>
     *   <li>
     *        histograms Local Binary Patterns Histograms calculated from the given training data (empty if
     *         none was given).
     *   </li>
     *   <li>
     *        labels Labels corresponding to the calculated Local Binary Patterns Histograms.
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static LBPHFaceRecognizer create(int radius, int neighbors, int grid_x, int grid_y, double threshold) {
        return LBPHFaceRecognizer.__fromPtr__(create_0(radius, neighbors, grid_x, grid_y, threshold));
    }

    /**
     * @param radius The radius used for building the Circular Local Binary Pattern. The greater the
     *     radius, the smoother the image but more spatial information you can get.
     *     @param neighbors The number of sample points to build a Circular Local Binary Pattern from. An
     *     appropriate value is to use {@code 8} sample points. Keep in mind: the more sample points you include,
     *     the higher the computational cost.
     *     @param grid_x The number of cells in the horizontal direction, 8 is a common value used in
     *     publications. The more cells, the finer the grid, the higher the dimensionality of the resulting
     *     feature vector.
     *     @param grid_y The number of cells in the vertical direction, 8 is a common value used in
     *     publications. The more cells, the finer the grid, the higher the dimensionality of the resulting
     *     feature vector.
     *     is larger than the threshold, this method returns -1.
     *
     *     ### Notes:
     *
     * <ul>
     *   <li>
     *        The Circular Local Binary Patterns (used in training and prediction) expect the data given as
     *         grayscale images, use cvtColor to convert between the color spaces.
     *   </li>
     *   <li>
     *        This model supports updating.
     *   </li>
     * </ul>
     *
     *     ### Model internal data:
     *
     * <ul>
     *   <li>
     *        radius see LBPHFaceRecognizer::create.
     *   </li>
     *   <li>
     *        neighbors see LBPHFaceRecognizer::create.
     *   </li>
     *   <li>
     *        grid_x see LLBPHFaceRecognizer::create.
     *   </li>
     *   <li>
     *        grid_y see LBPHFaceRecognizer::create.
     *   </li>
     *   <li>
     *        threshold see LBPHFaceRecognizer::create.
     *   </li>
     *   <li>
     *        histograms Local Binary Patterns Histograms calculated from the given training data (empty if
     *         none was given).
     *   </li>
     *   <li>
     *        labels Labels corresponding to the calculated Local Binary Patterns Histograms.
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static LBPHFaceRecognizer create(int radius, int neighbors, int grid_x, int grid_y) {
        return LBPHFaceRecognizer.__fromPtr__(create_1(radius, neighbors, grid_x, grid_y));
    }

    /**
     * @param radius The radius used for building the Circular Local Binary Pattern. The greater the
     *     radius, the smoother the image but more spatial information you can get.
     *     @param neighbors The number of sample points to build a Circular Local Binary Pattern from. An
     *     appropriate value is to use {@code 8} sample points. Keep in mind: the more sample points you include,
     *     the higher the computational cost.
     *     @param grid_x The number of cells in the horizontal direction, 8 is a common value used in
     *     publications. The more cells, the finer the grid, the higher the dimensionality of the resulting
     *     feature vector.
     *     publications. The more cells, the finer the grid, the higher the dimensionality of the resulting
     *     feature vector.
     *     is larger than the threshold, this method returns -1.
     *
     *     ### Notes:
     *
     * <ul>
     *   <li>
     *        The Circular Local Binary Patterns (used in training and prediction) expect the data given as
     *         grayscale images, use cvtColor to convert between the color spaces.
     *   </li>
     *   <li>
     *        This model supports updating.
     *   </li>
     * </ul>
     *
     *     ### Model internal data:
     *
     * <ul>
     *   <li>
     *        radius see LBPHFaceRecognizer::create.
     *   </li>
     *   <li>
     *        neighbors see LBPHFaceRecognizer::create.
     *   </li>
     *   <li>
     *        grid_x see LLBPHFaceRecognizer::create.
     *   </li>
     *   <li>
     *        grid_y see LBPHFaceRecognizer::create.
     *   </li>
     *   <li>
     *        threshold see LBPHFaceRecognizer::create.
     *   </li>
     *   <li>
     *        histograms Local Binary Patterns Histograms calculated from the given training data (empty if
     *         none was given).
     *   </li>
     *   <li>
     *        labels Labels corresponding to the calculated Local Binary Patterns Histograms.
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static LBPHFaceRecognizer create(int radius, int neighbors, int grid_x) {
        return LBPHFaceRecognizer.__fromPtr__(create_2(radius, neighbors, grid_x));
    }

    /**
     * @param radius The radius used for building the Circular Local Binary Pattern. The greater the
     *     radius, the smoother the image but more spatial information you can get.
     *     @param neighbors The number of sample points to build a Circular Local Binary Pattern from. An
     *     appropriate value is to use {@code 8} sample points. Keep in mind: the more sample points you include,
     *     the higher the computational cost.
     *     publications. The more cells, the finer the grid, the higher the dimensionality of the resulting
     *     feature vector.
     *     publications. The more cells, the finer the grid, the higher the dimensionality of the resulting
     *     feature vector.
     *     is larger than the threshold, this method returns -1.
     *
     *     ### Notes:
     *
     * <ul>
     *   <li>
     *        The Circular Local Binary Patterns (used in training and prediction) expect the data given as
     *         grayscale images, use cvtColor to convert between the color spaces.
     *   </li>
     *   <li>
     *        This model supports updating.
     *   </li>
     * </ul>
     *
     *     ### Model internal data:
     *
     * <ul>
     *   <li>
     *        radius see LBPHFaceRecognizer::create.
     *   </li>
     *   <li>
     *        neighbors see LBPHFaceRecognizer::create.
     *   </li>
     *   <li>
     *        grid_x see LLBPHFaceRecognizer::create.
     *   </li>
     *   <li>
     *        grid_y see LBPHFaceRecognizer::create.
     *   </li>
     *   <li>
     *        threshold see LBPHFaceRecognizer::create.
     *   </li>
     *   <li>
     *        histograms Local Binary Patterns Histograms calculated from the given training data (empty if
     *         none was given).
     *   </li>
     *   <li>
     *        labels Labels corresponding to the calculated Local Binary Patterns Histograms.
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static LBPHFaceRecognizer create(int radius, int neighbors) {
        return LBPHFaceRecognizer.__fromPtr__(create_3(radius, neighbors));
    }

    /**
     * @param radius The radius used for building the Circular Local Binary Pattern. The greater the
     *     radius, the smoother the image but more spatial information you can get.
     *     appropriate value is to use {@code 8} sample points. Keep in mind: the more sample points you include,
     *     the higher the computational cost.
     *     publications. The more cells, the finer the grid, the higher the dimensionality of the resulting
     *     feature vector.
     *     publications. The more cells, the finer the grid, the higher the dimensionality of the resulting
     *     feature vector.
     *     is larger than the threshold, this method returns -1.
     *
     *     ### Notes:
     *
     * <ul>
     *   <li>
     *        The Circular Local Binary Patterns (used in training and prediction) expect the data given as
     *         grayscale images, use cvtColor to convert between the color spaces.
     *   </li>
     *   <li>
     *        This model supports updating.
     *   </li>
     * </ul>
     *
     *     ### Model internal data:
     *
     * <ul>
     *   <li>
     *        radius see LBPHFaceRecognizer::create.
     *   </li>
     *   <li>
     *        neighbors see LBPHFaceRecognizer::create.
     *   </li>
     *   <li>
     *        grid_x see LLBPHFaceRecognizer::create.
     *   </li>
     *   <li>
     *        grid_y see LBPHFaceRecognizer::create.
     *   </li>
     *   <li>
     *        threshold see LBPHFaceRecognizer::create.
     *   </li>
     *   <li>
     *        histograms Local Binary Patterns Histograms calculated from the given training data (empty if
     *         none was given).
     *   </li>
     *   <li>
     *        labels Labels corresponding to the calculated Local Binary Patterns Histograms.
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static LBPHFaceRecognizer create(int radius) {
        return LBPHFaceRecognizer.__fromPtr__(create_4(radius));
    }

    /**
     *     radius, the smoother the image but more spatial information you can get.
     *     appropriate value is to use {@code 8} sample points. Keep in mind: the more sample points you include,
     *     the higher the computational cost.
     *     publications. The more cells, the finer the grid, the higher the dimensionality of the resulting
     *     feature vector.
     *     publications. The more cells, the finer the grid, the higher the dimensionality of the resulting
     *     feature vector.
     *     is larger than the threshold, this method returns -1.
     *
     *     ### Notes:
     *
     * <ul>
     *   <li>
     *        The Circular Local Binary Patterns (used in training and prediction) expect the data given as
     *         grayscale images, use cvtColor to convert between the color spaces.
     *   </li>
     *   <li>
     *        This model supports updating.
     *   </li>
     * </ul>
     *
     *     ### Model internal data:
     *
     * <ul>
     *   <li>
     *        radius see LBPHFaceRecognizer::create.
     *   </li>
     *   <li>
     *        neighbors see LBPHFaceRecognizer::create.
     *   </li>
     *   <li>
     *        grid_x see LLBPHFaceRecognizer::create.
     *   </li>
     *   <li>
     *        grid_y see LBPHFaceRecognizer::create.
     *   </li>
     *   <li>
     *        threshold see LBPHFaceRecognizer::create.
     *   </li>
     *   <li>
     *        histograms Local Binary Patterns Histograms calculated from the given training data (empty if
     *         none was given).
     *   </li>
     *   <li>
     *        labels Labels corresponding to the calculated Local Binary Patterns Histograms.
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static LBPHFaceRecognizer create() {
        return LBPHFaceRecognizer.__fromPtr__(create_5());
    }


    //
    // C++:  double cv::face::LBPHFaceRecognizer::getThreshold()
    //

    /**
     * SEE: setThreshold
     * @return automatically generated
     */
    public double getThreshold() {
        return getThreshold_0(nativeObj);
    }


    //
    // C++:  int cv::face::LBPHFaceRecognizer::getGridX()
    //

    /**
     * SEE: setGridX
     * @return automatically generated
     */
    public int getGridX() {
        return getGridX_0(nativeObj);
    }


    //
    // C++:  int cv::face::LBPHFaceRecognizer::getGridY()
    //

    /**
     * SEE: setGridY
     * @return automatically generated
     */
    public int getGridY() {
        return getGridY_0(nativeObj);
    }


    //
    // C++:  int cv::face::LBPHFaceRecognizer::getNeighbors()
    //

    /**
     * SEE: setNeighbors
     * @return automatically generated
     */
    public int getNeighbors() {
        return getNeighbors_0(nativeObj);
    }


    //
    // C++:  int cv::face::LBPHFaceRecognizer::getRadius()
    //

    /**
     * SEE: setRadius
     * @return automatically generated
     */
    public int getRadius() {
        return getRadius_0(nativeObj);
    }


    //
    // C++:  vector_Mat cv::face::LBPHFaceRecognizer::getHistograms()
    //

    public List<Mat> getHistograms() {
        List<Mat> retVal = new ArrayList<Mat>();
        Mat retValMat = new Mat(getHistograms_0(nativeObj));
        Converters.Mat_to_vector_Mat(retValMat, retVal);
        return retVal;
    }


    //
    // C++:  void cv::face::LBPHFaceRecognizer::setGridX(int val)
    //

    /**
     *  getGridX SEE: getGridX
     * @param val automatically generated
     */
    public void setGridX(int val) {
        setGridX_0(nativeObj, val);
    }


    //
    // C++:  void cv::face::LBPHFaceRecognizer::setGridY(int val)
    //

    /**
     *  getGridY SEE: getGridY
     * @param val automatically generated
     */
    public void setGridY(int val) {
        setGridY_0(nativeObj, val);
    }


    //
    // C++:  void cv::face::LBPHFaceRecognizer::setNeighbors(int val)
    //

    /**
     *  getNeighbors SEE: getNeighbors
     * @param val automatically generated
     */
    public void setNeighbors(int val) {
        setNeighbors_0(nativeObj, val);
    }


    //
    // C++:  void cv::face::LBPHFaceRecognizer::setRadius(int val)
    //

    /**
     *  getRadius SEE: getRadius
     * @param val automatically generated
     */
    public void setRadius(int val) {
        setRadius_0(nativeObj, val);
    }


    //
    // C++:  void cv::face::LBPHFaceRecognizer::setThreshold(double val)
    //

    /**
     *  getThreshold SEE: getThreshold
     * @param val automatically generated
     */
    public void setThreshold(double val) {
        setThreshold_0(nativeObj, val);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  Mat cv::face::LBPHFaceRecognizer::getLabels()
    private static native long getLabels_0(long nativeObj);

    // C++: static Ptr_LBPHFaceRecognizer cv::face::LBPHFaceRecognizer::create(int radius = 1, int neighbors = 8, int grid_x = 8, int grid_y = 8, double threshold = DBL_MAX)
    private static native long create_0(int radius, int neighbors, int grid_x, int grid_y, double threshold);
    private static native long create_1(int radius, int neighbors, int grid_x, int grid_y);
    private static native long create_2(int radius, int neighbors, int grid_x);
    private static native long create_3(int radius, int neighbors);
    private static native long create_4(int radius);
    private static native long create_5();

    // C++:  double cv::face::LBPHFaceRecognizer::getThreshold()
    private static native double getThreshold_0(long nativeObj);

    // C++:  int cv::face::LBPHFaceRecognizer::getGridX()
    private static native int getGridX_0(long nativeObj);

    // C++:  int cv::face::LBPHFaceRecognizer::getGridY()
    private static native int getGridY_0(long nativeObj);

    // C++:  int cv::face::LBPHFaceRecognizer::getNeighbors()
    private static native int getNeighbors_0(long nativeObj);

    // C++:  int cv::face::LBPHFaceRecognizer::getRadius()
    private static native int getRadius_0(long nativeObj);

    // C++:  vector_Mat cv::face::LBPHFaceRecognizer::getHistograms()
    private static native long getHistograms_0(long nativeObj);

    // C++:  void cv::face::LBPHFaceRecognizer::setGridX(int val)
    private static native void setGridX_0(long nativeObj, int val);

    // C++:  void cv::face::LBPHFaceRecognizer::setGridY(int val)
    private static native void setGridY_0(long nativeObj, int val);

    // C++:  void cv::face::LBPHFaceRecognizer::setNeighbors(int val)
    private static native void setNeighbors_0(long nativeObj, int val);

    // C++:  void cv::face::LBPHFaceRecognizer::setRadius(int val)
    private static native void setRadius_0(long nativeObj, int val);

    // C++:  void cv::face::LBPHFaceRecognizer::setThreshold(double val)
    private static native void setThreshold_0(long nativeObj, double val);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
