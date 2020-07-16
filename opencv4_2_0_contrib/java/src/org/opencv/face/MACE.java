//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.face;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.face.MACE;
import org.opencv.utils.Converters;

// C++: class MACE
/**
 * Minimum Average Correlation Energy Filter
 *     useful for authentication with (cancellable) biometrical features.
 *     (does not need many positives to train (10-50), and no negatives at all, also robust to noise/salting)
 *
 *     see also: CITE: Savvides04
 *
 *     this implementation is largely based on: https://code.google.com/archive/p/pam-face-authentication (GSOC 2009)
 *
 *     use it like:
 *     <code>
 *
 *     Ptr&lt;face::MACE&gt; mace = face::MACE::create(64);
 *
 *     vector&lt;Mat&gt; pos_images = ...
 *     mace-&gt;train(pos_images);
 *
 *     Mat query = ...
 *     bool same = mace-&gt;same(query);
 *
 *     </code>
 *
 *     you can also use two-factor authentication, with an additional passphrase:
 *
 *     <code>
 *     String owners_passphrase = "ilikehotdogs";
 *     Ptr&lt;face::MACE&gt; mace = face::MACE::create(64);
 *     mace-&gt;salt(owners_passphrase);
 *     vector&lt;Mat&gt; pos_images = ...
 *     mace-&gt;train(pos_images);
 *
 *     // now, users have to give a valid passphrase, along with the image:
 *     Mat query = ...
 *     cout &lt;&lt; "enter passphrase: ";
 *     string pass;
 *     getline(cin, pass);
 *     mace-&gt;salt(pass);
 *     bool same = mace-&gt;same(query);
 *     </code>
 *
 *     save/load your model:
 *     <code>
 *     Ptr&lt;face::MACE&gt; mace = face::MACE::create(64);
 *     mace-&gt;train(pos_images);
 *     mace-&gt;save("my_mace.xml");
 *
 *     // later:
 *     Ptr&lt;MACE&gt; reloaded = MACE::load("my_mace.xml");
 *     reloaded-&gt;same(some_image);
 *     </code>
 */
public class MACE extends Algorithm {

    protected MACE(long addr) { super(addr); }

    // internal usage only
    public static MACE __fromPtr__(long addr) { return new MACE(addr); }

    //
    // C++: static Ptr_MACE cv::face::MACE::create(int IMGSIZE = 64)
    //

    /**
     * constructor
     *     @param IMGSIZE  images will get resized to this (should be an even number)
     * @return automatically generated
     */
    public static MACE create(int IMGSIZE) {
        return MACE.__fromPtr__(create_0(IMGSIZE));
    }

    /**
     * constructor
     * @return automatically generated
     */
    public static MACE create() {
        return MACE.__fromPtr__(create_1());
    }


    //
    // C++: static Ptr_MACE cv::face::MACE::load(String filename, String objname = String())
    //

    /**
     * constructor
     *     @param filename  build a new MACE instance from a pre-serialized FileStorage
     *     @param objname (optional) top-level node in the FileStorage
     * @return automatically generated
     */
    public static MACE load(String filename, String objname) {
        return MACE.__fromPtr__(load_0(filename, objname));
    }

    /**
     * constructor
     *     @param filename  build a new MACE instance from a pre-serialized FileStorage
     * @return automatically generated
     */
    public static MACE load(String filename) {
        return MACE.__fromPtr__(load_1(filename));
    }


    //
    // C++:  bool cv::face::MACE::same(Mat query)
    //

    /**
     * correlate query img and threshold to min class value
     *     @param query  a Mat with query image
     * @return automatically generated
     */
    public boolean same(Mat query) {
        return same_0(nativeObj, query.nativeObj);
    }


    //
    // C++:  void cv::face::MACE::salt(String passphrase)
    //

    /**
     * optionally encrypt images with random convolution
     *     @param passphrase a crc64 random seed will get generated from this
     */
    public void salt(String passphrase) {
        salt_0(nativeObj, passphrase);
    }


    //
    // C++:  void cv::face::MACE::train(vector_Mat images)
    //

    /**
     * train it on positive features
     *        compute the mace filter: {@code h = D(-1) * X * (X(+) * D(-1) * X)(-1) * C}
     *        also calculate a minimal threshold for this class, the smallest self-similarity from the train images
     *     @param images  a vector&lt;Mat&gt; with the train images
     */
    public void train(List<Mat> images) {
        Mat images_mat = Converters.vector_Mat_to_Mat(images);
        train_0(nativeObj, images_mat.nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_MACE cv::face::MACE::create(int IMGSIZE = 64)
    private static native long create_0(int IMGSIZE);
    private static native long create_1();

    // C++: static Ptr_MACE cv::face::MACE::load(String filename, String objname = String())
    private static native long load_0(String filename, String objname);
    private static native long load_1(String filename);

    // C++:  bool cv::face::MACE::same(Mat query)
    private static native boolean same_0(long nativeObj, long query_nativeObj);

    // C++:  void cv::face::MACE::salt(String passphrase)
    private static native void salt_0(long nativeObj, String passphrase);

    // C++:  void cv::face::MACE::train(vector_Mat images)
    private static native void train_0(long nativeObj, long images_mat_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
