//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.aruco;

import java.util.ArrayList;
import java.util.List;
import org.opencv.aruco.Board;
import org.opencv.aruco.CharucoBoard;
import org.opencv.aruco.DetectorParameters;
import org.opencv.aruco.Dictionary;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.core.TermCriteria;
import org.opencv.utils.Converters;

// C++: class Aruco

public class Aruco {

    // C++: enum CornerRefineMethod
    public static final int
            CORNER_REFINE_NONE = 0,
            CORNER_REFINE_SUBPIX = 1,
            CORNER_REFINE_CONTOUR = 2,
            CORNER_REFINE_APRILTAG = 3;


    // C++: enum PREDEFINED_DICTIONARY_NAME
    public static final int
            DICT_4X4_50 = 0,
            DICT_4X4_100 = 0+1,
            DICT_4X4_250 = 0+2,
            DICT_4X4_1000 = 0+3,
            DICT_5X5_50 = 0+4,
            DICT_5X5_100 = 0+5,
            DICT_5X5_250 = 0+6,
            DICT_5X5_1000 = 0+7,
            DICT_6X6_50 = 0+8,
            DICT_6X6_100 = 0+9,
            DICT_6X6_250 = 0+10,
            DICT_6X6_1000 = 0+11,
            DICT_7X7_50 = 0+12,
            DICT_7X7_100 = 0+13,
            DICT_7X7_250 = 0+14,
            DICT_7X7_1000 = 0+15,
            DICT_ARUCO_ORIGINAL = 0+16,
            DICT_APRILTAG_16h5 = 0+17,
            DICT_APRILTAG_25h9 = 0+18,
            DICT_APRILTAG_36h10 = 0+19,
            DICT_APRILTAG_36h11 = 0+20;


    //
    // C++:  Ptr_Dictionary cv::aruco::generateCustomDictionary(int nMarkers, int markerSize, Ptr_Dictionary baseDictionary, int randomSeed = 0)
    //

    /**
     * Generates a new customizable marker dictionary
     *
     * @param nMarkers number of markers in the dictionary
     * @param markerSize number of bits per dimension of each markers
     * @param baseDictionary Include the markers in this dictionary at the beginning (optional)
     * @param randomSeed a user supplied seed for theRNG()
     *
     * This function creates a new dictionary composed by nMarkers markers and each markers composed
     * by markerSize x markerSize bits. If baseDictionary is provided, its markers are directly
     * included and the rest are generated based on them. If the size of baseDictionary is higher
     * than nMarkers, only the first nMarkers in baseDictionary are taken and no new marker is added.
     * @return automatically generated
     */
    public static Dictionary custom_dictionary_from(int nMarkers, int markerSize, Dictionary baseDictionary, int randomSeed) {
        return Dictionary.__fromPtr__(custom_dictionary_from_0(nMarkers, markerSize, baseDictionary.getNativeObjAddr(), randomSeed));
    }

    /**
     * Generates a new customizable marker dictionary
     *
     * @param nMarkers number of markers in the dictionary
     * @param markerSize number of bits per dimension of each markers
     * @param baseDictionary Include the markers in this dictionary at the beginning (optional)
     *
     * This function creates a new dictionary composed by nMarkers markers and each markers composed
     * by markerSize x markerSize bits. If baseDictionary is provided, its markers are directly
     * included and the rest are generated based on them. If the size of baseDictionary is higher
     * than nMarkers, only the first nMarkers in baseDictionary are taken and no new marker is added.
     * @return automatically generated
     */
    public static Dictionary custom_dictionary_from(int nMarkers, int markerSize, Dictionary baseDictionary) {
        return Dictionary.__fromPtr__(custom_dictionary_from_1(nMarkers, markerSize, baseDictionary.getNativeObjAddr()));
    }


    //
    // C++:  Ptr_Dictionary cv::aruco::generateCustomDictionary(int nMarkers, int markerSize, int randomSeed = 0)
    //

    /**
     * SEE: generateCustomDictionary
     * @param nMarkers automatically generated
     * @param markerSize automatically generated
     * @param randomSeed automatically generated
     * @return automatically generated
     */
    public static Dictionary custom_dictionary(int nMarkers, int markerSize, int randomSeed) {
        return Dictionary.__fromPtr__(custom_dictionary_0(nMarkers, markerSize, randomSeed));
    }

    /**
     * SEE: generateCustomDictionary
     * @param nMarkers automatically generated
     * @param markerSize automatically generated
     * @return automatically generated
     */
    public static Dictionary custom_dictionary(int nMarkers, int markerSize) {
        return Dictionary.__fromPtr__(custom_dictionary_1(nMarkers, markerSize));
    }


    //
    // C++:  Ptr_Dictionary cv::aruco::getPredefinedDictionary(int dict)
    //

    /**
     * Returns one of the predefined dictionaries referenced by DICT_*.
     * @param dict automatically generated
     * @return automatically generated
     */
    public static Dictionary getPredefinedDictionary(int dict) {
        return Dictionary.__fromPtr__(getPredefinedDictionary_0(dict));
    }


    //
    // C++:  bool cv::aruco::estimatePoseCharucoBoard(Mat charucoCorners, Mat charucoIds, Ptr_CharucoBoard board, Mat cameraMatrix, Mat distCoeffs, Mat& rvec, Mat& tvec, bool useExtrinsicGuess = false)
    //

    /**
     * Pose estimation for a ChArUco board given some of their corners
     * @param charucoCorners vector of detected charuco corners
     * @param charucoIds list of identifiers for each corner in charucoCorners
     * @param board layout of ChArUco board.
     * @param cameraMatrix input 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\)
     * @param distCoeffs vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     * @param rvec Output vector (e.g. cv::Mat) corresponding to the rotation vector of the board
     * (see cv::Rodrigues).
     * @param tvec Output vector (e.g. cv::Mat) corresponding to the translation vector of the board.
     * @param useExtrinsicGuess defines whether initial guess for \b rvec and \b tvec will be used or not.
     *
     * This function estimates a Charuco board pose from some detected corners.
     * The function checks if the input corners are enough and valid to perform pose estimation.
     * If pose estimation is valid, returns true, else returns false.
     * @return automatically generated
     */
    public static boolean estimatePoseCharucoBoard(Mat charucoCorners, Mat charucoIds, CharucoBoard board, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess) {
        return estimatePoseCharucoBoard_0(charucoCorners.nativeObj, charucoIds.nativeObj, board.getNativeObjAddr(), cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess);
    }

    /**
     * Pose estimation for a ChArUco board given some of their corners
     * @param charucoCorners vector of detected charuco corners
     * @param charucoIds list of identifiers for each corner in charucoCorners
     * @param board layout of ChArUco board.
     * @param cameraMatrix input 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\)
     * @param distCoeffs vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     * @param rvec Output vector (e.g. cv::Mat) corresponding to the rotation vector of the board
     * (see cv::Rodrigues).
     * @param tvec Output vector (e.g. cv::Mat) corresponding to the translation vector of the board.
     *
     * This function estimates a Charuco board pose from some detected corners.
     * The function checks if the input corners are enough and valid to perform pose estimation.
     * If pose estimation is valid, returns true, else returns false.
     * @return automatically generated
     */
    public static boolean estimatePoseCharucoBoard(Mat charucoCorners, Mat charucoIds, CharucoBoard board, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec) {
        return estimatePoseCharucoBoard_1(charucoCorners.nativeObj, charucoIds.nativeObj, board.getNativeObjAddr(), cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj);
    }


    //
    // C++:  double cv::aruco::calibrateCameraAruco(vector_Mat corners, Mat ids, Mat counter, Ptr_Board board, Size imageSize, Mat& cameraMatrix, Mat& distCoeffs, vector_Mat& rvecs, vector_Mat& tvecs, Mat& stdDeviationsIntrinsics, Mat& stdDeviationsExtrinsics, Mat& perViewErrors, int flags = 0, TermCriteria criteria = TermCriteria(TermCriteria::COUNT + TermCriteria::EPS, 30, DBL_EPSILON))
    //

    /**
     * Calibrate a camera using aruco markers
     *
     * @param corners vector of detected marker corners in all frames.
     * The corners should have the same format returned by detectMarkers (see #detectMarkers).
     * @param ids list of identifiers for each marker in corners
     * @param counter number of markers in each frame so that corners and ids can be split
     * @param board Marker Board layout
     * @param imageSize Size of the image used only to initialize the intrinsic camera matrix.
     * @param cameraMatrix Output 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\) . If CV\_CALIB\_USE\_INTRINSIC\_GUESS
     * and/or CV_CALIB_FIX_ASPECT_RATIO are specified, some or all of fx, fy, cx, cy must be
     * initialized before calling the function.
     * @param distCoeffs Output vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     * @param rvecs Output vector of rotation vectors (see Rodrigues ) estimated for each board view
     * (e.g. std::vector&lt;cv::Mat&gt;&gt;). That is, each k-th rotation vector together with the corresponding
     * k-th translation vector (see the next output parameter description) brings the board pattern
     * from the model coordinate space (in which object points are specified) to the world coordinate
     * space, that is, a real position of the board pattern in the k-th pattern view (k=0.. *M* -1).
     * @param tvecs Output vector of translation vectors estimated for each pattern view.
     * @param stdDeviationsIntrinsics Output vector of standard deviations estimated for intrinsic parameters.
     * Order of deviations values:
     * \((f_x, f_y, c_x, c_y, k_1, k_2, p_1, p_2, k_3, k_4, k_5, k_6 , s_1, s_2, s_3,
     * s_4, \tau_x, \tau_y)\) If one of parameters is not estimated, it's deviation is equals to zero.
     * @param stdDeviationsExtrinsics Output vector of standard deviations estimated for extrinsic parameters.
     * Order of deviations values: \((R_1, T_1, \dotsc , R_M, T_M)\) where M is number of pattern views,
     * \(R_i, T_i\) are concatenated 1x3 vectors.
     * @param perViewErrors Output vector of average re-projection errors estimated for each pattern view.
     * @param flags flags Different flags  for the calibration process (see #calibrateCamera for details).
     * @param criteria Termination criteria for the iterative optimization algorithm.
     *
     * This function calibrates a camera using an Aruco Board. The function receives a list of
     * detected markers from several views of the Board. The process is similar to the chessboard
     * calibration in calibrateCamera(). The function returns the final re-projection error.
     * @return automatically generated
     */
    public static double calibrateCameraArucoExtended(List<Mat> corners, Mat ids, Mat counter, Board board, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, Mat stdDeviationsIntrinsics, Mat stdDeviationsExtrinsics, Mat perViewErrors, int flags, TermCriteria criteria) {
        Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        double retVal = calibrateCameraArucoExtended_0(corners_mat.nativeObj, ids.nativeObj, counter.nativeObj, board.getNativeObjAddr(), imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, stdDeviationsIntrinsics.nativeObj, stdDeviationsExtrinsics.nativeObj, perViewErrors.nativeObj, flags, criteria.type, criteria.maxCount, criteria.epsilon);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        tvecs_mat.release();
        return retVal;
    }

    /**
     * Calibrate a camera using aruco markers
     *
     * @param corners vector of detected marker corners in all frames.
     * The corners should have the same format returned by detectMarkers (see #detectMarkers).
     * @param ids list of identifiers for each marker in corners
     * @param counter number of markers in each frame so that corners and ids can be split
     * @param board Marker Board layout
     * @param imageSize Size of the image used only to initialize the intrinsic camera matrix.
     * @param cameraMatrix Output 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\) . If CV\_CALIB\_USE\_INTRINSIC\_GUESS
     * and/or CV_CALIB_FIX_ASPECT_RATIO are specified, some or all of fx, fy, cx, cy must be
     * initialized before calling the function.
     * @param distCoeffs Output vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     * @param rvecs Output vector of rotation vectors (see Rodrigues ) estimated for each board view
     * (e.g. std::vector&lt;cv::Mat&gt;&gt;). That is, each k-th rotation vector together with the corresponding
     * k-th translation vector (see the next output parameter description) brings the board pattern
     * from the model coordinate space (in which object points are specified) to the world coordinate
     * space, that is, a real position of the board pattern in the k-th pattern view (k=0.. *M* -1).
     * @param tvecs Output vector of translation vectors estimated for each pattern view.
     * @param stdDeviationsIntrinsics Output vector of standard deviations estimated for intrinsic parameters.
     * Order of deviations values:
     * \((f_x, f_y, c_x, c_y, k_1, k_2, p_1, p_2, k_3, k_4, k_5, k_6 , s_1, s_2, s_3,
     * s_4, \tau_x, \tau_y)\) If one of parameters is not estimated, it's deviation is equals to zero.
     * @param stdDeviationsExtrinsics Output vector of standard deviations estimated for extrinsic parameters.
     * Order of deviations values: \((R_1, T_1, \dotsc , R_M, T_M)\) where M is number of pattern views,
     * \(R_i, T_i\) are concatenated 1x3 vectors.
     * @param perViewErrors Output vector of average re-projection errors estimated for each pattern view.
     * @param flags flags Different flags  for the calibration process (see #calibrateCamera for details).
     *
     * This function calibrates a camera using an Aruco Board. The function receives a list of
     * detected markers from several views of the Board. The process is similar to the chessboard
     * calibration in calibrateCamera(). The function returns the final re-projection error.
     * @return automatically generated
     */
    public static double calibrateCameraArucoExtended(List<Mat> corners, Mat ids, Mat counter, Board board, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, Mat stdDeviationsIntrinsics, Mat stdDeviationsExtrinsics, Mat perViewErrors, int flags) {
        Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        double retVal = calibrateCameraArucoExtended_1(corners_mat.nativeObj, ids.nativeObj, counter.nativeObj, board.getNativeObjAddr(), imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, stdDeviationsIntrinsics.nativeObj, stdDeviationsExtrinsics.nativeObj, perViewErrors.nativeObj, flags);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        tvecs_mat.release();
        return retVal;
    }

