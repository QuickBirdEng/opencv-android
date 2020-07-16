//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.text;



// C++: class Callback
/**
 * Callback with the classifier is made a class.
 *
 *     By doing it we hide SVM, Boost etc. Developers can provide their own classifiers to the
 *     ERFilter algorithm.
 */
public class Callback {

    protected final long nativeObj;
    protected Callback(long addr) { nativeObj = addr; }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static Callback __fromPtr__(long addr) { return new Callback(addr); }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // native support for java finalize()
    private static native void delete(long nativeObj);

}
