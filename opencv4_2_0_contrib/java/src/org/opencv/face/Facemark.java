//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.face;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint2f;
import org.opencv.core.MatOfRect;
import org.opencv.utils.Converters;

// C++: class Facemark
/**
 * Abstract base class for all facemark models
 *
 * To utilize this API in your program, please take a look at the REF: tutorial_table_of_content_facemark
 * ### Description
 *
 * Facemark is a base class which provides universal access to any specific facemark algorithm.
 * Therefore, the users should declare a desired algorithm before they can use it in their application.
 *
 * Here is an example on how to declare a facemark algorithm:
 * <code>
 * // Using Facemark in your code:
 * Ptr&lt;Facemark&gt; facemark = createFacemarkLBF();
 * </code>
 *
 * The typical pipeline for facemark detection is as follows:
 * <ul>
 *   <li>
 *  Load the trained model using Facemark::loadModel.
 *   </li>
 *   <li>
 *  Perform the fitting on an image via Facemark::fit.
 *   </li>
 * </ul>
 */
public class Facemark extends Algorithm {

    protected Facemark(long addr) { super(addr); }

    // internal usage only
    public static Facemark __fromPtr__(long addr) { return new Facemark(addr); }

    //
    // C++:  bool cv::face::Facemark::fit(Mat image, vector_Rect faces, vector_vector_Point2f& landmarks)
    //

    /**
     * Detect facial landmarks from an image.
     *     @param image Input image.
     *     @param faces Output of the function which represent region of interest of the detected faces.
     *     Each face is stored in cv::Rect container.
     *     @param landmarks The detected landmark points for each faces.
     *
     *     &lt;B&gt;Example of usage&lt;/B&gt;
     *     <code>
     *     Mat image = imread("image.jpg");
     *     std::vector&lt;Rect&gt; faces;
     *     std::vector&lt;std::vector&lt;Point2f&gt; &gt; landmarks;
     *     facemark-&gt;fit(image, faces, landmarks);
     *     </code>
     * @return automatically generated
     */
    public boolean fit(Mat image, MatOfRect faces, List<MatOfPoint2f> landmarks) {
        Mat faces_mat = faces;
        Mat landmarks_mat = new Mat();
        boolean retVal = fit_0(nativeObj, image.nativeObj, faces_mat.nativeObj, landmarks_mat.nativeObj);
        Converters.Mat_to_vector_vector_Point2f(landmarks_mat, landmarks);
        landmarks_mat.release();
        return retVal;
    }


    //
    // C++:  void cv::face::Facemark::loadModel(String model)
    //

    /**
     * A function to load the trained model before the fitting process.
     *     @param model A string represent the filename of a trained model.
     *
     *     &lt;B&gt;Example of usage&lt;/B&gt;
     *     <code>
     *     facemark-&gt;loadModel("../data/lbf.model");
     *     </code>
     */
    public void loadModel(String model) {
        loadModel_0(nativeObj, model);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  bool cv::face::Facemark::fit(Mat image, vector_Rect faces, vector_vector_Point2f& landmarks)
    private static native boolean fit_0(long nativeObj, long image_nativeObj, long faces_mat_nativeObj, long landmarks_mat_nativeObj);

    // C++:  void cv::face::Facemark::loadModel(String model)
    private static native void loadModel_0(long nativeObj, String model);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