    /**
     * Calibrate a camera using aruco markers
     *
     * @param corners vector of detected marker corners in all frames.
     * The corners should have the same format returned by detectMarkers (see #detectMarkers).
     * @param ids list of identifiers for each marker in corners
     * @param counter number of markers in each frame so that corners and ids can be split
     * @param board Marker Board layout
     * @param imageSize Size of the image used only to initialize the intrinsic camera matrix.
     * @param cameraMatrix Output 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\) . If CV\_CALIB\_USE\_INTRINSIC\_GUESS
     * and/or CV_CALIB_FIX_ASPECT_RATIO are specified, some or all of fx, fy, cx, cy must be
     * initialized before calling the function.
     * @param distCoeffs Output vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     * @param rvecs Output vector of rotation vectors (see Rodrigues ) estimated for each board view
     * (e.g. std::vector&lt;cv::Mat&gt;&gt;). That is, each k-th rotation vector together with the corresponding
     * k-th translation vector (see the next output parameter description) brings the board pattern
     * from the model coordinate space (in which object points are specified) to the world coordinate
     * space, that is, a real position of the board pattern in the k-th pattern view (k=0.. *M* -1).
     * @param tvecs Output vector of translation vectors estimated for each pattern view.
     * @param stdDeviationsIntrinsics Output vector of standard deviations estimated for intrinsic parameters.
     * Order of deviations values:
     * \((f_x, f_y, c_x, c_y, k_1, k_2, p_1, p_2, k_3, k_4, k_5, k_6 , s_1, s_2, s_3,
     * s_4, \tau_x, \tau_y)\) If one of parameters is not estimated, it's deviation is equals to zero.
     * @param stdDeviationsExtrinsics Output vector of standard deviations estimated for extrinsic parameters.
     * Order of deviations values: \((R_1, T_1, \dotsc , R_M, T_M)\) where M is number of pattern views,
     * \(R_i, T_i\) are concatenated 1x3 vectors.
     * @param perViewErrors Output vector of average re-projection errors estimated for each pattern view.
     *
     * This function calibrates a camera using an Aruco Board. The function receives a list of
     * detected markers from several views of the Board. The process is similar to the chessboard
     * calibration in calibrateCamera(). The function returns the final re-projection error.
     * @return automatically generated
     */
    public static double calibrateCameraArucoExtended(List<Mat> corners, Mat ids, Mat counter, Board board, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, Mat stdDeviationsIntrinsics, Mat stdDeviationsExtrinsics, Mat perViewErrors) {
        Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        double retVal = calibrateCameraArucoExtended_2(corners_mat.nativeObj, ids.nativeObj, counter.nativeObj, board.getNativeObjAddr(), imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, stdDeviationsIntrinsics.nativeObj, stdDeviationsExtrinsics.nativeObj, perViewErrors.nativeObj);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        tvecs_mat.release();
        return retVal;
    }


    //
    // C++:  double cv::aruco::calibrateCameraAruco(vector_Mat corners, Mat ids, Mat counter, Ptr_Board board, Size imageSize, Mat& cameraMatrix, Mat& distCoeffs, vector_Mat& rvecs = vector_Mat(), vector_Mat& tvecs = vector_Mat(), int flags = 0, TermCriteria criteria = TermCriteria(TermCriteria::COUNT + TermCriteria::EPS, 30, DBL_EPSILON))
    //

    /**
     * It's the same function as #calibrateCameraAruco but without calibration error estimation.
     * @param corners automatically generated
     * @param ids automatically generated
     * @param counter automatically generated
     * @param board automatically generated
     * @param imageSize automatically generated
     * @param cameraMatrix automatically generated
     * @param distCoeffs automatically generated
     * @param rvecs automatically generated
     * @param tvecs automatically generated
     * @param flags automatically generated
     * @param criteria automatically generated
     * @return automatically generated
     */
    public static double calibrateCameraAruco(List<Mat> corners, Mat ids, Mat counter, Board board, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, int flags, TermCriteria criteria) {
        Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        double retVal = calibrateCameraAruco_0(corners_mat.nativeObj, ids.nativeObj, counter.nativeObj, board.getNativeObjAddr(), imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, flags, criteria.type, criteria.maxCount, criteria.epsilon);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        tvecs_mat.release();
        return retVal;
    }

    /**
     * It's the same function as #calibrateCameraAruco but without calibration error estimation.
     * @param corners automatically generated
     * @param ids automatically generated
     * @param counter automatically generated
     * @param board automatically generated
     * @param imageSize automatically generated
     * @param cameraMatrix automatically generated
     * @param distCoeffs automatically generated
     * @param rvecs automatically generated
     * @param tvecs automatically generated
     * @param flags automatically generated
     * @return automatically generated
     */
    public static double calibrateCameraAruco(List<Mat> corners, Mat ids, Mat counter, Board board, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, int flags) {
        Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        double retVal = calibrateCameraAruco_1(corners_mat.nativeObj, ids.nativeObj, counter.nativeObj, board.getNativeObjAddr(), imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, flags);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        tvecs_mat.release();
        return retVal;
    }

