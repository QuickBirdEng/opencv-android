//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.aruco;

import org.opencv.aruco.Board;
import org.opencv.aruco.Dictionary;
import org.opencv.aruco.GridBoard;
import org.opencv.core.Mat;
import org.opencv.core.Size;

// C++: class GridBoard
/**
 * Planar board with grid arrangement of markers
 * More common type of board. All markers are placed in the same plane in a grid arrangement.
 * The board can be drawn using drawPlanarBoard() function (SEE: drawPlanarBoard)
 */
public class GridBoard extends Board {

    protected GridBoard(long addr) { super(addr); }

    // internal usage only
    public static GridBoard __fromPtr__(long addr) { return new GridBoard(addr); }

    //
    // C++: static Ptr_GridBoard cv::aruco::GridBoard::create(int markersX, int markersY, float markerLength, float markerSeparation, Ptr_Dictionary dictionary, int firstMarker = 0)
    //

    /**
     * Create a GridBoard object
     *
     * @param markersX number of markers in X direction
     * @param markersY number of markers in Y direction
     * @param markerLength marker side length (normally in meters)
     * @param markerSeparation separation between two markers (same unit as markerLength)
     * @param dictionary dictionary of markers indicating the type of markers
     * @param firstMarker id of first marker in dictionary to use on board.
     * @return the output GridBoard object
     *
     * This functions creates a GridBoard object given the number of markers in each direction and
     * the marker size and marker separation.
     */
    public static GridBoard create(int markersX, int markersY, float markerLength, float markerSeparation, Dictionary dictionary, int firstMarker) {
        return GridBoard.__fromPtr__(create_0(markersX, markersY, markerLength, markerSeparation, dictionary.getNativeObjAddr(), firstMarker));
    }

    /**
     * Create a GridBoard object
     *
     * @param markersX number of markers in X direction
     * @param markersY number of markers in Y direction
     * @param markerLength marker side length (normally in meters)
     * @param markerSeparation separation between two markers (same unit as markerLength)
     * @param dictionary dictionary of markers indicating the type of markers
     * @return the output GridBoard object
     *
     * This functions creates a GridBoard object given the number of markers in each direction and
     * the marker size and marker separation.
     */
    public static GridBoard create(int markersX, int markersY, float markerLength, float markerSeparation, Dictionary dictionary) {
        return GridBoard.__fromPtr__(create_1(markersX, markersY, markerLength, markerSeparation, dictionary.getNativeObjAddr()));
    }


    //
    // C++:  Size cv::aruco::GridBoard::getGridSize()
    //

    public Size getGridSize() {
        return new Size(getGridSize_0(nativeObj));
    }


    //
    // C++:  float cv::aruco::GridBoard::getMarkerLength()
    //

    public float getMarkerLength() {
        return getMarkerLength_0(nativeObj);
    }


    //
    // C++:  float cv::aruco::GridBoard::getMarkerSeparation()
    //

    public float getMarkerSeparation() {
        return getMarkerSeparation_0(nativeObj);
    }


    //
    // C++:  void cv::aruco::GridBoard::draw(Size outSize, Mat& img, int marginSize = 0, int borderBits = 1)
    //

    /**
     * Draw a GridBoard
     *
     * @param outSize size of the output image in pixels.
     * @param img output image with the board. The size of this image will be outSize
     * and the board will be on the center, keeping the board proportions.
     * @param marginSize minimum margins (in pixels) of the board in the output image
     * @param borderBits width of the marker borders.
     *
     * This function return the image of the GridBoard, ready to be printed.
     */
    public void draw(Size outSize, Mat img, int marginSize, int borderBits) {
        draw_0(nativeObj, outSize.width, outSize.height, img.nativeObj, marginSize, borderBits);
    }

    /**
     * Draw a GridBoard
     *
     * @param outSize size of the output image in pixels.
     * @param img output image with the board. The size of this image will be outSize
     * and the board will be on the center, keeping the board proportions.
     * @param marginSize minimum margins (in pixels) of the board in the output image
     *
     * This function return the image of the GridBoard, ready to be printed.
     */
    public void draw(Size outSize, Mat img, int marginSize) {
        draw_1(nativeObj, outSize.width, outSize.height, img.nativeObj, marginSize);
    }

    /**
     * Draw a GridBoard
     *
     * @param outSize size of the output image in pixels.
     * @param img output image with the board. The size of this image will be outSize
     * and the board will be on the center, keeping the board proportions.
     *
     * This function return the image of the GridBoard, ready to be printed.
     */
    public void draw(Size outSize, Mat img) {
        draw_2(nativeObj, outSize.width, outSize.height, img.nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_GridBoard cv::aruco::GridBoard::create(int markersX, int markersY, float markerLength, float markerSeparation, Ptr_Dictionary dictionary, int firstMarker = 0)
    private static native long create_0(int markersX, int markersY, float markerLength, float markerSeparation, long dictionary_nativeObj, int firstMarker);
    private static native long create_1(int markersX, int markersY, float markerLength, float markerSeparation, long dictionary_nativeObj);

    // C++:  Size cv::aruco::GridBoard::getGridSize()
    private static native double[] getGridSize_0(long nativeObj);

    // C++:  float cv::aruco::GridBoard::getMarkerLength()
    private static native float getMarkerLength_0(long nativeObj);

    // C++:  float cv::aruco::GridBoard::getMarkerSeparation()
    private static native float getMarkerSeparation_0(long nativeObj);

    // C++:  void cv::aruco::GridBoard::draw(Size outSize, Mat& img, int marginSize = 0, int borderBits = 1)
    private static native void draw_0(long nativeObj, double outSize_width, double outSize_height, long img_nativeObj, int marginSize, int borderBits);
    private static native void draw_1(long nativeObj, double outSize_width, double outSize_height, long img_nativeObj, int marginSize);
    private static native void draw_2(long nativeObj, double outSize_width, double outSize_height, long img_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
