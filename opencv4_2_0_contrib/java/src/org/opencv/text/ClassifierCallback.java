//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.text;



// C++: class ClassifierCallback
/**
 * Callback with the character classifier is made a class.
 *
 *     This way it hides the feature extractor and the classifier itself, so developers can write
 *     their own OCR code.
 *
 *     The default character classifier and feature extractor can be loaded using the utility function
 *     loadOCRHMMClassifierNM and KNN model provided in
 *     &lt;https://github.com/opencv/opencv_contrib/blob/master/modules/text/samples/OCRHMM_knn_model_data.xml.gz&gt;.
 */
public class ClassifierCallback {

    protected final long nativeObj;
    protected ClassifierCallback(long addr) { nativeObj = addr; }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static ClassifierCallback __fromPtr__(long addr) { return new ClassifierCallback(addr); }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // native support for java finalize()
    private static native void delete(long nativeObj);

}
