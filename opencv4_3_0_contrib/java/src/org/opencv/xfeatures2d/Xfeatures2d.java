//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xfeatures2d;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.MatOfDMatch;
import org.opencv.core.MatOfInt;
import org.opencv.core.MatOfKeyPoint;
import org.opencv.core.Size;
import org.opencv.utils.Converters;

// C++: class Xfeatures2d

public class Xfeatures2d {

    //
    // C++:  void cv::xfeatures2d::matchGMS(Size size1, Size size2, vector_KeyPoint keypoints1, vector_KeyPoint keypoints2, vector_DMatch matches1to2, vector_DMatch& matchesGMS, bool withRotation = false, bool withScale = false, double thresholdFactor = 6.0)
    //

    /**
     * GMS (Grid-based Motion Statistics) feature matching strategy described in CITE: Bian2017gms .
     *     @param size1 Input size of image1.
     *     @param size2 Input size of image2.
     *     @param keypoints1 Input keypoints of image1.
     *     @param keypoints2 Input keypoints of image2.
     *     @param matches1to2 Input 1-nearest neighbor matches.
     *     @param matchesGMS Matches returned by the GMS matching strategy.
     *     @param withRotation Take rotation transformation into account.
     *     @param withScale Take scale transformation into account.
     *     @param thresholdFactor The higher, the less matches.
     *     <b>Note:</b>
     *         Since GMS works well when the number of features is large, we recommend to use the ORB feature and set FastThreshold to 0 to get as many as possible features quickly.
     *         If matching results are not satisfying, please add more features. (We use 10000 for images with 640 X 480).
     *         If your images have big rotation and scale changes, please set withRotation or withScale to true.
     */
    public static void matchGMS(Size size1, Size size2, MatOfKeyPoint keypoints1, MatOfKeyPoint keypoints2, MatOfDMatch matches1to2, MatOfDMatch matchesGMS, boolean withRotation, boolean withScale, double thresholdFactor) {
        Mat keypoints1_mat = keypoints1;
        Mat keypoints2_mat = keypoints2;
        Mat matches1to2_mat = matches1to2;
        Mat matchesGMS_mat = matchesGMS;
        matchGMS_0(size1.width, size1.height, size2.width, size2.height, keypoints1_mat.nativeObj, keypoints2_mat.nativeObj, matches1to2_mat.nativeObj, matchesGMS_mat.nativeObj, withRotation, withScale, thresholdFactor);
    }

    /**
     * GMS (Grid-based Motion Statistics) feature matching strategy described in CITE: Bian2017gms .
     *     @param size1 Input size of image1.
     *     @param size2 Input size of image2.
     *     @param keypoints1 Input keypoints of image1.
     *     @param keypoints2 Input keypoints of image2.
     *     @param matches1to2 Input 1-nearest neighbor matches.
     *     @param matchesGMS Matches returned by the GMS matching strategy.
     *     @param withRotation Take rotation transformation into account.
     *     @param withScale Take scale transformation into account.
     *     <b>Note:</b>
     *         Since GMS works well when the number of features is large, we recommend to use the ORB feature and set FastThreshold to 0 to get as many as possible features quickly.
     *         If matching results are not satisfying, please add more features. (We use 10000 for images with 640 X 480).
     *         If your images have big rotation and scale changes, please set withRotation or withScale to true.
     */
    public static void matchGMS(Size size1, Size size2, MatOfKeyPoint keypoints1, MatOfKeyPoint keypoints2, MatOfDMatch matches1to2, MatOfDMatch matchesGMS, boolean withRotation, boolean withScale) {
        Mat keypoints1_mat = keypoints1;
        Mat keypoints2_mat = keypoints2;
        Mat matches1to2_mat = matches1to2;
        Mat matchesGMS_mat = matchesGMS;
        matchGMS_1(size1.width, size1.height, size2.width, size2.height, keypoints1_mat.nativeObj, keypoints2_mat.nativeObj, matches1to2_mat.nativeObj, matchesGMS_mat.nativeObj, withRotation, withScale);
    }

    /**
     * GMS (Grid-based Motion Statistics) feature matching strategy described in CITE: Bian2017gms .
     *     @param size1 Input size of image1.
     *     @param size2 Input size of image2.
     *     @param keypoints1 Input keypoints of image1.
     *     @param keypoints2 Input keypoints of image2.
     *     @param matches1to2 Input 1-nearest neighbor matches.
     *     @param matchesGMS Matches returned by the GMS matching strategy.
     *     @param withRotation Take rotation transformation into account.
     *     <b>Note:</b>
     *         Since GMS works well when the number of features is large, we recommend to use the ORB feature and set FastThreshold to 0 to get as many as possible features quickly.
     *         If matching results are not satisfying, please add more features. (We use 10000 for images with 640 X 480).
     *         If your images have big rotation and scale changes, please set withRotation or withScale to true.
     */
    public static void matchGMS(Size size1, Size size2, MatOfKeyPoint keypoints1, MatOfKeyPoint keypoints2, MatOfDMatch matches1to2, MatOfDMatch matchesGMS, boolean withRotation) {
        Mat keypoints1_mat = keypoints1;
        Mat keypoints2_mat = keypoints2;
        Mat matches1to2_mat = matches1to2;
        Mat matchesGMS_mat = matchesGMS;
        matchGMS_2(size1.width, size1.height, size2.width, size2.height, keypoints1_mat.nativeObj, keypoints2_mat.nativeObj, matches1to2_mat.nativeObj, matchesGMS_mat.nativeObj, withRotation);
    }

