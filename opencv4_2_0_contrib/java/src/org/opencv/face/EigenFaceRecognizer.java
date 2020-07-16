//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.face;

import org.opencv.face.BasicFaceRecognizer;
import org.opencv.face.EigenFaceRecognizer;

// C++: class EigenFaceRecognizer

public class EigenFaceRecognizer extends BasicFaceRecognizer {

    protected EigenFaceRecognizer(long addr) { super(addr); }

    // internal usage only
    public static EigenFaceRecognizer __fromPtr__(long addr) { return new EigenFaceRecognizer(addr); }

    //
    // C++: static Ptr_EigenFaceRecognizer cv::face::EigenFaceRecognizer::create(int num_components = 0, double threshold = DBL_MAX)
    //

    /**
     * @param num_components The number of components (read: Eigenfaces) kept for this Principal
     *     Component Analysis. As a hint: There's no rule how many components (read: Eigenfaces) should be
     *     kept for good reconstruction capabilities. It is based on your input data, so experiment with the
     *     number. Keeping 80 components should almost always be sufficient.
     *     @param threshold The threshold applied in the prediction.
     *
     *     ### Notes:
     *
     * <ul>
     *   <li>
     *        Training and prediction must be done on grayscale images, use cvtColor to convert between the
     *         color spaces.
     *   </li>
     *   <li>
     *        <b>THE EIGENFACES METHOD MAKES THE ASSUMPTION, THAT THE TRAINING AND TEST IMAGES ARE OF EQUAL
     *         SIZE.</b> (caps-lock, because I got so many mails asking for this). You have to make sure your
     *         input data has the correct shape, else a meaningful exception is thrown. Use resize to resize
     *         the images.
     *   </li>
     *   <li>
     *        This model does not support updating.
     *   </li>
     * </ul>
     *
     *     ### Model internal data:
     *
     * <ul>
     *   <li>
     *        num_components see EigenFaceRecognizer::create.
     *   </li>
     *   <li>
     *        threshold see EigenFaceRecognizer::create.
     *   </li>
     *   <li>
     *        eigenvalues The eigenvalues for this Principal Component Analysis (ordered descending).
     *   </li>
     *   <li>
     *        eigenvectors The eigenvectors for this Principal Component Analysis (ordered by their
     *         eigenvalue).
     *   </li>
     *   <li>
     *        mean The sample mean calculated from the training data.
     *   </li>
     *   <li>
     *        projections The projections of the training data.
     *   </li>
     *   <li>
     *        labels The threshold applied in the prediction. If the distance to the nearest neighbor is
     *         larger than the threshold, this method returns -1.
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static EigenFaceRecognizer create(int num_components, double threshold) {
        return EigenFaceRecognizer.__fromPtr__(create_0(num_components, threshold));
    }

    /**
     * @param num_components The number of components (read: Eigenfaces) kept for this Principal
     *     Component Analysis. As a hint: There's no rule how many components (read: Eigenfaces) should be
     *     kept for good reconstruction capabilities. It is based on your input data, so experiment with the
     *     number. Keeping 80 components should almost always be sufficient.
     *
     *     ### Notes:
     *
     * <ul>
     *   <li>
     *        Training and prediction must be done on grayscale images, use cvtColor to convert between the
     *         color spaces.
     *   </li>
     *   <li>
     *        <b>THE EIGENFACES METHOD MAKES THE ASSUMPTION, THAT THE TRAINING AND TEST IMAGES ARE OF EQUAL
     *         SIZE.</b> (caps-lock, because I got so many mails asking for this). You have to make sure your
     *         input data has the correct shape, else a meaningful exception is thrown. Use resize to resize
     *         the images.
     *   </li>
     *   <li>
     *        This model does not support updating.
     *   </li>
     * </ul>
     *
     *     ### Model internal data:
     *
     * <ul>
     *   <li>
     *        num_components see EigenFaceRecognizer::create.
     *   </li>
     *   <li>
     *        threshold see EigenFaceRecognizer::create.
     *   </li>
     *   <li>
     *        eigenvalues The eigenvalues for this Principal Component Analysis (ordered descending).
     *   </li>
     *   <li>
     *        eigenvectors The eigenvectors for this Principal Component Analysis (ordered by their
     *         eigenvalue).
     *   </li>
     *   <li>
     *        mean The sample mean calculated from the training data.
     *   </li>
     *   <li>
     *        projections The projections of the training data.
     *   </li>
     *   <li>
     *        labels The threshold applied in the prediction. If the distance to the nearest neighbor is
     *         larger than the threshold, this method returns -1.
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static EigenFaceRecognizer create(int num_components) {
        return EigenFaceRecognizer.__fromPtr__(create_1(num_components));
    }

    /**
     *     Component Analysis. As a hint: There's no rule how many components (read: Eigenfaces) should be
     *     kept for good reconstruction capabilities. It is based on your input data, so experiment with the
     *     number. Keeping 80 components should almost always be sufficient.
     *
     *     ### Notes:
     *
     * <ul>
     *   <li>
     *        Training and prediction must be done on grayscale images, use cvtColor to convert between the
     *         color spaces.
     *   </li>
     *   <li>
     *        <b>THE EIGENFACES METHOD MAKES THE ASSUMPTION, THAT THE TRAINING AND TEST IMAGES ARE OF EQUAL
     *         SIZE.</b> (caps-lock, because I got so many mails asking for this). You have to make sure your
     *         input data has the correct shape, else a meaningful exception is thrown. Use resize to resize
     *         the images.
     *   </li>
     *   <li>
     *        This model does not support updating.
     *   </li>
     * </ul>
     *
     *     ### Model internal data:
     *
     * <ul>
     *   <li>
     *        num_components see EigenFaceRecognizer::create.
     *   </li>
     *   <li>
     *        threshold see EigenFaceRecognizer::create.
     *   </li>
     *   <li>
     *        eigenvalues The eigenvalues for this Principal Component Analysis (ordered descending).
     *   </li>
     *   <li>
     *        eigenvectors The eigenvectors for this Principal Component Analysis (ordered by their
     *         eigenvalue).
     *   </li>
     *   <li>
     *        mean The sample mean calculated from the training data.
     *   </li>
     *   <li>
     *        projections The projections of the training data.
     *   </li>
     *   <li>
     *        labels The threshold applied in the prediction. If the distance to the nearest neighbor is
     *         larger than the threshold, this method returns -1.
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static EigenFaceRecognizer create() {
        return EigenFaceRecognizer.__fromPtr__(create_2());
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_EigenFaceRecognizer cv::face::EigenFaceRecognizer::create(int num_components = 0, double threshold = DBL_MAX)
    private static native long create_0(int num_components, double threshold);
    private static native long create_1(int num_components);
    private static native long create_2();

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
