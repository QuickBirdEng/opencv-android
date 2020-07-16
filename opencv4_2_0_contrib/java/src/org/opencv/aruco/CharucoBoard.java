//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.aruco;

import java.util.ArrayList;
import java.util.List;
import org.opencv.aruco.Board;
import org.opencv.aruco.CharucoBoard;
import org.opencv.aruco.Dictionary;
import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint3f;
import org.opencv.core.Size;
import org.opencv.utils.Converters;

// C++: class CharucoBoard
/**
 * ChArUco board
 * Specific class for ChArUco boards. A ChArUco board is a planar board where the markers are placed
 * inside the white squares of a chessboard. The benefits of ChArUco boards is that they provide
 * both, ArUco markers versatility and chessboard corner precision, which is important for
 * calibration and pose estimation.
 * This class also allows the easy creation and drawing of ChArUco boards.
 */
public class CharucoBoard extends Board {

    protected CharucoBoard(long addr) { super(addr); }

    // internal usage only
    public static CharucoBoard __fromPtr__(long addr) { return new CharucoBoard(addr); }

    //
    // C++: static Ptr_CharucoBoard cv::aruco::CharucoBoard::create(int squaresX, int squaresY, float squareLength, float markerLength, Ptr_Dictionary dictionary)
    //

    /**
     * Create a CharucoBoard object
     *
     * @param squaresX number of chessboard squares in X direction
     * @param squaresY number of chessboard squares in Y direction
     * @param squareLength chessboard square side length (normally in meters)
     * @param markerLength marker side length (same unit than squareLength)
     * @param dictionary dictionary of markers indicating the type of markers.
     * The first markers in the dictionary are used to fill the white chessboard squares.
     * @return the output CharucoBoard object
     *
     * This functions creates a CharucoBoard object given the number of squares in each direction
     * and the size of the markers and chessboard squares.
     */
    public static CharucoBoard create(int squaresX, int squaresY, float squareLength, float markerLength, Dictionary dictionary) {
        return CharucoBoard.__fromPtr__(create_0(squaresX, squaresY, squareLength, markerLength, dictionary.getNativeObjAddr()));
    }


    //
    // C++:  Size cv::aruco::CharucoBoard::getChessboardSize()
    //

    public Size getChessboardSize() {
        return new Size(getChessboardSize_0(nativeObj));
    }


    //
    // C++:  float cv::aruco::CharucoBoard::getMarkerLength()
    //

    public float getMarkerLength() {
        return getMarkerLength_0(nativeObj);
    }


    //
    // C++:  float cv::aruco::CharucoBoard::getSquareLength()
    //

    public float getSquareLength() {
        return getSquareLength_0(nativeObj);
    }


    //
    // C++:  void cv::aruco::CharucoBoard::draw(Size outSize, Mat& img, int marginSize = 0, int borderBits = 1)
    //

    /**
     * Draw a ChArUco board
     *
     * @param outSize size of the output image in pixels.
     * @param img output image with the board. The size of this image will be outSize
     * and the board will be on the center, keeping the board proportions.
     * @param marginSize minimum margins (in pixels) of the board in the output image
     * @param borderBits width of the marker borders.
     *
     * This function return the image of the ChArUco board, ready to be printed.
     */
    public void draw(Size outSize, Mat img, int marginSize, int borderBits) {
        draw_0(nativeObj, outSize.width, outSize.height, img.nativeObj, marginSize, borderBits);
    }

    /**
     * Draw a ChArUco board
     *
     * @param outSize size of the output image in pixels.
     * @param img output image with the board. The size of this image will be outSize
     * and the board will be on the center, keeping the board proportions.
     * @param marginSize minimum margins (in pixels) of the board in the output image
     *
     * This function return the image of the ChArUco board, ready to be printed.
     */
    public void draw(Size outSize, Mat img, int marginSize) {
        draw_1(nativeObj, outSize.width, outSize.height, img.nativeObj, marginSize);
    }

    /**
     * Draw a ChArUco board
     *
     * @param outSize size of the output image in pixels.
     * @param img output image with the board. The size of this image will be outSize
     * and the board will be on the center, keeping the board proportions.
     *
     * This function return the image of the ChArUco board, ready to be printed.
     */
    public void draw(Size outSize, Mat img) {
        draw_2(nativeObj, outSize.width, outSize.height, img.nativeObj);
    }


    //
    // C++: vector_Point3f CharucoBoard::chessboardCorners
    //

    public MatOfPoint3f get_chessboardCorners() {
        return MatOfPoint3f.fromNativeAddr(get_chessboardCorners_0(nativeObj));
    }


    //
    // C++: vector_vector_int CharucoBoard::nearestMarkerIdx
    //

    // Return type 'vector_vector_int' is not supported, skipping the function


    //
    // C++: vector_vector_int CharucoBoard::nearestMarkerCorners
    //

    // Return type 'vector_vector_int' is not supported, skipping the function


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_CharucoBoard cv::aruco::CharucoBoard::create(int squaresX, int squaresY, float squareLength, float markerLength, Ptr_Dictionary dictionary)
    private static native long create_0(int squaresX, int squaresY, float squareLength, float markerLength, long dictionary_nativeObj);

    // C++:  Size cv::aruco::CharucoBoard::getChessboardSize()
    private static native double[] getChessboardSize_0(long nativeObj);

    // C++:  float cv::aruco::CharucoBoard::getMarkerLength()
    private static native float getMarkerLength_0(long nativeObj);

    // C++:  float cv::aruco::CharucoBoard::getSquareLength()
    private static native float getSquareLength_0(long nativeObj);

    // C++:  void cv::aruco::CharucoBoard::draw(Size outSize, Mat& img, int marginSize = 0, int borderBits = 1)
    private static native void draw_0(long nativeObj, double outSize_width, double outSize_height, long img_nativeObj, int marginSize, int borderBits);
    private static native void draw_1(long nativeObj, double outSize_width, double outSize_height, long img_nativeObj, int marginSize);
    private static native void draw_2(long nativeObj, double outSize_width, double outSize_height, long img_nativeObj);

    // C++: vector_Point3f CharucoBoard::chessboardCorners
    private static native long get_chessboardCorners_0(long nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
