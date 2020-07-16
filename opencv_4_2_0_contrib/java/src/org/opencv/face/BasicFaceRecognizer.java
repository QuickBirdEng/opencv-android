//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.face;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.face.FaceRecognizer;
import org.opencv.utils.Converters;

// C++: class BasicFaceRecognizer

public class BasicFaceRecognizer extends FaceRecognizer {

    protected BasicFaceRecognizer(long addr) { super(addr); }

    // internal usage only
    public static BasicFaceRecognizer __fromPtr__(long addr) { return new BasicFaceRecognizer(addr); }

    //
    // C++:  Mat cv::face::BasicFaceRecognizer::getEigenValues()
    //

    public Mat getEigenValues() {
        return new Mat(getEigenValues_0(nativeObj));
    }


    //
    // C++:  Mat cv::face::BasicFaceRecognizer::getEigenVectors()
    //

    public Mat getEigenVectors() {
        return new Mat(getEigenVectors_0(nativeObj));
    }


    //
    // C++:  Mat cv::face::BasicFaceRecognizer::getLabels()
    //

    public Mat getLabels() {
        return new Mat(getLabels_0(nativeObj));
    }


    //
    // C++:  Mat cv::face::BasicFaceRecognizer::getMean()
    //

    public Mat getMean() {
        return new Mat(getMean_0(nativeObj));
    }


    //
    // C++:  double cv::face::BasicFaceRecognizer::getThreshold()
    //

    /**
     * SEE: setThreshold
     * @return automatically generated
     */
    public double getThreshold() {
        return getThreshold_0(nativeObj);
    }


    //
    // C++:  int cv::face::BasicFaceRecognizer::getNumComponents()
    //

    /**
     * SEE: setNumComponents
     * @return automatically generated
     */
    public int getNumComponents() {
        return getNumComponents_0(nativeObj);
    }


    //
    // C++:  vector_Mat cv::face::BasicFaceRecognizer::getProjections()
    //

    public List<Mat> getProjections() {
        List<Mat> retVal = new ArrayList<Mat>();
        Mat retValMat = new Mat(getProjections_0(nativeObj));
        Converters.Mat_to_vector_Mat(retValMat, retVal);
        return retVal;
    }


    //
    // C++:  void cv::face::BasicFaceRecognizer::setNumComponents(int val)
    //

    /**
     *  getNumComponents SEE: getNumComponents
     * @param val automatically generated
     */
    public void setNumComponents(int val) {
        setNumComponents_0(nativeObj, val);
    }


    //
    // C++:  void cv::face::BasicFaceRecognizer::setThreshold(double val)
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



    // C++:  Mat cv::face::BasicFaceRecognizer::getEigenValues()
    private static native long getEigenValues_0(long nativeObj);

    // C++:  Mat cv::face::BasicFaceRecognizer::getEigenVectors()
    private static native long getEigenVectors_0(long nativeObj);

    // C++:  Mat cv::face::BasicFaceRecognizer::getLabels()
    private static native long getLabels_0(long nativeObj);

    // C++:  Mat cv::face::BasicFaceRecognizer::getMean()
    private static native long getMean_0(long nativeObj);

    // C++:  double cv::face::BasicFaceRecognizer::getThreshold()
    private static native double getThreshold_0(long nativeObj);

    // C++:  int cv::face::BasicFaceRecognizer::getNumComponents()
    private static native int getNumComponents_0(long nativeObj);

    // C++:  vector_Mat cv::face::BasicFaceRecognizer::getProjections()
    private static native long getProjections_0(long nativeObj);

    // C++:  void cv::face::BasicFaceRecognizer::setNumComponents(int val)
    private static native void setNumComponents_0(long nativeObj, int val);

    // C++:  void cv::face::BasicFaceRecognizer::setThreshold(double val)
    private static native void setThreshold_0(long nativeObj, double val);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