    /**
     * GMS (Grid-based Motion Statistics) feature matching strategy described in CITE: Bian2017gms .
     *     @param size1 Input size of image1.
     *     @param size2 Input size of image2.
     *     @param keypoints1 Input keypoints of image1.
     *     @param keypoints2 Input keypoints of image2.
     *     @param matches1to2 Input 1-nearest neighbor matches.
     *     @param matchesGMS Matches returned by the GMS matching strategy.
     *     <b>Note:</b>
     *         Since GMS works well when the number of features is large, we recommend to use the ORB feature and set FastThreshold to 0 to get as many as possible features quickly.
     *         If matching results are not satisfying, please add more features. (We use 10000 for images with 640 X 480).
     *         If your images have big rotation and scale changes, please set withRotation or withScale to true.
     */
    public static void matchGMS(Size size1, Size size2, MatOfKeyPoint keypoints1, MatOfKeyPoint keypoints2, MatOfDMatch matches1to2, MatOfDMatch matchesGMS) {
        Mat keypoints1_mat = keypoints1;
        Mat keypoints2_mat = keypoints2;
        Mat matches1to2_mat = matches1to2;
        Mat matchesGMS_mat = matchesGMS;
        matchGMS_3(size1.width, size1.height, size2.width, size2.height, keypoints1_mat.nativeObj, keypoints2_mat.nativeObj, matches1to2_mat.nativeObj, matchesGMS_mat.nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::matchLOGOS(vector_KeyPoint keypoints1, vector_KeyPoint keypoints2, vector_int nn1, vector_int nn2, vector_DMatch matches1to2)
    //

    /**
     * LOGOS (Local geometric support for high-outlier spatial verification) feature matching strategy described in CITE: Lowry2018LOGOSLG .
     *     @param keypoints1 Input keypoints of image1.
     *     @param keypoints2 Input keypoints of image2.
     *     @param nn1 Index to the closest BoW centroid for each descriptors of image1.
     *     @param nn2 Index to the closest BoW centroid for each descriptors of image2.
     *     @param matches1to2 Matches returned by the LOGOS matching strategy.
     *     <b>Note:</b>
     *         This matching strategy is suitable for features matching against large scale database.
     *         First step consists in constructing the bag-of-words (BoW) from a representative image database.
     *         Image descriptors are then represented by their closest codevector (nearest BoW centroid).
     */
    public static void matchLOGOS(MatOfKeyPoint keypoints1, MatOfKeyPoint keypoints2, MatOfInt nn1, MatOfInt nn2, MatOfDMatch matches1to2) {
        Mat keypoints1_mat = keypoints1;
        Mat keypoints2_mat = keypoints2;
        Mat nn1_mat = nn1;
        Mat nn2_mat = nn2;
        Mat matches1to2_mat = matches1to2;
        matchLOGOS_0(keypoints1_mat.nativeObj, keypoints2_mat.nativeObj, nn1_mat.nativeObj, nn2_mat.nativeObj, matches1to2_mat.nativeObj);
    }




    // C++:  void cv::xfeatures2d::matchGMS(Size size1, Size size2, vector_KeyPoint keypoints1, vector_KeyPoint keypoints2, vector_DMatch matches1to2, vector_DMatch& matchesGMS, bool withRotation = false, bool withScale = false, double thresholdFactor = 6.0)
    private static native void matchGMS_0(double size1_width, double size1_height, double size2_width, double size2_height, long keypoints1_mat_nativeObj, long keypoints2_mat_nativeObj, long matches1to2_mat_nativeObj, long matchesGMS_mat_nativeObj, boolean withRotation, boolean withScale, double thresholdFactor);
    private static native void matchGMS_1(double size1_width, double size1_height, double size2_width, double size2_height, long keypoints1_mat_nativeObj, long keypoints2_mat_nativeObj, long matches1to2_mat_nativeObj, long matchesGMS_mat_nativeObj, boolean withRotation, boolean withScale);
    private static native void matchGMS_2(double size1_width, double size1_height, double size2_width, double size2_height, long keypoints1_mat_nativeObj, long keypoints2_mat_nativeObj, long matches1to2_mat_nativeObj, long matchesGMS_mat_nativeObj, boolean withRotation);
    private static native void matchGMS_3(double size1_width, double size1_height, double size2_width, double size2_height, long keypoints1_mat_nativeObj, long keypoints2_mat_nativeObj, long matches1to2_mat_nativeObj, long matchesGMS_mat_nativeObj);

    // C++:  void cv::xfeatures2d::matchLOGOS(vector_KeyPoint keypoints1, vector_KeyPoint keypoints2, vector_int nn1, vector_int nn2, vector_DMatch matches1to2)
    private static native void matchLOGOS_0(long keypoints1_mat_nativeObj, long keypoints2_mat_nativeObj, long nn1_mat_nativeObj, long nn2_mat_nativeObj, long matches1to2_mat_nativeObj);

}