    /**
     * It's the same function as #calibrateCameraAruco but without calibration error estimation.
     * @param corners automatically generated
     * @param ids automatically generated
     * @param counter automatically generated
     * @param board automatically generated
     * @param imageSize automatically generated
     * @param cameraMatrix automatically generated
     * @param distCoeffs automatically generated
     * @param rvecs automatically generated
     * @param tvecs automatically generated
     * @return automatically generated
     */
    public static double calibrateCameraAruco(List<Mat> corners, Mat ids, Mat counter, Board board, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs) {
        Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        double retVal = calibrateCameraAruco_2(corners_mat.nativeObj, ids.nativeObj, counter.nativeObj, board.getNativeObjAddr(), imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        tvecs_mat.release();
        return retVal;
    }

    /**
     * It's the same function as #calibrateCameraAruco but without calibration error estimation.
     * @param corners automatically generated
     * @param ids automatically generated
     * @param counter automatically generated
     * @param board automatically generated
     * @param imageSize automatically generated
     * @param cameraMatrix automatically generated
     * @param distCoeffs automatically generated
     * @param rvecs automatically generated
     * @return automatically generated
     */
    public static double calibrateCameraAruco(List<Mat> corners, Mat ids, Mat counter, Board board, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs) {
        Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
        Mat rvecs_mat = new Mat();
        double retVal = calibrateCameraAruco_3(corners_mat.nativeObj, ids.nativeObj, counter.nativeObj, board.getNativeObjAddr(), imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        return retVal;
    }

    /**
     * It's the same function as #calibrateCameraAruco but without calibration error estimation.
     * @param corners automatically generated
     * @param ids automatically generated
     * @param counter automatically generated
     * @param board automatically generated
     * @param imageSize automatically generated
     * @param cameraMatrix automatically generated
     * @param distCoeffs automatically generated
     * @return automatically generated
     */
    public static double calibrateCameraAruco(List<Mat> corners, Mat ids, Mat counter, Board board, Size imageSize, Mat cameraMatrix, Mat distCoeffs) {
        Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
        return calibrateCameraAruco_4(corners_mat.nativeObj, ids.nativeObj, counter.nativeObj, board.getNativeObjAddr(), imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj);
    }


    //
    // C++:  double cv::aruco::calibrateCameraCharuco(vector_Mat charucoCorners, vector_Mat charucoIds, Ptr_CharucoBoard board, Size imageSize, Mat& cameraMatrix, Mat& distCoeffs, vector_Mat& rvecs, vector_Mat& tvecs, Mat& stdDeviationsIntrinsics, Mat& stdDeviationsExtrinsics, Mat& perViewErrors, int flags = 0, TermCriteria criteria = TermCriteria(TermCriteria::COUNT + TermCriteria::EPS, 30, DBL_EPSILON))
    //

    /**
     * Calibrate a camera using Charuco corners
     *
     * @param charucoCorners vector of detected charuco corners per frame
     * @param charucoIds list of identifiers for each corner in charucoCorners per frame
     * @param board Marker Board layout
     * @param imageSize input image size
     * @param cameraMatrix Output 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\) . If CV\_CALIB\_USE\_INTRINSIC\_GUESS
     * and/or CV_CALIB_FIX_ASPECT_RATIO are specified, some or all of fx, fy, cx, cy must be
     * initialized before calling the function.
     * @param distCoeffs Output vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     * @param rvecs Output vector of rotation vectors (see Rodrigues ) estimated for each board view
     * (e.g. std::vector&lt;cv::Mat&gt;&gt;). That is, each k-th rotation vector together with the corresponding
     * k-th translation vector (see the next output parameter description) brings the board pattern
     * from the model coordinate space (in which object points are specified) to the world coordinate
     * space, that is, a real position of the board pattern in the k-th pattern view (k=0.. *M* -1).
     * @param tvecs Output vector of translation vectors estimated for each pattern view.
     * @param stdDeviationsIntrinsics Output vector of standard deviations estimated for intrinsic parameters.
     * Order of deviations values:
     * \((f_x, f_y, c_x, c_y, k_1, k_2, p_1, p_2, k_3, k_4, k_5, k_6 , s_1, s_2, s_3,
     * s_4, \tau_x, \tau_y)\) If one of parameters is not estimated, it's deviation is equals to zero.
     * @param stdDeviationsExtrinsics Output vector of standard deviations estimated for extrinsic parameters.
     * Order of deviations values: \((R_1, T_1, \dotsc , R_M, T_M)\) where M is number of pattern views,
     * \(R_i, T_i\) are concatenated 1x3 vectors.
     * @param perViewErrors Output vector of average re-projection errors estimated for each pattern view.
     * @param flags flags Different flags  for the calibration process (see #calibrateCamera for details).
     * @param criteria Termination criteria for the iterative optimization algorithm.
     *
     * This function calibrates a camera using a set of corners of a  Charuco Board. The function
     * receives a list of detected corners and its identifiers from several views of the Board.
     * The function returns the final re-projection error.
     * @return automatically generated
     */
    public static double calibrateCameraCharucoExtended(List<Mat> charucoCorners, List<Mat> charucoIds, CharucoBoard board, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, Mat stdDeviationsIntrinsics, Mat stdDeviationsExtrinsics, Mat perViewErrors, int flags, TermCriteria criteria) {
        Mat charucoCorners_mat = Converters.vector_Mat_to_Mat(charucoCorners);
        Mat charucoIds_mat = Converters.vector_Mat_to_Mat(charucoIds);
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        double retVal = calibrateCameraCharucoExtended_0(charucoCorners_mat.nativeObj, charucoIds_mat.nativeObj, board.getNativeObjAddr(), imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, stdDeviationsIntrinsics.nativeObj, stdDeviationsExtrinsics.nativeObj, perViewErrors.nativeObj, flags, criteria.type, criteria.maxCount, criteria.epsilon);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        tvecs_mat.release();
        return retVal;
    }

    /**
     * Calibrate a camera using Charuco corners
     *
     * @param charucoCorners vector of detected charuco corners per frame
     * @param charucoIds list of identifiers for each corner in charucoCorners per frame
     * @param board Marker Board layout
     * @param imageSize input image size
     * @param cameraMatrix Output 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\) . If CV\_CALIB\_USE\_INTRINSIC\_GUESS
     * and/or CV_CALIB_FIX_ASPECT_RATIO are specified, some or all of fx, fy, cx, cy must be
     * initialized before calling the function.
     * @param distCoeffs Output vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     * @param rvecs Output vector of rotation vectors (see Rodrigues ) estimated for each board view
     * (e.g. std::vector&lt;cv::Mat&gt;&gt;). That is, each k-th rotation vector together with the corresponding
     * k-th translation vector (see the next output parameter description) brings the board pattern
     * from the model coordinate space (in which object points are specified) to the world coordinate
     * space, that is, a real position of the board pattern in the k-th pattern view (k=0.. *M* -1).
     * @param tvecs Output vector of translation vectors estimated for each pattern view.
     * @param stdDeviationsIntrinsics Output vector of standard deviations estimated for intrinsic parameters.
     * Order of deviations values:
     * \((f_x, f_y, c_x, c_y, k_1, k_2, p_1, p_2, k_3, k_4, k_5, k_6 , s_1, s_2, s_3,
     * s_4, \tau_x, \tau_y)\) If one of parameters is not estimated, it's deviation is equals to zero.
     * @param stdDeviationsExtrinsics Output vector of standard deviations estimated for extrinsic parameters.
     * Order of deviations values: \((R_1, T_1, \dotsc , R_M, T_M)\) where M is number of pattern views,
     * \(R_i, T_i\) are concatenated 1x3 vectors.
     * @param perViewErrors Output vector of average re-projection errors estimated for each pattern view.
     * @param flags flags Different flags  for the calibration process (see #calibrateCamera for details).
     *
     * This function calibrates a camera using a set of corners of a  Charuco Board. The function
     * receives a list of detected corners and its identifiers from several views of the Board.
     * The function returns the final re-projection error.
     * @return automatically generated
     */
    public static double calibrateCameraCharucoExtended(List<Mat> charucoCorners, List<Mat> charucoIds, CharucoBoard board, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, Mat stdDeviationsIntrinsics, Mat stdDeviationsExtrinsics, Mat perViewErrors, int flags) {
        Mat charucoCorners_mat = Converters.vector_Mat_to_Mat(charucoCorners);
        Mat charucoIds_mat = Converters.vector_Mat_to_Mat(charucoIds);
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        double retVal = calibrateCameraCharucoExtended_1(charucoCorners_mat.nativeObj, charucoIds_mat.nativeObj, board.getNativeObjAddr(), imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, stdDeviationsIntrinsics.nativeObj, stdDeviationsExtrinsics.nativeObj, perViewErrors.nativeObj, flags);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        tvecs_mat.release();
        return retVal;
    }

    /**
     * Calibrate a camera using Charuco corners
     *
     * @param charucoCorners vector of detected charuco corners per frame
     * @param charucoIds list of identifiers for each corner in charucoCorners per frame
     * @param board Marker Board layout
     * @param imageSize input image size
     * @param cameraMatrix Output 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\) . If CV\_CALIB\_USE\_INTRINSIC\_GUESS
     * and/or CV_CALIB_FIX_ASPECT_RATIO are specified, some or all of fx, fy, cx, cy must be
     * initialized before calling the function.
     * @param distCoeffs Output vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     * @param rvecs Output vector of rotation vectors (see Rodrigues ) estimated for each board view
     * (e.g. std::vector&lt;cv::Mat&gt;&gt;). That is, each k-th rotation vector together with the corresponding
     * k-th translation vector (see the next output parameter description) brings the board pattern
     * from the model coordinate space (in which object points are specified) to the world coordinate
     * space, that is, a real position of the board pattern in the k-th pattern view (k=0.. *M* -1).
     * @param tvecs Output vector of translation vectors estimated for each pattern view.
     * @param stdDeviationsIntrinsics Output vector of standard deviations estimated for intrinsic parameters.
     * Order of deviations values:
     * \((f_x, f_y, c_x, c_y, k_1, k_2, p_1, p_2, k_3, k_4, k_5, k_6 , s_1, s_2, s_3,
     * s_4, \tau_x, \tau_y)\) If one of parameters is not estimated, it's deviation is equals to zero.
     * @param stdDeviationsExtrinsics Output vector of standard deviations estimated for extrinsic parameters.
     * Order of deviations values: \((R_1, T_1, \dotsc , R_M, T_M)\) where M is number of pattern views,
     * \(R_i, T_i\) are concatenated 1x3 vectors.
     * @param perViewErrors Output vector of average re-projection errors estimated for each pattern view.
     *
     * This function calibrates a camera using a set of corners of a  Charuco Board. The function
     * receives a list of detected corners and its identifiers from several views of the Board.
     * The function returns the final re-projection error.
     * @return automatically generated
     */
    public static double calibrateCameraCharucoExtended(List<Mat> charucoCorners, List<Mat> charucoIds, CharucoBoard board, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, Mat stdDeviationsIntrinsics, Mat stdDeviationsExtrinsics, Mat perViewErrors) {
        Mat charucoCorners_mat = Converters.vector_Mat_to_Mat(charucoCorners);
        Mat charucoIds_mat = Converters.vector_Mat_to_Mat(charucoIds);
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        double retVal = calibrateCameraCharucoExtended_2(charucoCorners_mat.nativeObj, charucoIds_mat.nativeObj, board.getNativeObjAddr(), imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, stdDeviationsIntrinsics.nativeObj, stdDeviationsExtrinsics.nativeObj, perViewErrors.nativeObj);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        tvecs_mat.release();
        return retVal;
    }


    //
    // C++:  double cv::aruco::calibrateCameraCharuco(vector_Mat charucoCorners, vector_Mat charucoIds, Ptr_CharucoBoard board, Size imageSize, Mat& cameraMatrix, Mat& distCoeffs, vector_Mat& rvecs = vector_Mat(), vector_Mat& tvecs = vector_Mat(), int flags = 0, TermCriteria criteria = TermCriteria(TermCriteria::COUNT + TermCriteria::EPS, 30, DBL_EPSILON))
    //

    /**
     * It's the same function as #calibrateCameraCharuco but without calibration error estimation.
     * @param charucoCorners automatically generated
     * @param charucoIds automatically generated
     * @param board automatically generated
     * @param imageSize automatically generated
     * @param cameraMatrix automatically generated
     * @param distCoeffs automatically generated
     * @param rvecs automatically generated
     * @param tvecs automatically generated
     * @param flags automatically generated
     * @param criteria automatically generated
     * @return automatically generated
     */
    public static double calibrateCameraCharuco(List<Mat> charucoCorners, List<Mat> charucoIds, CharucoBoard board, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, int flags, TermCriteria criteria) {
        Mat charucoCorners_mat = Converters.vector_Mat_to_Mat(charucoCorners);
        Mat charucoIds_mat = Converters.vector_Mat_to_Mat(charucoIds);
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        double retVal = calibrateCameraCharuco_0(charucoCorners_mat.nativeObj, charucoIds_mat.nativeObj, board.getNativeObjAddr(), imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, flags, criteria.type, criteria.maxCount, criteria.epsilon);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        tvecs_mat.release();
        return retVal;
    }

    /**
     * It's the same function as #calibrateCameraCharuco but without calibration error estimation.
     * @param charucoCorners automatically generated
     * @param charucoIds automatically generated
     * @param board automatically generated
     * @param imageSize automatically generated
     * @param cameraMatrix automatically generated
     * @param distCoeffs automatically generated
     * @param rvecs automatically generated
     * @param tvecs automatically generated
     * @param flags automatically generated
     * @return automatically generated
     */
    public static double calibrateCameraCharuco(List<Mat> charucoCorners, List<Mat> charucoIds, CharucoBoard board, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, int flags) {
        Mat charucoCorners_mat = Converters.vector_Mat_to_Mat(charucoCorners);
        Mat charucoIds_mat = Converters.vector_Mat_to_Mat(charucoIds);
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        double retVal = calibrateCameraCharuco_1(charucoCorners_mat.nativeObj, charucoIds_mat.nativeObj, board.getNativeObjAddr(), imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, flags);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        tvecs_mat.release();
        return retVal;
    }

    /**
     * It's the same function as #calibrateCameraCharuco but without calibration error estimation.
     * @param charucoCorners automatically generated
     * @param charucoIds automatically generated
     * @param board automatically generated
     * @param imageSize automatically generated
     * @param cameraMatrix automatically generated
     * @param distCoeffs automatically generated
     * @param rvecs automatically generated
     * @param tvecs automatically generated
     * @return automatically generated
     */
    public static double calibrateCameraCharuco(List<Mat> charucoCorners, List<Mat> charucoIds, CharucoBoard board, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs) {
        Mat charucoCorners_mat = Converters.vector_Mat_to_Mat(charucoCorners);
        Mat charucoIds_mat = Converters.vector_Mat_to_Mat(charucoIds);
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        double retVal = calibrateCameraCharuco_2(charucoCorners_mat.nativeObj, charucoIds_mat.nativeObj, board.getNativeObjAddr(), imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        tvecs_mat.release();
        return retVal;
    }

    /**
     * It's the same function as #calibrateCameraCharuco but without calibration error estimation.
     * @param charucoCorners automatically generated
     * @param charucoIds automatically generated
     * @param board automatically generated
     * @param imageSize automatically generated
     * @param cameraMatrix automatically generated
     * @param distCoeffs automatically generated
     * @param rvecs automatically generated
     * @return automatically generated
     */
    public static double calibrateCameraCharuco(List<Mat> charucoCorners, List<Mat> charucoIds, CharucoBoard board, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs) {
        Mat charucoCorners_mat = Converters.vector_Mat_to_Mat(charucoCorners);
        Mat charucoIds_mat = Converters.vector_Mat_to_Mat(charucoIds);
        Mat rvecs_mat = new Mat();
        double retVal = calibrateCameraCharuco_3(charucoCorners_mat.nativeObj, charucoIds_mat.nativeObj, board.getNativeObjAddr(), imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        return retVal;
    }

    /**
     * It's the same function as #calibrateCameraCharuco but without calibration error estimation.
     * @param charucoCorners automatically generated
     * @param charucoIds automatically generated
     * @param board automatically generated
     * @param imageSize automatically generated
     * @param cameraMatrix automatically generated
     * @param distCoeffs automatically generated
     * @return automatically generated
     */
    public static double calibrateCameraCharuco(List<Mat> charucoCorners, List<Mat> charucoIds, CharucoBoard board, Size imageSize, Mat cameraMatrix, Mat distCoeffs) {
        Mat charucoCorners_mat = Converters.vector_Mat_to_Mat(charucoCorners);
        Mat charucoIds_mat = Converters.vector_Mat_to_Mat(charucoIds);
        return calibrateCameraCharuco_4(charucoCorners_mat.nativeObj, charucoIds_mat.nativeObj, board.getNativeObjAddr(), imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj);
    }


    //
    // C++:  int cv::aruco::estimatePoseBoard(vector_Mat corners, Mat ids, Ptr_Board board, Mat cameraMatrix, Mat distCoeffs, Mat& rvec, Mat& tvec, bool useExtrinsicGuess = false)
    //

    /**
     * Pose estimation for a board of markers
     *
     * @param corners vector of already detected markers corners. For each marker, its four corners
     * are provided, (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ). For N detected markers, the
     * dimensions of this array should be Nx4. The order of the corners should be clockwise.
     * @param ids list of identifiers for each marker in corners
     * @param board layout of markers in the board. The layout is composed by the marker identifiers
     * and the positions of each marker corner in the board reference system.
     * @param cameraMatrix input 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\)
     * @param distCoeffs vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     * @param rvec Output vector (e.g. cv::Mat) corresponding to the rotation vector of the board
     * (see cv::Rodrigues). Used as initial guess if not empty.
     * @param tvec Output vector (e.g. cv::Mat) corresponding to the translation vector of the board.
     * @param useExtrinsicGuess defines whether initial guess for \b rvec and \b tvec will be used or not.
     * Used as initial guess if not empty.
     *
     * This function receives the detected markers and returns the pose of a marker board composed
     * by those markers.
     * A Board of marker has a single world coordinate system which is defined by the board layout.
     * The returned transformation is the one that transforms points from the board coordinate system
     * to the camera coordinate system.
     * Input markers that are not included in the board layout are ignored.
     * The function returns the number of markers from the input employed for the board pose estimation.
     * Note that returning a 0 means the pose has not been estimated.
     * @return automatically generated
     */
    public static int estimatePoseBoard(List<Mat> corners, Mat ids, Board board, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess) {
        Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
        return estimatePoseBoard_0(corners_mat.nativeObj, ids.nativeObj, board.getNativeObjAddr(), cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess);
    }

    /**
     * Pose estimation for a board of markers
     *
     * @param corners vector of already detected markers corners. For each marker, its four corners
     * are provided, (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ). For N detected markers, the
     * dimensions of this array should be Nx4. The order of the corners should be clockwise.
     * @param ids list of identifiers for each marker in corners
     * @param board layout of markers in the board. The layout is composed by the marker identifiers
     * and the positions of each marker corner in the board reference system.
     * @param cameraMatrix input 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\)
     * @param distCoeffs vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     * @param rvec Output vector (e.g. cv::Mat) corresponding to the rotation vector of the board
     * (see cv::Rodrigues). Used as initial guess if not empty.
     * @param tvec Output vector (e.g. cv::Mat) corresponding to the translation vector of the board.
     * Used as initial guess if not empty.
     *
     * This function receives the detected markers and returns the pose of a marker board composed
     * by those markers.
     * A Board of marker has a single world coordinate system which is defined by the board layout.
     * The returned transformation is the one that transforms points from the board coordinate system
     * to the camera coordinate system.
     * Input markers that are not included in the board layout are ignored.
     * The function returns the number of markers from the input employed for the board pose estimation.
     * Note that returning a 0 means the pose has not been estimated.
     * @return automatically generated
     */
    public static int estimatePoseBoard(List<Mat> corners, Mat ids, Board board, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec) {
        Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
        return estimatePoseBoard_1(corners_mat.nativeObj, ids.nativeObj, board.getNativeObjAddr(), cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj);
    }


    //
    // C++:  int cv::aruco::interpolateCornersCharuco(vector_Mat markerCorners, Mat markerIds, Mat image, Ptr_CharucoBoard board, Mat& charucoCorners, Mat& charucoIds, Mat cameraMatrix = Mat(), Mat distCoeffs = Mat(), int minMarkers = 2)
    //

    /**
     * Interpolate position of ChArUco board corners
     * @param markerCorners vector of already detected markers corners. For each marker, its four
     * corners are provided, (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ). For N detected markers, the
     * dimensions of this array should be Nx4. The order of the corners should be clockwise.
     * @param markerIds list of identifiers for each marker in corners
     * @param image input image necesary for corner refinement. Note that markers are not detected and
     * should be sent in corners and ids parameters.
     * @param board layout of ChArUco board.
     * @param charucoCorners interpolated chessboard corners
     * @param charucoIds interpolated chessboard corners identifiers
     * @param cameraMatrix optional 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\)
     * @param distCoeffs optional vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     * @param minMarkers number of adjacent markers that must be detected to return a charuco corner
     *
     * This function receives the detected markers and returns the 2D position of the chessboard corners
     * from a ChArUco board using the detected Aruco markers. If camera parameters are provided,
     * the process is based in an approximated pose estimation, else it is based on local homography.
     * Only visible corners are returned. For each corner, its corresponding identifier is
     * also returned in charucoIds.
     * The function returns the number of interpolated corners.
     * @return automatically generated
     */
    public static int interpolateCornersCharuco(List<Mat> markerCorners, Mat markerIds, Mat image, CharucoBoard board, Mat charucoCorners, Mat charucoIds, Mat cameraMatrix, Mat distCoeffs, int minMarkers) {
        Mat markerCorners_mat = Converters.vector_Mat_to_Mat(markerCorners);
        return interpolateCornersCharuco_0(markerCorners_mat.nativeObj, markerIds.nativeObj, image.nativeObj, board.getNativeObjAddr(), charucoCorners.nativeObj, charucoIds.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, minMarkers);
    }

    /**
     * Interpolate position of ChArUco board corners
     * @param markerCorners vector of already detected markers corners. For each marker, its four
     * corners are provided, (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ). For N detected markers, the
     * dimensions of this array should be Nx4. The order of the corners should be clockwise.
     * @param markerIds list of identifiers for each marker in corners
     * @param image input image necesary for corner refinement. Note that markers are not detected and
     * should be sent in corners and ids parameters.
     * @param board layout of ChArUco board.
     * @param charucoCorners interpolated chessboard corners
     * @param charucoIds interpolated chessboard corners identifiers
     * @param cameraMatrix optional 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\)
     * @param distCoeffs optional vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     *
     * This function receives the detected markers and returns the 2D position of the chessboard corners
     * from a ChArUco board using the detected Aruco markers. If camera parameters are provided,
     * the process is based in an approximated pose estimation, else it is based on local homography.
     * Only visible corners are returned. For each corner, its corresponding identifier is
     * also returned in charucoIds.
     * The function returns the number of interpolated corners.
     * @return automatically generated
     */
    public static int interpolateCornersCharuco(List<Mat> markerCorners, Mat markerIds, Mat image, CharucoBoard board, Mat charucoCorners, Mat charucoIds, Mat cameraMatrix, Mat distCoeffs) {
        Mat markerCorners_mat = Converters.vector_Mat_to_Mat(markerCorners);
        return interpolateCornersCharuco_1(markerCorners_mat.nativeObj, markerIds.nativeObj, image.nativeObj, board.getNativeObjAddr(), charucoCorners.nativeObj, charucoIds.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj);
    }

    /**
     * Interpolate position of ChArUco board corners
     * @param markerCorners vector of already detected markers corners. For each marker, its four
     * corners are provided, (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ). For N detected markers, the
     * dimensions of this array should be Nx4. The order of the corners should be clockwise.
     * @param markerIds list of identifiers for each marker in corners
     * @param image input image necesary for corner refinement. Note that markers are not detected and
     * should be sent in corners and ids parameters.
     * @param board layout of ChArUco board.
     * @param charucoCorners interpolated chessboard corners
     * @param charucoIds interpolated chessboard corners identifiers
     * @param cameraMatrix optional 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\)
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     *
     * This function receives the detected markers and returns the 2D position of the chessboard corners
     * from a ChArUco board using the detected Aruco markers. If camera parameters are provided,
     * the process is based in an approximated pose estimation, else it is based on local homography.
     * Only visible corners are returned. For each corner, its corresponding identifier is
     * also returned in charucoIds.
     * The function returns the number of interpolated corners.
     * @return automatically generated
     */
    public static int interpolateCornersCharuco(List<Mat> markerCorners, Mat markerIds, Mat image, CharucoBoard board, Mat charucoCorners, Mat charucoIds, Mat cameraMatrix) {
        Mat markerCorners_mat = Converters.vector_Mat_to_Mat(markerCorners);
        return interpolateCornersCharuco_2(markerCorners_mat.nativeObj, markerIds.nativeObj, image.nativeObj, board.getNativeObjAddr(), charucoCorners.nativeObj, charucoIds.nativeObj, cameraMatrix.nativeObj);
    }

    /**
     * Interpolate position of ChArUco board corners
     * @param markerCorners vector of already detected markers corners. For each marker, its four
     * corners are provided, (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ). For N detected markers, the
     * dimensions of this array should be Nx4. The order of the corners should be clockwise.
     * @param markerIds list of identifiers for each marker in corners
     * @param image input image necesary for corner refinement. Note that markers are not detected and
     * should be sent in corners and ids parameters.
     * @param board layout of ChArUco board.
     * @param charucoCorners interpolated chessboard corners
     * @param charucoIds interpolated chessboard corners identifiers
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\)
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     *
     * This function receives the detected markers and returns the 2D position of the chessboard corners
     * from a ChArUco board using the detected Aruco markers. If camera parameters are provided,
     * the process is based in an approximated pose estimation, else it is based on local homography.
     * Only visible corners are returned. For each corner, its corresponding identifier is
     * also returned in charucoIds.
     * The function returns the number of interpolated corners.
     * @return automatically generated
     */
    public static int interpolateCornersCharuco(List<Mat> markerCorners, Mat markerIds, Mat image, CharucoBoard board, Mat charucoCorners, Mat charucoIds) {
        Mat markerCorners_mat = Converters.vector_Mat_to_Mat(markerCorners);
        return interpolateCornersCharuco_3(markerCorners_mat.nativeObj, markerIds.nativeObj, image.nativeObj, board.getNativeObjAddr(), charucoCorners.nativeObj, charucoIds.nativeObj);
    }


    //
    // C++:  void cv::aruco::detectCharucoDiamond(Mat image, vector_Mat markerCorners, Mat markerIds, float squareMarkerLengthRate, vector_Mat& diamondCorners, Mat& diamondIds, Mat cameraMatrix = Mat(), Mat distCoeffs = Mat())
    //

    /**
     * Detect ChArUco Diamond markers
     *
     * @param image input image necessary for corner subpixel.
     * @param markerCorners list of detected marker corners from detectMarkers function.
     * @param markerIds list of marker ids in markerCorners.
     * @param squareMarkerLengthRate rate between square and marker length:
     * squareMarkerLengthRate = squareLength/markerLength. The real units are not necessary.
     * @param diamondCorners output list of detected diamond corners (4 corners per diamond). The order
     * is the same than in marker corners: top left, top right, bottom right and bottom left. Similar
     * format than the corners returned by detectMarkers (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ).
     * @param diamondIds ids of the diamonds in diamondCorners. The id of each diamond is in fact of
     * type Vec4i, so each diamond has 4 ids, which are the ids of the aruco markers composing the
     * diamond.
     * @param cameraMatrix Optional camera calibration matrix.
     * @param distCoeffs Optional camera distortion coefficients.
     *
     * This function detects Diamond markers from the previous detected ArUco markers. The diamonds
     * are returned in the diamondCorners and diamondIds parameters. If camera calibration parameters
     * are provided, the diamond search is based on reprojection. If not, diamond search is based on
     * homography. Homography is faster than reprojection but can slightly reduce the detection rate.
     */
    public static void detectCharucoDiamond(Mat image, List<Mat> markerCorners, Mat markerIds, float squareMarkerLengthRate, List<Mat> diamondCorners, Mat diamondIds, Mat cameraMatrix, Mat distCoeffs) {
        Mat markerCorners_mat = Converters.vector_Mat_to_Mat(markerCorners);
        Mat diamondCorners_mat = new Mat();
        detectCharucoDiamond_0(image.nativeObj, markerCorners_mat.nativeObj, markerIds.nativeObj, squareMarkerLengthRate, diamondCorners_mat.nativeObj, diamondIds.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj);
        Converters.Mat_to_vector_Mat(diamondCorners_mat, diamondCorners);
        diamondCorners_mat.release();
    }

    /**
     * Detect ChArUco Diamond markers
     *
     * @param image input image necessary for corner subpixel.
     * @param markerCorners list of detected marker corners from detectMarkers function.
     * @param markerIds list of marker ids in markerCorners.
     * @param squareMarkerLengthRate rate between square and marker length:
     * squareMarkerLengthRate = squareLength/markerLength. The real units are not necessary.
     * @param diamondCorners output list of detected diamond corners (4 corners per diamond). The order
     * is the same than in marker corners: top left, top right, bottom right and bottom left. Similar
     * format than the corners returned by detectMarkers (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ).
     * @param diamondIds ids of the diamonds in diamondCorners. The id of each diamond is in fact of
     * type Vec4i, so each diamond has 4 ids, which are the ids of the aruco markers composing the
     * diamond.
     * @param cameraMatrix Optional camera calibration matrix.
     *
     * This function detects Diamond markers from the previous detected ArUco markers. The diamonds
     * are returned in the diamondCorners and diamondIds parameters. If camera calibration parameters
     * are provided, the diamond search is based on reprojection. If not, diamond search is based on
     * homography. Homography is faster than reprojection but can slightly reduce the detection rate.
     */
    public static void detectCharucoDiamond(Mat image, List<Mat> markerCorners, Mat markerIds, float squareMarkerLengthRate, List<Mat> diamondCorners, Mat diamondIds, Mat cameraMatrix) {
        Mat markerCorners_mat = Converters.vector_Mat_to_Mat(markerCorners);
        Mat diamondCorners_mat = new Mat();
        detectCharucoDiamond_1(image.nativeObj, markerCorners_mat.nativeObj, markerIds.nativeObj, squareMarkerLengthRate, diamondCorners_mat.nativeObj, diamondIds.nativeObj, cameraMatrix.nativeObj);
        Converters.Mat_to_vector_Mat(diamondCorners_mat, diamondCorners);
        diamondCorners_mat.release();
    }

    /**
     * Detect ChArUco Diamond markers
     *
     * @param image input image necessary for corner subpixel.
     * @param markerCorners list of detected marker corners from detectMarkers function.
     * @param markerIds list of marker ids in markerCorners.
     * @param squareMarkerLengthRate rate between square and marker length:
     * squareMarkerLengthRate = squareLength/markerLength. The real units are not necessary.
     * @param diamondCorners output list of detected diamond corners (4 corners per diamond). The order
     * is the same than in marker corners: top left, top right, bottom right and bottom left. Similar
     * format than the corners returned by detectMarkers (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ).
     * @param diamondIds ids of the diamonds in diamondCorners. The id of each diamond is in fact of
     * type Vec4i, so each diamond has 4 ids, which are the ids of the aruco markers composing the
     * diamond.
     *
     * This function detects Diamond markers from the previous detected ArUco markers. The diamonds
     * are returned in the diamondCorners and diamondIds parameters. If camera calibration parameters
     * are provided, the diamond search is based on reprojection. If not, diamond search is based on
     * homography. Homography is faster than reprojection but can slightly reduce the detection rate.
     */
    public static void detectCharucoDiamond(Mat image, List<Mat> markerCorners, Mat markerIds, float squareMarkerLengthRate, List<Mat> diamondCorners, Mat diamondIds) {
        Mat markerCorners_mat = Converters.vector_Mat_to_Mat(markerCorners);
        Mat diamondCorners_mat = new Mat();
        detectCharucoDiamond_2(image.nativeObj, markerCorners_mat.nativeObj, markerIds.nativeObj, squareMarkerLengthRate, diamondCorners_mat.nativeObj, diamondIds.nativeObj);
        Converters.Mat_to_vector_Mat(diamondCorners_mat, diamondCorners);
        diamondCorners_mat.release();
    }


    //
    // C++:  void cv::aruco::detectMarkers(Mat image, Ptr_Dictionary dictionary, vector_Mat& corners, Mat& ids, Ptr_DetectorParameters parameters = DetectorParameters::create(), vector_Mat& rejectedImgPoints = vector_Mat(), Mat cameraMatrix = Mat(), Mat distCoeff = Mat())
    //

    /**
     * Basic marker detection
     *
     * @param image input image
     * @param dictionary indicates the type of markers that will be searched
     * @param corners vector of detected marker corners. For each marker, its four corners
     * are provided, (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ). For N detected markers,
     * the dimensions of this array is Nx4. The order of the corners is clockwise.
     * @param ids vector of identifiers of the detected markers. The identifier is of type int
     * (e.g. std::vector&lt;int&gt;). For N detected markers, the size of ids is also N.
     * The identifiers have the same order than the markers in the imgPoints array.
     * @param parameters marker detection parameters
     * @param rejectedImgPoints contains the imgPoints of those squares whose inner code has not a
     * correct codification. Useful for debugging purposes.
     * @param cameraMatrix optional input 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\)
     * @param distCoeff optional vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     *
     * Performs marker detection in the input image. Only markers included in the specific dictionary
     * are searched. For each detected marker, it returns the 2D position of its corner in the image
     * and its corresponding identifier.
     * Note that this function does not perform pose estimation.
     * SEE: estimatePoseSingleMarkers,  estimatePoseBoard
     *
     */
    public static void detectMarkers(Mat image, Dictionary dictionary, List<Mat> corners, Mat ids, DetectorParameters parameters, List<Mat> rejectedImgPoints, Mat cameraMatrix, Mat distCoeff) {
        Mat corners_mat = new Mat();
        Mat rejectedImgPoints_mat = new Mat();
        detectMarkers_0(image.nativeObj, dictionary.getNativeObjAddr(), corners_mat.nativeObj, ids.nativeObj, parameters.getNativeObjAddr(), rejectedImgPoints_mat.nativeObj, cameraMatrix.nativeObj, distCoeff.nativeObj);
        Converters.Mat_to_vector_Mat(corners_mat, corners);
        corners_mat.release();
        Converters.Mat_to_vector_Mat(rejectedImgPoints_mat, rejectedImgPoints);
        rejectedImgPoints_mat.release();
    }

    /**
     * Basic marker detection
     *
     * @param image input image
     * @param dictionary indicates the type of markers that will be searched
     * @param corners vector of detected marker corners. For each marker, its four corners
     * are provided, (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ). For N detected markers,
     * the dimensions of this array is Nx4. The order of the corners is clockwise.
     * @param ids vector of identifiers of the detected markers. The identifier is of type int
     * (e.g. std::vector&lt;int&gt;). For N detected markers, the size of ids is also N.
     * The identifiers have the same order than the markers in the imgPoints array.
     * @param parameters marker detection parameters
     * @param rejectedImgPoints contains the imgPoints of those squares whose inner code has not a
     * correct codification. Useful for debugging purposes.
     * @param cameraMatrix optional input 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\)
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     *
     * Performs marker detection in the input image. Only markers included in the specific dictionary
     * are searched. For each detected marker, it returns the 2D position of its corner in the image
     * and its corresponding identifier.
     * Note that this function does not perform pose estimation.
     * SEE: estimatePoseSingleMarkers,  estimatePoseBoard
     *
     */
    public static void detectMarkers(Mat image, Dictionary dictionary, List<Mat> corners, Mat ids, DetectorParameters parameters, List<Mat> rejectedImgPoints, Mat cameraMatrix) {
        Mat corners_mat = new Mat();
        Mat rejectedImgPoints_mat = new Mat();
        detectMarkers_1(image.nativeObj, dictionary.getNativeObjAddr(), corners_mat.nativeObj, ids.nativeObj, parameters.getNativeObjAddr(), rejectedImgPoints_mat.nativeObj, cameraMatrix.nativeObj);
        Converters.Mat_to_vector_Mat(corners_mat, corners);
        corners_mat.release();
        Converters.Mat_to_vector_Mat(rejectedImgPoints_mat, rejectedImgPoints);
        rejectedImgPoints_mat.release();
    }

    /**
     * Basic marker detection
     *
     * @param image input image
     * @param dictionary indicates the type of markers that will be searched
     * @param corners vector of detected marker corners. For each marker, its four corners
     * are provided, (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ). For N detected markers,
     * the dimensions of this array is Nx4. The order of the corners is clockwise.
     * @param ids vector of identifiers of the detected markers. The identifier is of type int
     * (e.g. std::vector&lt;int&gt;). For N detected markers, the size of ids is also N.
     * The identifiers have the same order than the markers in the imgPoints array.
     * @param parameters marker detection parameters
     * @param rejectedImgPoints contains the imgPoints of those squares whose inner code has not a
     * correct codification. Useful for debugging purposes.
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\)
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     *
     * Performs marker detection in the input image. Only markers included in the specific dictionary
     * are searched. For each detected marker, it returns the 2D position of its corner in the image
     * and its corresponding identifier.
     * Note that this function does not perform pose estimation.
     * SEE: estimatePoseSingleMarkers,  estimatePoseBoard
     *
     */
    public static void detectMarkers(Mat image, Dictionary dictionary, List<Mat> corners, Mat ids, DetectorParameters parameters, List<Mat> rejectedImgPoints) {
        Mat corners_mat = new Mat();
        Mat rejectedImgPoints_mat = new Mat();
        detectMarkers_2(image.nativeObj, dictionary.getNativeObjAddr(), corners_mat.nativeObj, ids.nativeObj, parameters.getNativeObjAddr(), rejectedImgPoints_mat.nativeObj);
        Converters.Mat_to_vector_Mat(corners_mat, corners);
        corners_mat.release();
        Converters.Mat_to_vector_Mat(rejectedImgPoints_mat, rejectedImgPoints);
        rejectedImgPoints_mat.release();
    }

    /**
     * Basic marker detection
     *
     * @param image input image
     * @param dictionary indicates the type of markers that will be searched
     * @param corners vector of detected marker corners. For each marker, its four corners
     * are provided, (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ). For N detected markers,
     * the dimensions of this array is Nx4. The order of the corners is clockwise.
     * @param ids vector of identifiers of the detected markers. The identifier is of type int
     * (e.g. std::vector&lt;int&gt;). For N detected markers, the size of ids is also N.
     * The identifiers have the same order than the markers in the imgPoints array.
     * @param parameters marker detection parameters
     * correct codification. Useful for debugging purposes.
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\)
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     *
     * Performs marker detection in the input image. Only markers included in the specific dictionary
     * are searched. For each detected marker, it returns the 2D position of its corner in the image
     * and its corresponding identifier.
     * Note that this function does not perform pose estimation.
     * SEE: estimatePoseSingleMarkers,  estimatePoseBoard
     *
     */
    public static void detectMarkers(Mat image, Dictionary dictionary, List<Mat> corners, Mat ids, DetectorParameters parameters) {
        Mat corners_mat = new Mat();
        detectMarkers_3(image.nativeObj, dictionary.getNativeObjAddr(), corners_mat.nativeObj, ids.nativeObj, parameters.getNativeObjAddr());
        Converters.Mat_to_vector_Mat(corners_mat, corners);
        corners_mat.release();
    }

    /**
     * Basic marker detection
     *
     * @param image input image
     * @param dictionary indicates the type of markers that will be searched
     * @param corners vector of detected marker corners. For each marker, its four corners
     * are provided, (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ). For N detected markers,
     * the dimensions of this array is Nx4. The order of the corners is clockwise.
     * @param ids vector of identifiers of the detected markers. The identifier is of type int
     * (e.g. std::vector&lt;int&gt;). For N detected markers, the size of ids is also N.
     * The identifiers have the same order than the markers in the imgPoints array.
     * correct codification. Useful for debugging purposes.
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\)
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     *
     * Performs marker detection in the input image. Only markers included in the specific dictionary
     * are searched. For each detected marker, it returns the 2D position of its corner in the image
     * and its corresponding identifier.
     * Note that this function does not perform pose estimation.
     * SEE: estimatePoseSingleMarkers,  estimatePoseBoard
     *
     */
    public static void detectMarkers(Mat image, Dictionary dictionary, List<Mat> corners, Mat ids) {
        Mat corners_mat = new Mat();
        detectMarkers_4(image.nativeObj, dictionary.getNativeObjAddr(), corners_mat.nativeObj, ids.nativeObj);
        Converters.Mat_to_vector_Mat(corners_mat, corners);
        corners_mat.release();
    }


    //
    // C++:  void cv::aruco::drawAxis(Mat& image, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec, float length)
    //

    /**
     * Draw coordinate system axis from pose estimation
     *
     * @param image input/output image. It must have 1 or 3 channels. The number of channels is not
     * altered.
     * @param cameraMatrix input 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\)
     * @param distCoeffs vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     * @param rvec rotation vector of the coordinate system that will be drawn. (SEE: Rodrigues).
     * @param tvec translation vector of the coordinate system that will be drawn.
     * @param length length of the painted axis in the same unit than tvec (usually in meters)
     *
     * Given the pose estimation of a marker or board, this function draws the axis of the world
     * coordinate system, i.e. the system centered on the marker/board. Useful for debugging purposes.
     *
     * @deprecated use cv::drawFrameAxes
     */
    @Deprecated
    public static void drawAxis(Mat image, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec, float length) {
        drawAxis_0(image.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj, length);
    }


    //
    // C++:  void cv::aruco::drawDetectedCornersCharuco(Mat& image, Mat charucoCorners, Mat charucoIds = Mat(), Scalar cornerColor = Scalar(255, 0, 0))
    //

    /**
     * Draws a set of Charuco corners
     * @param image input/output image. It must have 1 or 3 channels. The number of channels is not
     * altered.
     * @param charucoCorners vector of detected charuco corners
     * @param charucoIds list of identifiers for each corner in charucoCorners
     * @param cornerColor color of the square surrounding each corner
     *
     * This function draws a set of detected Charuco corners. If identifiers vector is provided, it also
     * draws the id of each corner.
     */
    public static void drawDetectedCornersCharuco(Mat image, Mat charucoCorners, Mat charucoIds, Scalar cornerColor) {
        drawDetectedCornersCharuco_0(image.nativeObj, charucoCorners.nativeObj, charucoIds.nativeObj, cornerColor.val[0], cornerColor.val[1], cornerColor.val[2], cornerColor.val[3]);
    }

    /**
     * Draws a set of Charuco corners
     * @param image input/output image. It must have 1 or 3 channels. The number of channels is not
     * altered.
     * @param charucoCorners vector of detected charuco corners
     * @param charucoIds list of identifiers for each corner in charucoCorners
     *
     * This function draws a set of detected Charuco corners. If identifiers vector is provided, it also
     * draws the id of each corner.
     */
    public static void drawDetectedCornersCharuco(Mat image, Mat charucoCorners, Mat charucoIds) {
        drawDetectedCornersCharuco_1(image.nativeObj, charucoCorners.nativeObj, charucoIds.nativeObj);
    }

    /**
     * Draws a set of Charuco corners
     * @param image input/output image. It must have 1 or 3 channels. The number of channels is not
     * altered.
     * @param charucoCorners vector of detected charuco corners
     *
     * This function draws a set of detected Charuco corners. If identifiers vector is provided, it also
     * draws the id of each corner.
     */
    public static void drawDetectedCornersCharuco(Mat image, Mat charucoCorners) {
        drawDetectedCornersCharuco_2(image.nativeObj, charucoCorners.nativeObj);
    }


    //
    // C++:  void cv::aruco::drawDetectedDiamonds(Mat& image, vector_Mat diamondCorners, Mat diamondIds = Mat(), Scalar borderColor = Scalar(0, 0, 255))
    //

    /**
     * Draw a set of detected ChArUco Diamond markers
     *
     * @param image input/output image. It must have 1 or 3 channels. The number of channels is not
     * altered.
     * @param diamondCorners positions of diamond corners in the same format returned by
     * detectCharucoDiamond(). (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ). For N detected markers,
     * the dimensions of this array should be Nx4. The order of the corners should be clockwise.
     * @param diamondIds vector of identifiers for diamonds in diamondCorners, in the same format
     * returned by detectCharucoDiamond() (e.g. std::vector&lt;Vec4i&gt;).
     * Optional, if not provided, ids are not painted.
     * @param borderColor color of marker borders. Rest of colors (text color and first corner color)
     * are calculated based on this one.
     *
     * Given an array of detected diamonds, this functions draws them in the image. The marker borders
     * are painted and the markers identifiers if provided.
     * Useful for debugging purposes.
     */
    public static void drawDetectedDiamonds(Mat image, List<Mat> diamondCorners, Mat diamondIds, Scalar borderColor) {
        Mat diamondCorners_mat = Converters.vector_Mat_to_Mat(diamondCorners);
        drawDetectedDiamonds_0(image.nativeObj, diamondCorners_mat.nativeObj, diamondIds.nativeObj, borderColor.val[0], borderColor.val[1], borderColor.val[2], borderColor.val[3]);
    }

    /**
     * Draw a set of detected ChArUco Diamond markers
     *
     * @param image input/output image. It must have 1 or 3 channels. The number of channels is not
     * altered.
     * @param diamondCorners positions of diamond corners in the same format returned by
     * detectCharucoDiamond(). (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ). For N detected markers,
     * the dimensions of this array should be Nx4. The order of the corners should be clockwise.
     * @param diamondIds vector of identifiers for diamonds in diamondCorners, in the same format
     * returned by detectCharucoDiamond() (e.g. std::vector&lt;Vec4i&gt;).
     * Optional, if not provided, ids are not painted.
     * are calculated based on this one.
     *
     * Given an array of detected diamonds, this functions draws them in the image. The marker borders
     * are painted and the markers identifiers if provided.
     * Useful for debugging purposes.
     */
    public static void drawDetectedDiamonds(Mat image, List<Mat> diamondCorners, Mat diamondIds) {
        Mat diamondCorners_mat = Converters.vector_Mat_to_Mat(diamondCorners);
        drawDetectedDiamonds_1(image.nativeObj, diamondCorners_mat.nativeObj, diamondIds.nativeObj);
    }

    /**
     * Draw a set of detected ChArUco Diamond markers
     *
     * @param image input/output image. It must have 1 or 3 channels. The number of channels is not
     * altered.
     * @param diamondCorners positions of diamond corners in the same format returned by
     * detectCharucoDiamond(). (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ). For N detected markers,
     * the dimensions of this array should be Nx4. The order of the corners should be clockwise.
     * returned by detectCharucoDiamond() (e.g. std::vector&lt;Vec4i&gt;).
     * Optional, if not provided, ids are not painted.
     * are calculated based on this one.
     *
     * Given an array of detected diamonds, this functions draws them in the image. The marker borders
     * are painted and the markers identifiers if provided.
     * Useful for debugging purposes.
     */
    public static void drawDetectedDiamonds(Mat image, List<Mat> diamondCorners) {
        Mat diamondCorners_mat = Converters.vector_Mat_to_Mat(diamondCorners);
        drawDetectedDiamonds_2(image.nativeObj, diamondCorners_mat.nativeObj);
    }


    //
    // C++:  void cv::aruco::drawDetectedMarkers(Mat& image, vector_Mat corners, Mat ids = Mat(), Scalar borderColor = Scalar(0, 255, 0))
    //

    /**
     * Draw detected markers in image
     *
     * @param image input/output image. It must have 1 or 3 channels. The number of channels is not
     * altered.
     * @param corners positions of marker corners on input image.
     * (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ). For N detected markers, the dimensions of
     * this array should be Nx4. The order of the corners should be clockwise.
     * @param ids vector of identifiers for markers in markersCorners .
     * Optional, if not provided, ids are not painted.
     * @param borderColor color of marker borders. Rest of colors (text color and first corner color)
     * are calculated based on this one to improve visualization.
     *
     * Given an array of detected marker corners and its corresponding ids, this functions draws
     * the markers in the image. The marker borders are painted and the markers identifiers if provided.
     * Useful for debugging purposes.
     */
    public static void drawDetectedMarkers(Mat image, List<Mat> corners, Mat ids, Scalar borderColor) {
        Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
        drawDetectedMarkers_0(image.nativeObj, corners_mat.nativeObj, ids.nativeObj, borderColor.val[0], borderColor.val[1], borderColor.val[2], borderColor.val[3]);
    }

    /**
     * Draw detected markers in image
     *
     * @param image input/output image. It must have 1 or 3 channels. The number of channels is not
     * altered.
     * @param corners positions of marker corners on input image.
     * (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ). For N detected markers, the dimensions of
     * this array should be Nx4. The order of the corners should be clockwise.
     * @param ids vector of identifiers for markers in markersCorners .
     * Optional, if not provided, ids are not painted.
     * are calculated based on this one to improve visualization.
     *
     * Given an array of detected marker corners and its corresponding ids, this functions draws
     * the markers in the image. The marker borders are painted and the markers identifiers if provided.
     * Useful for debugging purposes.
     */
    public static void drawDetectedMarkers(Mat image, List<Mat> corners, Mat ids) {
        Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
        drawDetectedMarkers_1(image.nativeObj, corners_mat.nativeObj, ids.nativeObj);
    }

    /**
     * Draw detected markers in image
     *
     * @param image input/output image. It must have 1 or 3 channels. The number of channels is not
     * altered.
     * @param corners positions of marker corners on input image.
     * (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ). For N detected markers, the dimensions of
     * this array should be Nx4. The order of the corners should be clockwise.
     * Optional, if not provided, ids are not painted.
     * are calculated based on this one to improve visualization.
     *
     * Given an array of detected marker corners and its corresponding ids, this functions draws
     * the markers in the image. The marker borders are painted and the markers identifiers if provided.
     * Useful for debugging purposes.
     */
    public static void drawDetectedMarkers(Mat image, List<Mat> corners) {
        Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
        drawDetectedMarkers_2(image.nativeObj, corners_mat.nativeObj);
    }


    //
    // C++:  void cv::aruco::drawMarker(Ptr_Dictionary dictionary, int id, int sidePixels, Mat& img, int borderBits = 1)
    //

    /**
     * Draw a canonical marker image
     *
     * @param dictionary dictionary of markers indicating the type of markers
     * @param id identifier of the marker that will be returned. It has to be a valid id
     * in the specified dictionary.
     * @param sidePixels size of the image in pixels
     * @param img output image with the marker
     * @param borderBits width of the marker border.
     *
     * This function returns a marker image in its canonical form (i.e. ready to be printed)
     */
    public static void drawMarker(Dictionary dictionary, int id, int sidePixels, Mat img, int borderBits) {
        drawMarker_0(dictionary.getNativeObjAddr(), id, sidePixels, img.nativeObj, borderBits);
    }

    /**
     * Draw a canonical marker image
     *
     * @param dictionary dictionary of markers indicating the type of markers
     * @param id identifier of the marker that will be returned. It has to be a valid id
     * in the specified dictionary.
     * @param sidePixels size of the image in pixels
     * @param img output image with the marker
     *
     * This function returns a marker image in its canonical form (i.e. ready to be printed)
     */
    public static void drawMarker(Dictionary dictionary, int id, int sidePixels, Mat img) {
        drawMarker_1(dictionary.getNativeObjAddr(), id, sidePixels, img.nativeObj);
    }


    //
    // C++:  void cv::aruco::drawPlanarBoard(Ptr_Board board, Size outSize, Mat& img, int marginSize = 0, int borderBits = 1)
    //

    /**
     * Draw a planar board
     * SEE: _drawPlanarBoardImpl
     *
     * @param board layout of the board that will be drawn. The board should be planar,
     * z coordinate is ignored
     * @param outSize size of the output image in pixels.
     * @param img output image with the board. The size of this image will be outSize
     * and the board will be on the center, keeping the board proportions.
     * @param marginSize minimum margins (in pixels) of the board in the output image
     * @param borderBits width of the marker borders.
     *
     * This function return the image of a planar board, ready to be printed. It assumes
     * the Board layout specified is planar by ignoring the z coordinates of the object points.
     */
    public static void drawPlanarBoard(Board board, Size outSize, Mat img, int marginSize, int borderBits) {
        drawPlanarBoard_0(board.getNativeObjAddr(), outSize.width, outSize.height, img.nativeObj, marginSize, borderBits);
    }

    /**
     * Draw a planar board
     * SEE: _drawPlanarBoardImpl
     *
     * @param board layout of the board that will be drawn. The board should be planar,
     * z coordinate is ignored
     * @param outSize size of the output image in pixels.
     * @param img output image with the board. The size of this image will be outSize
     * and the board will be on the center, keeping the board proportions.
     * @param marginSize minimum margins (in pixels) of the board in the output image
     *
     * This function return the image of a planar board, ready to be printed. It assumes
     * the Board layout specified is planar by ignoring the z coordinates of the object points.
     */
    public static void drawPlanarBoard(Board board, Size outSize, Mat img, int marginSize) {
        drawPlanarBoard_1(board.getNativeObjAddr(), outSize.width, outSize.height, img.nativeObj, marginSize);
    }

    /**
     * Draw a planar board
     * SEE: _drawPlanarBoardImpl
     *
     * @param board layout of the board that will be drawn. The board should be planar,
     * z coordinate is ignored
     * @param outSize size of the output image in pixels.
     * @param img output image with the board. The size of this image will be outSize
     * and the board will be on the center, keeping the board proportions.
     *
     * This function return the image of a planar board, ready to be printed. It assumes
     * the Board layout specified is planar by ignoring the z coordinates of the object points.
     */
    public static void drawPlanarBoard(Board board, Size outSize, Mat img) {
        drawPlanarBoard_2(board.getNativeObjAddr(), outSize.width, outSize.height, img.nativeObj);
    }


    //
    // C++:  void cv::aruco::estimatePoseSingleMarkers(vector_Mat corners, float markerLength, Mat cameraMatrix, Mat distCoeffs, Mat& rvecs, Mat& tvecs, Mat& _objPoints = Mat())
    //

    /**
     * Pose estimation for single markers
     *
     * @param corners vector of already detected markers corners. For each marker, its four corners
     * are provided, (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ). For N detected markers,
     * the dimensions of this array should be Nx4. The order of the corners should be clockwise.
     * SEE: detectMarkers
     * @param markerLength the length of the markers' side. The returning translation vectors will
     * be in the same unit. Normally, unit is meters.
     * @param cameraMatrix input 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\)
     * @param distCoeffs vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     * @param rvecs array of output rotation vectors (SEE: Rodrigues) (e.g. std::vector&lt;cv::Vec3d&gt;).
     * Each element in rvecs corresponds to the specific marker in imgPoints.
     * @param tvecs array of output translation vectors (e.g. std::vector&lt;cv::Vec3d&gt;).
     * Each element in tvecs corresponds to the specific marker in imgPoints.
     * @param _objPoints array of object points of all the marker corners
     *
     * This function receives the detected markers and returns their pose estimation respect to
     * the camera individually. So for each marker, one rotation and translation vector is returned.
     * The returned transformation is the one that transforms points from each marker coordinate system
     * to the camera coordinate system.
     * The marker corrdinate system is centered on the middle of the marker, with the Z axis
     * perpendicular to the marker plane.
     * The coordinates of the four corners of the marker in its own coordinate system are:
     * (-markerLength/2, markerLength/2, 0), (markerLength/2, markerLength/2, 0),
     * (markerLength/2, -markerLength/2, 0), (-markerLength/2, -markerLength/2, 0)
     */
    public static void estimatePoseSingleMarkers(List<Mat> corners, float markerLength, Mat cameraMatrix, Mat distCoeffs, Mat rvecs, Mat tvecs, Mat _objPoints) {
        Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
        estimatePoseSingleMarkers_0(corners_mat.nativeObj, markerLength, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs.nativeObj, tvecs.nativeObj, _objPoints.nativeObj);
    }

    /**
     * Pose estimation for single markers
     *
     * @param corners vector of already detected markers corners. For each marker, its four corners
     * are provided, (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ). For N detected markers,
     * the dimensions of this array should be Nx4. The order of the corners should be clockwise.
     * SEE: detectMarkers
     * @param markerLength the length of the markers' side. The returning translation vectors will
     * be in the same unit. Normally, unit is meters.
     * @param cameraMatrix input 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\)
     * @param distCoeffs vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     * @param rvecs array of output rotation vectors (SEE: Rodrigues) (e.g. std::vector&lt;cv::Vec3d&gt;).
     * Each element in rvecs corresponds to the specific marker in imgPoints.
     * @param tvecs array of output translation vectors (e.g. std::vector&lt;cv::Vec3d&gt;).
     * Each element in tvecs corresponds to the specific marker in imgPoints.
     *
     * This function receives the detected markers and returns their pose estimation respect to
     * the camera individually. So for each marker, one rotation and translation vector is returned.
     * The returned transformation is the one that transforms points from each marker coordinate system
     * to the camera coordinate system.
     * The marker corrdinate system is centered on the middle of the marker, with the Z axis
     * perpendicular to the marker plane.
     * The coordinates of the four corners of the marker in its own coordinate system are:
     * (-markerLength/2, markerLength/2, 0), (markerLength/2, markerLength/2, 0),
     * (markerLength/2, -markerLength/2, 0), (-markerLength/2, -markerLength/2, 0)
     */
    public static void estimatePoseSingleMarkers(List<Mat> corners, float markerLength, Mat cameraMatrix, Mat distCoeffs, Mat rvecs, Mat tvecs) {
        Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
        estimatePoseSingleMarkers_1(corners_mat.nativeObj, markerLength, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs.nativeObj, tvecs.nativeObj);
    }


    //
    // C++:  void cv::aruco::getBoardObjectAndImagePoints(Ptr_Board board, vector_Mat detectedCorners, Mat detectedIds, Mat& objPoints, Mat& imgPoints)
    //

    /**
     * Given a board configuration and a set of detected markers, returns the corresponding
     * image points and object points to call solvePnP
     *
     * @param board Marker board layout.
     * @param detectedCorners List of detected marker corners of the board.
     * @param detectedIds List of identifiers for each marker.
     * @param objPoints Vector of vectors of board marker points in the board coordinate space.
     * @param imgPoints Vector of vectors of the projections of board marker corner points.
     */
    public static void getBoardObjectAndImagePoints(Board board, List<Mat> detectedCorners, Mat detectedIds, Mat objPoints, Mat imgPoints) {
        Mat detectedCorners_mat = Converters.vector_Mat_to_Mat(detectedCorners);
        getBoardObjectAndImagePoints_0(board.getNativeObjAddr(), detectedCorners_mat.nativeObj, detectedIds.nativeObj, objPoints.nativeObj, imgPoints.nativeObj);
    }


    //
    // C++:  void cv::aruco::refineDetectedMarkers(Mat image, Ptr_Board board, vector_Mat& detectedCorners, Mat& detectedIds, vector_Mat& rejectedCorners, Mat cameraMatrix = Mat(), Mat distCoeffs = Mat(), float minRepDistance = 10.f, float errorCorrectionRate = 3.f, bool checkAllOrders = true, Mat& recoveredIdxs = Mat(), Ptr_DetectorParameters parameters = DetectorParameters::create())
    //

    /**
     * Refind not detected markers based on the already detected and the board layout
     *
     * @param image input image
     * @param board layout of markers in the board.
     * @param detectedCorners vector of already detected marker corners.
     * @param detectedIds vector of already detected marker identifiers.
     * @param rejectedCorners vector of rejected candidates during the marker detection process.
     * @param cameraMatrix optional input 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\)
     * @param distCoeffs optional vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     * @param minRepDistance minimum distance between the corners of the rejected candidate and the
     * reprojected marker in order to consider it as a correspondence.
     * @param errorCorrectionRate rate of allowed erroneous bits respect to the error correction
     * capability of the used dictionary. -1 ignores the error correction step.
     * @param checkAllOrders Consider the four posible corner orders in the rejectedCorners array.
     * If it set to false, only the provided corner order is considered (default true).
     * @param recoveredIdxs Optional array to returns the indexes of the recovered candidates in the
     * original rejectedCorners array.
     * @param parameters marker detection parameters
     *
     * This function tries to find markers that were not detected in the basic detecMarkers function.
     * First, based on the current detected marker and the board layout, the function interpolates
     * the position of the missing markers. Then it tries to find correspondence between the reprojected
     * markers and the rejected candidates based on the minRepDistance and errorCorrectionRate
     * parameters.
     * If camera parameters and distortion coefficients are provided, missing markers are reprojected
     * using projectPoint function. If not, missing marker projections are interpolated using global
     * homography, and all the marker corners in the board must have the same Z coordinate.
     */
    public static void refineDetectedMarkers(Mat image, Board board, List<Mat> detectedCorners, Mat detectedIds, List<Mat> rejectedCorners, Mat cameraMatrix, Mat distCoeffs, float minRepDistance, float errorCorrectionRate, boolean checkAllOrders, Mat recoveredIdxs, DetectorParameters parameters) {
        Mat detectedCorners_mat = Converters.vector_Mat_to_Mat(detectedCorners);
        Mat rejectedCorners_mat = Converters.vector_Mat_to_Mat(rejectedCorners);
        refineDetectedMarkers_0(image.nativeObj, board.getNativeObjAddr(), detectedCorners_mat.nativeObj, detectedIds.nativeObj, rejectedCorners_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, minRepDistance, errorCorrectionRate, checkAllOrders, recoveredIdxs.nativeObj, parameters.getNativeObjAddr());
        Converters.Mat_to_vector_Mat(detectedCorners_mat, detectedCorners);
        detectedCorners_mat.release();
        Converters.Mat_to_vector_Mat(rejectedCorners_mat, rejectedCorners);
        rejectedCorners_mat.release();
    }

    /**
     * Refind not detected markers based on the already detected and the board layout
     *
     * @param image input image
     * @param board layout of markers in the board.
     * @param detectedCorners vector of already detected marker corners.
     * @param detectedIds vector of already detected marker identifiers.
     * @param rejectedCorners vector of rejected candidates during the marker detection process.
     * @param cameraMatrix optional input 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\)
     * @param distCoeffs optional vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     * @param minRepDistance minimum distance between the corners of the rejected candidate and the
     * reprojected marker in order to consider it as a correspondence.
     * @param errorCorrectionRate rate of allowed erroneous bits respect to the error correction
     * capability of the used dictionary. -1 ignores the error correction step.
     * @param checkAllOrders Consider the four posible corner orders in the rejectedCorners array.
     * If it set to false, only the provided corner order is considered (default true).
     * @param recoveredIdxs Optional array to returns the indexes of the recovered candidates in the
     * original rejectedCorners array.
     *
     * This function tries to find markers that were not detected in the basic detecMarkers function.
     * First, based on the current detected marker and the board layout, the function interpolates
     * the position of the missing markers. Then it tries to find correspondence between the reprojected
     * markers and the rejected candidates based on the minRepDistance and errorCorrectionRate
     * parameters.
     * If camera parameters and distortion coefficients are provided, missing markers are reprojected
     * using projectPoint function. If not, missing marker projections are interpolated using global
     * homography, and all the marker corners in the board must have the same Z coordinate.
     */
    public static void refineDetectedMarkers(Mat image, Board board, List<Mat> detectedCorners, Mat detectedIds, List<Mat> rejectedCorners, Mat cameraMatrix, Mat distCoeffs, float minRepDistance, float errorCorrectionRate, boolean checkAllOrders, Mat recoveredIdxs) {
        Mat detectedCorners_mat = Converters.vector_Mat_to_Mat(detectedCorners);
        Mat rejectedCorners_mat = Converters.vector_Mat_to_Mat(rejectedCorners);
        refineDetectedMarkers_1(image.nativeObj, board.getNativeObjAddr(), detectedCorners_mat.nativeObj, detectedIds.nativeObj, rejectedCorners_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, minRepDistance, errorCorrectionRate, checkAllOrders, recoveredIdxs.nativeObj);
        Converters.Mat_to_vector_Mat(detectedCorners_mat, detectedCorners);
        detectedCorners_mat.release();
        Converters.Mat_to_vector_Mat(rejectedCorners_mat, rejectedCorners);
        rejectedCorners_mat.release();
    }

    /**
     * Refind not detected markers based on the already detected and the board layout
     *
     * @param image input image
     * @param board layout of markers in the board.
     * @param detectedCorners vector of already detected marker corners.
     * @param detectedIds vector of already detected marker identifiers.
     * @param rejectedCorners vector of rejected candidates during the marker detection process.
     * @param cameraMatrix optional input 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\)
     * @param distCoeffs optional vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     * @param minRepDistance minimum distance between the corners of the rejected candidate and the
     * reprojected marker in order to consider it as a correspondence.
     * @param errorCorrectionRate rate of allowed erroneous bits respect to the error correction
     * capability of the used dictionary. -1 ignores the error correction step.
     * @param checkAllOrders Consider the four posible corner orders in the rejectedCorners array.
     * If it set to false, only the provided corner order is considered (default true).
     * original rejectedCorners array.
     *
     * This function tries to find markers that were not detected in the basic detecMarkers function.
     * First, based on the current detected marker and the board layout, the function interpolates
     * the position of the missing markers. Then it tries to find correspondence between the reprojected
     * markers and the rejected candidates based on the minRepDistance and errorCorrectionRate
     * parameters.
     * If camera parameters and distortion coefficients are provided, missing markers are reprojected
     * using projectPoint function. If not, missing marker projections are interpolated using global
     * homography, and all the marker corners in the board must have the same Z coordinate.
     */
    public static void refineDetectedMarkers(Mat image, Board board, List<Mat> detectedCorners, Mat detectedIds, List<Mat> rejectedCorners, Mat cameraMatrix, Mat distCoeffs, float minRepDistance, float errorCorrectionRate, boolean checkAllOrders) {
        Mat detectedCorners_mat = Converters.vector_Mat_to_Mat(detectedCorners);
        Mat rejectedCorners_mat = Converters.vector_Mat_to_Mat(rejectedCorners);
        refineDetectedMarkers_2(image.nativeObj, board.getNativeObjAddr(), detectedCorners_mat.nativeObj, detectedIds.nativeObj, rejectedCorners_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, minRepDistance, errorCorrectionRate, checkAllOrders);
        Converters.Mat_to_vector_Mat(detectedCorners_mat, detectedCorners);
        detectedCorners_mat.release();
        Converters.Mat_to_vector_Mat(rejectedCorners_mat, rejectedCorners);
        rejectedCorners_mat.release();
    }

    /**
     * Refind not detected markers based on the already detected and the board layout
     *
     * @param image input image
     * @param board layout of markers in the board.
     * @param detectedCorners vector of already detected marker corners.
     * @param detectedIds vector of already detected marker identifiers.
     * @param rejectedCorners vector of rejected candidates during the marker detection process.
     * @param cameraMatrix optional input 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\)
     * @param distCoeffs optional vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     * @param minRepDistance minimum distance between the corners of the rejected candidate and the
     * reprojected marker in order to consider it as a correspondence.
     * @param errorCorrectionRate rate of allowed erroneous bits respect to the error correction
     * capability of the used dictionary. -1 ignores the error correction step.
     * If it set to false, only the provided corner order is considered (default true).
     * original rejectedCorners array.
     *
     * This function tries to find markers that were not detected in the basic detecMarkers function.
     * First, based on the current detected marker and the board layout, the function interpolates
     * the position of the missing markers. Then it tries to find correspondence between the reprojected
     * markers and the rejected candidates based on the minRepDistance and errorCorrectionRate
     * parameters.
     * If camera parameters and distortion coefficients are provided, missing markers are reprojected
     * using projectPoint function. If not, missing marker projections are interpolated using global
     * homography, and all the marker corners in the board must have the same Z coordinate.
     */
    public static void refineDetectedMarkers(Mat image, Board board, List<Mat> detectedCorners, Mat detectedIds, List<Mat> rejectedCorners, Mat cameraMatrix, Mat distCoeffs, float minRepDistance, float errorCorrectionRate) {
        Mat detectedCorners_mat = Converters.vector_Mat_to_Mat(detectedCorners);
        Mat rejectedCorners_mat = Converters.vector_Mat_to_Mat(rejectedCorners);
        refineDetectedMarkers_3(image.nativeObj, board.getNativeObjAddr(), detectedCorners_mat.nativeObj, detectedIds.nativeObj, rejectedCorners_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, minRepDistance, errorCorrectionRate);
        Converters.Mat_to_vector_Mat(detectedCorners_mat, detectedCorners);
        detectedCorners_mat.release();
        Converters.Mat_to_vector_Mat(rejectedCorners_mat, rejectedCorners);
        rejectedCorners_mat.release();
    }

    /**
     * Refind not detected markers based on the already detected and the board layout
     *
     * @param image input image
     * @param board layout of markers in the board.
     * @param detectedCorners vector of already detected marker corners.
     * @param detectedIds vector of already detected marker identifiers.
     * @param rejectedCorners vector of rejected candidates during the marker detection process.
     * @param cameraMatrix optional input 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\)
     * @param distCoeffs optional vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     * @param minRepDistance minimum distance between the corners of the rejected candidate and the
     * reprojected marker in order to consider it as a correspondence.
     * capability of the used dictionary. -1 ignores the error correction step.
     * If it set to false, only the provided corner order is considered (default true).
     * original rejectedCorners array.
     *
     * This function tries to find markers that were not detected in the basic detecMarkers function.
     * First, based on the current detected marker and the board layout, the function interpolates
     * the position of the missing markers. Then it tries to find correspondence between the reprojected
     * markers and the rejected candidates based on the minRepDistance and errorCorrectionRate
     * parameters.
     * If camera parameters and distortion coefficients are provided, missing markers are reprojected
     * using projectPoint function. If not, missing marker projections are interpolated using global
     * homography, and all the marker corners in the board must have the same Z coordinate.
     */
    public static void refineDetectedMarkers(Mat image, Board board, List<Mat> detectedCorners, Mat detectedIds, List<Mat> rejectedCorners, Mat cameraMatrix, Mat distCoeffs, float minRepDistance) {
        Mat detectedCorners_mat = Converters.vector_Mat_to_Mat(detectedCorners);
        Mat rejectedCorners_mat = Converters.vector_Mat_to_Mat(rejectedCorners);
        refineDetectedMarkers_4(image.nativeObj, board.getNativeObjAddr(), detectedCorners_mat.nativeObj, detectedIds.nativeObj, rejectedCorners_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, minRepDistance);
        Converters.Mat_to_vector_Mat(detectedCorners_mat, detectedCorners);
        detectedCorners_mat.release();
        Converters.Mat_to_vector_Mat(rejectedCorners_mat, rejectedCorners);
        rejectedCorners_mat.release();
    }

    /**
     * Refind not detected markers based on the already detected and the board layout
     *
     * @param image input image
     * @param board layout of markers in the board.
     * @param detectedCorners vector of already detected marker corners.
     * @param detectedIds vector of already detected marker identifiers.
     * @param rejectedCorners vector of rejected candidates during the marker detection process.
     * @param cameraMatrix optional input 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\)
     * @param distCoeffs optional vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     * reprojected marker in order to consider it as a correspondence.
     * capability of the used dictionary. -1 ignores the error correction step.
     * If it set to false, only the provided corner order is considered (default true).
     * original rejectedCorners array.
     *
     * This function tries to find markers that were not detected in the basic detecMarkers function.
     * First, based on the current detected marker and the board layout, the function interpolates
     * the position of the missing markers. Then it tries to find correspondence between the reprojected
     * markers and the rejected candidates based on the minRepDistance and errorCorrectionRate
     * parameters.
     * If camera parameters and distortion coefficients are provided, missing markers are reprojected
     * using projectPoint function. If not, missing marker projections are interpolated using global
     * homography, and all the marker corners in the board must have the same Z coordinate.
     */
    public static void refineDetectedMarkers(Mat image, Board board, List<Mat> detectedCorners, Mat detectedIds, List<Mat> rejectedCorners, Mat cameraMatrix, Mat distCoeffs) {
        Mat detectedCorners_mat = Converters.vector_Mat_to_Mat(detectedCorners);
        Mat rejectedCorners_mat = Converters.vector_Mat_to_Mat(rejectedCorners);
        refineDetectedMarkers_5(image.nativeObj, board.getNativeObjAddr(), detectedCorners_mat.nativeObj, detectedIds.nativeObj, rejectedCorners_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj);
        Converters.Mat_to_vector_Mat(detectedCorners_mat, detectedCorners);
        detectedCorners_mat.release();
        Converters.Mat_to_vector_Mat(rejectedCorners_mat, rejectedCorners);
        rejectedCorners_mat.release();
    }

    /**
     * Refind not detected markers based on the already detected and the board layout
     *
     * @param image input image
     * @param board layout of markers in the board.
     * @param detectedCorners vector of already detected marker corners.
     * @param detectedIds vector of already detected marker identifiers.
     * @param rejectedCorners vector of rejected candidates during the marker detection process.
     * @param cameraMatrix optional input 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\)
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     * reprojected marker in order to consider it as a correspondence.
     * capability of the used dictionary. -1 ignores the error correction step.
     * If it set to false, only the provided corner order is considered (default true).
     * original rejectedCorners array.
     *
     * This function tries to find markers that were not detected in the basic detecMarkers function.
     * First, based on the current detected marker and the board layout, the function interpolates
     * the position of the missing markers. Then it tries to find correspondence between the reprojected
     * markers and the rejected candidates based on the minRepDistance and errorCorrectionRate
     * parameters.
     * If camera parameters and distortion coefficients are provided, missing markers are reprojected
     * using projectPoint function. If not, missing marker projections are interpolated using global
     * homography, and all the marker corners in the board must have the same Z coordinate.
     */
    public static void refineDetectedMarkers(Mat image, Board board, List<Mat> detectedCorners, Mat detectedIds, List<Mat> rejectedCorners, Mat cameraMatrix) {
        Mat detectedCorners_mat = Converters.vector_Mat_to_Mat(detectedCorners);
        Mat rejectedCorners_mat = Converters.vector_Mat_to_Mat(rejectedCorners);
        refineDetectedMarkers_6(image.nativeObj, board.getNativeObjAddr(), detectedCorners_mat.nativeObj, detectedIds.nativeObj, rejectedCorners_mat.nativeObj, cameraMatrix.nativeObj);
        Converters.Mat_to_vector_Mat(detectedCorners_mat, detectedCorners);
        detectedCorners_mat.release();
        Converters.Mat_to_vector_Mat(rejectedCorners_mat, rejectedCorners);
        rejectedCorners_mat.release();
    }

    /**
     * Refind not detected markers based on the already detected and the board layout
     *
     * @param image input image
     * @param board layout of markers in the board.
     * @param detectedCorners vector of already detected marker corners.
     * @param detectedIds vector of already detected marker identifiers.
     * @param rejectedCorners vector of rejected candidates during the marker detection process.
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\)
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     * reprojected marker in order to consider it as a correspondence.
     * capability of the used dictionary. -1 ignores the error correction step.
     * If it set to false, only the provided corner order is considered (default true).
     * original rejectedCorners array.
     *
     * This function tries to find markers that were not detected in the basic detecMarkers function.
     * First, based on the current detected marker and the board layout, the function interpolates
     * the position of the missing markers. Then it tries to find correspondence between the reprojected
     * markers and the rejected candidates based on the minRepDistance and errorCorrectionRate
     * parameters.
     * If camera parameters and distortion coefficients are provided, missing markers are reprojected
     * using projectPoint function. If not, missing marker projections are interpolated using global
     * homography, and all the marker corners in the board must have the same Z coordinate.
     */
    public static void refineDetectedMarkers(Mat image, Board board, List<Mat> detectedCorners, Mat detectedIds, List<Mat> rejectedCorners) {
        Mat detectedCorners_mat = Converters.vector_Mat_to_Mat(detectedCorners);
        Mat rejectedCorners_mat = Converters.vector_Mat_to_Mat(rejectedCorners);
        refineDetectedMarkers_7(image.nativeObj, board.getNativeObjAddr(), detectedCorners_mat.nativeObj, detectedIds.nativeObj, rejectedCorners_mat.nativeObj);
        Converters.Mat_to_vector_Mat(detectedCorners_mat, detectedCorners);
        detectedCorners_mat.release();
        Converters.Mat_to_vector_Mat(rejectedCorners_mat, rejectedCorners);
        rejectedCorners_mat.release();
    }




    // C++:  Ptr_Dictionary cv::aruco::generateCustomDictionary(int nMarkers, int markerSize, Ptr_Dictionary baseDictionary, int randomSeed = 0)
    private static native long custom_dictionary_from_0(int nMarkers, int markerSize, long baseDictionary_nativeObj, int randomSeed);
    private static native long custom_dictionary_from_1(int nMarkers, int markerSize, long baseDictionary_nativeObj);

    // C++:  Ptr_Dictionary cv::aruco::generateCustomDictionary(int nMarkers, int markerSize, int randomSeed = 0)
    private static native long custom_dictionary_0(int nMarkers, int markerSize, int randomSeed);
    private static native long custom_dictionary_1(int nMarkers, int markerSize);

    // C++:  Ptr_Dictionary cv::aruco::getPredefinedDictionary(int dict)
    private static native long getPredefinedDictionary_0(int dict);

    // C++:  bool cv::aruco::estimatePoseCharucoBoard(Mat charucoCorners, Mat charucoIds, Ptr_CharucoBoard board, Mat cameraMatrix, Mat distCoeffs, Mat& rvec, Mat& tvec, bool useExtrinsicGuess = false)
    private static native boolean estimatePoseCharucoBoard_0(long charucoCorners_nativeObj, long charucoIds_nativeObj, long board_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj, boolean useExtrinsicGuess);
    private static native boolean estimatePoseCharucoBoard_1(long charucoCorners_nativeObj, long charucoIds_nativeObj, long board_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj);

    // C++:  double cv::aruco::calibrateCameraAruco(vector_Mat corners, Mat ids, Mat counter, Ptr_Board board, Size imageSize, Mat& cameraMatrix, Mat& distCoeffs, vector_Mat& rvecs, vector_Mat& tvecs, Mat& stdDeviationsIntrinsics, Mat& stdDeviationsExtrinsics, Mat& perViewErrors, int flags = 0, TermCriteria criteria = TermCriteria(TermCriteria::COUNT + TermCriteria::EPS, 30, DBL_EPSILON))
    private static native double calibrateCameraArucoExtended_0(long corners_mat_nativeObj, long ids_nativeObj, long counter_nativeObj, long board_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj, long stdDeviationsIntrinsics_nativeObj, long stdDeviationsExtrinsics_nativeObj, long perViewErrors_nativeObj, int flags, int criteria_type, int criteria_maxCount, double criteria_epsilon);
    private static native double calibrateCameraArucoExtended_1(long corners_mat_nativeObj, long ids_nativeObj, long counter_nativeObj, long board_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj, long stdDeviationsIntrinsics_nativeObj, long stdDeviationsExtrinsics_nativeObj, long perViewErrors_nativeObj, int flags);
    private static native double calibrateCameraArucoExtended_2(long corners_mat_nativeObj, long ids_nativeObj, long counter_nativeObj, long board_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj, long stdDeviationsIntrinsics_nativeObj, long stdDeviationsExtrinsics_nativeObj, long perViewErrors_nativeObj);

    // C++:  double cv::aruco::calibrateCameraAruco(vector_Mat corners, Mat ids, Mat counter, Ptr_Board board, Size imageSize, Mat& cameraMatrix, Mat& distCoeffs, vector_Mat& rvecs = vector_Mat(), vector_Mat& tvecs = vector_Mat(), int flags = 0, TermCriteria criteria = TermCriteria(TermCriteria::COUNT + TermCriteria::EPS, 30, DBL_EPSILON))
    private static native double calibrateCameraAruco_0(long corners_mat_nativeObj, long ids_nativeObj, long counter_nativeObj, long board_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj, int flags, int criteria_type, int criteria_maxCount, double criteria_epsilon);
    private static native double calibrateCameraAruco_1(long corners_mat_nativeObj, long ids_nativeObj, long counter_nativeObj, long board_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj, int flags);
    private static native double calibrateCameraAruco_2(long corners_mat_nativeObj, long ids_nativeObj, long counter_nativeObj, long board_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj);
    private static native double calibrateCameraAruco_3(long corners_mat_nativeObj, long ids_nativeObj, long counter_nativeObj, long board_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj);
    private static native double calibrateCameraAruco_4(long corners_mat_nativeObj, long ids_nativeObj, long counter_nativeObj, long board_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj);

    // C++:  double cv::aruco::calibrateCameraCharuco(vector_Mat charucoCorners, vector_Mat charucoIds, Ptr_CharucoBoard board, Size imageSize, Mat& cameraMatrix, Mat& distCoeffs, vector_Mat& rvecs, vector_Mat& tvecs, Mat& stdDeviationsIntrinsics, Mat& stdDeviationsExtrinsics, Mat& perViewErrors, int flags = 0, TermCriteria criteria = TermCriteria(TermCriteria::COUNT + TermCriteria::EPS, 30, DBL_EPSILON))
    private static native double calibrateCameraCharucoExtended_0(long charucoCorners_mat_nativeObj, long charucoIds_mat_nativeObj, long board_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj, long stdDeviationsIntrinsics_nativeObj, long stdDeviationsExtrinsics_nativeObj, long perViewErrors_nativeObj, int flags, int criteria_type, int criteria_maxCount, double criteria_epsilon);
    private static native double calibrateCameraCharucoExtended_1(long charucoCorners_mat_nativeObj, long charucoIds_mat_nativeObj, long board_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj, long stdDeviationsIntrinsics_nativeObj, long stdDeviationsExtrinsics_nativeObj, long perViewErrors_nativeObj, int flags);
    private static native double calibrateCameraCharucoExtended_2(long charucoCorners_mat_nativeObj, long charucoIds_mat_nativeObj, long board_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj, long stdDeviationsIntrinsics_nativeObj, long stdDeviationsExtrinsics_nativeObj, long perViewErrors_nativeObj);

    // C++:  double cv::aruco::calibrateCameraCharuco(vector_Mat charucoCorners, vector_Mat charucoIds, Ptr_CharucoBoard board, Size imageSize, Mat& cameraMatrix, Mat& distCoeffs, vector_Mat& rvecs = vector_Mat(), vector_Mat& tvecs = vector_Mat(), int flags = 0, TermCriteria criteria = TermCriteria(TermCriteria::COUNT + TermCriteria::EPS, 30, DBL_EPSILON))
    private static native double calibrateCameraCharuco_0(long charucoCorners_mat_nativeObj, long charucoIds_mat_nativeObj, long board_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj, int flags, int criteria_type, int criteria_maxCount, double criteria_epsilon);
    private static native double calibrateCameraCharuco_1(long charucoCorners_mat_nativeObj, long charucoIds_mat_nativeObj, long board_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj, int flags);
    private static native double calibrateCameraCharuco_2(long charucoCorners_mat_nativeObj, long charucoIds_mat_nativeObj, long board_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj);
    private static native double calibrateCameraCharuco_3(long charucoCorners_mat_nativeObj, long charucoIds_mat_nativeObj, long board_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj);
    private static native double calibrateCameraCharuco_4(long charucoCorners_mat_nativeObj, long charucoIds_mat_nativeObj, long board_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj);

    // C++:  int cv::aruco::estimatePoseBoard(vector_Mat corners, Mat ids, Ptr_Board board, Mat cameraMatrix, Mat distCoeffs, Mat& rvec, Mat& tvec, bool useExtrinsicGuess = false)
    private static native int estimatePoseBoard_0(long corners_mat_nativeObj, long ids_nativeObj, long board_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj, boolean useExtrinsicGuess);
    private static native int estimatePoseBoard_1(long corners_mat_nativeObj, long ids_nativeObj, long board_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj);

    // C++:  int cv::aruco::interpolateCornersCharuco(vector_Mat markerCorners, Mat markerIds, Mat image, Ptr_CharucoBoard board, Mat& charucoCorners, Mat& charucoIds, Mat cameraMatrix = Mat(), Mat distCoeffs = Mat(), int minMarkers = 2)
    private static native int interpolateCornersCharuco_0(long markerCorners_mat_nativeObj, long markerIds_nativeObj, long image_nativeObj, long board_nativeObj, long charucoCorners_nativeObj, long charucoIds_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, int minMarkers);
    private static native int interpolateCornersCharuco_1(long markerCorners_mat_nativeObj, long markerIds_nativeObj, long image_nativeObj, long board_nativeObj, long charucoCorners_nativeObj, long charucoIds_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj);
    private static native int interpolateCornersCharuco_2(long markerCorners_mat_nativeObj, long markerIds_nativeObj, long image_nativeObj, long board_nativeObj, long charucoCorners_nativeObj, long charucoIds_nativeObj, long cameraMatrix_nativeObj);
    private static native int interpolateCornersCharuco_3(long markerCorners_mat_nativeObj, long markerIds_nativeObj, long image_nativeObj, long board_nativeObj, long charucoCorners_nativeObj, long charucoIds_nativeObj);

    // C++:  void cv::aruco::detectCharucoDiamond(Mat image, vector_Mat markerCorners, Mat markerIds, float squareMarkerLengthRate, vector_Mat& diamondCorners, Mat& diamondIds, Mat cameraMatrix = Mat(), Mat distCoeffs = Mat())
    private static native void detectCharucoDiamond_0(long image_nativeObj, long markerCorners_mat_nativeObj, long markerIds_nativeObj, float squareMarkerLengthRate, long diamondCorners_mat_nativeObj, long diamondIds_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj);
    private static native void detectCharucoDiamond_1(long image_nativeObj, long markerCorners_mat_nativeObj, long markerIds_nativeObj, float squareMarkerLengthRate, long diamondCorners_mat_nativeObj, long diamondIds_nativeObj, long cameraMatrix_nativeObj);
    private static native void detectCharucoDiamond_2(long image_nativeObj, long markerCorners_mat_nativeObj, long markerIds_nativeObj, float squareMarkerLengthRate, long diamondCorners_mat_nativeObj, long diamondIds_nativeObj);

    // C++:  void cv::aruco::detectMarkers(Mat image, Ptr_Dictionary dictionary, vector_Mat& corners, Mat& ids, Ptr_DetectorParameters parameters = DetectorParameters::create(), vector_Mat& rejectedImgPoints = vector_Mat(), Mat cameraMatrix = Mat(), Mat distCoeff = Mat())
    private static native void detectMarkers_0(long image_nativeObj, long dictionary_nativeObj, long corners_mat_nativeObj, long ids_nativeObj, long parameters_nativeObj, long rejectedImgPoints_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeff_nativeObj);
    private static native void detectMarkers_1(long image_nativeObj, long dictionary_nativeObj, long corners_mat_nativeObj, long ids_nativeObj, long parameters_nativeObj, long rejectedImgPoints_mat_nativeObj, long cameraMatrix_nativeObj);
    private static native void detectMarkers_2(long image_nativeObj, long dictionary_nativeObj, long corners_mat_nativeObj, long ids_nativeObj, long parameters_nativeObj, long rejectedImgPoints_mat_nativeObj);
    private static native void detectMarkers_3(long image_nativeObj, long dictionary_nativeObj, long corners_mat_nativeObj, long ids_nativeObj, long parameters_nativeObj);
    private static native void detectMarkers_4(long image_nativeObj, long dictionary_nativeObj, long corners_mat_nativeObj, long ids_nativeObj);

    // C++:  void cv::aruco::drawAxis(Mat& image, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec, float length)
    private static native void drawAxis_0(long image_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj, float length);

    // C++:  void cv::aruco::drawDetectedCornersCharuco(Mat& image, Mat charucoCorners, Mat charucoIds = Mat(), Scalar cornerColor = Scalar(255, 0, 0))
    private static native void drawDetectedCornersCharuco_0(long image_nativeObj, long charucoCorners_nativeObj, long charucoIds_nativeObj, double cornerColor_val0, double cornerColor_val1, double cornerColor_val2, double cornerColor_val3);
    private static native void drawDetectedCornersCharuco_1(long image_nativeObj, long charucoCorners_nativeObj, long charucoIds_nativeObj);
    private static native void drawDetectedCornersCharuco_2(long image_nativeObj, long charucoCorners_nativeObj);

    // C++:  void cv::aruco::drawDetectedDiamonds(Mat& image, vector_Mat diamondCorners, Mat diamondIds = Mat(), Scalar borderColor = Scalar(0, 0, 255))
    private static native void drawDetectedDiamonds_0(long image_nativeObj, long diamondCorners_mat_nativeObj, long diamondIds_nativeObj, double borderColor_val0, double borderColor_val1, double borderColor_val2, double borderColor_val3);
    private static native void drawDetectedDiamonds_1(long image_nativeObj, long diamondCorners_mat_nativeObj, long diamondIds_nativeObj);
    private static native void drawDetectedDiamonds_2(long image_nativeObj, long diamondCorners_mat_nativeObj);

    // C++:  void cv::aruco::drawDetectedMarkers(Mat& image, vector_Mat corners, Mat ids = Mat(), Scalar borderColor = Scalar(0, 255, 0))
    private static native void drawDetectedMarkers_0(long image_nativeObj, long corners_mat_nativeObj, long ids_nativeObj, double borderColor_val0, double borderColor_val1, double borderColor_val2, double borderColor_val3);
    private static native void drawDetectedMarkers_1(long image_nativeObj, long corners_mat_nativeObj, long ids_nativeObj);
    private static native void drawDetectedMarkers_2(long image_nativeObj, long corners_mat_nativeObj);

    // C++:  void cv::aruco::drawMarker(Ptr_Dictionary dictionary, int id, int sidePixels, Mat& img, int borderBits = 1)
    private static native void drawMarker_0(long dictionary_nativeObj, int id, int sidePixels, long img_nativeObj, int borderBits);
    private static native void drawMarker_1(long dictionary_nativeObj, int id, int sidePixels, long img_nativeObj);

    // C++:  void cv::aruco::drawPlanarBoard(Ptr_Board board, Size outSize, Mat& img, int marginSize = 0, int borderBits = 1)
    private static native void drawPlanarBoard_0(long board_nativeObj, double outSize_width, double outSize_height, long img_nativeObj, int marginSize, int borderBits);
    private static native void drawPlanarBoard_1(long board_nativeObj, double outSize_width, double outSize_height, long img_nativeObj, int marginSize);
    private static native void drawPlanarBoard_2(long board_nativeObj, double outSize_width, double outSize_height, long img_nativeObj);

    // C++:  void cv::aruco::estimatePoseSingleMarkers(vector_Mat corners, float markerLength, Mat cameraMatrix, Mat distCoeffs, Mat& rvecs, Mat& tvecs, Mat& _objPoints = Mat())
    private static native void estimatePoseSingleMarkers_0(long corners_mat_nativeObj, float markerLength, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_nativeObj, long tvecs_nativeObj, long _objPoints_nativeObj);
    private static native void estimatePoseSingleMarkers_1(long corners_mat_nativeObj, float markerLength, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_nativeObj, long tvecs_nativeObj);

    // C++:  void cv::aruco::getBoardObjectAndImagePoints(Ptr_Board board, vector_Mat detectedCorners, Mat detectedIds, Mat& objPoints, Mat& imgPoints)
    private static native void getBoardObjectAndImagePoints_0(long board_nativeObj, long detectedCorners_mat_nativeObj, long detectedIds_nativeObj, long objPoints_nativeObj, long imgPoints_nativeObj);

    // C++:  void cv::aruco::refineDetectedMarkers(Mat image, Ptr_Board board, vector_Mat& detectedCorners, Mat& detectedIds, vector_Mat& rejectedCorners, Mat cameraMatrix = Mat(), Mat distCoeffs = Mat(), float minRepDistance = 10.f, float errorCorrectionRate = 3.f, bool checkAllOrders = true, Mat& recoveredIdxs = Mat(), Ptr_DetectorParameters parameters = DetectorParameters::create())
    private static native void refineDetectedMarkers_0(long image_nativeObj, long board_nativeObj, long detectedCorners_mat_nativeObj, long detectedIds_nativeObj, long rejectedCorners_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, float minRepDistance, float errorCorrectionRate, boolean checkAllOrders, long recoveredIdxs_nativeObj, long parameters_nativeObj);
    private static native void refineDetectedMarkers_1(long image_nativeObj, long board_nativeObj, long detectedCorners_mat_nativeObj, long detectedIds_nativeObj, long rejectedCorners_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, float minRepDistance, float errorCorrectionRate, boolean checkAllOrders, long recoveredIdxs_nativeObj);
    private static native void refineDetectedMarkers_2(long image_nativeObj, long board_nativeObj, long detectedCorners_mat_nativeObj, long detectedIds_nativeObj, long rejectedCorners_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, float minRepDistance, float errorCorrectionRate, boolean checkAllOrders);
    private static native void refineDetectedMarkers_3(long image_nativeObj, long board_nativeObj, long detectedCorners_mat_nativeObj, long detectedIds_nativeObj, long rejectedCorners_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, float minRepDistance, float errorCorrectionRate);
    private static native void refineDetectedMarkers_4(long image_nativeObj, long board_nativeObj, long detectedCorners_mat_nativeObj, long detectedIds_nativeObj, long rejectedCorners_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, float minRepDistance);
    private static native void refineDetectedMarkers_5(long image_nativeObj, long board_nativeObj, long detectedCorners_mat_nativeObj, long detectedIds_nativeObj, long rejectedCorners_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj);
    private static native void refineDetectedMarkers_6(long image_nativeObj, long board_nativeObj, long detectedCorners_mat_nativeObj, long detectedIds_nativeObj, long rejectedCorners_mat_nativeObj, long cameraMatrix_nativeObj);
    private static native void refineDetectedMarkers_7(long image_nativeObj, long board_nativeObj, long detectedCorners_mat_nativeObj, long detectedIds_nativeObj, long rejectedCorners_mat_nativeObj);

}
