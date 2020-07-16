//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;

// C++: class FastLineDetector
/**
 * Class implementing the FLD (Fast Line Detector) algorithm described
 * in CITE: Lee14 .
 */
public class FastLineDetector extends Algorithm {

    protected FastLineDetector(long addr) { super(addr); }

    // internal usage only
    public static FastLineDetector __fromPtr__(long addr) { return new FastLineDetector(addr); }

    //
    // C++:  void cv::ximgproc::FastLineDetector::detect(Mat _image, Mat& _lines)
    //

    /**
     * Finds lines in the input image.
     *       This is the output of the default parameters of the algorithm on the above
     *       shown image.
     *
     *       ![image](pics/corridor_fld.jpg)
     *
     *       @param _image A grayscale (CV_8UC1) input image. If only a roi needs to be
     *       selected, use: `fld_ptr-&gt;detect(image(roi), lines, ...);
     *       lines += Scalar(roi.x, roi.y, roi.x, roi.y);`
     *       @param _lines A vector of Vec4f elements specifying the beginning
     *       and ending point of a line.  Where Vec4f is (x1, y1, x2, y2), point
     *       1 is the start, point 2 - end. Returned lines are directed so that the
     *       brighter side is on their left.
     */
    public void detect(Mat _image, Mat _lines) {
        detect_0(nativeObj, _image.nativeObj, _lines.nativeObj);
    }


    //
    // C++:  void cv::ximgproc::FastLineDetector::drawSegments(Mat& _image, Mat lines, bool draw_arrow = false)
    //

    /**
     * Draws the line segments on a given image.
     *       @param _image The image, where the lines will be drawn. Should be bigger
     *       or equal to the image, where the lines were found.
     *       @param lines A vector of the lines that needed to be drawn.
     *       @param draw_arrow If true, arrow heads will be drawn.
     */
    public void drawSegments(Mat _image, Mat lines, boolean draw_arrow) {
        drawSegments_0(nativeObj, _image.nativeObj, lines.nativeObj, draw_arrow);
    }

    /**
     * Draws the line segments on a given image.
     *       @param _image The image, where the lines will be drawn. Should be bigger
     *       or equal to the image, where the lines were found.
     *       @param lines A vector of the lines that needed to be drawn.
     */
    public void drawSegments(Mat _image, Mat lines) {
        drawSegments_1(nativeObj, _image.nativeObj, lines.nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  void cv::ximgproc::FastLineDetector::detect(Mat _image, Mat& _lines)
    private static native void detect_0(long nativeObj, long _image_nativeObj, long _lines_nativeObj);

    // C++:  void cv::ximgproc::FastLineDetector::drawSegments(Mat& _image, Mat lines, bool draw_arrow = false)
    private static native void drawSegments_0(long nativeObj, long _image_nativeObj, long lines_nativeObj, boolean draw_arrow);
    private static native void drawSegments_1(long nativeObj, long _image_nativeObj, long lines_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
