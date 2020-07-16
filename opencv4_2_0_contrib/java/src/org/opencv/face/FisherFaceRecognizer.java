//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.face;

import org.opencv.face.BasicFaceRecognizer;
import org.opencv.face.FisherFaceRecognizer;

// C++: class FisherFaceRecognizer

public class FisherFaceRecognizer extends BasicFaceRecognizer {

    protected FisherFaceRecognizer(long addr) { super(addr); }

    // internal usage only
    public static FisherFaceRecognizer __fromPtr__(long addr) { return new FisherFaceRecognizer(addr); }

    //
    // C++: static Ptr_FisherFaceRecognizer cv::face::FisherFaceRecognizer::create(int num_components = 0, double threshold = DBL_MAX)
    //

    /**
     * @param num_components The number of components (read: Fisherfaces) kept for this Linear
     *     Discriminant Analysis with the Fisherfaces criterion. It's useful to keep all components, that
     *     means the number of your classes c (read: subjects, persons you want to recognize). If you leave
     *     this at the default (0) or set it to a value less-equal 0 or greater (c-1), it will be set to the
     *     correct number (c-1) automatically.
     *     @param threshold The threshold applied in the prediction. If the distance to the nearest neighbor
     *     is larger than the threshold, this method returns -1.
     *
     *     ### Notes:
     *
     * <ul>
     *   <li>
     *        Training and prediction must be done on grayscale images, use cvtColor to convert between the
     *         color spaces.
     *   </li>
     *   <li>
     *        <b>THE FISHERFACES METHOD MAKES THE ASSUMPTION, THAT THE TRAINING AND TEST IMAGES ARE OF EQUAL
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
     *        num_components see FisherFaceRecognizer::create.
     *   </li>
     *   <li>
     *        threshold see FisherFaceRecognizer::create.
     *   </li>
     *   <li>
     *        eigenvalues The eigenvalues for this Linear Discriminant Analysis (ordered descending).
     *   </li>
     *   <li>
     *        eigenvectors The eigenvectors for this Linear Discriminant Analysis (ordered by their
     *         eigenvalue).
     *   </li>
     *   <li>
     *        mean The sample mean calculated from the training data.
     *   </li>
     *   <li>
     *        projections The projections of the training data.
     *   </li>
     *   <li>
     *        labels The labels corresponding to the projections.
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static FisherFaceRecognizer create(int num_components, double threshold) {
        return FisherFaceRecognizer.__fromPtr__(create_0(num_components, threshold));
    }

    /**
     * @param num_components The number of components (read: Fisherfaces) kept for this Linear
     *     Discriminant Analysis with the Fisherfaces criterion. It's useful to keep all components, that
     *     means the number of your classes c (read: subjects, persons you want to recognize). If you leave
     *     this at the default (0) or set it to a value less-equal 0 or greater (c-1), it will be set to the
     *     correct number (c-1) automatically.
     *     is larger than the threshold, this method returns -1.
     *
     *     ### Notes:
     *
     * <ul>
     *   <li>
     *        Training and prediction must be done on grayscale images, use cvtColor to convert between the
     *         color spaces.
     *   </li>
     *   <li>
     *        <b>THE FISHERFACES METHOD MAKES THE ASSUMPTION, THAT THE TRAINING AND TEST IMAGES ARE OF EQUAL
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
     *        num_components see FisherFaceRecognizer::create.
     *   </li>
     *   <li>
     *        threshold see FisherFaceRecognizer::create.
     *   </li>
     *   <li>
     *        eigenvalues The eigenvalues for this Linear Discriminant Analysis (ordered descending).
     *   </li>
     *   <li>
     *        eigenvectors The eigenvectors for this Linear Discriminant Analysis (ordered by their
     *         eigenvalue).
     *   </li>
     *   <li>
     *        mean The sample mean calculated from the training data.
     *   </li>
     *   <li>
     *        projections The projections of the training data.
     *   </li>
     *   <li>
     *        labels The labels corresponding to the projections.
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static FisherFaceRecognizer create(int num_components) {
        return FisherFaceRecognizer.__fromPtr__(create_1(num_components));
    }

    /**
     *     Discriminant Analysis with the Fisherfaces criterion. It's useful to keep all components, that
     *     means the number of your classes c (read: subjects, persons you want to recognize). If you leave
     *     this at the default (0) or set it to a value less-equal 0 or greater (c-1), it will be set to the
     *     correct number (c-1) automatically.
     *     is larger than the threshold, this method returns -1.
     *
     *     ### Notes:
     *
     * <ul>
     *   <li>
     *        Training and prediction must be done on grayscale images, use cvtColor to convert between the
     *         color spaces.
     *   </li>
     *   <li>
     *        <b>THE FISHERFACES METHOD MAKES THE ASSUMPTION, THAT THE TRAINING AND TEST IMAGES ARE OF EQUAL
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
     *        num_components see FisherFaceRecognizer::create.
     *   </li>
     *   <li>
     *        threshold see FisherFaceRecognizer::create.
     *   </li>
     *   <li>
     *        eigenvalues The eigenvalues for this Linear Discriminant Analysis (ordered descending).
     *   </li>
     *   <li>
     *        eigenvectors The eigenvectors for this Linear Discriminant Analysis (ordered by their
     *         eigenvalue).
     *   </li>
     *   <li>
     *        mean The sample mean calculated from the training data.
     *   </li>
     *   <li>
     *        projections The projections of the training data.
     *   </li>
     *   <li>
     *        labels The labels corresponding to the projections.
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static FisherFaceRecognizer create() {
        return FisherFaceRecognizer.__fromPtr__(create_2());
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_FisherFaceRecognizer cv::face::FisherFaceRecognizer::create(int num_components = 0, double threshold = DBL_MAX)
    private static native long create_0(int num_components, double threshold);
    private static native long create_1(int num_components);
    private static native long create_2();

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
