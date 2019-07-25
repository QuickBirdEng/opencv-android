//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.face;



// C++: class FacemarkAAM
//javadoc: FacemarkAAM

public class FacemarkAAM extends FacemarkTrain {

    protected FacemarkAAM(long addr) { super(addr); }

    // internal usage only
    public static FacemarkAAM __fromPtr__(long addr) { return new FacemarkAAM(addr); }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // native support for java finalize()
    private static native void delete(long nativeObj);

}
