//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.face;



// C++: class FacemarkTrain
/**
 * Abstract base class for trainable facemark models
 *
 * To utilize this API in your program, please take a look at the REF: tutorial_table_of_content_facemark
 * ### Description
 *
 * The AAM and LBF facemark models in OpenCV are derived from the abstract base class FacemarkTrain, which
 * provides a unified access to those facemark algorithms in OpenCV.
 *
 * Here is an example on how to declare facemark algorithm:
 * <code>
 * // Using Facemark in your code:
 * Ptr&lt;Facemark&gt; facemark = FacemarkLBF::create();
 * </code>
 *
 *
 * The typical pipeline for facemark detection is listed as follows:
 * <ul>
 *   <li>
 *  (Non-mandatory) Set a user defined face detection using FacemarkTrain::setFaceDetector.
 *   The facemark algorithms are designed to fit the facial points into a face.
 *   Therefore, the face information should be provided to the facemark algorithm.
 *   Some algorithms might provides a default face recognition function.
 *   However, the users might prefer to use their own face detector to obtains the best possible detection result.
 *   </li>
 *   <li>
 *  (Non-mandatory) Training the model for a specific algorithm using FacemarkTrain::training.
 *   In this case, the model should be automatically saved by the algorithm.
 *   If the user already have a trained model, then this part can be omitted.
 *   </li>
 *   <li>
 *  Load the trained model using Facemark::loadModel.
 *   </li>
 *   <li>
 *  Perform the fitting via the Facemark::fit.
 *   </li>
 * </ul>
 */
public class FacemarkTrain extends Facemark {

    protected FacemarkTrain(long addr) { super(addr); }

    // internal usage only
    public static FacemarkTrain __fromPtr__(long addr) { return new FacemarkTrain(addr); }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // native support for java finalize()
    private static native void delete(long nativeObj);

}
