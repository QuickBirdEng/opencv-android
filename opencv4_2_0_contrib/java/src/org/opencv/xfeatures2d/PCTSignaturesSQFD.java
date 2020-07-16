//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xfeatures2d;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.core.MatOfFloat;
import org.opencv.utils.Converters;
import org.opencv.xfeatures2d.PCTSignaturesSQFD;

// C++: class PCTSignaturesSQFD
/**
 * Class implementing Signature Quadratic Form Distance (SQFD).
 * SEE: Christian Beecks, Merih Seran Uysal, Thomas Seidl.
 * Signature quadratic form distance.
 * In Proceedings of the ACM International Conference on Image and Video Retrieval, pages 438-445.
 * ACM, 2010.
 * CITE: BeecksUS10
 */
public class PCTSignaturesSQFD extends Algorithm {

    protected PCTSignaturesSQFD(long addr) { super(addr); }

    // internal usage only
    public static PCTSignaturesSQFD __fromPtr__(long addr) { return new PCTSignaturesSQFD(addr); }

    //
    // C++: static Ptr_PCTSignaturesSQFD cv::xfeatures2d::PCTSignaturesSQFD::create(int distanceFunction = 3, int similarityFunction = 2, float similarityParameter = 1.0f)
    //

    /**
     * Creates the algorithm instance using selected distance function,
     * similarity function and similarity function parameter.
     * @param distanceFunction Distance function selector. Default: L2
     * Available: L0_25, L0_5, L1, L2, L2SQUARED, L5, L_INFINITY
     * @param similarityFunction Similarity function selector. Default: HEURISTIC
     * Available: MINUS, GAUSSIAN, HEURISTIC
     * @param similarityParameter Parameter of the similarity function.
     * @return automatically generated
     */
    public static PCTSignaturesSQFD create(int distanceFunction, int similarityFunction, float similarityParameter) {
        return PCTSignaturesSQFD.__fromPtr__(create_0(distanceFunction, similarityFunction, similarityParameter));
    }

    /**
     * Creates the algorithm instance using selected distance function,
     * similarity function and similarity function parameter.
     * @param distanceFunction Distance function selector. Default: L2
     * Available: L0_25, L0_5, L1, L2, L2SQUARED, L5, L_INFINITY
     * @param similarityFunction Similarity function selector. Default: HEURISTIC
     * Available: MINUS, GAUSSIAN, HEURISTIC
     * @return automatically generated
     */
    public static PCTSignaturesSQFD create(int distanceFunction, int similarityFunction) {
        return PCTSignaturesSQFD.__fromPtr__(create_1(distanceFunction, similarityFunction));
    }

    /**
     * Creates the algorithm instance using selected distance function,
     * similarity function and similarity function parameter.
     * @param distanceFunction Distance function selector. Default: L2
     * Available: L0_25, L0_5, L1, L2, L2SQUARED, L5, L_INFINITY
     * Available: MINUS, GAUSSIAN, HEURISTIC
     * @return automatically generated
     */
    public static PCTSignaturesSQFD create(int distanceFunction) {
        return PCTSignaturesSQFD.__fromPtr__(create_2(distanceFunction));
    }

    /**
     * Creates the algorithm instance using selected distance function,
     * similarity function and similarity function parameter.
     * Available: L0_25, L0_5, L1, L2, L2SQUARED, L5, L_INFINITY
     * Available: MINUS, GAUSSIAN, HEURISTIC
     * @return automatically generated
     */
    public static PCTSignaturesSQFD create() {
        return PCTSignaturesSQFD.__fromPtr__(create_3());
    }


    //
    // C++:  float cv::xfeatures2d::PCTSignaturesSQFD::computeQuadraticFormDistance(Mat _signature0, Mat _signature1)
    //

    /**
     * Computes Signature Quadratic Form Distance of two signatures.
     * @param _signature0 The first signature.
     * @param _signature1 The second signature.
     * @return automatically generated
     */
    public float computeQuadraticFormDistance(Mat _signature0, Mat _signature1) {
        return computeQuadraticFormDistance_0(nativeObj, _signature0.nativeObj, _signature1.nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignaturesSQFD::computeQuadraticFormDistances(Mat sourceSignature, vector_Mat imageSignatures, vector_float distances)
    //

    /**
     * Computes Signature Quadratic Form Distance between the reference signature
     * and each of the other image signatures.
     * @param sourceSignature The signature to measure distance of other signatures from.
     * @param imageSignatures Vector of signatures to measure distance from the source signature.
     * @param distances Output vector of measured distances.
     */
    public void computeQuadraticFormDistances(Mat sourceSignature, List<Mat> imageSignatures, MatOfFloat distances) {
        Mat imageSignatures_mat = Converters.vector_Mat_to_Mat(imageSignatures);
        Mat distances_mat = distances;
        computeQuadraticFormDistances_0(nativeObj, sourceSignature.nativeObj, imageSignatures_mat.nativeObj, distances_mat.nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_PCTSignaturesSQFD cv::xfeatures2d::PCTSignaturesSQFD::create(int distanceFunction = 3, int similarityFunction = 2, float similarityParameter = 1.0f)
    private static native long create_0(int distanceFunction, int similarityFunction, float similarityParameter);
    private static native long create_1(int distanceFunction, int similarityFunction);
    private static native long create_2(int distanceFunction);
    private static native long create_3();

    // C++:  float cv::xfeatures2d::PCTSignaturesSQFD::computeQuadraticFormDistance(Mat _signature0, Mat _signature1)
    private static native float computeQuadraticFormDistance_0(long nativeObj, long _signature0_nativeObj, long _signature1_nativeObj);

    // C++:  void cv::xfeatures2d::PCTSignaturesSQFD::computeQuadraticFormDistances(Mat sourceSignature, vector_Mat imageSignatures, vector_float distances)
    private static native void computeQuadraticFormDistances_0(long nativeObj, long sourceSignature_nativeObj, long imageSignatures_mat_nativeObj, long distances_mat_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
